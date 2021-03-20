package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import b.e.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f7382m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> f7383n = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public CompatJobEngine f7384h;

    /* renamed from: i  reason: collision with root package name */
    public WorkEnqueuer f7385i;

    /* renamed from: j  reason: collision with root package name */
    public CommandProcessor f7386j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7387k = false;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList<CompatWorkItem> f7388l = new ArrayList<>();

    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public CommandProcessor() {
        }

        public Void doInBackground(Void... voidArr) {
            GenericWorkItem genericWorkItem;
            while (true) {
                JobIntentService jobIntentService = JobIntentService.this;
                CompatJobEngine compatJobEngine = jobIntentService.f7384h;
                if (compatJobEngine == null || (genericWorkItem = compatJobEngine.dequeueWork()) == null) {
                    synchronized (jobIntentService.f7388l) {
                        if (jobIntentService.f7388l.size() > 0) {
                            GenericWorkItem remove = jobIntentService.f7388l.remove(0);
                            genericWorkItem = remove;
                        } else {
                            genericWorkItem = null;
                        }
                    }
                }
                if (genericWorkItem == null) {
                    return null;
                }
                JobIntentService.this.d(genericWorkItem.getIntent());
                genericWorkItem.complete();
            }
            while (true) {
            }
        }

        public void onCancelled(Void voidR) {
            JobIntentService.this.e();
        }

        public void onPostExecute(Void voidR) {
            JobIntentService.this.e();
        }
    }

    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void enqueueWork(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.mLaunchingService) {
                        this.mLaunchingService = true;
                        if (!this.mServiceProcessing) {
                            this.mLaunchWakeLock.acquire(60000);
                        }
                    }
                }
            }
        }

        public void serviceProcessingFinished() {
            synchronized (this) {
                if (this.mServiceProcessing) {
                    if (this.mLaunchingService) {
                        this.mLaunchWakeLock.acquire(60000);
                    }
                    this.mServiceProcessing = false;
                    this.mRunWakeLock.release();
                }
            }
        }

        public void serviceProcessingStarted() {
            synchronized (this) {
                if (!this.mServiceProcessing) {
                    this.mServiceProcessing = true;
                    this.mRunWakeLock.acquire(600000);
                    this.mLaunchWakeLock.release();
                }
            }
        }

        public void serviceStartReceived() {
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    public final class CompatWorkItem implements GenericWorkItem {
        public final Intent mIntent;
        public final int mStartId;

        public CompatWorkItem(Intent intent, int i2) {
            this.mIntent = intent;
            this.mStartId = i2;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.mStartId);
        }

        public Intent getIntent() {
            return this.mIntent;
        }
    }

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName2, boolean z) {
            this.componentName = componentName2;
            this.useWakefulService = z;
        }
    }

    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    @RequiresApi(26)
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock = new Object();
        public JobParameters mParams;
        public final JobIntentService mService;

        public final class WrapperWorkItem implements GenericWorkItem {
            public final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            public void complete() {
                String str;
                String str2;
                synchronized (JobServiceEngineImpl.this.mLock) {
                    JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.mJobWork);
                        } catch (SecurityException e2) {
                            e = e2;
                            str = "JobServiceEngineImpl";
                            str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            str = "JobServiceEngineImpl";
                            str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        }
                    }
                }
                Log.e(str, str2, e);
            }

            public Intent getIntent() {
                return this.mJobWork.getIntent();
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mService = jobIntentService;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r5.mService.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            return new com.onesignal.JobIntentService.JobServiceEngineImpl.WrapperWorkItem(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.onesignal.JobIntentService.GenericWorkItem dequeueWork() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.mParams     // Catch:{ all -> 0x002f }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                com.onesignal.JobIntentService r2 = r5.mService
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem r0 = new com.onesignal.JobIntentService$JobServiceEngineImpl$WrapperWorkItem
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "Failed to run mParams.dequeueWork()!"
                android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x002f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.JobIntentService.JobServiceEngineImpl.dequeueWork():com.onesignal.JobIntentService$GenericWorkItem");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.mParams = jobParameters;
            this.mService.b(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            CommandProcessor commandProcessor = this.mService.f7386j;
            if (commandProcessor != null) {
                commandProcessor.cancel(false);
            }
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return true;
        }
    }

    @RequiresApi(26)
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i2) {
            super(componentName);
            ensureJobId(i2);
            this.mJobInfo = new JobInfo.Builder(i2, this.mComponentName).setOverrideDeadline(0).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void enqueueWork(Intent intent) {
            this.mJobScheduler.enqueue(this.mJobInfo, new JobWorkItem(intent));
        }
    }

    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i2) {
            if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i2;
            } else if (this.mJobId != i2) {
                StringBuilder z = a.z("Given job ID ", i2, " is different than previous ");
                z.append(this.mJobId);
                throw new IllegalArgumentException(z.toString());
            }
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }

    public static void a(@NonNull Context context, @NonNull ComponentName componentName, int i2, @NonNull Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f7382m) {
                WorkEnqueuer c = c(context, componentName, true, i2, z);
                c.ensureJobId(i2);
                try {
                    c.enqueueWork(intent);
                } catch (IllegalStateException e2) {
                    if (z) {
                        c(context, componentName, true, i2, false).enqueueWork(intent);
                    } else {
                        throw e2;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static WorkEnqueuer c(Context context, ComponentName componentName, boolean z, int i2, boolean z2) {
        WorkEnqueuer workEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, z2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = f7383n;
        WorkEnqueuer workEnqueuer2 = hashMap.get(componentNameWithWakeful);
        if (workEnqueuer2 != null) {
            return workEnqueuer2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            workEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else if (z) {
            workEnqueuer = new JobWorkEnqueuer(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        WorkEnqueuer workEnqueuer3 = workEnqueuer;
        hashMap.put(componentNameWithWakeful, workEnqueuer3);
        return workEnqueuer3;
    }

    public void b(boolean z) {
        if (this.f7386j == null) {
            this.f7386j = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f7385i;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.f7386j.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void d(@NonNull Intent intent);

    public void e() {
        ArrayList<CompatWorkItem> arrayList = this.f7388l;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f7386j = null;
                ArrayList<CompatWorkItem> arrayList2 = this.f7388l;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    b(false);
                } else if (!this.f7387k) {
                    this.f7385i.serviceProcessingFinished();
                }
            }
        }
    }

    public IBinder onBind(@NonNull Intent intent) {
        CompatJobEngine compatJobEngine = this.f7384h;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7384h = new JobServiceEngineImpl(this);
            this.f7385i = null;
        }
        this.f7385i = c(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        CommandProcessor commandProcessor = this.f7386j;
        if (commandProcessor != null) {
            commandProcessor.cancel(false);
        }
        synchronized (this.f7388l) {
            this.f7387k = true;
            this.f7385i.serviceProcessingFinished();
        }
    }

    public int onStartCommand(@Nullable Intent intent, int i2, int i3) {
        this.f7385i.serviceStartReceived();
        synchronized (this.f7388l) {
            ArrayList<CompatWorkItem> arrayList = this.f7388l;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            b(true);
        }
        return 3;
    }
}
