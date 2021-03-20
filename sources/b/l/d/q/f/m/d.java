package b.l.d.q.f.m;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b.l.a.c.k.g;
import b.l.a.c.k.h;
import b.l.a.c.k.i;
import b.l.d.q.f.b;
import b.l.d.q.f.m.j.e;
import b.l.d.q.f.m.j.f;
import b.l.d.q.f.m.k.a;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class d implements g<Void, Void> {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @NonNull
    public h a(@Nullable Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        b bVar = b.a;
        e eVar = this.a;
        a aVar = eVar.f;
        f fVar = eVar.f5274b;
        Objects.requireNonNull(aVar);
        try {
            Map<String, String> c = aVar.c(fVar);
            b.l.d.q.f.j.b bVar2 = aVar.f5285b;
            String str = aVar.a;
            Objects.requireNonNull(bVar2);
            b.l.d.q.f.j.a aVar2 = new b.l.d.q.f.j.a(str, c);
            aVar2.c.put("User-Agent", "Crashlytics Android SDK/17.3.1");
            aVar2.c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            aVar.a(aVar2, fVar);
            bVar.b("Requesting settings from " + aVar.a);
            bVar.b("Settings query params were: " + c);
            jSONObject = aVar.d(aVar2.b());
        } catch (IOException e2) {
            if (bVar.a(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            e a2 = this.a.c.a(jSONObject);
            a aVar3 = this.a.f5275e;
            long j2 = a2.d;
            Objects.requireNonNull(aVar3);
            bVar.b("Writing settings to cache file...");
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter(aVar3.a());
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                fileWriter = null;
                try {
                    if (bVar.a(6)) {
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    }
                    b.l.d.q.f.g.e.a(fileWriter, "Failed to close settings writer.");
                    this.a.c(jSONObject, "Loaded settings: ");
                    e eVar2 = this.a;
                    String str2 = eVar2.f5274b.f;
                    SharedPreferences.Editor edit = b.l.d.q.f.g.e.h(eVar2.a).edit();
                    edit.putString("existing_instance_identifier", str2);
                    edit.apply();
                    this.a.f5277h.set(a2);
                    this.a.f5278i.get().b(a2.a);
                    i iVar = new i();
                    iVar.b(a2.a);
                    this.a.f5278i.set(iVar);
                    return b.l.a.c.b.a.X(null);
                } catch (Throwable th) {
                    th = th;
                    b.l.d.q.f.g.e.a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileWriter = null;
                b.l.d.q.f.g.e.a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            b.l.d.q.f.g.e.a(fileWriter, "Failed to close settings writer.");
            this.a.c(jSONObject, "Loaded settings: ");
            e eVar22 = this.a;
            String str22 = eVar22.f5274b.f;
            SharedPreferences.Editor edit2 = b.l.d.q.f.g.e.h(eVar22.a).edit();
            edit2.putString("existing_instance_identifier", str22);
            edit2.apply();
            this.a.f5277h.set(a2);
            this.a.f5278i.get().b(a2.a);
            i iVar2 = new i();
            iVar2.b(a2.a);
            this.a.f5278i.set(iVar2);
        }
        return b.l.a.c.b.a.X(null);
    }
}
