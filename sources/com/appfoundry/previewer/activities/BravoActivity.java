package com.appfoundry.previewer.activities;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import app.bravostudio.A01F175WZXYVE9FWM81EKWKN6FN.R;
import b.a.a.g.a0;
import b.a.a.g.d0;
import b.a.a.g.j0;
import b.a.a.g.k0;
import b.a.a.g.l0;
import b.a.a.g.m0;
import b.a.a.g.r0;
import b.a.a.g.s0;
import b.a.a.g.t0;
import b.a.a.g.v0;
import b.l.a.c.f.e.ci;
import b.l.a.c.f.e.sh;
import b.l.a.c.f.e.wh;
import b.l.a.c.f.e.xg;
import b.l.d.o.a;
import b.l.d.o.u0;
import b.o.i2;
import b.p.b.o;
import com.androidbuffer.kotlinfilepicker.KotlinFilePicker;
import com.appfoundry.previewer.BravoApp;
import com.appfoundry.previewer.fragments.BottomSheetFragment;
import com.appfoundry.previewer.model.AuthInfoFromBackend;
import com.appfoundry.previewer.model.BackendResponse;
import com.appfoundry.previewer.model.ExchangeResponse;
import com.appfoundry.previewer.model.JsonApp;
import com.appfoundry.previewer.model.Page;
import com.appfoundry.previewer.model.Params;
import com.appfoundry.previewer.model.UploadInfoResponse;
import com.auth0.android.provider.AuthenticationActivity;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.Options;
import com.segment.analytics.integrations.BasePayload;
import g.a.i0;
import g.a.y0;
import g.a.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Metadata;
import n.b0;
import n.e0;
import n.f0;
import n.g0;
import n.h0;
import org.greenrobot.eventbus.ThreadMode;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ì\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\b¢\u0006\u0005\bð\u0001\u0010\u0018J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u0018J\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u0018J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010\u0018J!\u0010(\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J-\u00101\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b1\u00102J#\u00104\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b4\u00105J-\u00106\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b6\u00102J#\u00107\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u0018J!\u0010=\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J+\u0010@\u001a\u00020\r2\u0006\u0010?\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020\r2\b\u0010C\u001a\u0004\u0018\u00010BH\u0014¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\rH\u0014¢\u0006\u0004\bF\u0010\u0018J\u000f\u0010G\u001a\u00020\rH\u0016¢\u0006\u0004\bG\u0010\u0018J\u000f\u0010H\u001a\u00020\rH\u0014¢\u0006\u0004\bH\u0010\u0018J\u000f\u0010I\u001a\u00020\rH\u0014¢\u0006\u0004\bI\u0010\u0018J\u000f\u0010J\u001a\u00020\rH\u0014¢\u0006\u0004\bJ\u0010\u0018J\u000f\u0010K\u001a\u00020\rH\u0016¢\u0006\u0004\bK\u0010\u0018J)\u0010Q\u001a\u00020\r2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020L2\b\u0010P\u001a\u0004\u0018\u00010OH\u0014¢\u0006\u0004\bQ\u0010RJ/\u0010W\u001a\u00020\r2\u0006\u0010M\u001a\u00020L2\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070S2\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020YH\u0007¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\\H\u0007¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020_H\u0007¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020bH\u0007¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020eH\u0007¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020hH\u0007¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020kH\u0007¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020nH\u0007¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020qH\u0007¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020tH\u0007¢\u0006\u0004\bu\u0010vJ\u0017\u0010x\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020wH\u0007¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020zH\u0007¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020}H\u0007¢\u0006\u0004\b~\u0010J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u00020\r2\t\u0010\u001a\u001a\u0005\u0018\u00010\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\r2\b\u0010\u0001\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\r2\b\u0010\u0001\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010 \u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030\u0001H\u0007¢\u0006\u0006\b \u0001\u0010¡\u0001J\u001b\u0010£\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030¢\u0001H\u0007¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¦\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030¥\u0001H\u0007¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001b\u0010©\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030¨\u0001H\u0007¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001b\u0010¬\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030«\u0001H\u0007¢\u0006\u0006\b¬\u0001\u0010­\u0001J\u001b\u0010¯\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030®\u0001H\u0007¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0019\u0010±\u0001\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0005\b±\u0001\u0010\u001cJ\u001b\u0010³\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030²\u0001H\u0007¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001b\u0010¶\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030µ\u0001H\u0007¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001b\u0010¹\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030¸\u0001H\u0007¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001b\u0010¼\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030»\u0001H\u0007¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001b\u0010¿\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030¾\u0001H\u0007¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001b\u0010Â\u0001\u001a\u00020\r2\u0007\u0010\u001a\u001a\u00030Á\u0001H\u0007¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001b\u0010Å\u0001\u001a\u00020 2\u0007\u0010\u001a\u001a\u00030Ä\u0001H\u0016¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001c\u0010É\u0001\u001a\u00020\r2\b\u0010È\u0001\u001a\u00030Ç\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001R\u001a\u0010Î\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R \u0010Ò\u0001\u001a\n\u0012\u0005\u0012\u00030Ð\u00010Ï\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010Ñ\u0001R#\u0010Ø\u0001\u001a\u00030Ó\u00018B@\u0002X\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0019\u0010Û\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÚ\u0001\u0010!R\u0019\u0010Ý\u0001\u001a\u00030Ù\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bÜ\u0001\u0010!R!\u0010ß\u0001\u001a\n\u0012\u0005\u0012\u00030Þ\u00010Ï\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Ñ\u0001R\u0019\u0010â\u0001\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\"\u0010æ\u0001\u001a\u00030ã\u00018B@\u0002X\u0002¢\u0006\u000f\n\u0005\b\u001f\u0010Õ\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u001b\u0010è\u0001\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b(\u0010ç\u0001R\u001b\u0010ê\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010é\u0001R\u0019\u0010ì\u0001\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bë\u0001\u0010á\u0001R\u001b\u0010ï\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b$\u0010î\u0001¨\u0006ñ\u0001"}, d2 = {"Lcom/appfoundry/previewer/activities/BravoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/appfoundry/previewer/model/Page;", "page", "Landroidx/fragment/app/Fragment;", "q", "(Lcom/appfoundry/previewer/model/Page;)Landroidx/fragment/app/Fragment;", "", "path", "Landroid/graphics/Bitmap;", "u", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "triggerUrl", "Le/r;", "H", "(Ljava/lang/String;)V", "Lcom/appfoundry/previewer/model/BackendResponse;", "backendResponse", "Landroid/widget/RelativeLayout;", "progressBar", "loadingFragment", "w", "(Lcom/appfoundry/previewer/model/BackendResponse;Landroid/widget/RelativeLayout;Landroidx/fragment/app/Fragment;)V", "v", "()V", "Lb/a/a/g/f0;", "event", "p", "(Lb/a/a/g/f0;)V", "provider", "x", "o", "", "F", "()Z", "C", "h", "g", "pageId", "action", "r", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/appfoundry/previewer/model/FirebaseConfigJson;", "firebaseConfigJson", "E", "(Lcom/appfoundry/previewer/model/FirebaseConfigJson;)V", "Lb/a/a/i/d;", "emailInput", "passwordInput", "z", "(Lb/a/a/i/d;Lb/a/a/i/d;Landroid/widget/RelativeLayout;)V", "firebaseIdToken", "t", "(Ljava/lang/String;Landroid/widget/RelativeLayout;)V", "A", "D", "(Lb/a/a/i/d;Landroid/widget/RelativeLayout;)V", "B", "formUrl", "Ln/g0;", "requestBody", "G", "(Ljava/lang/String;Ln/g0;)V", "show", "y", "(ZLandroidx/fragment/app/Fragment;Landroid/widget/RelativeLayout;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "finish", "onPause", "onStart", "onDestroy", "onBackPressed", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Lb/a/a/g/k0;", "onScannedOrEmulatorAppListClicked", "(Lb/a/a/g/k0;)V", "Lb/a/a/g/a0;", "onOpenQrScannerEvent", "(Lb/a/a/g/a0;)V", "Lb/a/a/g/v;", "onNavigationEvent", "(Lb/a/a/g/v;)V", "Lb/a/a/g/t0;", "onUnlinkEvent", "(Lb/a/a/g/t0;)V", "Lb/a/a/g/e0;", "onPhoneEvent", "(Lb/a/a/g/e0;)V", "Lb/a/a/g/h;", "onEmailEvent", "(Lb/a/a/g/h;)V", "Lb/a/a/g/l0;", "onShareEvent", "(Lb/a/a/g/l0;)V", "Lb/a/a/g/g;", "onDownloadEvent", "(Lb/a/a/g/g;)V", "Lb/a/a/g/v0;", "onVideoEvent", "(Lb/a/a/g/v0;)V", "Lb/a/a/g/d0;", "onPdfEvent", "(Lb/a/a/g/d0;)V", "Lb/a/a/g/u;", "onMapsEvent", "(Lb/a/a/g/u;)V", "Lb/a/a/g/b;", "onAddToCalendarEvent", "(Lb/a/a/g/b;)V", "Lb/a/a/g/b0;", "onOpenUrlEvent", "(Lb/a/a/g/b0;)V", "Lb/a/a/g/u0;", "onUpdateEvent", "(Lb/a/a/g/u0;)V", "Lb/a/a/g/w;", "onNewJsonEvent", "(Lb/a/a/g/w;)V", "Lb/a/a/g/q;", "onIntroCloseEvent", "(Lb/a/a/g/q;)V", "Lb/a/a/g/r;", "onLoginWithProviderEvent", "(Lb/a/a/g/r;)V", "Lb/a/a/g/j0;", "onResetPasswordEvent", "(Lb/a/a/g/j0;)V", "Lb/a/a/g/s;", "logout", "onLogoutEvent", "(Lb/a/a/g/s;)V", "Lb/a/a/g/l;", "onFirebaseLogoutEvent", "(Lb/a/a/g/l;)V", "Lb/a/a/g/r0;", "onTokenExpiredEvent", "(Lb/a/a/g/r0;)V", "Lb/a/a/g/h0;", "onPushDialogEvent", "(Lb/a/a/g/h0;)V", "Lb/a/a/g/z;", "onOpenIntroEvent", "(Lb/a/a/g/z;)V", "Lb/a/a/g/n;", "onGoBackEvent", "(Lb/a/a/g/n;)V", "Lb/a/a/g/g0;", "onPreviewAppEvent", "(Lb/a/a/g/g0;)V", "Lb/a/a/g/m0;", "onShowEmulatorAppListEvent", "(Lb/a/a/g/m0;)V", "Lb/a/a/g/o0;", "onSubmitEvent", "(Lb/a/a/g/o0;)V", "Lb/a/a/g/i0;", "onRemoteActionEvent", "(Lb/a/a/g/i0;)V", "Lb/a/a/g/e;", "onCloseEvent", "(Lb/a/a/g/e;)V", "onPlayEvent", "Lb/a/a/g/m;", "onFirebaseRegisterEvent", "(Lb/a/a/g/m;)V", "Lb/a/a/g/s0;", "onTripleTapEvent", "(Lb/a/a/g/s0;)V", "Lb/a/a/g/c0;", "onPauseEvent", "(Lb/a/a/g/c0;)V", "Lb/a/a/g/y;", "onOpenAudioEvent", "(Lb/a/a/g/y;)V", "Lb/a/a/g/p;", "onInputImageEvent", "(Lb/a/a/g/p;)V", "Lb/a/a/g/o;", "onInputFileEvent", "(Lb/a/a/g/o;)V", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "i", "J", "actionDowntTime", "", "Lb/a/a/i/f;", "Ljava/util/List;", "inputImageUploadFlags", "Lb/l/a/d/a/a/b;", "n", "Le/f;", "s", "()Lb/l/a/d/a/a/b;", "appUpdateManager", "", "j", "actionDownY", "k", "actionDownX", "Lb/a/a/i/e;", "inputFileUploadFlags", "m", "Z", "showDownloading", "Lb/l/a/d/a/d/b;", "getAppUpdatedListener", "()Lb/l/a/d/a/d/b;", "appUpdatedListener", "Lb/a/a/g/o;", "inputFileEvent", "Lb/a/a/g/p;", "inputImageEvent", "l", "scrollingGesture", "Landroidx/drawerlayout/widget/DrawerLayout;", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerMenu", "<init>", "app_release"}, k = 1, mv = {1, 1, 15})
public class BravoActivity extends AppCompatActivity {
    public static final /* synthetic */ int t = 0;

    /* renamed from: h  reason: collision with root package name */
    public DrawerLayout f6924h;

    /* renamed from: i  reason: collision with root package name */
    public long f6925i;

    /* renamed from: j  reason: collision with root package name */
    public float f6926j;

    /* renamed from: k  reason: collision with root package name */
    public float f6927k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6928l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6929m = true;

    /* renamed from: n  reason: collision with root package name */
    public final e.f f6930n = b.q.a.a.h2(new b(this));

    /* renamed from: o  reason: collision with root package name */
    public final e.f f6931o = b.q.a.a.h2(new c(this));

    /* renamed from: p  reason: collision with root package name */
    public b.a.a.g.p f6932p;

    /* renamed from: q  reason: collision with root package name */
    public List<b.a.a.i.f> f6933q = new ArrayList();
    public b.a.a.g.o r;
    public List<b.a.a.i.e> s = new ArrayList();

    /* compiled from: java-style lambda group */
    public static final class a implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f6934h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Object f6935i;

        public a(int i2, Object obj) {
            this.f6934h = i2;
            this.f6935i = obj;
        }

        public final void run() {
            int i2 = this.f6934h;
            if (i2 == 0) {
                ((BravoActivity) this.f6935i).onBackPressed();
            } else if (i2 == 1) {
                BravoActivity bravoActivity = (BravoActivity) this.f6935i;
                e.x.c.i.e(bravoActivity, "$this$refreshLastFragment");
                FragmentManager supportFragmentManager = bravoActivity.getSupportFragmentManager();
                e.x.c.i.d(supportFragmentManager, "supportFragmentManager");
                List<Fragment> fragments = supportFragmentManager.getFragments();
                e.x.c.i.d(fragments, "supportFragmentManager.fragments");
                Object z = e.t.g.z(fragments);
                Objects.requireNonNull(z, "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BravoFragment");
                b.a.a.a.h hVar = (b.a.a.a.h) z;
                Page page = hVar.f74h;
                if (page == null || !b.a.a.h.e.E(page)) {
                    bravoActivity.getSupportFragmentManager().beginTransaction().detach(hVar).attach(hVar).commit();
                    return;
                }
                int i3 = b.a.a.a.h.f104p;
                hVar.e(false);
            } else {
                throw null;
            }
        }
    }

    public static final class b extends e.x.c.k implements e.x.b.a<b.l.a.d.a.a.b> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6936h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(BravoActivity bravoActivity) {
            super(0);
            this.f6936h = bravoActivity;
        }

        public Object e() {
            b.l.a.d.a.a.v vVar;
            Context context = this.f6936h;
            synchronized (b.l.a.d.a.a.u.class) {
                if (b.l.a.d.a.a.u.a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    b.l.a.d.a.a.g gVar = new b.l.a.d.a.a.g(context);
                    b.l.a.c.b.a.c0(gVar, b.l.a.d.a.a.g.class);
                    b.l.a.d.a.a.u.a = new b.l.a.d.a.a.v(gVar);
                }
                vVar = b.l.a.d.a.a.u.a;
            }
            b.l.a.d.a.a.b a = vVar.f.a();
            e.x.c.i.d(a, "AppUpdateManagerFactory.create(this)");
            return a;
        }
    }

    public static final class c extends e.x.c.k implements e.x.b.a<b.a.a.d.a> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6937h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(BravoActivity bravoActivity) {
            super(0);
            this.f6937h = bravoActivity;
        }

        public Object e() {
            return new b.a.a.d.a(this);
        }
    }

    public static final class d implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ TextView f6938h;

        public d(TextView textView) {
            this.f6938h = textView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r1 = r1.c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
                android.widget.TextView r0 = r3.f6938h
                if (r0 == 0) goto L_0x001b
                com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
                b.a.a.i.g r1 = com.appfoundry.previewer.BravoApp.G
                if (r1 == 0) goto L_0x0017
                android.media.MediaPlayer r1 = r1.c
                if (r1 == 0) goto L_0x0017
                int r1 = r1.getCurrentPosition()
                java.lang.String r1 = b.f.a.e.k0(r1)
                goto L_0x0018
            L_0x0017:
                r1 = 0
            L_0x0018:
                r0.setText(r1)
            L_0x001b:
                com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
                b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
                if (r0 == 0) goto L_0x002a
                android.os.Handler r0 = r0.d
                if (r0 == 0) goto L_0x002a
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.postDelayed(r3, r1)
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.d.run():void");
        }
    }

    @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1", f = "BravoActivity.kt", l = {1815, 1818}, m = "invokeSuspend")
    public static final class e extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super e.r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f6939l;

        /* renamed from: m  reason: collision with root package name */
        public Object f6940m;

        /* renamed from: n  reason: collision with root package name */
        public Object f6941n;

        /* renamed from: o  reason: collision with root package name */
        public Object f6942o;

        /* renamed from: p  reason: collision with root package name */
        public int f6943p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6944q;
        public final /* synthetic */ String r;
        public final /* synthetic */ String s;
        public final /* synthetic */ RelativeLayout t;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ e f6945h;

            public a(e eVar) {
                this.f6945h = eVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f6945h.t;
                if (relativeLayout != null) {
                    b.a.a.h.o.e(relativeLayout);
                }
            }
        }

        @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1$authInfo$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super AuthInfoFromBackend>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6946l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ e.x.c.u f6947m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(e.x.c.u uVar, e.v.d dVar) {
                super(2, dVar);
                this.f6947m = uVar;
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                b bVar = new b(this.f6947m, dVar);
                bVar.f6946l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                try {
                    b.a.a.m.b bVar = b.a.a.m.b.f349m;
                    b.p.a.l<AuthInfoFromBackend> lVar = b.a.a.m.b.d;
                    String str = ((ExchangeResponse) this.f6947m.f7989h).f7111b;
                    if (str == null) {
                        str = "";
                    }
                    return lVar.b(str);
                } catch (Exception e2) {
                    q.a.a.d.b("Exception parsing secrets with backend: %s", e2.toString());
                    return null;
                }
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                e.x.c.u uVar = this.f6947m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(e.r.a);
                try {
                    b.a.a.m.b bVar = b.a.a.m.b.f349m;
                    b.p.a.l<AuthInfoFromBackend> lVar = b.a.a.m.b.d;
                    String str = ((ExchangeResponse) uVar.f7989h).f7111b;
                    if (str == null) {
                        str = "";
                    }
                    return lVar.b(str);
                } catch (Exception e2) {
                    q.a.a.d.b("Exception parsing secrets with backend: %s", e2.toString());
                    return null;
                }
            }
        }

        @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$exchangeSecretsWithBackend$1$exchangeResponse$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
        public static final class c extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super ExchangeResponse>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6948l;

            public c(e.v.d dVar) {
                super(2, dVar);
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                c cVar = new c(dVar);
                cVar.f6948l = (z) obj;
                return cVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.f.a.e.E();
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(e.r.a);
                return b.f.a.e.E();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(BravoActivity bravoActivity, String str, String str2, RelativeLayout relativeLayout, e.v.d dVar) {
            super(2, dVar);
            this.f6944q = bravoActivity;
            this.r = str;
            this.s = str2;
            this.t = relativeLayout;
        }

        public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            e eVar = new e(this.f6944q, this.r, this.s, this.t, dVar);
            eVar.f6939l = (z) obj;
            return eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:83:0x019f, code lost:
            if (r6 == null) goto L_0x0256;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ab, code lost:
            if (r6 != null) goto L_0x01ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ad, code lost:
            b.a.a.h.o.e(r6);
         */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01f9  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0092  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r14) {
            /*
                r13 = this;
                e.v.i.a r0 = e.v.i.a.COROUTINE_SUSPENDED
                int r1 = r13.f6943p
                r2 = 2
                r3 = 0
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0032
                if (r1 == r4) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r0 = r13.f6941n
                e.x.c.u r0 = (e.x.c.u) r0
                java.lang.Object r0 = r13.f6940m
                g.a.z r0 = (g.a.z) r0
                b.q.a.a.c3(r14)
                goto L_0x0082
            L_0x001a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0022:
                java.lang.Object r1 = r13.f6942o
                e.x.c.u r1 = (e.x.c.u) r1
                java.lang.Object r6 = r13.f6941n
                e.x.c.u r6 = (e.x.c.u) r6
                java.lang.Object r7 = r13.f6940m
                g.a.z r7 = (g.a.z) r7
                b.q.a.a.c3(r14)
                goto L_0x0053
            L_0x0032:
                b.q.a.a.c3(r14)
                g.a.z r7 = r13.f6939l
                e.x.c.u r1 = new e.x.c.u
                r1.<init>()
                g.a.x r14 = g.a.i0.f9955b
                com.appfoundry.previewer.activities.BravoActivity$e$c r6 = new com.appfoundry.previewer.activities.BravoActivity$e$c
                r6.<init>(r5)
                r13.f6940m = r7
                r13.f6941n = r1
                r13.f6942o = r1
                r13.f6943p = r4
                java.lang.Object r14 = e.a.a.a.y0.m.o1.c.u0(r14, r6, r13)
                if (r14 != r0) goto L_0x0052
                return r0
            L_0x0052:
                r6 = r1
            L_0x0053:
                com.appfoundry.previewer.model.ExchangeResponse r14 = (com.appfoundry.previewer.model.ExchangeResponse) r14
                r1.f7989h = r14
                T r14 = r6.f7989h
                com.appfoundry.previewer.model.ExchangeResponse r14 = (com.appfoundry.previewer.model.ExchangeResponse) r14
                int r1 = r14.a
                r8 = 200(0xc8, float:2.8E-43)
                if (r1 != r8) goto L_0x0240
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.String r14 = r14.f7111b
                r1[r3] = r14
                q.a.a$b r14 = q.a.a.d
                java.lang.String r8 = "Exchange JSON = %s"
                r14.a(r8, r1)
                g.a.x r14 = g.a.i0.f9955b
                com.appfoundry.previewer.activities.BravoActivity$e$b r1 = new com.appfoundry.previewer.activities.BravoActivity$e$b
                r1.<init>(r6, r5)
                r13.f6940m = r7
                r13.f6941n = r6
                r13.f6943p = r2
                java.lang.Object r14 = e.a.a.a.y0.m.o1.c.u0(r14, r1, r13)
                if (r14 != r0) goto L_0x0082
                return r0
            L_0x0082:
                com.appfoundry.previewer.model.AuthInfoFromBackend r14 = (com.appfoundry.previewer.model.AuthInfoFromBackend) r14
                if (r14 == 0) goto L_0x0089
                java.lang.String r0 = r14.f7067b
                goto L_0x008a
            L_0x0089:
                r0 = r5
            L_0x008a:
                java.lang.String r1 = "firebase"
                boolean r0 = e.x.c.i.a(r0, r1)
                if (r0 == 0) goto L_0x01f9
                com.appfoundry.previewer.activities.BravoActivity r0 = r13.f6944q
                java.lang.String r1 = r13.r
                java.lang.String r2 = r13.s
                android.widget.RelativeLayout r6 = r13.t
                int r7 = com.appfoundry.previewer.activities.BravoActivity.t
                java.util.Objects.requireNonNull(r0)
                if (r2 == 0) goto L_0x01ea
                com.appfoundry.previewer.BravoApp$b r7 = com.appfoundry.previewer.BravoApp.Q
                java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r7 = com.appfoundry.previewer.BravoApp.E
                java.lang.Object r2 = r7.get(r2)
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L_0x0256
                boolean r7 = r2.isEmpty()
                r7 = r7 ^ r4
                if (r7 == 0) goto L_0x0256
                java.util.Iterator r7 = r2.iterator()
            L_0x00b8:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00d0
                java.lang.Object r8 = r7.next()
                r9 = r8
                b.a.a.i.d r9 = (b.a.a.i.d) r9
                java.lang.String r9 = r9.a
                java.lang.String r10 = "component:input-email"
                boolean r9 = e.x.c.i.a(r9, r10)
                if (r9 == 0) goto L_0x00b8
                goto L_0x00d1
            L_0x00d0:
                r8 = r5
            L_0x00d1:
                b.a.a.i.d r8 = (b.a.a.i.d) r8
                java.util.Iterator r2 = r2.iterator()
            L_0x00d7:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x00ef
                java.lang.Object r7 = r2.next()
                r9 = r7
                b.a.a.i.d r9 = (b.a.a.i.d) r9
                java.lang.String r9 = r9.a
                java.lang.String r10 = "component:input-password"
                boolean r9 = e.x.c.i.a(r9, r10)
                if (r9 == 0) goto L_0x00d7
                goto L_0x00f0
            L_0x00ef:
                r7 = r5
            L_0x00f0:
                b.a.a.i.d r7 = (b.a.a.i.d) r7
                java.lang.String r2 = "firebase-email-password"
                boolean r9 = e.x.c.i.a(r1, r2)
                java.lang.String r10 = "register:firebase-email-password"
                if (r9 != 0) goto L_0x0113
                java.lang.String r9 = "action:"
                boolean r9 = e.x.c.i.a(r9, r10)
                if (r9 == 0) goto L_0x0105
                goto L_0x0113
            L_0x0105:
                if (r8 == 0) goto L_0x012e
                java.lang.String r9 = b.f.a.e.Q(r8)
                boolean r9 = e.c0.h.n(r9)
                r9 = r9 ^ r4
                if (r9 == 0) goto L_0x012e
                goto L_0x012f
            L_0x0113:
                if (r8 == 0) goto L_0x012e
                if (r7 == 0) goto L_0x012e
                java.lang.String r9 = b.f.a.e.Q(r8)
                boolean r9 = e.c0.h.n(r9)
                r9 = r9 ^ r4
                if (r9 == 0) goto L_0x012e
                java.lang.String r9 = b.f.a.e.Q(r7)
                boolean r9 = e.c0.h.n(r9)
                r9 = r9 ^ r4
                if (r9 == 0) goto L_0x012e
                goto L_0x012f
            L_0x012e:
                r4 = r3
            L_0x012f:
                if (r4 == 0) goto L_0x01e2
                com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.Q
                com.google.firebase.auth.FirebaseAuth r4 = com.appfoundry.previewer.BravoApp.D
                java.lang.String r9 = "reset-password"
                r11 = -96312741(0xfffffffffa42625b, float:-2.5232512E35)
                r12 = -346707623(0xffffffffeb55a959, float:-2.5830092E26)
                if (r4 != 0) goto L_0x01b2
                boolean r2 = b.a.a.n.c.b()
                if (r2 == 0) goto L_0x014e
                if (r14 == 0) goto L_0x0156
                com.appfoundry.previewer.model.AuthSettings r14 = r14.d
                if (r14 == 0) goto L_0x0156
                java.lang.String r5 = r14.f7072i
                goto L_0x0156
            L_0x014e:
                if (r14 == 0) goto L_0x0156
                com.appfoundry.previewer.model.AuthSettings r14 = r14.d
                if (r14 == 0) goto L_0x0156
                java.lang.String r5 = r14.f7071h
            L_0x0156:
                if (r5 == 0) goto L_0x01a2
                b.a.a.m.b r14 = b.a.a.m.b.f349m     // Catch:{ Exception -> 0x018d }
                b.p.a.l<com.appfoundry.previewer.model.FirebaseConfigJson> r14 = b.a.a.m.b.f348l     // Catch:{ Exception -> 0x018d }
                java.lang.String r2 = b.a.a.h.m.a(r5)     // Catch:{ Exception -> 0x018d }
                java.lang.Object r14 = r14.b(r2)     // Catch:{ Exception -> 0x018d }
                com.appfoundry.previewer.model.FirebaseConfigJson r14 = (com.appfoundry.previewer.model.FirebaseConfigJson) r14     // Catch:{ Exception -> 0x018d }
                r0.E(r14)     // Catch:{ Exception -> 0x018d }
                int r14 = r1.hashCode()     // Catch:{ Exception -> 0x018d }
                if (r14 == r12) goto L_0x017d
                if (r14 == r11) goto L_0x0172
                goto L_0x0188
            L_0x0172:
                boolean r14 = r1.equals(r10)     // Catch:{ Exception -> 0x018d }
                if (r14 == 0) goto L_0x0188
                r0.A(r8, r7, r6)     // Catch:{ Exception -> 0x018d }
                goto L_0x0256
            L_0x017d:
                boolean r14 = r1.equals(r9)     // Catch:{ Exception -> 0x018d }
                if (r14 == 0) goto L_0x0188
                r0.D(r8, r6)     // Catch:{ Exception -> 0x018d }
                goto L_0x0256
            L_0x0188:
                r0.z(r8, r7, r6)     // Catch:{ Exception -> 0x018d }
                goto L_0x0256
            L_0x018d:
                r14 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r3]
                q.a.a$b r2 = q.a.a.d
                java.lang.String r4 = "Error parsing google-services.json"
                r2.b(r4, r1)
                java.lang.String r14 = r14.getLocalizedMessage()
                r1 = 4
                b.f.a.e.J0(r0, r4, r14, r3, r1)
                if (r6 == 0) goto L_0x0256
                goto L_0x01ad
            L_0x01a2:
                java.lang.String r14 = "Missing json config file"
                android.widget.Toast r14 = android.widget.Toast.makeText(r0, r14, r3)
                r14.show()
                if (r6 == 0) goto L_0x0256
            L_0x01ad:
                b.a.a.h.o.e(r6)
                goto L_0x0256
            L_0x01b2:
                int r14 = r1.hashCode()
                if (r14 == r12) goto L_0x01d7
                if (r14 == r11) goto L_0x01cc
                r3 = 108318258(0x674ce32, float:4.6042788E-35)
                if (r14 == r3) goto L_0x01c1
                goto L_0x0256
            L_0x01c1:
                boolean r14 = r1.equals(r2)
                if (r14 == 0) goto L_0x0256
                r0.z(r8, r7, r6)
                goto L_0x0256
            L_0x01cc:
                boolean r14 = r1.equals(r10)
                if (r14 == 0) goto L_0x0256
                r0.A(r8, r7, r6)
                goto L_0x0256
            L_0x01d7:
                boolean r14 = r1.equals(r9)
                if (r14 == 0) goto L_0x0256
                r0.D(r8, r6)
                goto L_0x0256
            L_0x01e2:
                if (r6 == 0) goto L_0x01e7
                b.a.a.h.o.e(r6)
            L_0x01e7:
                java.lang.String r14 = "Missing email and/or password inputs"
                goto L_0x01f1
            L_0x01ea:
                if (r6 == 0) goto L_0x01ef
                b.a.a.h.o.e(r6)
            L_0x01ef:
                java.lang.String r14 = "PageId is null"
            L_0x01f1:
                android.widget.Toast r14 = android.widget.Toast.makeText(r0, r14, r3)
                r14.show()
                goto L_0x0256
            L_0x01f9:
                com.appfoundry.previewer.activities.BravoActivity r0 = r13.f6944q
                android.widget.RelativeLayout r1 = r13.t
                int r2 = com.appfoundry.previewer.activities.BravoActivity.t
                b.a.a.k.b r2 = new b.a.a.k.b
                androidx.fragment.app.FragmentManager r8 = r0.getSupportFragmentManager()
                java.lang.String r4 = "supportFragmentManager"
                e.x.c.i.d(r8, r4)
                if (r14 == 0) goto L_0x0210
                com.appfoundry.previewer.model.AuthSettings r14 = r14.d
                r9 = r14
                goto L_0x0211
            L_0x0210:
                r9 = r5
            L_0x0211:
                r10 = 0
                r11 = 8
                r6 = r2
                r7 = r0
                r6.<init>(r7, r8, r9, r10, r11)
                com.appfoundry.previewer.BravoApp$b r14 = com.appfoundry.previewer.BravoApp.Q
                com.appfoundry.previewer.BravoApp.C = r2
                androidx.loader.app.LoaderManager r14 = androidx.loader.app.LoaderManager.getInstance(r0)
                java.lang.String r4 = "LoaderManager.getInstance(this@BravoActivity)"
                e.x.c.i.d(r14, r4)
                java.lang.String r4 = "loaderManager"
                e.x.c.i.e(r14, r4)
                androidx.loader.content.Loader r4 = r14.getLoader(r3)
                if (r4 != 0) goto L_0x0235
                r14.initLoader(r3, r5, r2)
                goto L_0x0238
            L_0x0235:
                r14.restartLoader(r3, r5, r2)
            L_0x0238:
                b.a.a.d.h r14 = new b.a.a.d.h
                r14.<init>(r0, r1)
                r2.c = r14
                goto L_0x0256
            L_0x0240:
                com.appfoundry.previewer.activities.BravoActivity r14 = r13.f6944q
                com.appfoundry.previewer.activities.BravoActivity$e$a r0 = new com.appfoundry.previewer.activities.BravoActivity$e$a
                r0.<init>(r13)
                r14.runOnUiThread(r0)
                com.appfoundry.previewer.activities.BravoActivity r14 = r13.f6944q
                T r0 = r6.f7989h
                com.appfoundry.previewer.model.ExchangeResponse r0 = (com.appfoundry.previewer.model.ExchangeResponse) r0
                java.lang.String r0 = r0.f7111b
                r1 = 6
                b.f.a.e.J0(r14, r0, r5, r3, r1)
            L_0x0256:
                e.r r14 = e.r.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.e.d(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((e) a(obj, (e.v.d) obj2)).d(e.r.a);
        }
    }

    public static final class f implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6949h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ BackendResponse f6950i;

        public f(BravoActivity bravoActivity, BackendResponse backendResponse) {
            this.f6949h = bravoActivity;
            this.f6950i = backendResponse;
        }

        public final void run() {
            String str;
            BravoActivity bravoActivity = this.f6949h;
            Params params = this.f6950i.f7073b;
            if (params == null || (str = params.f7147m) == null) {
                str = "Form sent successfully";
            }
            b.f.a.e.D0(bravoActivity, str);
        }
    }

    public static final class g implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6951h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Fragment f6952i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f6953j;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ g f6954h;

            public a(g gVar) {
                this.f6954h = gVar;
            }

            public final void run() {
                g gVar = this.f6954h;
                BravoActivity bravoActivity = gVar.f6951h;
                Fragment fragment = gVar.f6952i;
                RelativeLayout relativeLayout = gVar.f6953j;
                int i2 = BravoActivity.t;
                bravoActivity.y(false, fragment, relativeLayout);
            }
        }

        public g(BravoActivity bravoActivity, Fragment fragment, RelativeLayout relativeLayout) {
            this.f6951h = bravoActivity;
            this.f6952i = fragment;
            this.f6953j = relativeLayout;
        }

        public final void run() {
            new Handler().postDelayed(new a(this), 400);
        }
    }

    public static final class h implements b.g.a.f.a<b.g.a.j.a, b.g.a.e.f.b> {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b.g.a.e.f.h f6955b;
        public final /* synthetic */ RelativeLayout c;

        public h(BravoActivity bravoActivity, b.g.a.e.f.h hVar, RelativeLayout relativeLayout) {
            this.a = bravoActivity;
            this.f6955b = hVar;
            this.c = relativeLayout;
        }

        public void a(Object obj) {
            BravoActivity.b(this.a, this.f6955b, (b.g.a.j.a) obj, this.c);
        }

        public void b(b.g.a.b bVar) {
            b.g.a.e.f.b bVar2 = (b.g.a.e.f.b) bVar;
            BravoActivity.a(this.a, this.c);
        }
    }

    public static final class i implements b.g.a.h.d {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f6956b;
        public final /* synthetic */ b.g.a.e.f.h c;

        public i(BravoActivity bravoActivity, RelativeLayout relativeLayout, b.g.a.e.f.h hVar) {
            this.a = bravoActivity;
            this.f6956b = relativeLayout;
            this.c = hVar;
        }

        public void a(@NonNull b.g.a.j.a aVar) {
            e.x.c.i.e(aVar, "credentials");
            BravoActivity.b(this.a, this.c, aVar, this.f6956b);
        }

        public void b(b.g.a.e.c cVar) {
            e.x.c.i.e(cVar, "exception");
            BravoActivity.a(this.a, this.f6956b);
        }
    }

    public static final class j<TResult> implements b.l.a.c.k.c<Object> {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f6957b;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ j f6958h;

            public a(j jVar) {
                this.f6958h = jVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f6958h.f6957b;
                if (relativeLayout != null) {
                    b.a.a.h.o.e(relativeLayout);
                }
            }
        }

        public j(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.a = bravoActivity;
            this.f6957b = relativeLayout;
        }

        public final void c(b.l.a.c.k.h<Object> hVar) {
            e.x.c.i.e(hVar, "task");
            String str = null;
            if (hVar.n()) {
                BravoApp.b bVar = BravoApp.Q;
                FirebaseAuth firebaseAuth = BravoApp.D;
                b.l.d.o.p pVar = firebaseAuth != null ? firebaseAuth.f : null;
                Object[] objArr = new Object[1];
                if (pVar != null) {
                    str = pVar.V();
                }
                objArr[0] = str;
                q.a.a.d.a("User: %s", objArr);
                BravoActivity.c(this.a, pVar, this.f6957b);
                return;
            }
            this.a.runOnUiThread(new a(this));
            Object[] objArr2 = new Object[1];
            Exception i2 = hVar.i();
            objArr2[0] = i2 != null ? i2.getLocalizedMessage() : null;
            q.a.a.d.b("createUserWithEmail:failure %s", objArr2);
            BravoActivity bravoActivity = this.a;
            Exception i3 = hVar.i();
            if (i3 != null) {
                str = i3.getLocalizedMessage();
            }
            b.f.a.e.J0(bravoActivity, "Login failed", str, 0, 4);
        }
    }

    public static final class k<TResult> implements b.l.a.c.k.c<Object> {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f6959b;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ k f6960h;

            public a(k kVar) {
                this.f6960h = kVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f6960h.f6959b;
                if (relativeLayout != null) {
                    b.a.a.h.o.e(relativeLayout);
                }
            }
        }

        public k(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.a = bravoActivity;
            this.f6959b = relativeLayout;
        }

        public final void c(b.l.a.c.k.h<Object> hVar) {
            e.x.c.i.e(hVar, "task");
            String str = null;
            if (hVar.n()) {
                BravoApp.b bVar = BravoApp.Q;
                FirebaseAuth firebaseAuth = BravoApp.D;
                b.l.d.o.p pVar = firebaseAuth != null ? firebaseAuth.f : null;
                Object[] objArr = new Object[1];
                if (pVar != null) {
                    str = pVar.V();
                }
                objArr[0] = str;
                q.a.a.d.a("User: %s", objArr);
                BravoActivity.c(this.a, pVar, this.f6959b);
                return;
            }
            this.a.runOnUiThread(new a(this));
            Object[] objArr2 = new Object[1];
            Exception i2 = hVar.i();
            objArr2[0] = i2 != null ? i2.getLocalizedMessage() : null;
            q.a.a.d.b("createUserWithEmail:failure %s", objArr2);
            BravoActivity bravoActivity = this.a;
            Exception i3 = hVar.i();
            if (i3 != null) {
                str = i3.getLocalizedMessage();
            }
            b.f.a.e.J0(bravoActivity, "Login failed", str, 0, 4);
        }
    }

    @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onActivityResult$2", f = "BravoActivity.kt", l = {344}, m = "invokeSuspend")
    public static final class l extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super e.r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f6961l;

        /* renamed from: m  reason: collision with root package name */
        public Object f6962m;

        /* renamed from: n  reason: collision with root package name */
        public int f6963n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6964o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ List f6965p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ b.a.a.i.f f6966q;

        public static final class a implements n.g {
            public final /* synthetic */ l a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ UploadInfoResponse f6967b;

            /* renamed from: com.appfoundry.previewer.activities.BravoActivity$l$a$a  reason: collision with other inner class name */
            public static final class C0120a implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ a f6968h;

                public C0120a(a aVar) {
                    this.f6968h = aVar;
                }

                public final void run() {
                    b.a.a.h.o.e(this.f6968h.a.f6966q.f315b);
                }
            }

            public static final class b implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ a f6969h;

                public b(a aVar) {
                    this.f6969h = aVar;
                }

                public final void run() {
                    b.a.a.h.o.e(this.f6969h.a.f6966q.f315b);
                }
            }

            public a(l lVar, UploadInfoResponse uploadInfoResponse) {
                this.a = lVar;
                this.f6967b = uploadInfoResponse;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
                b.q.a.a.A(r7, r6);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(n.f r6, n.h0 r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "call"
                    e.x.c.i.e(r6, r0)
                    java.lang.String r6 = "response"
                    e.x.c.i.e(r7, r6)
                    com.appfoundry.previewer.activities.BravoActivity$l r6 = r5.a
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6964o
                    com.appfoundry.previewer.activities.BravoActivity$l$a$b r0 = new com.appfoundry.previewer.activities.BravoActivity$l$a$b
                    r0.<init>(r5)
                    r6.runOnUiThread(r0)
                    boolean r6 = r7.e()     // Catch:{ all -> 0x007a }
                    r0 = 1
                    r1 = 0
                    if (r6 != 0) goto L_0x002d
                    java.lang.String r6 = "ERROR: %s"
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x007a }
                    r2 = 0
                    java.lang.String r3 = r7.f10102j     // Catch:{ all -> 0x007a }
                    r0[r2] = r3     // Catch:{ all -> 0x007a }
                    q.a.a$b r2 = q.a.a.d     // Catch:{ all -> 0x007a }
                    r2.b(r6, r0)     // Catch:{ all -> 0x007a }
                    goto L_0x0076
                L_0x002d:
                    com.appfoundry.previewer.activities.BravoActivity$l r6 = r5.a     // Catch:{ all -> 0x007a }
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6964o     // Catch:{ all -> 0x007a }
                    java.util.List<b.a.a.i.f> r2 = r6.f6933q     // Catch:{ all -> 0x007a }
                    b.a.a.g.p r6 = r6.f6932p     // Catch:{ all -> 0x007a }
                    if (r6 == 0) goto L_0x003a
                    java.lang.String r6 = r6.f245b     // Catch:{ all -> 0x007a }
                    goto L_0x003b
                L_0x003a:
                    r6 = r1
                L_0x003b:
                    java.lang.String r3 = "$this$setAsFinished"
                    e.x.c.i.e(r2, r3)     // Catch:{ all -> 0x007a }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007a }
                L_0x0044:
                    boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007a }
                    if (r3 == 0) goto L_0x005a
                    java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007a }
                    r4 = r3
                    b.a.a.i.f r4 = (b.a.a.i.f) r4     // Catch:{ all -> 0x007a }
                    java.lang.String r4 = r4.a     // Catch:{ all -> 0x007a }
                    boolean r4 = e.x.c.i.a(r4, r6)     // Catch:{ all -> 0x007a }
                    if (r4 == 0) goto L_0x0044
                    goto L_0x005b
                L_0x005a:
                    r3 = r1
                L_0x005b:
                    b.a.a.i.f r3 = (b.a.a.i.f) r3     // Catch:{ all -> 0x007a }
                    if (r3 == 0) goto L_0x0061
                    r3.c = r0     // Catch:{ all -> 0x007a }
                L_0x0061:
                    com.appfoundry.previewer.activities.BravoActivity$l r6 = r5.a     // Catch:{ all -> 0x007a }
                    java.util.List r0 = r6.f6965p     // Catch:{ all -> 0x007a }
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6964o     // Catch:{ all -> 0x007a }
                    b.a.a.g.p r6 = r6.f6932p     // Catch:{ all -> 0x007a }
                    if (r6 == 0) goto L_0x006e
                    java.lang.String r6 = r6.f245b     // Catch:{ all -> 0x007a }
                    goto L_0x006f
                L_0x006e:
                    r6 = r1
                L_0x006f:
                    com.appfoundry.previewer.model.UploadInfoResponse r2 = r5.f6967b     // Catch:{ all -> 0x007a }
                    java.lang.String r2 = r2.a     // Catch:{ all -> 0x007a }
                    b.f.a.e.M0(r0, r6, r2)     // Catch:{ all -> 0x007a }
                L_0x0076:
                    b.q.a.a.A(r7, r1)
                    return
                L_0x007a:
                    r6 = move-exception
                    throw r6     // Catch:{ all -> 0x007c }
                L_0x007c:
                    r0 = move-exception
                    b.q.a.a.A(r7, r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.l.a.a(n.f, n.h0):void");
            }

            public void b(n.f fVar, IOException iOException) {
                e.x.c.i.e(fVar, NotificationCompat.CATEGORY_CALL);
                e.x.c.i.e(iOException, "e");
                this.a.f6964o.runOnUiThread(new C0120a(this));
                q.a.a.d.b("ERROR: %s", iOException.getMessage());
            }
        }

        @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onActivityResult$2$requestInfo$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super UploadInfoResponse>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6970l;

            public b(e.v.d dVar) {
                super(2, dVar);
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                b bVar = new b(dVar);
                bVar.f6970l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.a.a.n.c.l("image/jpeg");
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(e.r.a);
                return b.a.a.n.c.l("image/jpeg");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(BravoActivity bravoActivity, List list, b.a.a.i.f fVar, e.v.d dVar) {
            super(2, dVar);
            this.f6964o = bravoActivity;
            this.f6965p = list;
            this.f6966q = fVar;
        }

        public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            l lVar = new l(this.f6964o, this.f6965p, this.f6966q, dVar);
            lVar.f6961l = (z) obj;
            return lVar;
        }

        public final Object d(Object obj) {
            Object obj2;
            boolean z;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f6963n;
            String str = null;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f6961l;
                g.a.x xVar = i0.f9955b;
                b bVar = new b((e.v.d) null);
                this.f6962m = zVar;
                this.f6963n = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f6962m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UploadInfoResponse uploadInfoResponse = (UploadInfoResponse) obj;
            List list = this.f6965p;
            e.x.c.i.e(list, "$this$getFile");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((b.a.a.i.d) obj2).d != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            b.a.a.i.d dVar = (b.a.a.i.d) obj2;
            File file = dVar != null ? dVar.d : null;
            if (uploadInfoResponse != null) {
                str = uploadInfoResponse.f7183b;
            }
            if (!(str == null || file == null)) {
                e0.a aVar2 = new e0.a();
                aVar2.g(uploadInfoResponse.f7183b);
                b0.a aVar3 = b0.f10048e;
                b0 a2 = b0.a.a("image/jpeg; charset=utf-8");
                e.x.c.i.e(file, "$this$asRequestBody");
                f0 f0Var = new f0(file, a2);
                e.x.c.i.e(f0Var, "body");
                aVar2.d("PUT", f0Var);
                ((n.m0.g.e) BravoApp.Q.c().a(aVar2.b())).g(new a(this, uploadInfoResponse));
            }
            return e.r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            e.v.d dVar = (e.v.d) obj2;
            e.x.c.i.e(dVar, "completion");
            l lVar = new l(this.f6964o, this.f6965p, this.f6966q, dVar);
            lVar.f6961l = (z) obj;
            return lVar.d(e.r.a);
        }
    }

    @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onActivityResult$4", f = "BravoActivity.kt", l = {415}, m = "invokeSuspend")
    public static final class m extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super e.r>, Object> {

        /* renamed from: l  reason: collision with root package name */
        public z f6971l;

        /* renamed from: m  reason: collision with root package name */
        public Object f6972m;

        /* renamed from: n  reason: collision with root package name */
        public int f6973n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6974o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ b.f.a.a f6975p;

        /* renamed from: q  reason: collision with root package name */
        public final /* synthetic */ e.x.c.s f6976q;
        public final /* synthetic */ b.a.a.i.e r;
        public final /* synthetic */ List s;

        public static final class a implements n.g {
            public final /* synthetic */ m a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ UploadInfoResponse f6977b;

            /* renamed from: com.appfoundry.previewer.activities.BravoActivity$m$a$a  reason: collision with other inner class name */
            public static final class C0121a implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ a f6978h;

                public C0121a(a aVar) {
                    this.f6978h = aVar;
                }

                public final void run() {
                    b.a.a.h.o.e(this.f6978h.a.r.f314b);
                }
            }

            public static final class b implements Runnable {

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ a f6979h;

                public b(a aVar) {
                    this.f6979h = aVar;
                }

                public final void run() {
                    b.a.a.h.o.e(this.f6979h.a.r.f314b);
                }
            }

            public a(m mVar, UploadInfoResponse uploadInfoResponse) {
                this.a = mVar;
                this.f6977b = uploadInfoResponse;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
                b.q.a.a.A(r7, r6);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void a(n.f r6, n.h0 r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "call"
                    e.x.c.i.e(r6, r0)
                    java.lang.String r6 = "response"
                    e.x.c.i.e(r7, r6)
                    com.appfoundry.previewer.activities.BravoActivity$m r6 = r5.a
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6974o
                    com.appfoundry.previewer.activities.BravoActivity$m$a$b r0 = new com.appfoundry.previewer.activities.BravoActivity$m$a$b
                    r0.<init>(r5)
                    r6.runOnUiThread(r0)
                    boolean r6 = r7.e()     // Catch:{ all -> 0x007a }
                    r0 = 1
                    r1 = 0
                    if (r6 != 0) goto L_0x002d
                    java.lang.String r6 = "ERROR: %s"
                    java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x007a }
                    r2 = 0
                    java.lang.String r3 = r7.f10102j     // Catch:{ all -> 0x007a }
                    r0[r2] = r3     // Catch:{ all -> 0x007a }
                    q.a.a$b r2 = q.a.a.d     // Catch:{ all -> 0x007a }
                    r2.b(r6, r0)     // Catch:{ all -> 0x007a }
                    goto L_0x0076
                L_0x002d:
                    com.appfoundry.previewer.activities.BravoActivity$m r6 = r5.a     // Catch:{ all -> 0x007a }
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6974o     // Catch:{ all -> 0x007a }
                    java.util.List<b.a.a.i.e> r2 = r6.s     // Catch:{ all -> 0x007a }
                    b.a.a.g.o r6 = r6.r     // Catch:{ all -> 0x007a }
                    if (r6 == 0) goto L_0x003a
                    java.lang.String r6 = r6.f244b     // Catch:{ all -> 0x007a }
                    goto L_0x003b
                L_0x003a:
                    r6 = r1
                L_0x003b:
                    java.lang.String r3 = "$this$setFinished"
                    e.x.c.i.e(r2, r3)     // Catch:{ all -> 0x007a }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x007a }
                L_0x0044:
                    boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007a }
                    if (r3 == 0) goto L_0x005a
                    java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007a }
                    r4 = r3
                    b.a.a.i.e r4 = (b.a.a.i.e) r4     // Catch:{ all -> 0x007a }
                    java.lang.String r4 = r4.a     // Catch:{ all -> 0x007a }
                    boolean r4 = e.x.c.i.a(r4, r6)     // Catch:{ all -> 0x007a }
                    if (r4 == 0) goto L_0x0044
                    goto L_0x005b
                L_0x005a:
                    r3 = r1
                L_0x005b:
                    b.a.a.i.e r3 = (b.a.a.i.e) r3     // Catch:{ all -> 0x007a }
                    if (r3 == 0) goto L_0x0061
                    r3.c = r0     // Catch:{ all -> 0x007a }
                L_0x0061:
                    com.appfoundry.previewer.activities.BravoActivity$m r6 = r5.a     // Catch:{ all -> 0x007a }
                    java.util.List r0 = r6.s     // Catch:{ all -> 0x007a }
                    com.appfoundry.previewer.activities.BravoActivity r6 = r6.f6974o     // Catch:{ all -> 0x007a }
                    b.a.a.g.p r6 = r6.f6932p     // Catch:{ all -> 0x007a }
                    if (r6 == 0) goto L_0x006e
                    java.lang.String r6 = r6.f245b     // Catch:{ all -> 0x007a }
                    goto L_0x006f
                L_0x006e:
                    r6 = r1
                L_0x006f:
                    com.appfoundry.previewer.model.UploadInfoResponse r2 = r5.f6977b     // Catch:{ all -> 0x007a }
                    java.lang.String r2 = r2.a     // Catch:{ all -> 0x007a }
                    b.f.a.e.M0(r0, r6, r2)     // Catch:{ all -> 0x007a }
                L_0x0076:
                    b.q.a.a.A(r7, r1)
                    return
                L_0x007a:
                    r6 = move-exception
                    throw r6     // Catch:{ all -> 0x007c }
                L_0x007c:
                    r0 = move-exception
                    b.q.a.a.A(r7, r6)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.m.a.a(n.f, n.h0):void");
            }

            public void b(n.f fVar, IOException iOException) {
                e.x.c.i.e(fVar, NotificationCompat.CATEGORY_CALL);
                e.x.c.i.e(iOException, "e");
                this.a.f6974o.runOnUiThread(new C0121a(this));
                q.a.a.d.b("ERROR: %s", iOException.getMessage());
            }
        }

        @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onActivityResult$4$requestInfo$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
        public static final class b extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super UploadInfoResponse>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6980l;

            /* renamed from: m  reason: collision with root package name */
            public final /* synthetic */ m f6981m;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(m mVar, e.v.d dVar) {
                super(2, dVar);
                this.f6981m = mVar;
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                b bVar = new b(this.f6981m, dVar);
                bVar.f6980l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                b.q.a.a.c3(obj);
                return b.a.a.n.c.l(this.f6981m.f6975p.f400l);
            }

            public final Object invoke(Object obj, Object obj2) {
                e.v.d dVar = (e.v.d) obj2;
                e.x.c.i.e(dVar, "completion");
                m mVar = this.f6981m;
                dVar.getContext();
                z zVar = (z) obj;
                b.q.a.a.c3(e.r.a);
                return b.a.a.n.c.l(mVar.f6975p.f400l);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(BravoActivity bravoActivity, b.f.a.a aVar, e.x.c.s sVar, b.a.a.i.e eVar, List list, e.v.d dVar) {
            super(2, dVar);
            this.f6974o = bravoActivity;
            this.f6975p = aVar;
            this.f6976q = sVar;
            this.r = eVar;
            this.s = list;
        }

        public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
            e.x.c.i.e(dVar, "completion");
            m mVar = new m(this.f6974o, this.f6975p, this.f6976q, this.r, this.s, dVar);
            mVar.f6971l = (z) obj;
            return mVar;
        }

        public final Object d(Object obj) {
            byte[] bArr;
            e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
            int i2 = this.f6973n;
            String str = null;
            if (i2 == 0) {
                b.q.a.a.c3(obj);
                z zVar = this.f6971l;
                g.a.x xVar = i0.f9955b;
                b bVar = new b(this, (e.v.d) null);
                this.f6972m = zVar;
                this.f6973n = 1;
                obj = e.a.a.a.y0.m.o1.c.u0(xVar, bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                z zVar2 = (z) this.f6972m;
                b.q.a.a.c3(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UploadInfoResponse uploadInfoResponse = (UploadInfoResponse) obj;
            InputStream openInputStream = this.f6974o.getContentResolver().openInputStream(this.f6975p.f396h);
            int i3 = 0;
            if (openInputStream != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int read = openInputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } else {
                bArr = null;
            }
            e.x.c.s sVar = this.f6976q;
            if (bArr != null) {
                i3 = new Integer(bArr.length).intValue();
            }
            sVar.f7987h = i3;
            if (uploadInfoResponse != null) {
                str = uploadInfoResponse.f7183b;
            }
            if (!(str == null || bArr == null)) {
                e0.a aVar2 = new e0.a();
                aVar2.g(uploadInfoResponse.f7183b);
                g0.a aVar3 = g0.a;
                b0.a aVar4 = b0.f10048e;
                g0 c = g0.a.c(aVar3, bArr, b0.a.a(e.x.c.i.k(this.f6975p.f400l, "; charset=utf-8")), 0, 0, 6);
                e.x.c.i.e(c, "body");
                aVar2.d("PUT", c);
                ((n.m0.g.e) BravoApp.Q.c().a(aVar2.b())).g(new a(this, uploadInfoResponse));
            }
            return e.r.a;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((m) a(obj, (e.v.d) obj2)).d(e.r.a);
        }
    }

    public static final class n implements PermissionListener {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b.a.a.g.g f6982b;

        public n(BravoActivity bravoActivity, b.a.a.g.g gVar) {
            this.a = bravoActivity;
            this.f6982b = gVar;
        }

        public void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
            q.a.a.d.b("Permission denied for file download: %s", this.f6982b.a);
        }

        public void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
            String str;
            BravoActivity bravoActivity = this.a;
            String str2 = this.f6982b.a;
            int i2 = BravoActivity.t;
            Objects.requireNonNull(bravoActivity);
            e.x.c.i.e(str2, "$this$getFilename");
            String substring = str2.substring(b.a.a.h.m.j(str2, "/", 1, true) + 1);
            e.x.c.i.d(substring, "(this as java.lang.String).substring(startIndex)");
            e.x.c.i.e(substring, "$this$extension");
            String substring2 = substring.substring(e.c0.h.o(substring, '.', 0, false, 6) + 1);
            e.x.c.i.d(substring2, "(this as java.lang.String).substring(startIndex)");
            e.x.c.i.e(substring2, "$this$isImage");
            if (e.c0.h.f(substring2, "png", true) || e.c0.h.f(substring2, "jpg", true) || e.c0.h.f(substring2, "jpeg", true) || e.c0.h.f(substring2, "gif", true)) {
                str = Environment.DIRECTORY_PICTURES;
            } else {
                e.x.c.i.e(substring2, "$this$isVideo");
                if (e.c0.h.f(substring2, "mp4", true) || e.c0.h.f(substring2, "3gp", true) || e.c0.h.f(substring2, "mpeg", true) || e.c0.h.f(substring2, "mov", true)) {
                    str = Environment.DIRECTORY_MOVIES;
                } else {
                    e.x.c.i.e(substring2, "$this$isDocument");
                    if (e.c0.h.f(substring2, "pdf", true) || e.c0.h.f(substring2, "txt", true) || e.c0.h.f(substring2, "doc", true) || e.c0.h.f(substring2, "docx", true) || e.c0.h.f(substring2, "xls", true)) {
                        str = Environment.DIRECTORY_DOCUMENTS;
                    } else {
                        e.x.c.i.e(substring2, "$this$isAudio");
                        str = e.c0.h.f(substring2, "mp3", true) || e.c0.h.f(substring2, "wav", true) || e.c0.h.f(substring2, "m4a", true) || e.c0.h.f(substring2, "aac", true) || e.c0.h.f(substring2, "ogg", true) ? Environment.DIRECTORY_MUSIC : Environment.DIRECTORY_DOWNLOADS;
                    }
                }
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
            DownloadManager.Request title = request.setAllowedNetworkTypes(3).setAllowedOverRoaming(false).setTitle(substring);
            DownloadManager.Request notificationVisibility = title.setDescription("Downloading " + substring).setNotificationVisibility(1);
            notificationVisibility.setDestinationInExternalPublicDir(str, File.separator + substring).allowScanningByMediaScanner();
            Object systemService = bravoActivity.getSystemService("download");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
            ((DownloadManager) systemService).enqueue(request);
            Toast.makeText(bravoActivity, "Downloading " + substring, 0).show();
        }

        public void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        }
    }

    public static final class o extends e.x.c.k implements e.x.b.l<b.k.b.a.c.a, e.r> {

        /* renamed from: h  reason: collision with root package name */
        public static final o f6983h = new o();

        public o() {
            super(1);
        }

        public Object invoke(Object obj) {
            b.k.b.a.c.a aVar = (b.k.b.a.c.a) obj;
            e.x.c.i.e(aVar, "imageProvider");
            q.a.a.d.a("Selected ImageProvider: %s", aVar.name());
            return e.r.a;
        }
    }

    public static final class p implements b.g.a.h.u {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b.g.a.e.f.a f6984b;

        public p(BravoActivity bravoActivity, b.g.a.e.f.a aVar) {
            this.a = bravoActivity;
            this.f6984b = aVar;
        }

        public void a(Object obj) {
            Void voidR = (Void) obj;
            b.g.a.e.f.a aVar = this.f6984b;
            aVar.a.e("com.auth0.access_token");
            aVar.a.e("com.auth0.refresh_token");
            aVar.a.e("com.auth0.id_token");
            aVar.a.e("com.auth0.token_type");
            aVar.a.e("com.auth0.expires_at");
            aVar.a.e("com.auth0.scope");
            aVar.a.e("com.auth0.cache_expires_at");
            BravoActivity bravoActivity = this.a;
            int i2 = BravoActivity.t;
            bravoActivity.C();
        }

        public void b(b.g.a.b bVar) {
            e.x.c.i.e(bVar, "error");
            q.a.a.d.b("ERROR: onFailure dialog: %s", bVar.getLocalizedMessage());
        }
    }

    public static final class q implements Runnable {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f6985h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b.a.a.g.v f6986i;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ Fragment f6987h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ q f6988i;

            public a(Fragment fragment, q qVar, e.x.c.u uVar) {
                this.f6987h = fragment;
                this.f6988i = qVar;
            }

            public final void run() {
                BravoActivity bravoActivity = this.f6988i.f6985h;
                Fragment fragment = this.f6987h;
                int i2 = BravoActivity.t;
                bravoActivity.y(false, fragment, (RelativeLayout) null);
            }
        }

        @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onNavigationEvent$1$1", f = "BravoActivity.kt", l = {539}, m = "invokeSuspend")
        public static final class b extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super e.r>, Object> {

            /* renamed from: l  reason: collision with root package name */
            public z f6989l;

            /* renamed from: m  reason: collision with root package name */
            public Object f6990m;

            /* renamed from: n  reason: collision with root package name */
            public int f6991n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ q f6992o;

            /* renamed from: p  reason: collision with root package name */
            public final /* synthetic */ e.x.c.u f6993p;

            /* renamed from: q  reason: collision with root package name */
            public final /* synthetic */ RelativeLayout f6994q;
            public final /* synthetic */ String r;

            @e.v.j.a.e(c = "com.appfoundry.previewer.activities.BravoActivity$onNavigationEvent$1$1$remoteResponse$1", f = "BravoActivity.kt", l = {}, m = "invokeSuspend")
            public static final class a extends e.v.j.a.h implements e.x.b.p<z, e.v.d<? super b.a.a.i.j>, Object> {

                /* renamed from: l  reason: collision with root package name */
                public z f6995l;

                /* renamed from: m  reason: collision with root package name */
                public final /* synthetic */ b f6996m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar, e.v.d dVar) {
                    super(2, dVar);
                    this.f6996m = bVar;
                }

                public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                    e.x.c.i.e(dVar, "completion");
                    a aVar = new a(this.f6996m, dVar);
                    aVar.f6995l = (z) obj;
                    return aVar;
                }

                public final Object d(Object obj) {
                    b.q.a.a.c3(obj);
                    return b.a.a.n.c.i((Page) this.f6996m.f6993p.f7989h, false, 2);
                }

                public final Object invoke(Object obj, Object obj2) {
                    e.v.d dVar = (e.v.d) obj2;
                    e.x.c.i.e(dVar, "completion");
                    b bVar = this.f6996m;
                    dVar.getContext();
                    z zVar = (z) obj;
                    b.q.a.a.c3(e.r.a);
                    return b.a.a.n.c.i((Page) bVar.f6993p.f7989h, false, 2);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(q qVar, e.x.c.u uVar, RelativeLayout relativeLayout, String str, e.v.d dVar) {
                super(2, dVar);
                this.f6992o = qVar;
                this.f6993p = uVar;
                this.f6994q = relativeLayout;
                this.r = str;
            }

            public final e.v.d<e.r> a(Object obj, e.v.d<?> dVar) {
                e.x.c.i.e(dVar, "completion");
                b bVar = new b(this.f6992o, this.f6993p, this.f6994q, this.r, dVar);
                bVar.f6989l = (z) obj;
                return bVar;
            }

            public final Object d(Object obj) {
                e.v.i.a aVar = e.v.i.a.COROUTINE_SUSPENDED;
                int i2 = this.f6991n;
                T t = null;
                if (i2 == 0) {
                    b.q.a.a.c3(obj);
                    z zVar = this.f6989l;
                    g.a.x xVar = i0.f9955b;
                    a aVar2 = new a(this, (e.v.d) null);
                    this.f6990m = zVar;
                    this.f6991n = 1;
                    obj = e.a.a.a.y0.m.o1.c.u0(xVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    z zVar2 = (z) this.f6990m;
                    b.q.a.a.c3(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.a.a.i.j jVar = (b.a.a.i.j) obj;
                RelativeLayout relativeLayout = this.f6994q;
                e.x.c.i.d(relativeLayout, "loading");
                b.a.a.h.o.e(relativeLayout);
                e.x.c.u uVar = this.f6993p;
                if (jVar != null) {
                    t = jVar.a;
                }
                uVar.f7989h = t;
                if (t != null) {
                    t.f7132k = this.r;
                }
                BravoActivity.e(this.f6992o.f6985h, t);
                return e.r.a;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((b) a(obj, (e.v.d) obj2)).d(e.r.a);
            }
        }

        public q(BravoActivity bravoActivity, b.a.a.g.v vVar) {
            this.f6985h = bravoActivity;
            this.f6986i = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
            if ((r0 != null ? r0.K : null) == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
            if (r0.f == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if (r0 != null) goto L_0x0031;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                b.a.a.g.v r0 = r12.f6986i
                java.lang.String r0 = r0.f250b
                b.a.a.n.f.L(r0)
                e.x.c.u r3 = new e.x.c.u
                r3.<init>()
                b.a.a.g.v r0 = r12.f6986i
                java.lang.String r1 = r0.a
                java.lang.String r0 = r0.f250b
                r2 = 0
                r4 = 1
                if (r0 == 0) goto L_0x002d
                boolean r5 = b.a.a.h.m.h(r0)
                if (r5 != r4) goto L_0x002d
                com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.Q
                java.util.Map<java.lang.String, com.appfoundry.previewer.model.Page> r5 = com.appfoundry.previewer.BravoApp.f6916p
                if (r5 == 0) goto L_0x0029
                java.lang.Object r0 = r5.get(r0)
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                goto L_0x002a
            L_0x0029:
                r0 = r2
            L_0x002a:
                if (r0 == 0) goto L_0x002d
                goto L_0x0031
            L_0x002d:
                com.appfoundry.previewer.model.Page r0 = b.a.a.n.f.n(r1)
            L_0x0031:
                r3.f7989h = r0
                r1 = 0
                if (r0 == 0) goto L_0x00c5
                boolean r0 = b.a.a.h.e.C(r0)
                if (r0 != r4) goto L_0x00c5
                T r0 = r3.f7989h
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                java.lang.String r5 = "$this$shouldGetRemoteData"
                e.x.c.i.e(r0, r5)
                java.lang.Boolean r5 = b.a.a.h.e.B(r0)
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                boolean r5 = e.x.c.i.a(r5, r6)
                if (r5 == 0) goto L_0x0069
                java.lang.String r5 = r0.f7132k
                if (r5 == 0) goto L_0x007c
                java.util.List<com.appfoundry.previewer.model.Container> r5 = r0.f
                if (r5 != 0) goto L_0x007c
                java.lang.String r0 = r0.r
                r5 = 2
                com.appfoundry.previewer.model.Style r0 = b.a.a.n.f.u(r0, r2, r5)
                if (r0 == 0) goto L_0x0065
                java.lang.Integer r0 = r0.K
                goto L_0x0066
            L_0x0065:
                r0 = r2
            L_0x0066:
                if (r0 != 0) goto L_0x007c
                goto L_0x007b
            L_0x0069:
                java.lang.Boolean r5 = b.a.a.h.e.D(r0)
                boolean r5 = e.x.c.i.a(r5, r6)
                if (r5 == 0) goto L_0x007c
                java.lang.String r5 = r0.f7132k
                if (r5 == 0) goto L_0x007c
                java.util.List<com.appfoundry.previewer.model.Container> r0 = r0.f
                if (r0 != 0) goto L_0x007c
            L_0x007b:
                r1 = r4
            L_0x007c:
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f6985h
                if (r1 == 0) goto L_0x00bd
                r1 = 2131231009(0x7f080121, float:1.8078087E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
                java.lang.String r1 = "loading"
                e.x.c.i.d(r0, r1)
                b.a.a.h.o.l(r0)
                T r1 = r3.f7989h
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                java.lang.String r5 = r1.f7132k
                g.a.x r1 = g.a.i0.a
                g.a.h1 r1 = g.a.a.m.f9916b
                g.a.p r2 = e.a.a.a.y0.m.o1.c.c(r2, r4, r2)
                e.v.f r1 = r1.plus(r2)
                g.a.z r7 = e.a.a.a.y0.m.o1.c.b(r1)
                r8 = 0
                r9 = 0
                com.appfoundry.previewer.activities.BravoActivity$q$b r10 = new com.appfoundry.previewer.activities.BravoActivity$q$b
                r6 = 0
                r1 = r10
                r2 = r12
                r4 = r0
                r1.<init>(r2, r3, r4, r5, r6)
                r0 = 3
                r11 = 0
                r6 = r7
                r7 = r8
                r8 = r9
                r9 = r10
                r10 = r0
                e.a.a.a.y0.m.o1.c.S(r6, r7, r8, r9, r10, r11)
                goto L_0x0111
            L_0x00bd:
                T r1 = r3.f7989h
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                com.appfoundry.previewer.activities.BravoActivity.e(r0, r1)
                goto L_0x0111
            L_0x00c5:
                T r0 = r3.f7989h
                com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
                if (r0 == 0) goto L_0x0111
                boolean r2 = b.a.a.h.e.E(r0)
                if (r2 == 0) goto L_0x0105
                com.appfoundry.previewer.activities.BravoActivity r2 = r12.f6985h
                com.appfoundry.previewer.BravoApp$b r5 = com.appfoundry.previewer.BravoApp.Q
                java.lang.String r5 = com.appfoundry.previewer.BravoApp.O
                androidx.fragment.app.Fragment r2 = b.f.a.e.t(r2, r5)
                if (r2 == 0) goto L_0x00e7
                com.appfoundry.previewer.activities.BravoActivity r5 = r12.f6985h
                com.appfoundry.previewer.activities.BravoActivity$q$a r6 = new com.appfoundry.previewer.activities.BravoActivity$q$a
                r6.<init>(r2, r12, r3)
                r5.runOnUiThread(r6)
            L_0x00e7:
                java.lang.String r2 = "$this$shouldShowLoading"
                e.x.c.i.e(r0, r2)
                boolean r2 = b.a.a.h.e.v(r0)
                if (r2 == r4) goto L_0x00f8
                java.util.List<com.appfoundry.previewer.model.Container> r0 = r0.f
                if (r0 != 0) goto L_0x00f7
                goto L_0x00f8
            L_0x00f7:
                r4 = r1
            L_0x00f8:
                if (r4 == 0) goto L_0x0105
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f6985h
                T r1 = r3.f7989h
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                int r2 = com.appfoundry.previewer.activities.BravoActivity.t
                r0.q(r1)
            L_0x0105:
                com.appfoundry.previewer.activities.BravoActivity r0 = r12.f6985h
                T r1 = r3.f7989h
                com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
                r2 = 2131230858(0x7f08008a, float:1.807778E38)
                b.f.a.e.u0(r0, r1, r2)
            L_0x0111:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.q.run():void");
        }
    }

    public static final class r implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ View a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b.a.a.g.f0 f6997b;

        public r(View view, b.a.a.g.f0 f0Var) {
            this.a = view;
            this.f6997b = f0Var;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            Object obj;
            View view;
            q.a.a.d.a(">>>> MYMEDIAPLAYER completed", new Object[0]);
            View view2 = this.a;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            BravoApp.b bVar = BravoApp.Q;
            List list = BravoApp.F.get(this.f6997b.f240b);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (e.x.c.i.a(((b.a.a.i.a) obj).c, "action:pause")) {
                        break;
                    }
                }
                b.a.a.i.a aVar = (b.a.a.i.a) obj;
                if (aVar != null && (view = aVar.d) != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    public static final class s implements MediaPlayer.OnErrorListener {
        public final /* synthetic */ View a;

        public s(View view) {
            this.a = view;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            q.a.a.d.b(">>>> MYMEDIAPLAYER error: %s, %s", String.valueOf(i2), String.valueOf(i3));
            View view = this.a;
            if (view != null) {
                view.setVisibility(8);
            }
            return true;
        }
    }

    public static final class t implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f6998b;
        public final /* synthetic */ View c;
        public final /* synthetic */ b.a.a.g.f0 d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f6999e;

        public t(BravoActivity bravoActivity, View view, View view2, b.a.a.g.f0 f0Var, MediaPlayer mediaPlayer) {
            this.a = bravoActivity;
            this.f6998b = view;
            this.c = view2;
            this.d = f0Var;
            this.f6999e = mediaPlayer;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            q.a.a.d.a(">>>> MYMEDIAPLAYER prepared", new Object[0]);
            View view = this.f6998b;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.c;
            if (view2 != null) {
                view2.setClickable(true);
            }
            b.a.a.g.f0 f0Var = this.d;
            b.a.a.i.g gVar = new b.a.a.i.g(f0Var.f240b, f0Var.a, this.f6999e, new Handler(), this.d.c);
            BravoApp.b bVar = BravoApp.Q;
            BravoApp.G = gVar;
            BravoActivity bravoActivity = this.a;
            b.a.a.g.f0 f0Var2 = this.d;
            int i2 = BravoActivity.t;
            bravoActivity.p(f0Var2);
        }
    }

    public static final class u implements DialogInterface.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ BravoActivity f7000h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ b.a.a.g.i0 f7001i;

        public u(BravoActivity bravoActivity, b.a.a.g.i0 i0Var) {
            this.f7000h = bravoActivity;
            this.f7001i = i0Var;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            BravoActivity bravoActivity = this.f7000h;
            String str = this.f7001i.f241b;
            int i3 = BravoActivity.t;
            bravoActivity.H(str);
        }
    }

    public static final class v implements DialogInterface.OnClickListener {

        /* renamed from: h  reason: collision with root package name */
        public static final v f7002h = new v();

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public static final class w<TResult> implements b.l.a.c.k.c<Void> {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f7003b;

        public w(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.a = bravoActivity;
            this.f7003b = relativeLayout;
        }

        public final void c(b.l.a.c.k.h<Void> hVar) {
            e.x.c.i.e(hVar, "task");
            RelativeLayout relativeLayout = this.f7003b;
            if (relativeLayout != null) {
                b.a.a.h.o.e(relativeLayout);
            }
            String str = null;
            if (hVar.n()) {
                b.f.a.e.J0(this.a, "Check your email to reset your password", (String) null, 0, 6);
                return;
            }
            BravoActivity bravoActivity = this.a;
            Exception i2 = hVar.i();
            if (i2 != null) {
                str = i2.getLocalizedMessage();
            }
            b.f.a.e.J0(bravoActivity, "Error occurred sending reset email", str, 0, 4);
        }
    }

    public static final class x implements n.g {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e.x.c.u f7004b;
        public final /* synthetic */ e.x.c.u c;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ x f7005h;

            public a(x xVar) {
                this.f7005h = xVar;
            }

            public final void run() {
                x xVar = this.f7005h;
                int i2 = BravoActivity.t;
                xVar.a.y(false, (Fragment) xVar.f7004b.f7989h, (RelativeLayout) xVar.c.f7989h);
            }
        }

        public static final class b implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ x f7006h;

            public b(x xVar, h0 h0Var) {
                this.f7006h = xVar;
            }

            public final void run() {
                x xVar = this.f7006h;
                int i2 = BravoActivity.t;
                xVar.a.y(false, (Fragment) xVar.f7004b.f7989h, (RelativeLayout) xVar.c.f7989h);
            }
        }

        public x(BravoActivity bravoActivity, e.x.c.u uVar, e.x.c.u uVar2) {
            this.a = bravoActivity;
            this.f7004b = uVar;
            this.c = uVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
            b.q.a.a.A(r10, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(n.f r9, n.h0 r10) {
            /*
                r8 = this;
                java.lang.String r0 = "call"
                e.x.c.i.e(r9, r0)
                java.lang.String r9 = "response"
                e.x.c.i.e(r10, r9)
                boolean r9 = r10.e()     // Catch:{ all -> 0x0074 }
                r0 = 0
                r1 = 0
                if (r9 != 0) goto L_0x0035
                com.appfoundry.previewer.activities.BravoActivity r9 = r8.a     // Catch:{ all -> 0x0074 }
                com.appfoundry.previewer.activities.BravoActivity$x$b r2 = new com.appfoundry.previewer.activities.BravoActivity$x$b     // Catch:{ all -> 0x0074 }
                r2.<init>(r8, r10)     // Catch:{ all -> 0x0074 }
                r9.runOnUiThread(r2)     // Catch:{ all -> 0x0074 }
                com.appfoundry.previewer.activities.BravoActivity r9 = r8.a     // Catch:{ all -> 0x0074 }
                java.lang.String r2 = "ERROR: Form was not sent"
                java.lang.String r3 = r10.f10102j     // Catch:{ all -> 0x0074 }
                r4 = 4
                b.f.a.e.J0(r9, r2, r3, r1, r4)     // Catch:{ all -> 0x0074 }
                java.lang.String r9 = "ERROR: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r10.f10102j     // Catch:{ all -> 0x0074 }
                r2[r1] = r3     // Catch:{ all -> 0x0074 }
                q.a.a$b r1 = q.a.a.d     // Catch:{ all -> 0x0074 }
                r1.b(r9, r2)     // Catch:{ all -> 0x0074 }
                goto L_0x0070
            L_0x0035:
                n.j0 r9 = r10.f10106n     // Catch:{ all -> 0x0074 }
                if (r9 == 0) goto L_0x003e
                java.lang.String r9 = r9.z()     // Catch:{ all -> 0x0074 }
                goto L_0x003f
            L_0x003e:
                r9 = r0
            L_0x003f:
                r2 = 6
                java.lang.String r3 = "ERROR: Form response is null"
                if (r9 == 0) goto L_0x006b
                com.appfoundry.previewer.activities.BravoActivity r4 = r8.a     // Catch:{ Exception -> 0x0062 }
                b.a.a.m.b r5 = b.a.a.m.b.f349m     // Catch:{ Exception -> 0x0062 }
                b.p.a.l<com.appfoundry.previewer.model.BackendResponse> r5 = b.a.a.m.b.f347k     // Catch:{ Exception -> 0x0062 }
                java.lang.Object r9 = r5.b(r9)     // Catch:{ Exception -> 0x0062 }
                com.appfoundry.previewer.model.BackendResponse r9 = (com.appfoundry.previewer.model.BackendResponse) r9     // Catch:{ Exception -> 0x0062 }
                e.x.c.u r5 = r8.c     // Catch:{ Exception -> 0x0062 }
                T r5 = r5.f7989h     // Catch:{ Exception -> 0x0062 }
                android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5     // Catch:{ Exception -> 0x0062 }
                e.x.c.u r6 = r8.f7004b     // Catch:{ Exception -> 0x0062 }
                T r6 = r6.f7989h     // Catch:{ Exception -> 0x0062 }
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6     // Catch:{ Exception -> 0x0062 }
                int r7 = com.appfoundry.previewer.activities.BravoActivity.t     // Catch:{ Exception -> 0x0062 }
                r4.w(r9, r5, r6)     // Catch:{ Exception -> 0x0062 }
                goto L_0x0070
            L_0x0062:
                java.lang.String r9 = "Error parsing FormResponse"
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x0074 }
                q.a.a$b r5 = q.a.a.d     // Catch:{ all -> 0x0074 }
                r5.b(r9, r4)     // Catch:{ all -> 0x0074 }
            L_0x006b:
                com.appfoundry.previewer.activities.BravoActivity r9 = r8.a     // Catch:{ all -> 0x0074 }
                b.f.a.e.J0(r9, r3, r0, r1, r2)     // Catch:{ all -> 0x0074 }
            L_0x0070:
                b.q.a.a.A(r10, r0)
                return
            L_0x0074:
                r9 = move-exception
                throw r9     // Catch:{ all -> 0x0076 }
            L_0x0076:
                r0 = move-exception
                b.q.a.a.A(r10, r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.x.a(n.f, n.h0):void");
        }

        public void b(n.f fVar, IOException iOException) {
            e.x.c.i.e(fVar, NotificationCompat.CATEGORY_CALL);
            e.x.c.i.e(iOException, "e");
            this.a.runOnUiThread(new a(this));
            b.f.a.e.J0(this.a, "ERROR: Form was not sent", iOException.getMessage(), 0, 4);
        }
    }

    public static final class y implements n.g {
        public final /* synthetic */ BravoActivity a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f7007b;

        public static final class a implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ y f7008h;

            public a(y yVar) {
                this.f7008h = yVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f7008h.f7007b;
                if (relativeLayout != null) {
                    b.a.a.h.o.e(relativeLayout);
                }
            }
        }

        public static final class b implements Runnable {

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ y f7009h;

            public b(y yVar) {
                this.f7009h = yVar;
            }

            public final void run() {
                RelativeLayout relativeLayout = this.f7009h.f7007b;
                if (relativeLayout != null) {
                    b.a.a.h.o.e(relativeLayout);
                }
            }
        }

        public y(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
            this.a = bravoActivity;
            this.f7007b = relativeLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
            b.q.a.a.A(r8, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(n.f r7, n.h0 r8) {
            /*
                r6 = this;
                java.lang.String r0 = "call"
                e.x.c.i.e(r7, r0)
                java.lang.String r7 = "response"
                e.x.c.i.e(r8, r7)
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.a
                com.appfoundry.previewer.activities.BravoActivity$y$b r0 = new com.appfoundry.previewer.activities.BravoActivity$y$b
                r0.<init>(r6)
                r7.runOnUiThread(r0)
                boolean r7 = r8.e()     // Catch:{ all -> 0x0068 }
                r0 = 0
                r1 = 0
                if (r7 != 0) goto L_0x0035
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.a     // Catch:{ all -> 0x0068 }
                java.lang.String r2 = "ERROR: Remote Action not successful. "
                java.lang.String r3 = r8.f10102j     // Catch:{ all -> 0x0068 }
                r4 = 4
                b.f.a.e.J0(r7, r2, r3, r0, r4)     // Catch:{ all -> 0x0068 }
                java.lang.String r7 = "Remote Action ERROR: %s"
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0068 }
                java.lang.String r3 = r8.f10102j     // Catch:{ all -> 0x0068 }
                r2[r0] = r3     // Catch:{ all -> 0x0068 }
                q.a.a$b r0 = q.a.a.d     // Catch:{ all -> 0x0068 }
                r0.b(r7, r2)     // Catch:{ all -> 0x0068 }
                goto L_0x0064
            L_0x0035:
                n.j0 r7 = r8.f10106n     // Catch:{ all -> 0x0068 }
                if (r7 == 0) goto L_0x003e
                java.lang.String r7 = r7.z()     // Catch:{ all -> 0x0068 }
                goto L_0x003f
            L_0x003e:
                r7 = r1
            L_0x003f:
                r2 = 6
                java.lang.String r3 = "ERROR: Backend response is null"
                if (r7 == 0) goto L_0x005f
                com.appfoundry.previewer.activities.BravoActivity r4 = r6.a     // Catch:{ Exception -> 0x0056 }
                b.a.a.m.b r5 = b.a.a.m.b.f349m     // Catch:{ Exception -> 0x0056 }
                b.p.a.l<com.appfoundry.previewer.model.BackendResponse> r5 = b.a.a.m.b.f347k     // Catch:{ Exception -> 0x0056 }
                java.lang.Object r7 = r5.b(r7)     // Catch:{ Exception -> 0x0056 }
                com.appfoundry.previewer.model.BackendResponse r7 = (com.appfoundry.previewer.model.BackendResponse) r7     // Catch:{ Exception -> 0x0056 }
                int r5 = com.appfoundry.previewer.activities.BravoActivity.t     // Catch:{ Exception -> 0x0056 }
                r4.w(r7, r1, r1)     // Catch:{ Exception -> 0x0056 }
                goto L_0x0064
            L_0x0056:
                java.lang.String r7 = "Error parsing BackendResponse"
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0068 }
                q.a.a$b r5 = q.a.a.d     // Catch:{ all -> 0x0068 }
                r5.b(r7, r4)     // Catch:{ all -> 0x0068 }
            L_0x005f:
                com.appfoundry.previewer.activities.BravoActivity r7 = r6.a     // Catch:{ all -> 0x0068 }
                b.f.a.e.J0(r7, r3, r1, r0, r2)     // Catch:{ all -> 0x0068 }
            L_0x0064:
                b.q.a.a.A(r8, r1)
                return
            L_0x0068:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x006a }
            L_0x006a:
                r0 = move-exception
                b.q.a.a.A(r8, r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.y.a(n.f, n.h0):void");
        }

        public void b(n.f fVar, IOException iOException) {
            e.x.c.i.e(fVar, NotificationCompat.CATEGORY_CALL);
            e.x.c.i.e(iOException, "e");
            this.a.runOnUiThread(new a(this));
            b.f.a.e.J0(this.a, "ERROR: Remote Action failure. ", iOException.getMessage(), 0, 4);
        }
    }

    public static final void a(BravoActivity bravoActivity, RelativeLayout relativeLayout) {
        Objects.requireNonNull(bravoActivity);
        q.a.a.d.b("ERROR: onFailure dialog", new Object[0]);
        bravoActivity.runOnUiThread(new b.a.a.d.d(relativeLayout));
        bravoActivity.h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent(bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0042, code lost:
        r7 = r13.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(com.appfoundry.previewer.activities.BravoActivity r11, b.g.a.e.f.h r12, b.g.a.j.a r13, android.widget.RelativeLayout r14) {
        /*
            java.util.Objects.requireNonNull(r11)
            android.content.Context r0 = b.f.a.e.c()
            java.lang.String r1 = "com.appfoundry.previewerLoaded"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r3 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
            e.x.c.i.d(r0, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = b.f.a.e.c()
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r5 = "user_logged_in"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "key"
            e.x.c.i.e(r4, r5)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r4, r6)
            r0.apply()
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r4 = 0
            if (r13 == 0) goto L_0x004b
            java.util.Date r7 = r13.f
            if (r7 == 0) goto L_0x004b
            java.lang.String r7 = r7.toString()
            goto L_0x004c
        L_0x004b:
            r7 = r4
        L_0x004c:
            r0[r2] = r7
            q.a.a$b r7 = q.a.a.d
            java.lang.String r8 = "REFRESH TOKEN EXPIRATION DATE: %s"
            r7.a(r8, r0)
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            e.x.c.i.d(r0, r3)
            java.lang.String r8 = "bravo_vision_refresh_token_expiration"
            if (r13 == 0) goto L_0x0070
            java.util.Date r9 = r13.f
            if (r9 == 0) goto L_0x0070
            long r9 = r9.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
        L_0x0070:
            e.x.c.i.e(r8, r5)
            if (r4 == 0) goto L_0x0084
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r9 = r4.longValue()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r8, r9)
            r0.apply()
        L_0x0084:
            if (r13 == 0) goto L_0x00e1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r4 = r13.c
            r0[r2] = r4
            java.lang.String r4 = "onSuccess: %s"
            r7.a(r4, r0)
            r12.c(r13)     // Catch:{ Exception -> 0x0095 }
            goto L_0x00b4
        L_0x0095:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getLocalizedMessage()
            r4[r2] = r0
            q.a.a$b r0 = q.a.a.d
            java.lang.String r7 = "Error on credentialsManager.saveCredentials: %s"
            r0.b(r7, r4)
            r12.a()
            p.a.a.c r12 = p.a.a.c.b()
            b.a.a.g.s r0 = new b.a.a.g.s
            r0.<init>(r2, r6)
            r12.g(r0)
        L_0x00b4:
            android.content.Context r12 = b.f.a.e.c()
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r1, r2)
            e.x.c.i.d(r12, r3)
            java.lang.String r0 = "auth_token"
            java.lang.String r13 = r13.c
            if (r13 == 0) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            java.lang.String r13 = ""
        L_0x00c8:
            java.lang.String r1 = "credentials.idToken ?: \"\""
            e.x.c.i.d(r13, r1)
            e.x.c.i.e(r0, r5)
            java.lang.String r1 = "value"
            e.x.c.i.e(r13, r1)
            android.content.SharedPreferences$Editor r12 = r12.edit()
            android.content.SharedPreferences$Editor r12 = r12.putString(r0, r13)
            r12.apply()
            goto L_0x00f0
        L_0x00e1:
            r12.a()
            p.a.a.c r12 = p.a.a.c.b()
            b.a.a.g.s r13 = new b.a.a.g.s
            r13.<init>(r2, r6)
            r12.g(r13)
        L_0x00f0:
            b.a.a.d.e r12 = new b.a.a.d.e
            r12.<init>(r14)
            r11.runOnUiThread(r12)
            com.appfoundry.previewer.BravoApp$b r12 = com.appfoundry.previewer.BravoApp.Q
            r12.d()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            java.lang.String r13 = "showIntro"
            r12.putBoolean(r13, r2)
            java.lang.String r13 = "showLogin"
            r12.putBoolean(r13, r2)
            android.content.Intent r13 = new android.content.Intent
            java.lang.Class<com.appfoundry.previewer.activities.BravoActivity> r14 = com.appfoundry.previewer.activities.BravoActivity.class
            r13.<init>(r11, r14)
            r13.putExtras(r12)
            r11.startActivity(r13)
            r11.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.b(com.appfoundry.previewer.activities.BravoActivity, b.g.a.e.f.h, b.g.a.j.a, android.widget.RelativeLayout):void");
    }

    public static final void c(BravoActivity bravoActivity, b.l.d.o.p pVar, RelativeLayout relativeLayout) {
        b.l.a.c.k.h<b.l.d.o.q> f2;
        Objects.requireNonNull(bravoActivity);
        if (pVar != null && (f2 = FirebaseAuth.getInstance(pVar.e0()).f(pVar, true)) != null) {
            f2.c(new b.a.a.d.g(bravoActivity, relativeLayout));
        }
    }

    public static final void d(BravoActivity bravoActivity) {
        Objects.requireNonNull(bravoActivity);
        BravoApp.Q.d();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showIntro", false);
        bundle.putBoolean("showLogin", false);
        Intent intent = new Intent(bravoActivity, BravoActivity.class);
        intent.putExtras(bundle);
        bravoActivity.startActivity(intent);
        bravoActivity.finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(com.appfoundry.previewer.activities.BravoActivity r9, com.appfoundry.previewer.model.Page r10) {
        /*
            java.util.Objects.requireNonNull(r9)
            r0 = 0
            if (r10 == 0) goto L_0x000b
            java.lang.Boolean r1 = b.a.a.h.e.B(r10)
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = e.x.c.i.a(r1, r2)
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L_0x00e7
            java.lang.String r1 = "$this$showBottomSheetFor"
            e.x.c.i.e(r9, r1)
            com.appfoundry.previewer.fragments.BottomSheetFragment r1 = new com.appfoundry.previewer.fragments.BottomSheetFragment
            r1.<init>()
            if (r10 == 0) goto L_0x0026
            java.lang.String r2 = r10.r
            goto L_0x0027
        L_0x0026:
            r2 = r0
        L_0x0027:
            com.appfoundry.previewer.model.Style r2 = b.a.a.n.f.u(r2, r0, r5)
            r1.t = r10
            if (r10 == 0) goto L_0x0034
            int r5 = b.a.a.h.e.n(r10, r9)
            goto L_0x0035
        L_0x0034:
            r5 = r3
        L_0x0035:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6[r3] = r7
            q.a.a$b r7 = q.a.a.d
            java.lang.String r8 = ">>>>> calculatedModalHeight = %d"
            r7.a(r8, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.appfoundry.previewer.BravoApp$b r8 = com.appfoundry.previewer.BravoApp.Q
            int r8 = com.appfoundry.previewer.BravoApp.N
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r3] = r8
            java.lang.String r8 = ">>>>> screenHeight = %d"
            r7.a(r8, r6)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            if (r2 == 0) goto L_0x0062
            java.lang.Integer r8 = r2.K
            if (r8 == 0) goto L_0x0062
            int r8 = r8.intValue()
            goto L_0x0063
        L_0x0062:
            r8 = -1
        L_0x0063:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r3] = r8
            java.lang.String r8 = ">>>>> modalStyle?.modalHeight = %d"
            r7.a(r8, r6)
            int r6 = com.appfoundry.previewer.BravoApp.N
            if (r5 >= r6) goto L_0x0090
            if (r2 == 0) goto L_0x0077
            java.lang.Boolean r6 = r2.L
            goto L_0x0078
        L_0x0077:
            r6 = r0
        L_0x0078:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r6 = e.x.c.i.a(r6, r8)
            if (r6 == 0) goto L_0x0090
            r1.u = r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            java.lang.String r3 = ">>>>> fragment.height = calculatedModalHeight = %d"
            r7.a(r3, r6)
            goto L_0x00c9
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            java.lang.Integer r5 = r2.K
            goto L_0x0096
        L_0x0095:
            r5 = r0
        L_0x0096:
            if (r5 == 0) goto L_0x00c0
            java.lang.Integer r5 = r2.K
            int r5 = r5.intValue()
            r6 = 100
            if (r5 >= r6) goto L_0x00c0
            java.lang.Integer r5 = r2.K
            int r5 = r5.intValue()
            int r6 = com.appfoundry.previewer.BravoApp.N
            int r5 = r5 * r6
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            int r5 = (int) r5
            r1.u = r5
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r3] = r5
            java.lang.String r3 = ">>>>> fragment.height = ((modalStyle.modalHeight * screenHeight()) / 100f) = %d"
            r7.a(r3, r6)
            goto L_0x00c9
        L_0x00c0:
            r1.u = r3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = ">>>>> fragment.height = calculatedModalHeight = 0"
            r7.a(r5, r3)
        L_0x00c9:
            if (r2 == 0) goto L_0x00d3
            java.lang.Boolean r2 = r2.L
            if (r2 == 0) goto L_0x00d3
            boolean r4 = r2.booleanValue()
        L_0x00d3:
            r1.v = r4
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            java.lang.String r2 = "supportFragmentManager"
            e.x.c.i.d(r9, r2)
            if (r10 == 0) goto L_0x00e2
            java.lang.String r0 = r10.a
        L_0x00e2:
            r1.show(r9, r0)
            goto L_0x014c
        L_0x00e7:
            if (r10 == 0) goto L_0x0123
            java.lang.String r1 = "$this$isBlurPopUp"
            e.x.c.i.e(r10, r1)
            java.lang.Boolean r1 = b.a.a.h.e.D(r10)
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x010b
            java.lang.String r1 = r10.r
            com.appfoundry.previewer.model.Style r1 = b.a.a.n.f.u(r1, r0, r5)
            if (r1 == 0) goto L_0x0103
            java.lang.Boolean r1 = r1.N
            goto L_0x0104
        L_0x0103:
            r1 = r0
        L_0x0104:
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x010b
            r3 = r4
        L_0x010b:
            if (r3 != r4) goto L_0x0123
            java.lang.String r0 = "$this$showBlurPopupFor"
            e.x.c.i.e(r9, r0)
            b.a.a.a.c r0 = new b.a.a.a.c
            r0.<init>()
            r0.f77i = r10
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            java.lang.String r10 = r10.a
            r0.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r10)
            goto L_0x014c
        L_0x0123:
            java.lang.String r1 = "$this$showPopupFor"
            e.x.c.i.e(r9, r1)
            b.a.a.a.i r1 = new b.a.a.a.i
            r1.<init>()
            r1.f111h = r10
            if (r10 == 0) goto L_0x0134
            java.lang.String r2 = r10.r
            goto L_0x0135
        L_0x0134:
            r2 = r0
        L_0x0135:
            com.appfoundry.previewer.model.Style r2 = b.a.a.n.f.u(r2, r0, r5)
            if (r2 == 0) goto L_0x013e
            java.lang.String r2 = r2.M
            goto L_0x013f
        L_0x013e:
            r2 = r0
        L_0x013f:
            r1.f112i = r2
            androidx.fragment.app.FragmentManager r9 = r9.getSupportFragmentManager()
            if (r10 == 0) goto L_0x0149
            java.lang.String r0 = r10.a
        L_0x0149:
            r1.show((androidx.fragment.app.FragmentManager) r9, (java.lang.String) r0)
        L_0x014c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.e(com.appfoundry.previewer.activities.BravoActivity, com.appfoundry.previewer.model.Page):void");
    }

    public static final void f(BravoActivity bravoActivity, int i2) {
        RelativeLayout relativeLayout = (RelativeLayout) bravoActivity.findViewById(R.id.parent_layout);
        if (relativeLayout != null) {
            Snackbar make = Snackbar.make((View) relativeLayout, (CharSequence) "", i2 == 99 ? -2 : -1);
            e.x.c.i.d(make, "Snackbar.make(parentLayout, \"\", duration)");
            int dimension = (int) bravoActivity.getResources().getDimension(R.dimen.snackbar_height);
            Typeface typeface = null;
            View inflate = bravoActivity.getLayoutInflater().inflate(i2 == 99 ? R.layout.snackbar_update_layout : R.layout.snackbar_downloading_update_layout, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.snackbar_update_text);
            if (textView != null) {
                Hashtable hashtable = new Hashtable();
                e.x.c.i.e("01DZ4603S1A99S0MKRX805Z15F", "fontName");
                Typeface typeface2 = (Typeface) hashtable.get("01DZ4603S1A99S0MKRX805Z15F");
                if (typeface2 == null) {
                    try {
                        typeface2 = Typeface.createFromAsset(b.f.a.e.c().getAssets(), "fonts/01DZ4603S1A99S0MKRX805Z15F.otf");
                        hashtable.put("01DZ4603S1A99S0MKRX805Z15F", typeface2);
                    } catch (Exception unused) {
                        typeface2 = null;
                    }
                }
                textView.setTypeface(typeface2);
            }
            if (i2 == 500) {
                e.x.c.i.d(textView, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
                textView.setText(bravoActivity.getString(R.string.snackbar_download_failed));
            }
            if (i2 == 99) {
                TextView textView2 = (TextView) inflate.findViewById(R.id.snackbar_update_yes);
                if (textView2 != null) {
                    Hashtable hashtable2 = new Hashtable();
                    e.x.c.i.e("01DZ4603RX0X7SJMZFXAMWZQ4T", "fontName");
                    Typeface typeface3 = (Typeface) hashtable2.get("01DZ4603RX0X7SJMZFXAMWZQ4T");
                    if (typeface3 == null) {
                        try {
                            typeface = Typeface.createFromAsset(b.f.a.e.c().getAssets(), "fonts/01DZ4603RX0X7SJMZFXAMWZQ4T.otf");
                            hashtable2.put("01DZ4603RX0X7SJMZFXAMWZQ4T", typeface);
                        } catch (Exception unused2) {
                        }
                    } else {
                        typeface = typeface3;
                    }
                    textView2.setTypeface(typeface);
                }
                textView2.setOnClickListener(new b.a.a.d.n(bravoActivity));
            }
            View view = make.getView();
            Objects.requireNonNull(view, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) view;
            ViewGroup.LayoutParams layoutParams = snackbarLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = dimension;
            layoutParams2.width = -1;
            snackbarLayout.setLayoutParams(layoutParams2);
            snackbarLayout.setBackgroundColor(ContextCompat.getColor(bravoActivity, R.color.bravoPurple));
            snackbarLayout.addView(inflate, 0);
            make.show();
        }
    }

    public final void A(b.a.a.i.d dVar, b.a.a.i.d dVar2, RelativeLayout relativeLayout) {
        BravoApp.b bVar = BravoApp.Q;
        FirebaseAuth firebaseAuth = BravoApp.D;
        if (firebaseAuth != null) {
            String str = "";
            String Q = dVar != null ? b.f.a.e.Q(dVar) : str;
            if (dVar2 != null) {
                str = b.f.a.e.Q(dVar2);
            }
            b.l.a.c.b.a.x(Q);
            b.l.a.c.b.a.x(str);
            ci ciVar = firebaseAuth.f7333e;
            b.l.d.d dVar3 = firebaseAuth.a;
            String str2 = firebaseAuth.f7336i;
            u0 u0Var = new u0(firebaseAuth);
            Objects.requireNonNull(ciVar);
            xg xgVar = new xg(Q, str, str2);
            xgVar.d(dVar3);
            xgVar.f(u0Var);
            b.l.a.c.k.h b2 = ciVar.b(xgVar);
            if (b2 != null) {
                b2.b(this, new k(this, relativeLayout));
            }
        }
    }

    public final void B() {
        Object systemService = getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (inputMethodManager.isAcceptingText() && getCurrentFocus() != null) {
            View currentFocus = getCurrentFocus();
            e.x.c.i.c(currentFocus);
            e.x.c.i.d(currentFocus, "currentFocus!!");
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void C() {
        h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("showLogin", true);
        Intent intent = new Intent(this, BravoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    public final void D(b.a.a.i.d dVar, RelativeLayout relativeLayout) {
        BravoApp.b bVar = BravoApp.Q;
        FirebaseAuth firebaseAuth = BravoApp.D;
        if (firebaseAuth != null) {
            String Q = dVar != null ? b.f.a.e.Q(dVar) : "";
            b.l.a.c.b.a.x(Q);
            b.l.a.c.b.a.x(Q);
            b.l.d.o.a aVar = new b.l.d.o.a(new a.C0076a());
            aVar.f4935p = 1;
            ci ciVar = firebaseAuth.f7333e;
            b.l.d.d dVar2 = firebaseAuth.a;
            String str = firebaseAuth.f7336i;
            Objects.requireNonNull(ciVar);
            aVar.f4935p = 1;
            sh shVar = new sh(Q, aVar, str, "sendPasswordResetEmail");
            shVar.d(dVar2);
            b.l.a.c.k.h b2 = ciVar.b(shVar);
            if (b2 != null) {
                b2.c(new w(this, relativeLayout));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r0 = r0.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(com.appfoundry.previewer.model.FirebaseConfigJson r13) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x00a9
            r5 = 0
            java.lang.String r8 = "$this$getProjectId"
            e.x.c.i.e(r13, r8)
            com.appfoundry.previewer.model.FirebaseProjectInfo r0 = r13.a
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L_0x0014
            r7 = r0
            goto L_0x0015
        L_0x0014:
            r7 = r9
        L_0x0015:
            java.lang.String r0 = "$this$getApplicationId"
            e.x.c.i.e(r13, r0)
            java.util.List<com.appfoundry.previewer.model.FirebaseClient> r0 = r13.f7116b
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseClient r0 = (com.appfoundry.previewer.model.FirebaseClient) r0
            if (r0 == 0) goto L_0x0031
            com.appfoundry.previewer.model.FirebaseClientInfo r0 = r0.a
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L_0x0031
            r2 = r0
            goto L_0x0032
        L_0x0031:
            r2 = r9
        L_0x0032:
            java.lang.String r0 = "ApplicationId must be set."
            b.l.a.c.b.a.y(r2, r0)
            java.lang.String r0 = "$this$getApiKey"
            e.x.c.i.e(r13, r0)
            java.util.List<com.appfoundry.previewer.model.FirebaseClient> r0 = r13.f7116b
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseClient r0 = (com.appfoundry.previewer.model.FirebaseClient) r0
            if (r0 == 0) goto L_0x005a
            java.util.List<com.appfoundry.previewer.model.FirebaseApiKey> r0 = r0.f7114b
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r0.get(r1)
            com.appfoundry.previewer.model.FirebaseApiKey r0 = (com.appfoundry.previewer.model.FirebaseApiKey) r0
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L_0x005a
            r3 = r0
            goto L_0x005b
        L_0x005a:
            r3 = r9
        L_0x005b:
            java.lang.String r0 = "ApiKey must be set."
            b.l.a.c.b.a.y(r3, r0)
            b.l.d.l r10 = new b.l.d.l
            r4 = 0
            r6 = 0
            r11 = 0
            r0 = r10
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = "FirebaseOptions.Builder(…\n                .build()"
            e.x.c.i.d(r10, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            e.x.c.i.e(r13, r8)
            com.appfoundry.previewer.model.FirebaseProjectInfo r13 = r13.a
            if (r13 == 0) goto L_0x0081
            java.lang.String r13 = r13.c
            if (r13 == 0) goto L_0x0081
            r9 = r13
        L_0x0081:
            java.lang.String r13 = "context"
            e.x.c.i.f(r12, r13)
            java.lang.String r13 = "options"
            e.x.c.i.f(r10, r13)
            java.lang.String r13 = "name"
            e.x.c.i.f(r9, r13)
            b.l.d.d r13 = b.l.d.d.g(r12, r10, r9)
            java.lang.String r0 = "FirebaseApp.initializeApp(context, options, name)"
            e.x.c.i.b(r13, r0)
            java.lang.String r0 = "app"
            e.x.c.i.e(r13, r0)
            com.google.firebase.auth.FirebaseAuth r13 = com.google.firebase.auth.FirebaseAuth.getInstance(r13)
            java.lang.String r0 = "FirebaseAuth.getInstance(app)"
            e.x.c.i.d(r13, r0)
            com.appfoundry.previewer.BravoApp.D = r13
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.E(com.appfoundry.previewer.model.FirebaseConfigJson):void");
    }

    public final boolean F() {
        DrawerLayout drawerLayout;
        if (!b.f.a.e.F0() || (drawerLayout = (DrawerLayout) findViewById(R.id.drawer_menu)) == null) {
            return false;
        }
        return drawerLayout.isDrawerOpen((int) GravityCompat.START);
    }

    public final void G(String str, g0 g0Var) {
        b.a.a.a.h hVar;
        T t2;
        if (str != null) {
            e.x.c.i.e(this, "$this$getLastBravoFragment");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            e.x.c.i.d(supportFragmentManager, "supportFragmentManager");
            int size = supportFragmentManager.getFragments().size();
            while (true) {
                size--;
                if (size < 0) {
                    hVar = null;
                    break;
                }
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                e.x.c.i.d(supportFragmentManager2, "supportFragmentManager");
                if (supportFragmentManager2.getFragments().get(size) instanceof b.a.a.a.h) {
                    FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                    e.x.c.i.d(supportFragmentManager3, "supportFragmentManager");
                    Fragment fragment = supportFragmentManager3.getFragments().get(size);
                    Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BravoFragment");
                    hVar = (b.a.a.a.h) fragment;
                    break;
                }
            }
            e.x.c.u uVar = new e.x.c.u();
            uVar.f7989h = null;
            e.x.c.u uVar2 = new e.x.c.u();
            uVar2.f7989h = null;
            if (hVar != null) {
                uVar.f7989h = q(hVar.f74h);
                e.x.c.i.e(hVar, "$this$getFragmentLoading");
                t2 = (RelativeLayout) hVar.d().findViewById(R.id.fragment_loading);
            } else {
                t2 = (RelativeLayout) findViewById(R.id.main_progressbar);
            }
            uVar2.f7989h = t2;
            y(true, (Fragment) uVar.f7989h, (RelativeLayout) t2);
            e0.a k2 = b.a.a.n.c.k();
            k2.g(str);
            k2.e(g0Var);
            ((n.m0.g.e) BravoApp.Q.c().a(k2.b())).g(new x(this, uVar, uVar2));
            return;
        }
        q.a.a.d.b("Form URL is null", new Object[0]);
        Toast.makeText(this, "Missing form url", 0).show();
    }

    public final void H(String str) {
        if (str != null) {
            g0 b2 = g0.a.b(g0.a, (b0) null, new byte[0], 0, 0, 12);
            e0.a k2 = b.a.a.n.c.k();
            k2.g(str);
            k2.e(b2);
            e0 b3 = k2.b();
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
            if (relativeLayout != null) {
                b.a.a.h.o.l(relativeLayout);
            }
            ((n.m0.g.e) BravoApp.Q.c().a(b3)).g(new y(this, relativeLayout));
            return;
        }
        q.a.a.d.b("TriggerUrl is null", new Object[0]);
        Toast.makeText(this, "Missing trigger url", 0).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r2 != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r11, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            boolean r0 = com.appfoundry.previewer.BravoApp.H
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = b.a.a.n.c.b()
            if (r0 == 0) goto L_0x001b
            boolean r0 = b.a.a.n.c.s()
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            if (r0 == 0) goto L_0x00d4
            int r0 = r11.getAction()
            if (r0 != 0) goto L_0x003b
            long r0 = java.lang.System.currentTimeMillis()
            r10.f6925i = r0
            float r0 = r11.getY()
            r10.f6926j = r0
            float r0 = r11.getX()
            r10.f6927k = r0
        L_0x0036:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x003b:
            int r0 = r11.getAction()
            r3 = 2
            r4 = 700(0x2bc, double:3.46E-321)
            if (r0 != r3) goto L_0x009f
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f6925i
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            boolean r0 = b.a.a.n.c.b()
            if (r0 == 0) goto L_0x0061
            boolean r0 = b.a.a.n.c.s()
            if (r0 != 0) goto L_0x0061
            boolean r0 = r10.f6928l
            if (r0 != 0) goto L_0x0061
            r0 = r1
            goto L_0x0062
        L_0x0061:
            r0 = r2
        L_0x0062:
            if (r0 == 0) goto L_0x0068
            b.f.a.e.n0(r10)
            return r2
        L_0x0068:
            float r0 = r11.getY()
            float r0 = java.lang.Math.abs(r0)
            float r3 = r10.f6926j
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            r3 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007f
            r0 = r1
            goto L_0x0080
        L_0x007f:
            r0 = r2
        L_0x0080:
            if (r0 != 0) goto L_0x0098
            float r0 = r11.getX()
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.f6927k
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            r2 = r1
        L_0x0096:
            if (r2 == 0) goto L_0x009a
        L_0x0098:
            r10.f6928l = r1
        L_0x009a:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        L_0x009f:
            int r0 = r11.getAction()
            if (r0 != r1) goto L_0x00d4
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f6925i
            long r6 = r6 - r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r1 = r2
        L_0x00b2:
            r3 = 0
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r10.f6928l
            if (r0 != 0) goto L_0x00ce
            r10.f6925i = r3
            r10.f6928l = r2
            boolean r11 = b.a.a.n.c.b()
            if (r11 == 0) goto L_0x00cd
            boolean r11 = b.a.a.n.c.s()
            if (r11 != 0) goto L_0x00cd
            b.f.a.e.n0(r10)
        L_0x00cd:
            return r2
        L_0x00ce:
            r10.f6925i = r3
            r10.f6928l = r2
            goto L_0x0036
        L_0x00d4:
            boolean r11 = super.dispatchTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public void finish() {
        SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        e.x.c.i.e("restart_with_previewer", "key");
        sharedPreferences.edit().putBoolean("restart_with_previewer", true).apply();
        super.finish();
    }

    public final void g() {
        SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = b.f.a.e.c().getPackageName() + b.a.a.n.f.g() + "app_user_logged_in";
        e.x.c.i.e(str, "key");
        sharedPreferences.edit().remove(str).apply();
        SharedPreferences sharedPreferences2 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str2 = b.f.a.e.c().getPackageName() + b.a.a.n.f.g() + "app_oauth_token";
        e.x.c.i.e(str2, "key");
        sharedPreferences2.edit().remove(str2).apply();
        SharedPreferences sharedPreferences3 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences3, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str3 = b.f.a.e.c().getPackageName() + b.a.a.n.f.g() + "firebase_id_token";
        e.x.c.i.e(str3, "key");
        sharedPreferences3.edit().remove(str3).apply();
        SharedPreferences sharedPreferences4 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences4, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str4 = b.f.a.e.c().getPackageName() + b.a.a.n.f.g() + "bravo_id_token";
        e.x.c.i.e(str4, "key");
        sharedPreferences4.edit().remove(str4).apply();
        BravoApp.Q.d();
    }

    public final void h() {
        SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str = b.f.a.e.c().getPackageName() + "after_logout";
        e.x.c.i.e(str, "key");
        sharedPreferences.edit().putBoolean(str, true).apply();
        SharedPreferences sharedPreferences2 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        String str2 = b.f.a.e.c().getPackageName() + "user_logged_in";
        e.x.c.i.e(str2, "key");
        sharedPreferences2.edit().remove(str2).apply();
        SharedPreferences sharedPreferences3 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences3, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        e.x.c.i.e("auth_token", "key");
        sharedPreferences3.edit().remove("auth_token").apply();
        BravoApp.b bVar = BravoApp.Q;
        JsonApp o2 = b.a.a.n.c.o(R.raw.previewer_figma);
        BravoApp.f6914n = o2;
        BravoApp.f6915o = o2;
        bVar.d();
    }

    public final void o() {
        if (b.f.a.e.F0()) {
            if (this.f6924h == null) {
                this.f6924h = (DrawerLayout) findViewById(R.id.drawer_menu);
            }
            DrawerLayout drawerLayout = this.f6924h;
            e.x.c.i.c(drawerLayout);
            if (drawerLayout.isDrawerOpen((int) GravityCompat.START)) {
                DrawerLayout drawerLayout2 = this.f6924h;
                e.x.c.i.c(drawerLayout2);
                drawerLayout2.closeDrawer((int) GravityCompat.START);
            }
        } else if (e.x.c.i.a(b.f.a.e.K(), "menu:modal")) {
            BravoApp.b bVar = BravoApp.Q;
            BravoApp.u = false;
            BottomSheetFragment bottomSheetFragment = BravoApp.t;
            if (bottomSheetFragment != null) {
                bottomSheetFragment.dismiss();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: b.a.a.i.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: b.a.a.i.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = (r3 = (android.net.ConnectivityManager) r3).getNetworkCapabilities((r6 = r3.getActiveNetwork()));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r21, int r22, android.content.Intent r23) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            r1 = r22
            r2 = r23
            super.onActivityResult(r21, r22, r23)
            java.lang.String r3 = "$this$isNetworkAvailable"
            e.x.c.i.e(r7, r3)
            java.lang.String r3 = "connectivity"
            java.lang.Object r3 = r7.getSystemService(r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0043
            boolean r6 = r3 instanceof android.net.ConnectivityManager
            if (r6 == 0) goto L_0x0043
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.Network r6 = r3.getActiveNetwork()
            if (r6 == 0) goto L_0x0043
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r6)
            if (r3 == 0) goto L_0x0043
            boolean r6 = r3.hasTransport(r4)
            if (r6 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            boolean r6 = r3.hasTransport(r5)
            if (r6 == 0) goto L_0x003a
            goto L_0x0041
        L_0x003a:
            r6 = 3
            boolean r3 = r3.hasTransport(r6)
            if (r3 == 0) goto L_0x0043
        L_0x0041:
            r3 = r4
            goto L_0x0044
        L_0x0043:
            r3 = r5
        L_0x0044:
            if (r3 == 0) goto L_0x03e1
            java.util.Collection<java.lang.String> r3 = b.l.f.a0.a.a.f5580e
            r3 = 49374(0xc0de, float:6.9188E-41)
            r6 = -1
            r8 = 0
            if (r0 != r3) goto L_0x008d
            if (r1 != r6) goto L_0x0087
            java.lang.String r3 = "SCAN_RESULT"
            java.lang.String r10 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_FORMAT"
            java.lang.String r11 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_BYTES"
            byte[] r12 = r2.getByteArrayExtra(r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r9 = "SCAN_RESULT_ORIENTATION"
            int r9 = r2.getIntExtra(r9, r3)
            if (r9 != r3) goto L_0x006f
            r13 = r8
            goto L_0x0074
        L_0x006f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r13 = r3
        L_0x0074:
            java.lang.String r3 = "SCAN_RESULT_ERROR_CORRECTION_LEVEL"
            java.lang.String r14 = r2.getStringExtra(r3)
            java.lang.String r3 = "SCAN_RESULT_IMAGE_PATH"
            java.lang.String r15 = r2.getStringExtra(r3)
            b.l.f.a0.a.b r3 = new b.l.f.a0.a.b
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x008e
        L_0x0087:
            b.l.f.a0.a.b r3 = new b.l.f.a0.a.b
            r3.<init>()
            goto L_0x008e
        L_0x008d:
            r3 = r8
        L_0x008e:
            if (r3 == 0) goto L_0x012e
            java.lang.String r9 = r3.a
            if (r9 == 0) goto L_0x012e
            java.lang.String r10 = "result.contents"
            e.x.c.i.d(r9, r10)
            java.lang.String r11 = "$this$containsBravoJson"
            e.x.c.i.e(r9, r11)
            java.lang.String r11 = "^https:\\/\\/[^\\/]+\\/devices\\/apps\\/.*$"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)
            java.util.regex.Matcher r9 = r11.matcher(r9)
            boolean r9 = r9.find()
            if (r9 == 0) goto L_0x00e6
            b.a.a.e.a r9 = b.a.a.e.a.f235b
            java.lang.String r9 = r3.a
            e.x.c.i.d(r9, r10)
            java.lang.String r10 = "url"
            e.x.c.i.e(r9, r10)
            android.content.Context r11 = b.f.a.e.c()
            com.segment.analytics.Analytics r11 = com.segment.analytics.Analytics.with(r11)
            java.lang.String r12 = b.a.a.e.a.c()
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "java.util.UUID.randomUUID().toString()"
            e.x.c.i.d(r13, r14)
            com.segment.analytics.Properties r12 = b.a.a.e.a.b(r12, r13)
            com.segment.analytics.Properties r9 = r12.putValue((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r10 = "QR Scanned"
            r11.track(r10, r9)
            java.lang.String r3 = r3.a
            b.f.a.e.G0(r7, r3, r4)
            goto L_0x012e
        L_0x00e6:
            java.lang.String r9 = r3.a
            e.x.c.i.d(r9, r10)
            java.lang.String r11 = "$this$isUrl"
            e.x.c.i.e(r9, r11)
            java.util.regex.Pattern r11 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r9 = r11.matcher(r9)
            boolean r9 = r9.matches()
            if (r9 == 0) goto L_0x0126
            java.lang.String r9 = r3.a
            e.x.c.i.d(r9, r10)
            r10 = 2
            java.lang.String r11 = "http"
            boolean r9 = e.c0.h.C(r9, r11, r5, r10)
            if (r9 != 0) goto L_0x0111
            java.lang.String r3 = r3.a
            java.lang.String r3 = android.webkit.URLUtil.guessUrl(r3)
            goto L_0x0113
        L_0x0111:
            java.lang.String r3 = r3.a
        L_0x0113:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r10 = "android.intent.action.VIEW"
            r9.<init>(r10)
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.content.Intent r3 = r9.setData(r3)
            r7.startActivity(r3)
            goto L_0x012e
        L_0x0126:
            java.lang.String r3 = r3.a
            e.x.c.i.d(r3, r10)
            b.f.a.e.D0(r7, r3)
        L_0x012e:
            r3 = 23
            r9 = 22
            r10 = 21
            if (r1 != 0) goto L_0x0148
            if (r0 == r10) goto L_0x013c
            if (r0 == r9) goto L_0x013c
            if (r0 != r3) goto L_0x0148
        L_0x013c:
            p.a.a.c r11 = p.a.a.c.b()
            b.a.a.g.j r12 = new b.a.a.g.j
            r12.<init>()
            r11.g(r12)
        L_0x0148:
            r11 = 55
            if (r0 != r11) goto L_0x015d
            if (r1 == r6) goto L_0x03e6
            java.lang.String r0 = "Update flow failed! Result code: "
            java.lang.String r0 = b.e.a.a.a.g(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            q.a.a$b r2 = q.a.a.d
            r2.b(r0, r1)
            goto L_0x03e6
        L_0x015d:
            if (r0 != r10) goto L_0x0182
            if (r2 == 0) goto L_0x03e6
            java.lang.String r0 = r23.getDataString()
            if (r0 == 0) goto L_0x03e6
            p.a.a.c r1 = p.a.a.c.b()
            b.a.a.g.a r2 = new b.a.a.g.a
            android.net.Uri[] r3 = new android.net.Uri[r4]
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = "Uri.parse(\n             …                        )"
            e.x.c.i.d(r0, r4)
            r3[r5] = r0
            r2.<init>(r3)
            r1.g(r2)
            goto L_0x03e6
        L_0x0182:
            if (r0 != r9) goto L_0x018e
            p.a.a.c r0 = p.a.a.c.b()
            b.a.a.g.p0 r1 = new b.a.a.g.p0
            r1.<init>()
            goto L_0x0199
        L_0x018e:
            if (r0 != r3) goto L_0x019e
            p.a.a.c r0 = p.a.a.c.b()
            b.a.a.g.q0 r1 = new b.a.a.g.q0
            r1.<init>()
        L_0x0199:
            r0.g(r1)
            goto L_0x03e6
        L_0x019e:
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.FrameLayout"
            java.lang.String r4 = "newFlag"
            java.lang.String r9 = "$this$addIfNotThere"
            r10 = 1051260355(0x3ea8f5c3, float:0.33)
            if (r1 != r6) goto L_0x02d5
            r11 = 24
            if (r0 != r11) goto L_0x02d5
            if (r2 == 0) goto L_0x01b6
            java.lang.String r0 = "extra.file_path"
            java.lang.String r0 = r2.getStringExtra(r0)
            goto L_0x01b7
        L_0x01b6:
            r0 = r8
        L_0x01b7:
            if (r0 == 0) goto L_0x01bf
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto L_0x01c0
        L_0x01bf:
            r1 = r8
        L_0x01c0:
            if (r1 == 0) goto L_0x02ca
            b.a.a.g.p r0 = r7.f6932p
            if (r0 == 0) goto L_0x0205
            android.widget.ImageView r11 = r0.c
            if (r11 == 0) goto L_0x0205
            java.lang.String r2 = "$this$setupWithInputImageEvent"
            e.x.c.i.e(r11, r2)
            com.appfoundry.previewer.model.Asset r2 = new com.appfoundry.previewer.model.Asset
            java.lang.String r6 = r1.getAbsolutePath()
            if (r6 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            java.lang.String r6 = ""
        L_0x01da:
            r13 = r6
            java.lang.String r14 = r1.getAbsolutePath()
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.lang.String r12 = r0.a
            java.lang.String r13 = r0.f245b
            com.appfoundry.previewer.model.Style r15 = r0.d
            int r6 = r0.f246e
            int r14 = r0.f
            int r0 = r0.f247g
            java.lang.String r16 = "component:input-image"
            r17 = r14
            r14 = r16
            r16 = r6
            r18 = r2
            r19 = r0
            b.f.a.e.B0(r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0205:
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            r0.<init>(r7)
            r0.setScaleX(r10)
            r0.setScaleY(r10)
            b.a.a.i.f r2 = new b.a.a.i.f
            b.a.a.g.p r6 = r7.f6932p
            if (r6 == 0) goto L_0x0219
            java.lang.String r6 = r6.f245b
            goto L_0x021a
        L_0x0219:
            r6 = r8
        L_0x021a:
            r2.<init>(r6, r0, r5)
            java.util.List<b.a.a.i.f> r5 = r7.f6933q
            e.x.c.i.e(r5, r9)
            e.x.c.i.e(r2, r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0229:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0241
            java.lang.Object r6 = r4.next()
            r9 = r6
            b.a.a.i.f r9 = (b.a.a.i.f) r9
            java.lang.String r9 = r9.a
            java.lang.String r10 = r2.a
            boolean r9 = e.x.c.i.a(r9, r10)
            if (r9 == 0) goto L_0x0229
            goto L_0x0242
        L_0x0241:
            r6 = r8
        L_0x0242:
            if (r6 != 0) goto L_0x0247
            r5.add(r2)
        L_0x0247:
            b.a.a.g.p r4 = r7.f6932p
            if (r4 == 0) goto L_0x025f
            android.widget.ImageView r4 = r4.c
            if (r4 == 0) goto L_0x025f
            android.view.ViewParent r5 = r4.getParent()
            java.util.Objects.requireNonNull(r5, r3)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r5.addView(r0, r3)
        L_0x025f:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r0 = com.appfoundry.previewer.BravoApp.E
            b.a.a.g.p r3 = r7.f6932p
            if (r3 == 0) goto L_0x026a
            java.lang.String r3 = r3.a
            goto L_0x026b
        L_0x026a:
            r3 = r8
        L_0x026b:
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0290
            g.a.x r3 = g.a.i0.a
            g.a.h1 r3 = g.a.a.m.f9916b
            r4 = 1
            g.a.p r4 = e.a.a.a.y0.m.o1.c.c(r8, r4, r8)
            e.v.f r3 = r3.plus(r4)
            g.a.z r9 = e.a.a.a.y0.m.o1.c.b(r3)
            r10 = 0
            r11 = 0
            com.appfoundry.previewer.activities.BravoActivity$l r12 = new com.appfoundry.previewer.activities.BravoActivity$l
            r12.<init>(r7, r0, r2, r8)
            r13 = 3
            r14 = 0
            e.a.a.a.y0.m.o1.c.S(r9, r10, r11, r12, r13, r14)
        L_0x0290:
            b.a.a.g.p r0 = r7.f6932p
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r2 = com.appfoundry.previewer.BravoApp.E
            if (r0 == 0) goto L_0x0299
            java.lang.String r3 = r0.a
            goto L_0x029a
        L_0x0299:
            r3 = r8
        L_0x029a:
            java.lang.Object r2 = r2.get(r3)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x03e6
            java.util.Iterator r2 = r2.iterator()
        L_0x02a6:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02c2
            java.lang.Object r3 = r2.next()
            r4 = r3
            b.a.a.i.d r4 = (b.a.a.i.d) r4
            java.lang.String r4 = r4.f310b
            if (r0 == 0) goto L_0x02ba
            java.lang.String r5 = r0.f245b
            goto L_0x02bb
        L_0x02ba:
            r5 = r8
        L_0x02bb:
            boolean r4 = e.x.c.i.a(r4, r5)
            if (r4 == 0) goto L_0x02a6
            r8 = r3
        L_0x02c2:
            b.a.a.i.d r8 = (b.a.a.i.d) r8
            if (r8 == 0) goto L_0x03e6
            r8.d = r1
            goto L_0x03e6
        L_0x02ca:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            q.a.a$b r1 = q.a.a.d
            java.lang.String r2 = "input image file is null"
            r1.b(r2, r0)
            goto L_0x03e6
        L_0x02d5:
            r11 = 25
            if (r0 != r11) goto L_0x03e6
            if (r1 != r6) goto L_0x03e6
            if (r2 == 0) goto L_0x02ed
            java.lang.String r0 = "extraFileResults"
            java.util.ArrayList r0 = r2.getParcelableArrayListExtra(r0)
            if (r0 == 0) goto L_0x02ed
            java.lang.Object r0 = r0.get(r5)
            b.f.a.a r0 = (b.f.a.a) r0
            r11 = r0
            goto L_0x02ee
        L_0x02ed:
            r11 = r8
        L_0x02ee:
            if (r11 == 0) goto L_0x03e6
            b.a.a.g.o r0 = r7.r
            if (r0 == 0) goto L_0x02fd
            android.widget.TextView r0 = r0.c
            if (r0 == 0) goto L_0x02fd
            java.lang.String r1 = r11.f397i
            r0.setText(r1)
        L_0x02fd:
            android.widget.ProgressBar r0 = new android.widget.ProgressBar
            r0.<init>(r7)
            r0.setScaleX(r10)
            r0.setScaleY(r10)
            b.a.a.i.e r6 = new b.a.a.i.e
            b.a.a.g.o r1 = r7.r
            if (r1 == 0) goto L_0x0311
            java.lang.String r1 = r1.f244b
            goto L_0x0312
        L_0x0311:
            r1 = r8
        L_0x0312:
            r6.<init>(r1, r0, r5)
            java.util.List<b.a.a.i.e> r1 = r7.s
            e.x.c.i.e(r1, r9)
            e.x.c.i.e(r6, r4)
            java.util.Iterator r2 = r1.iterator()
        L_0x0321:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0339
            java.lang.Object r4 = r2.next()
            r9 = r4
            b.a.a.i.e r9 = (b.a.a.i.e) r9
            java.lang.String r9 = r9.a
            java.lang.String r10 = r6.a
            boolean r9 = e.x.c.i.a(r9, r10)
            if (r9 == 0) goto L_0x0321
            goto L_0x033a
        L_0x0339:
            r4 = r8
        L_0x033a:
            if (r4 != 0) goto L_0x033f
            r1.add(r6)
        L_0x033f:
            b.a.a.g.o r1 = r7.r
            if (r1 == 0) goto L_0x0357
            android.widget.TextView r1 = r1.c
            if (r1 == 0) goto L_0x0357
            android.view.ViewParent r2 = r1.getParent()
            java.util.Objects.requireNonNull(r2, r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r2.addView(r0, r1)
        L_0x0357:
            e.x.c.s r9 = new e.x.c.s
            r9.<init>()
            r9.f7987h = r5
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r0 = com.appfoundry.previewer.BravoApp.E
            b.a.a.g.o r1 = r7.r
            if (r1 == 0) goto L_0x0369
            java.lang.String r1 = r1.a
            goto L_0x036a
        L_0x0369:
            r1 = r8
        L_0x036a:
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x039a
            g.a.x r0 = g.a.i0.a
            g.a.h1 r0 = g.a.a.m.f9916b
            r1 = 1
            g.a.p r1 = e.a.a.a.y0.m.o1.c.c(r8, r1, r8)
            e.v.f r0 = r0.plus(r1)
            g.a.z r12 = e.a.a.a.y0.m.o1.c.b(r0)
            r13 = 0
            r14 = 0
            com.appfoundry.previewer.activities.BravoActivity$m r15 = new com.appfoundry.previewer.activities.BravoActivity$m
            r10 = 0
            r0 = r15
            r1 = r20
            r2 = r11
            r3 = r9
            r4 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r16 = 3
            r17 = 0
            e.a.a.a.y0.m.o1.c.S(r12, r13, r14, r15, r16, r17)
        L_0x039a:
            java.lang.String r0 = r11.f397i
            int r1 = r9.f7987h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r11.f400l
            b.a.a.g.o r3 = r7.r
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r4 = com.appfoundry.previewer.BravoApp.E
            if (r3 == 0) goto L_0x03ad
            java.lang.String r5 = r3.a
            goto L_0x03ae
        L_0x03ad:
            r5 = r8
        L_0x03ae:
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x03e6
            java.util.Iterator r4 = r4.iterator()
        L_0x03ba:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x03d6
            java.lang.Object r5 = r4.next()
            r6 = r5
            b.a.a.i.d r6 = (b.a.a.i.d) r6
            java.lang.String r6 = r6.f310b
            if (r3 == 0) goto L_0x03ce
            java.lang.String r9 = r3.f244b
            goto L_0x03cf
        L_0x03ce:
            r9 = r8
        L_0x03cf:
            boolean r6 = e.x.c.i.a(r6, r9)
            if (r6 == 0) goto L_0x03ba
            r8 = r5
        L_0x03d6:
            b.a.a.i.d r8 = (b.a.a.i.d) r8
            if (r8 == 0) goto L_0x03e6
            r8.f311e = r0
            r8.f = r1
            r8.f312g = r2
            goto L_0x03e6
        L_0x03e1:
            java.lang.String r0 = "There is no Internet connection available. Please connect to a WiFi network or make sure your mobile data is enabled"
            b.f.a.e.D0(r7, r0)
        L_0x03e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onAddToCalendarEvent(b.a.a.g.b bVar) {
        Intent intent;
        String str;
        e.x.c.i.e(bVar, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str2 = bVar.f238b;
        b.e.a.a.a.O(str2, "dateString").track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "date", "action_data", str2), new Options().setIntegration("Slack", false));
        Intent putExtra = new Intent("android.intent.action.EDIT").setType("vnd.android.cursor.item/event").putExtra("beginTime", bVar.f238b).putExtra("title", bVar.a);
        e.x.c.i.d(putExtra, "Intent(Intent.ACTION_EDI…s.TITLE, event.eventName)");
        String str3 = bVar.c;
        if (str3 == null || !b.a.a.h.m.h(str3)) {
            intent = putExtra.putExtra("allDay", true);
            str = "calendarIntent.putExtra(…XTRA_EVENT_ALL_DAY, true)";
        } else {
            intent = putExtra.putExtra("endTime", bVar.c);
            str = "calendarIntent.putExtra(…_END_TIME, event.endDate)";
        }
        e.x.c.i.d(intent, str);
        startActivity(intent);
    }

    public void onBackPressed() {
        if (F()) {
            if (this.f6924h == null) {
                this.f6924h = (DrawerLayout) findViewById(R.id.drawer_menu);
            }
            DrawerLayout drawerLayout = this.f6924h;
            if (drawerLayout != null) {
                drawerLayout.closeDrawer((int) GravityCompat.START);
                return;
            }
            return;
        }
        v();
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onCloseEvent(b.a.a.g.e eVar) {
        e.x.c.i.e(eVar, "event");
        BravoApp.b bVar = BravoApp.Q;
        Activity activity = BravoApp.f6911k;
        if (activity == null) {
            e.x.c.i.m("foregroundActivity");
            throw null;
        } else if (activity instanceof LongPressActivity) {
            BravoApp.w = false;
            ((LongPressActivity) activity).finish();
        } else if (F()) {
            o();
        } else if (BravoApp.u && BravoApp.t != null) {
            BravoApp.u = false;
            BottomSheetFragment bottomSheetFragment = BravoApp.t;
            if (bottomSheetFragment != null) {
                bottomSheetFragment.dismiss();
            }
        } else if (b.f.a.e.r(this) instanceof AppCompatDialogFragment) {
            Fragment r2 = b.f.a.e.r(this);
            Objects.requireNonNull(r2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatDialogFragment");
            ((AppCompatDialogFragment) r2).dismiss();
        } else if (BravoApp.L) {
            onIntroCloseEvent((b.a.a.g.q) null);
        } else {
            onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        e.x.c.i.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0277, code lost:
        if (r1 != null) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        r0 = r0.d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x033a  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0189 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r26) {
        /*
            r25 = this;
            r6 = r25
            super.onCreate(r26)
            r0 = 17432576(0x10a0000, float:2.5346597E-38)
            r1 = 17432577(0x10a0001, float:2.53466E-38)
            r6.overridePendingTransition(r0, r1)
            b.f.a.e.A0(r25)
            b.f.a.e.f0(r25)
            java.lang.String r0 = b.f.a.e.K()
            int r1 = r0.hashCode()
            r2 = -1560939335(0xffffffffa2f5f4b9, float:-6.6666493E-18)
            java.lang.String r3 = "menu:tabs"
            if (r1 == r2) goto L_0x0034
            r2 = -1150525230(0xffffffffbb6c60d2, float:-0.0036068452)
            if (r1 == r2) goto L_0x0028
            goto L_0x003e
        L_0x0028:
            java.lang.String r1 = "menu:modal"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003e
            r0 = 2131427363(0x7f0b0023, float:1.847634E38)
            goto L_0x0041
        L_0x0034:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003e
            r0 = 2131427364(0x7f0b0024, float:1.8476342E38)
            goto L_0x0041
        L_0x003e:
            r0 = 2131427362(0x7f0b0022, float:1.8476338E38)
        L_0x0041:
            r6.setContentView((int) r0)
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r1 = b.a.a.n.f.g()
            r8 = 0
            r0[r8] = r1
            q.a.a$b r1 = q.a.a.d
            java.lang.String r2 = "BravoActivity created for appId: %s"
            r1.a(r2, r0)
            b.a.a.n.c.a()
            boolean r0 = b.a.a.n.c.a()
            r9 = 2
            r10 = 0
            if (r0 == 0) goto L_0x00dc
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            if (r0 == 0) goto L_0x006d
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x006d
            com.appfoundry.previewer.model.Paywall r0 = r0.f7064h
            goto L_0x006e
        L_0x006d:
            r0 = r10
        L_0x006e:
            if (r0 == 0) goto L_0x0072
            r0 = r7
            goto L_0x0073
        L_0x0072:
            r0 = r8
        L_0x0073:
            if (r0 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r2 = b.f.a.e.d()
            r0[r8] = r2
            com.appfoundry.previewer.model.JsonApp r2 = com.appfoundry.previewer.BravoApp.f6915o
            if (r2 == 0) goto L_0x0092
            com.appfoundry.previewer.model.App r2 = r2.d
            if (r2 == 0) goto L_0x0092
            com.appfoundry.previewer.model.Paywall r2 = r2.f7064h
            if (r2 == 0) goto L_0x0092
            java.util.List<java.lang.String> r2 = r2.f7152b
            if (r2 == 0) goto L_0x0092
            java.lang.String r2 = r2.toString()
            goto L_0x0093
        L_0x0092:
            r2 = r10
        L_0x0093:
            r0[r7] = r2
            java.lang.String r2 = "User with paywall. App id: %s, Paid features used: %s"
            r1.b(r2, r0)
            androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
            r0.<init>(r6)
            r1 = 2131755089(0x7f100051, float:1.9141047E38)
            r0.setTitle((int) r1)
            r0.setCancelable(r8)
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f6915o
            if (r1 == 0) goto L_0x00b7
            com.appfoundry.previewer.model.App r1 = r1.d
            if (r1 == 0) goto L_0x00b7
            com.appfoundry.previewer.model.Paywall r1 = r1.f7064h
            if (r1 == 0) goto L_0x00b7
            java.lang.String r1 = r1.a
            goto L_0x00b8
        L_0x00b7:
            r1 = r10
        L_0x00b8:
            if (r1 == 0) goto L_0x00bb
            goto L_0x00c7
        L_0x00bb:
            r1 = 2131755087(0x7f10004f, float:1.9141043E38)
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r2 = "getString(R.string.downgraded_user_message)"
            e.x.c.i.d(r1, r2)
        L_0x00c7:
            r0.setMessage((java.lang.CharSequence) r1)
            r1 = 2131755088(0x7f100050, float:1.9141045E38)
            b.a.a.d.o r2 = new b.a.a.d.o
            r2.<init>(r6)
            r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)
            androidx.appcompat.app.AlertDialog r0 = r0.create()
            r0.show()
        L_0x00dc:
            com.appfoundry.previewer.model.Page r0 = b.a.a.n.f.k()
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f6915o
            if (r1 == 0) goto L_0x00f1
            com.appfoundry.previewer.model.App r2 = r1.d
            if (r2 == 0) goto L_0x00f1
            com.appfoundry.previewer.model.Data r2 = r2.f7062e
            if (r2 == 0) goto L_0x00f1
            java.util.List<com.appfoundry.previewer.model.Page> r2 = r2.f7108b
            goto L_0x00f2
        L_0x00f1:
            r2 = r10
        L_0x00f2:
            if (r2 == 0) goto L_0x011e
            if (r1 == 0) goto L_0x0101
            com.appfoundry.previewer.model.App r1 = r1.d
            if (r1 == 0) goto L_0x0101
            com.appfoundry.previewer.model.Data r1 = r1.f7062e
            if (r1 == 0) goto L_0x0101
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f7108b
            goto L_0x0102
        L_0x0101:
            r1 = r10
        L_0x0102:
            e.x.c.i.c(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x0109:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r1.next()
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            java.lang.String r4 = "login"
            boolean r4 = b.a.a.h.e.x(r2, r4)
            if (r4 == 0) goto L_0x0109
            goto L_0x011f
        L_0x011e:
            r2 = r10
        L_0x011f:
            boolean r1 = b.a.a.n.c.s()
            if (r1 != 0) goto L_0x012a
            com.appfoundry.previewer.model.Page r1 = b.a.a.n.c.g()
            goto L_0x012b
        L_0x012a:
            r1 = r10
        L_0x012b:
            android.content.Intent r4 = r25.getIntent()
            java.lang.String r5 = "intent"
            e.x.c.i.d(r4, r5)
            android.os.Bundle r4 = r4.getExtras()
            if (r4 == 0) goto L_0x0141
            java.lang.String r11 = "showIntro"
            boolean r4 = r4.getBoolean(r11, r7)
            goto L_0x0142
        L_0x0141:
            r4 = r7
        L_0x0142:
            android.content.Intent r11 = r25.getIntent()
            e.x.c.i.d(r11, r5)
            android.os.Bundle r5 = r11.getExtras()
            if (r5 == 0) goto L_0x0154
            java.lang.String r11 = "showLogin"
            r5.getBoolean(r11, r7)
        L_0x0154:
            android.content.Context r5 = b.f.a.e.c()
            java.lang.String r11 = "com.appfoundry.previewerLoaded"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r11, r8)
            java.lang.String r12 = "appContext().getSharedPr…ME, Context.MODE_PRIVATE)"
            e.x.c.i.d(r5, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "intro_already_displayed_"
            r13.append(r14)
            com.appfoundry.previewer.BravoApp$b r15 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r15 = com.appfoundry.previewer.BravoApp.f6915o
            if (r15 == 0) goto L_0x0176
            java.lang.String r15 = r15.a
            goto L_0x0177
        L_0x0176:
            r15 = r10
        L_0x0177:
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.String r15 = "key"
            e.x.c.i.e(r13, r15)
            boolean r5 = r5.getBoolean(r13, r8)
            if (r0 == 0) goto L_0x019b
            if (r4 == 0) goto L_0x019b
            java.lang.String r4 = r0.f7135n
            if (r4 == 0) goto L_0x0197
            java.lang.String r13 = "always"
            boolean r4 = r4.equals(r13)
            if (r4 == r7) goto L_0x0199
        L_0x0197:
            if (r5 != 0) goto L_0x019b
        L_0x0199:
            r4 = r7
            goto L_0x019c
        L_0x019b:
            r4 = r8
        L_0x019c:
            if (r4 == 0) goto L_0x01d2
            com.appfoundry.previewer.BravoApp.L = r7
            android.content.Context r1 = b.f.a.e.c()
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r11, r8)
            e.x.c.i.d(r1, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            com.appfoundry.previewer.model.JsonApp r4 = com.appfoundry.previewer.BravoApp.f6915o
            if (r4 == 0) goto L_0x01ba
            java.lang.String r4 = r4.a
            goto L_0x01bb
        L_0x01ba:
            r4 = r10
        L_0x01bb:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            e.x.c.i.e(r2, r15)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r2, r7)
            r1.apply()
            goto L_0x0292
        L_0x01d2:
            if (r2 == 0) goto L_0x0203
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = b.f.a.e.c()
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r5 = "user_logged_in"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            e.x.c.i.e(r4, r15)
            boolean r0 = r0.getBoolean(r4, r8)
            if (r0 != 0) goto L_0x0203
            r0 = r7
            goto L_0x0204
        L_0x0203:
            r0 = r8
        L_0x0204:
            if (r0 == 0) goto L_0x0209
            r13 = r2
            goto L_0x0295
        L_0x0209:
            if (r1 == 0) goto L_0x0241
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            android.content.Context r4 = b.f.a.e.c()
            java.lang.String r4 = r4.getPackageName()
            r2.append(r4)
            java.lang.String r4 = b.a.a.n.f.g()
            r2.append(r4)
            java.lang.String r4 = "app_user_logged_in"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            e.x.c.i.e(r2, r15)
            boolean r0 = r0.getBoolean(r2, r8)
            if (r0 != 0) goto L_0x0241
            r0 = r7
            goto L_0x0242
        L_0x0241:
            r0 = r8
        L_0x0242:
            if (r0 == 0) goto L_0x0246
        L_0x0244:
            r0 = r1
            goto L_0x0292
        L_0x0246:
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            if (r0 == 0) goto L_0x027a
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x027a
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x027a
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
            if (r0 == 0) goto L_0x027a
            java.util.Iterator r0 = r0.iterator()
        L_0x025a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0274
            java.lang.Object r1 = r0.next()
            r2 = r1
            com.appfoundry.previewer.model.Page r2 = (com.appfoundry.previewer.model.Page) r2
            java.lang.Boolean r2 = r2.f7131j
            if (r2 == 0) goto L_0x0270
            boolean r2 = r2.booleanValue()
            goto L_0x0271
        L_0x0270:
            r2 = r8
        L_0x0271:
            if (r2 == 0) goto L_0x025a
            goto L_0x0275
        L_0x0274:
            r1 = r10
        L_0x0275:
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            if (r1 == 0) goto L_0x027a
            goto L_0x0244
        L_0x027a:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            com.appfoundry.previewer.model.JsonApp r0 = com.appfoundry.previewer.BravoApp.f6915o
            if (r0 == 0) goto L_0x0294
            com.appfoundry.previewer.model.App r0 = r0.d
            if (r0 == 0) goto L_0x0294
            com.appfoundry.previewer.model.Data r0 = r0.f7062e
            if (r0 == 0) goto L_0x0294
            java.util.List<com.appfoundry.previewer.model.Page> r0 = r0.f7108b
            if (r0 == 0) goto L_0x0294
            java.lang.Object r0 = r0.get(r8)
            com.appfoundry.previewer.model.Page r0 = (com.appfoundry.previewer.model.Page) r0
        L_0x0292:
            r13 = r0
            goto L_0x0295
        L_0x0294:
            r13 = r10
        L_0x0295:
            r14 = 4
            if (r13 == 0) goto L_0x02c5
            java.lang.String r0 = "$this$shouldHideMenu"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = "$this$isIntro"
            e.x.c.i.e(r13, r0)
            java.lang.String r0 = r13.a
            com.appfoundry.previewer.model.Page r1 = b.a.a.n.f.k()
            if (r1 == 0) goto L_0x02ad
            java.lang.String r1 = r1.a
            goto L_0x02ae
        L_0x02ad:
            r1 = r10
        L_0x02ae:
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == r7) goto L_0x02bd
            boolean r0 = b.a.a.h.e.A(r13)
            if (r0 != r7) goto L_0x02bb
            goto L_0x02bd
        L_0x02bb:
            r0 = r8
            goto L_0x02be
        L_0x02bd:
            r0 = r7
        L_0x02be:
            if (r0 != r7) goto L_0x02c5
            b.f.a.e.e0(r25)
            goto L_0x0426
        L_0x02c5:
            java.lang.String r0 = "$this$setupMenu"
            e.x.c.i.e(r6, r0)
            com.appfoundry.previewer.model.Page r5 = b.f.a.e.J()
            java.lang.String r0 = b.f.a.e.K()
            java.lang.String r1 = "menu:slide"
            boolean r1 = e.x.c.i.a(r0, r1)
            if (r1 != 0) goto L_0x033a
            java.lang.String r1 = "menu:side"
            boolean r1 = e.x.c.i.a(r0, r1)
            if (r1 == 0) goto L_0x02e3
            goto L_0x033a
        L_0x02e3:
            boolean r0 = e.x.c.i.a(r0, r3)
            if (r0 == 0) goto L_0x0426
            r0 = 2131231221(0x7f0801f5, float:1.8078517E38)
            android.view.View r0 = r6.findViewById(r0)
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            java.lang.String r0 = "tabMenu"
            e.x.c.i.d(r4, r0)
            r4.setVisibility(r8)
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            int r1 = b.f.a.e.O(r25)
            r0.height = r1
            if (r5 == 0) goto L_0x030a
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r5.f
            goto L_0x030b
        L_0x030a:
            r0 = r10
        L_0x030b:
            if (r0 == 0) goto L_0x0426
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r5.f
            e.x.c.i.c(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0316:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0426
            java.lang.Object r0 = r16.next()
            com.appfoundry.previewer.model.Container r0 = (com.appfoundry.previewer.model.Container) r0
            java.lang.String r2 = r5.a
            java.lang.Boolean r17 = java.lang.Boolean.FALSE
            r18 = 1120403456(0x42c80000, float:100.0)
            r1 = r25
            r3 = r4
            r19 = r4
            r4 = r17
            r7 = r5
            r5 = r18
            b.a.a.h.e.g(r0, r1, r2, r3, r4, r5)
            r5 = r7
            r4 = r19
            r7 = 1
            goto L_0x0316
        L_0x033a:
            r7 = r5
            r0 = 2131231175(0x7f0801c7, float:1.8078424E38)
            android.view.View r0 = r6.findViewById(r0)
            com.google.android.material.navigation.NavigationView r0 = (com.google.android.material.navigation.NavigationView) r0
            java.lang.String r1 = "slideMenu"
            e.x.c.i.d(r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            com.appfoundry.previewer.model.Page r2 = b.f.a.e.J()
            if (r2 == 0) goto L_0x0356
            java.util.List<com.appfoundry.previewer.model.Container> r2 = r2.f
            goto L_0x0357
        L_0x0356:
            r2 = r10
        L_0x0357:
            if (r2 == 0) goto L_0x0380
            java.util.Iterator r2 = r2.iterator()
            r3 = r8
        L_0x035e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0381
            java.lang.Object r4 = r2.next()
            com.appfoundry.previewer.model.Container r4 = (com.appfoundry.previewer.model.Container) r4
            java.lang.String r4 = r4.c
            com.appfoundry.previewer.model.Style r4 = b.a.a.n.f.u(r4, r10, r9)
            if (r4 == 0) goto L_0x0375
            java.lang.Float r5 = r4.f7172i
            goto L_0x0376
        L_0x0375:
            r5 = r10
        L_0x0376:
            if (r5 == 0) goto L_0x035e
            int r4 = b.f.a.e.y0(r4)
            if (r4 <= r3) goto L_0x035e
            r3 = r4
            goto L_0x035e
        L_0x0380:
            r3 = r8
        L_0x0381:
            r1.width = r3
            r1 = 2131230916(0x7f0800c4, float:1.8077898E38)
            android.view.View r1 = r6.findViewById(r1)
            androidx.drawerlayout.widget.DrawerLayout r1 = (androidx.drawerlayout.widget.DrawerLayout) r1
            if (r1 == 0) goto L_0x0391
            r1.setDrawerLockMode(r8)
        L_0x0391:
            if (r7 == 0) goto L_0x0396
            com.appfoundry.previewer.model.Container r1 = r7.f7130i
            goto L_0x0397
        L_0x0396:
            r1 = r10
        L_0x0397:
            if (r1 == 0) goto L_0x03f5
            com.appfoundry.previewer.model.Page r1 = b.f.a.e.J()
            if (r1 == 0) goto L_0x03b8
            java.util.List<com.appfoundry.previewer.model.Container> r1 = r1.f
            if (r1 == 0) goto L_0x03b8
            java.lang.Object r1 = r1.get(r8)
            com.appfoundry.previewer.model.Container r1 = (com.appfoundry.previewer.model.Container) r1
            if (r1 == 0) goto L_0x03b8
            java.util.List<java.lang.String> r1 = r1.f7101j
            if (r1 == 0) goto L_0x03b8
            boolean r1 = b.f.a.e.V(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x03b9
        L_0x03b8:
            r1 = r10
        L_0x03b9:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = e.x.c.i.a(r1, r2)
            if (r1 == 0) goto L_0x03ee
            com.appfoundry.previewer.model.Container r1 = r7.f7130i
            if (r1 == 0) goto L_0x03c8
            java.util.List<java.lang.String> r2 = r1.f7101j
            goto L_0x03c9
        L_0x03c8:
            r2 = r10
        L_0x03c9:
            java.lang.String r3 = "display:fullscreen"
            if (r2 != 0) goto L_0x03d4
            if (r1 == 0) goto L_0x03ee
            java.util.List r2 = b.q.a.a.l2(r3)
            goto L_0x03ec
        L_0x03d4:
            if (r1 == 0) goto L_0x03ee
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.appfoundry.previewer.model.Container r4 = r7.f7130i
            if (r4 == 0) goto L_0x03e2
            java.util.List<java.lang.String> r4 = r4.f7101j
            goto L_0x03e3
        L_0x03e2:
            r4 = r10
        L_0x03e3:
            e.x.c.i.c(r4)
            r2.addAll(r4)
            r2.add(r3)
        L_0x03ec:
            r1.f7101j = r2
        L_0x03ee:
            java.lang.String r1 = r7.a
            com.appfoundry.previewer.model.Container r2 = r7.f7130i
            b.a.a.h.o.b(r0, r1, r2, r10, r14)
        L_0x03f5:
            r0 = 2131231128(0x7f080198, float:1.8078328E38)
            android.view.View r0 = r6.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.recyclerView)"
            e.x.c.i.d(r0, r1)
            r16 = r0
            androidx.recyclerview.widget.RecyclerView r16 = (androidx.recyclerview.widget.RecyclerView) r16
            if (r7 == 0) goto L_0x040c
            java.lang.String r0 = r7.a
            r17 = r0
            goto L_0x040e
        L_0x040c:
            r17 = r10
        L_0x040e:
            if (r7 == 0) goto L_0x0415
            java.util.List<com.appfoundry.previewer.model.Container> r0 = r7.f
            r18 = r0
            goto L_0x0417
        L_0x0415:
            r18 = r10
        L_0x0417:
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 124(0x7c, float:1.74E-43)
            b.f.a.e.C0(r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0426:
            r0 = 2131230858(0x7f08008a, float:1.807778E38)
            b.f.a.e.u0(r6, r13, r0)
            boolean r0 = b.a.a.n.c.s()
            java.lang.String r1 = "shake_toast_displayed"
            if (r0 != 0) goto L_0x045c
            boolean r0 = b.a.a.n.c.b()
            if (r0 == 0) goto L_0x045c
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            e.x.c.i.e(r1, r15)
            boolean r0 = r0.getBoolean(r1, r8)
            if (r0 != 0) goto L_0x045c
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.lang.Boolean r0 = com.appfoundry.previewer.BravoApp.P
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r0 = e.x.c.i.a(r0, r2)
            if (r0 == 0) goto L_0x045c
            r0 = 1
            goto L_0x045d
        L_0x045c:
            r0 = r8
        L_0x045d:
            if (r0 == 0) goto L_0x051e
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            e.x.c.i.e(r1, r15)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2 = 1
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            r0.apply()
            r0 = 2131231110(0x7f080186, float:1.8078292E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            if (r0 == 0) goto L_0x051e
            java.lang.String r1 = ""
            com.google.android.material.snackbar.Snackbar r0 = com.google.android.material.snackbar.Snackbar.make((android.view.View) r0, (java.lang.CharSequence) r1, (int) r8)
            java.lang.String r1 = "Snackbar.make(parentLayo…\"\", Snackbar.LENGTH_LONG)"
            e.x.c.i.d(r0, r1)
            android.content.res.Resources r1 = r25.getResources()
            r2 = 2131100070(0x7f0601a6, float:1.7812511E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            android.content.res.Resources r2 = r25.getResources()
            r3 = 2131100068(0x7f0601a4, float:1.7812507E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            android.view.LayoutInflater r3 = r25.getLayoutInflater()
            r4 = 2131427471(0x7f0b008f, float:1.847656E38)
            android.view.View r3 = r3.inflate(r4, r10)
            r4 = 2131231180(0x7f0801cc, float:1.8078434E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x04e9
            java.util.Hashtable r5 = new java.util.Hashtable
            r5.<init>()
            java.lang.String r7 = "01DZ4603S1A99S0MKRX805Z15F"
            java.lang.String r13 = "fontName"
            e.x.c.i.e(r7, r13)
            java.lang.Object r13 = r5.get(r7)
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13
            if (r13 != 0) goto L_0x04e5
            android.content.Context r13 = b.f.a.e.c()     // Catch:{ Exception -> 0x04e3 }
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ Exception -> 0x04e3 }
            java.lang.String r10 = "fonts/01DZ4603S1A99S0MKRX805Z15F.otf"
            android.graphics.Typeface r10 = android.graphics.Typeface.createFromAsset(r13, r10)     // Catch:{ Exception -> 0x04e3 }
            r5.put(r7, r10)
            goto L_0x04e6
        L_0x04e3:
            r10 = 0
            goto L_0x04e6
        L_0x04e5:
            r10 = r13
        L_0x04e6:
            r4.setTypeface(r10)
        L_0x04e9:
            android.view.View r4 = r0.getView()
            r5 = 2131034148(0x7f050024, float:1.7678805E38)
            int r5 = androidx.core.content.ContextCompat.getColor(r6, r5)
            r4.setBackgroundColor(r5)
            android.view.View r4 = r0.getView()
            java.lang.String r5 = "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout"
            java.util.Objects.requireNonNull(r4, r5)
            com.google.android.material.snackbar.Snackbar$SnackbarLayout r4 = (com.google.android.material.snackbar.Snackbar.SnackbarLayout) r4
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            java.util.Objects.requireNonNull(r5, r7)
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            r5.setMargins(r1, r8, r1, r1)
            r5.height = r2
            r1 = -1
            r5.width = r1
            r4.setLayoutParams(r5)
            r4.addView(r3, r8)
            r0.show()
        L_0x051e:
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            java.lang.String r1 = "app_process_id"
            int r2 = android.os.Process.myPid()
            e.x.c.i.e(r1, r15)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            r0.apply()
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            boolean r0 = com.appfoundry.previewer.BravoApp.B
            if (r0 == 0) goto L_0x055a
            b.l.a.d.a.a.b r0 = r25.s()
            b.l.a.d.a.i.r r0 = r0.b()
            java.lang.String r1 = "appUpdateManager.appUpdateInfo"
            e.x.c.i.d(r0, r1)
            b.a.a.d.b r1 = new b.a.a.d.b
            r1.<init>(r6)
            java.util.concurrent.Executor r2 = b.l.a.d.a.i.e.a
            r0.c(r2, r1)
        L_0x055a:
            boolean r0 = b.a.a.n.c.b()
            if (r0 != 0) goto L_0x0566
            java.lang.Integer r0 = b.a.a.n.f.r()
            if (r0 == 0) goto L_0x0636
        L_0x0566:
            android.content.Context r0 = b.f.a.e.c()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r11, r8)
            e.x.c.i.d(r0, r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = b.f.a.e.d()
            r1.append(r2)
            java.lang.String r2 = "app_sessions"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            e.x.c.i.e(r1, r15)
            e.x.c.i.e(r1, r15)
            int r2 = r0.getInt(r1, r8)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r3 = 1
            int r2 = r2 + r3
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)
            r0.apply()
            boolean r0 = b.a.a.n.c.b()
            if (r0 == 0) goto L_0x05a5
            r0 = 5
            goto L_0x05b1
        L_0x05a5:
            java.lang.Integer r0 = b.a.a.n.f.r()
            if (r0 == 0) goto L_0x05b0
            int r0 = r0.intValue()
            goto L_0x05b1
        L_0x05b0:
            r0 = 3
        L_0x05b1:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1[r8] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 1
            r1[r4] = r3
            q.a.a$b r3 = q.a.a.d
            java.lang.String r4 = "APP_SESSIONS = %d, ratingAppAlert = %d"
            r3.a(r4, r1)
            if (r2 <= 0) goto L_0x05cf
            int r0 = r2 % r0
            if (r0 != 0) goto L_0x05cf
            r0 = 1
            goto L_0x05d0
        L_0x05cf:
            r0 = r8
        L_0x05d0:
            if (r0 == 0) goto L_0x0636
            android.content.pm.PackageManager r0 = r25.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r25.getPackageName()
            java.lang.String r4 = "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"
            r1.<init>(r3, r4)
            r3 = 1
            b.l.a.c.b.a.b0(r0, r1, r3)
            android.content.Context r0 = r25.getApplicationContext()
            if (r0 == 0) goto L_0x05ec
            goto L_0x05ed
        L_0x05ec:
            r0 = r6
        L_0x05ed:
            b.l.a.d.a.g.c r1 = new b.l.a.d.a.g.c
            b.l.a.d.a.g.g r3 = new b.l.a.d.a.g.g
            r3.<init>(r0)
            r1.<init>(r3)
            java.lang.String r0 = "ReviewManagerFactory.create(this)"
            e.x.c.i.d(r1, r0)
            b.l.a.d.a.g.g r0 = r1.a
            b.l.a.d.a.e.f r3 = b.l.a.d.a.g.g.c
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r0.f4688b
            r4[r8] = r5
            java.lang.String r5 = "requestInAppReview (%s)"
            r3.b(r14, r5, r4)
            b.l.a.d.a.i.n r3 = new b.l.a.d.a.i.n
            r3.<init>()
            b.l.a.d.a.e.p<b.l.a.d.a.e.c> r4 = r0.a
            b.l.a.d.a.g.e r5 = new b.l.a.d.a.g.e
            r5.<init>(r0, r3, r3)
            r4.a(r5)
            b.l.a.d.a.i.r<ResultT> r0 = r3.a
            java.lang.String r3 = "manager.requestReviewFlow()"
            e.x.c.i.d(r0, r3)
            b.a.a.d.m r3 = new b.a.a.d.m
            r3.<init>(r6, r1, r2)
            java.util.concurrent.Executor r1 = b.l.a.d.a.i.e.a
            b.l.a.d.a.i.m<ResultT> r2 = r0.f4701b
            b.l.a.d.a.i.g r4 = new b.l.a.d.a.i.g
            r4.<init>(r1, r3)
            r2.a(r4)
            r0.e()
        L_0x0636:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        b.f.a.e.L0(this);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onDownloadEvent(b.a.a.g.g gVar) {
        e.x.c.i.e(gVar, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = gVar.a;
        b.e.a.a.a.K("Slack", false, b.e.a.a.a.O(str, "url"), "Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "download", "action_data", str));
        Dexter.withContext(this).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new n(this, gVar)).check();
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onEmailEvent(b.a.a.g.h hVar) {
        e.x.c.i.e(hVar, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = hVar.a;
        b.e.a.a.a.O(str, NotificationCompat.CATEGORY_EMAIL).track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", NotificationCompat.CATEGORY_EMAIL, "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", hVar.a, (String) null)));
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onFirebaseLogoutEvent(b.a.a.g.l lVar) {
        e.x.c.i.e(lVar, "logout");
        g();
        BravoApp.b bVar = BravoApp.Q;
        FirebaseAuth firebaseAuth = BravoApp.D;
        if (firebaseAuth != null) {
            firebaseAuth.a();
        }
        e.x.c.i.e(this, "$this$removeAllFragments");
        b.a.a.a.b bVar2 = null;
        getSupportFragmentManager().popBackStack((String) null, 1);
        o();
        Page g2 = b.a.a.n.c.g();
        if (g2 != null) {
            bVar2 = b.a.a.h.e.f(g2, (Boolean) null, 1);
        }
        b.f.a.e.t0(this, bVar2, R.id.container);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onFirebaseRegisterEvent(b.a.a.g.m mVar) {
        e.x.c.i.e(mVar, "event");
        B();
        r(mVar.a, "register:firebase-email-password");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onGoBackEvent(b.a.a.g.n nVar) {
        e.x.c.i.e(nVar, "event");
        onBackPressed();
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onInputFileEvent(b.a.a.g.o oVar) {
        e.x.c.i.e(oVar, "event");
        this.r = oVar;
        e.x.c.i.f(this, BasePayload.CONTEXT_KEY);
        e.x.c.i.f(this, BasePayload.CONTEXT_KEY);
        Intent intent = new Intent(this, KotlinFilePicker.class);
        intent.putExtra("extraFileSelection", "File");
        intent.putExtra("extraMultipleEnabled", false);
        intent.putExtra("extraMultipleEnabled", false);
        e.x.c.i.f("*/*", "mimeType");
        intent.putExtra("extraFileMimeType", "*/*");
        startActivityForResult(intent, 25);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onInputImageEvent(b.a.a.g.p pVar) {
        e.x.c.i.e(pVar, "event");
        this.f6932p = pVar;
        e.x.c.i.f(this, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        b.k.b.a.b bVar = new b.k.b.a.b(this);
        o oVar = o.f6983h;
        e.x.c.i.f(oVar, "interceptor");
        bVar.c = oVar;
        if (bVar.a == b.k.b.a.c.a.BOTH) {
            Activity activity = bVar.d;
            b.k.b.a.a aVar = new b.k.b.a.a(bVar, 24);
            e.x.c.i.f(activity, BasePayload.CONTEXT_KEY);
            e.x.c.i.f(aVar, "listener");
            View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_choose_app, (ViewGroup) null);
            AlertDialog show = new AlertDialog.Builder(activity).setTitle((int) R.string.title_choose_image_provider).setView(inflate).setOnCancelListener(new b.k.b.a.f.a(aVar)).setNegativeButton((int) R.string.action_cancel, (DialogInterface.OnClickListener) new b.k.b.a.f.b(aVar)).show();
            e.x.c.i.b(inflate, "customView");
            ((LinearLayout) inflate.findViewById(R.id.lytCameraPick)).setOnClickListener(new defpackage.c(0, aVar, show));
            ((LinearLayout) inflate.findViewById(R.id.lytGalleryPick)).setOnClickListener(new defpackage.c(1, aVar, show));
            return;
        }
        bVar.a(24);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onIntroCloseEvent(b.a.a.g.q qVar) {
        BravoApp.Q.d();
        if (!BravoApp.x) {
            BravoApp.L = false;
            Bundle bundle = new Bundle();
            bundle.putBoolean("showIntro", false);
            bundle.putBoolean("showLogin", true);
            Intent intent = new Intent(this, BravoActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onLoginWithProviderEvent(b.a.a.g.r rVar) {
        e.x.c.i.e(rVar, "event");
        B();
        String str = rVar.f248b;
        int hashCode = str.hashCode();
        if (hashCode == -1188976132 ? !str.equals("app-with-oauth") : hashCode != 108318258 || !str.equals("firebase-email-password")) {
            BravoApp.b bVar = BravoApp.Q;
            String str2 = rVar.f248b;
            e.x.c.i.e(str2, "<set-?>");
            BravoApp.K = str2;
            x(rVar.f248b);
            return;
        }
        r(rVar.a, "firebase-email-password");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onLogoutEvent(b.a.a.g.s sVar) {
        e.x.c.i.e(sVar, "logout");
        b.f.a.e.e0(this);
        b.a.a.a.b bVar = null;
        if (sVar.a) {
            b.g.a.a aVar = new b.g.a.a(this);
            b.g.a.e.f.a aVar2 = new b.g.a.e.f.a(new b.g.a.e.b(aVar), new b.g.a.e.f.i(this));
            String str = b.g.a.h.v.a;
            if (!"bravovision".equals("bravovision".toLowerCase())) {
                Log.w(b.g.a.h.v.a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            p pVar = new p(this, aVar2);
            b.g.a.h.v.f452b = null;
            if (!b.g.a.h.v.a(getPackageManager())) {
                pVar.b(new b.g.a.b("Cannot perform web log out", new ActivityNotFoundException("No Browser application installed.")));
                return;
            }
            b.g.a.h.l lVar = new b.g.a.h.l(aVar, pVar, b.g.a.h.f.a("bravovision", getApplicationContext().getPackageName(), aVar.f405b.f6728i));
            lVar.d = null;
            b.g.a.h.v.f452b = lVar;
            Map<String, String> map = lVar.c;
            b.g.a.k.c cVar = aVar.c;
            if (cVar != null) {
                map.put("auth0Client", cVar.f464b);
            }
            map.put("client_id", lVar.a.a);
            o.b k2 = lVar.a.f405b.k();
            k2.a("v2");
            k2.a("logout");
            Uri.Builder buildUpon = Uri.parse(k2.c().f6728i).buildUpon();
            for (Map.Entry next : lVar.c.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
            }
            Uri build = buildUpon.build();
            build.toString();
            Objects.requireNonNull(lVar.a);
            AuthenticationActivity.a(this, build, lVar.d);
        } else if (b.a.a.n.c.s()) {
            C();
        } else {
            g();
            BravoApp.b bVar2 = BravoApp.Q;
            b.a.a.k.b bVar3 = BravoApp.C;
            if (bVar3 != null) {
                bVar3.a(this);
            }
            e.x.c.i.e(this, "$this$removeAllFragments");
            getSupportFragmentManager().popBackStack((String) null, 1);
            o();
            Page g2 = b.a.a.n.c.g();
            if (g2 != null) {
                bVar = b.a.a.h.e.f(g2, (Boolean) null, 1);
            }
            b.f.a.e.t0(this, bVar, R.id.container);
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onMapsEvent(b.a.a.g.u uVar) {
        StringBuilder sb;
        e.x.c.i.e(uVar, "event");
        String str = uVar.a;
        if (str == null || !(!e.x.c.i.a(str, ""))) {
            sb = b.e.a.a.a.y("geo:");
            sb.append(uVar.f249b);
            sb.append(",");
            sb.append(uVar.c);
            sb.append("?z=");
            sb.append(uVar.d);
        } else {
            sb = b.e.a.a.a.y("geo:0,0?q=");
            sb.append(uVar.a);
        }
        String sb2 = sb.toString();
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        b.a.a.e.a.d(sb2);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb2)).setPackage("com.google.android.apps.maps"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (e.x.c.i.a(r11.c, r1) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e7, code lost:
        if (e.x.c.i.a(r11.c, r1) != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        if (e.c0.h.d(r2, r9, false, 2) == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        if (e.c0.h.d(r2, r0, false, 2) != false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
    @p.a.a.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNavigationEvent(b.a.a.g.v r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r11, r0)
            com.appfoundry.previewer.BravoApp$b r1 = com.appfoundry.previewer.BravoApp.Q
            boolean r1 = com.appfoundry.previewer.BravoApp.x
            if (r1 != 0) goto L_0x01e4
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r2 = "$this$fragmentAlreadyVisible"
            e.x.c.i.e(r10, r2)
            e.x.c.i.e(r11, r0)
            boolean r2 = com.appfoundry.previewer.BravoApp.v
            java.lang.String r3 = "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BravoFragment"
            java.lang.String r4 = "supportFragmentManager.fragments"
            java.lang.String r5 = "supportFragmentManager"
            r6 = 1
            r7 = 0
            r8 = 0
            if (r2 != 0) goto L_0x008a
            androidx.fragment.app.FragmentManager r2 = r10.getSupportFragmentManager()
            e.x.c.i.d(r2, r5)
            java.util.List r2 = r2.getFragments()
            e.x.c.i.d(r2, r4)
            java.lang.Object r2 = e.t.g.z(r2)
            boolean r2 = r2 instanceof com.appfoundry.previewer.fragments.BottomSheetFragment
            if (r2 == 0) goto L_0x0039
            goto L_0x008a
        L_0x0039:
            androidx.fragment.app.FragmentManager r2 = r10.getSupportFragmentManager()
            e.x.c.i.d(r2, r5)
            java.util.List r2 = r2.getFragments()
            e.x.c.i.d(r2, r4)
            java.lang.Object r2 = e.t.g.z(r2)
            boolean r2 = r2 instanceof b.a.a.a.h
            if (r2 == 0) goto L_0x00eb
            androidx.fragment.app.FragmentManager r2 = r10.getSupportFragmentManager()
            e.x.c.i.d(r2, r5)
            java.util.List r2 = r2.getFragments()
            e.x.c.i.d(r2, r4)
            java.lang.Object r2 = e.t.g.z(r2)
            java.util.Objects.requireNonNull(r2, r3)
            b.a.a.a.h r2 = (b.a.a.a.h) r2
            com.appfoundry.previewer.model.Page r2 = r2.f74h
            if (r2 == 0) goto L_0x0073
            boolean r3 = b.a.a.h.e.E(r2)
            if (r3 != r6) goto L_0x0073
            java.lang.String r2 = r2.y
            goto L_0x0079
        L_0x0073:
            if (r2 == 0) goto L_0x0078
            java.lang.String r2 = r2.a
            goto L_0x0079
        L_0x0078:
            r2 = r7
        L_0x0079:
            java.lang.String r3 = r11.a
            boolean r2 = e.x.c.i.a(r2, r3)
            if (r2 == 0) goto L_0x00eb
            java.lang.Boolean r2 = r11.c
            boolean r2 = e.x.c.i.a(r2, r1)
            if (r2 == 0) goto L_0x00eb
            goto L_0x00e9
        L_0x008a:
            androidx.fragment.app.FragmentManager r2 = r10.getSupportFragmentManager()
            e.x.c.i.d(r2, r5)
            java.util.List r2 = r2.getFragments()
            e.x.c.i.d(r2, r4)
            int r2 = e.t.g.s(r2)
            int r2 = r2 - r6
            if (r2 < 0) goto L_0x00eb
            androidx.fragment.app.FragmentManager r4 = r10.getSupportFragmentManager()
            e.x.c.i.d(r4, r5)
            java.util.List r4 = r4.getFragments()
            java.lang.Object r4 = r4.get(r2)
            boolean r4 = r4 instanceof b.a.a.a.h
            if (r4 == 0) goto L_0x00eb
            androidx.fragment.app.FragmentManager r4 = r10.getSupportFragmentManager()
            e.x.c.i.d(r4, r5)
            java.util.List r4 = r4.getFragments()
            java.lang.Object r2 = r4.get(r2)
            java.util.Objects.requireNonNull(r2, r3)
            b.a.a.a.h r2 = (b.a.a.a.h) r2
            com.appfoundry.previewer.model.Page r2 = r2.f74h
            if (r2 == 0) goto L_0x00d3
            boolean r3 = b.a.a.h.e.E(r2)
            if (r3 != r6) goto L_0x00d3
            java.lang.String r2 = r2.y
            goto L_0x00d9
        L_0x00d3:
            if (r2 == 0) goto L_0x00d8
            java.lang.String r2 = r2.a
            goto L_0x00d9
        L_0x00d8:
            r2 = r7
        L_0x00d9:
            java.lang.String r3 = r11.a
            boolean r2 = e.x.c.i.a(r2, r3)
            if (r2 == 0) goto L_0x00eb
            java.lang.Boolean r2 = r11.c
            boolean r2 = e.x.c.i.a(r2, r1)
            if (r2 == 0) goto L_0x00eb
        L_0x00e9:
            r2 = r6
            goto L_0x00ec
        L_0x00eb:
            r2 = r8
        L_0x00ec:
            if (r2 == 0) goto L_0x00fc
            r10.o()
            java.lang.Object[] r11 = new java.lang.Object[r8]
            q.a.a$b r0 = q.a.a.d
            java.lang.String r1 = "Trying to load a fragment already visible so we better do nothing"
            r0.a(r1, r11)
            goto L_0x01e4
        L_0x00fc:
            e.x.c.i.e(r11, r0)
            java.lang.String r0 = r11.a
            java.util.List<java.lang.String> r2 = com.appfoundry.previewer.BravoApp.f6910j
            int r2 = r2.size()
            java.lang.String r3 = ""
            r4 = 2
            if (r2 < r4) goto L_0x0124
            java.util.List<java.lang.String> r2 = com.appfoundry.previewer.BravoApp.f6910j
            int r9 = r2.size()
            int r9 = r9 - r4
            java.lang.Object r2 = r2.get(r9)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r0 == 0) goto L_0x011d
            r9 = r0
            goto L_0x011e
        L_0x011d:
            r9 = r3
        L_0x011e:
            boolean r2 = e.c0.h.d(r2, r9, r8, r4)
            if (r2 != 0) goto L_0x013e
        L_0x0124:
            java.util.List<java.lang.String> r2 = com.appfoundry.previewer.BravoApp.f6910j
            int r2 = r2.size()
            if (r2 != r6) goto L_0x0140
            java.util.List<java.lang.String> r2 = com.appfoundry.previewer.BravoApp.f6910j
            java.lang.Object r2 = r2.get(r8)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r0 == 0) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r0 = r3
        L_0x0138:
            boolean r0 = e.c0.h.d(r2, r0, r8, r4)
            if (r0 == 0) goto L_0x0140
        L_0x013e:
            r0 = r6
            goto L_0x0141
        L_0x0140:
            r0 = r8
        L_0x0141:
            if (r0 == 0) goto L_0x014d
            java.lang.Boolean r0 = r11.c
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x014d
            r0 = r6
            goto L_0x014e
        L_0x014d:
            r0 = r8
        L_0x014e:
            if (r0 == 0) goto L_0x0158
            r10.o()
            r10.v()
            goto L_0x01e4
        L_0x0158:
            java.lang.String r0 = r11.a
            com.appfoundry.previewer.model.JsonApp r1 = com.appfoundry.previewer.BravoApp.f6915o
            if (r1 == 0) goto L_0x0175
            com.appfoundry.previewer.model.App r1 = r1.d
            if (r1 == 0) goto L_0x0175
            com.appfoundry.previewer.model.Data r1 = r1.f7062e
            if (r1 == 0) goto L_0x0175
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.a
            if (r1 == 0) goto L_0x0175
            java.lang.Object r1 = r1.get(r8)
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            if (r1 == 0) goto L_0x0175
            java.lang.String r1 = r1.a
            goto L_0x0176
        L_0x0175:
            r1 = r7
        L_0x0176:
            boolean r0 = e.x.c.i.a(r1, r0)
            if (r0 == 0) goto L_0x01d2
            java.lang.String r11 = r11.a
            boolean r0 = b.f.a.e.F0()
            if (r0 == 0) goto L_0x019e
            androidx.drawerlayout.widget.DrawerLayout r11 = r10.f6924h
            if (r11 != 0) goto L_0x0193
            r11 = 2131230916(0x7f0800c4, float:1.8077898E38)
            android.view.View r11 = r10.findViewById(r11)
            androidx.drawerlayout.widget.DrawerLayout r11 = (androidx.drawerlayout.widget.DrawerLayout) r11
            r10.f6924h = r11
        L_0x0193:
            androidx.drawerlayout.widget.DrawerLayout r11 = r10.f6924h
            if (r11 == 0) goto L_0x01e4
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r11.openDrawer((int) r0)
            goto L_0x01e4
        L_0x019e:
            java.lang.String r0 = b.f.a.e.K()
            java.lang.String r1 = "menu:modal"
            boolean r0 = e.x.c.i.a(r0, r1)
            if (r0 == 0) goto L_0x01e4
            if (r11 == 0) goto L_0x01e4
            com.appfoundry.previewer.BravoApp.u = r6
            com.appfoundry.previewer.model.Page r0 = b.f.a.e.J()
            if (r0 == 0) goto L_0x01e4
            java.lang.String r1 = "$this$createBottomSheetFragment"
            e.x.c.i.e(r0, r1)
            com.appfoundry.previewer.fragments.BottomSheetFragment r1 = new com.appfoundry.previewer.fragments.BottomSheetFragment
            r1.<init>()
            java.lang.String r2 = r0.r
            b.a.a.n.f.u(r2, r7, r4)
            r1.t = r0
            com.appfoundry.previewer.BravoApp.t = r1
            androidx.fragment.app.FragmentManager r0 = r10.getSupportFragmentManager()
            e.x.c.i.d(r0, r5)
            r1.show(r0, r11)
            goto L_0x01e4
        L_0x01d2:
            r10.o()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            com.appfoundry.previewer.activities.BravoActivity$q r1 = new com.appfoundry.previewer.activities.BravoActivity$q
            r1.<init>(r10, r11)
            r2 = 200(0xc8, double:9.9E-322)
            r0.postDelayed(r1, r2)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onNavigationEvent(b.a.a.g.v):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onNewJsonEvent(b.a.a.g.w wVar) {
        e.x.c.i.e(wVar, "event");
        BravoApp.b bVar = BravoApp.Q;
        String str = BravoApp.y;
        if (str == null) {
            SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
            e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
            e.x.c.i.e("current_app_url", "key");
            str = sharedPreferences.getString("current_app_url", "");
        }
        if (str != null && (!e.x.c.i.a(str, ""))) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("new_json", true);
            Intent intent = new Intent(this, InitActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onOpenAudioEvent(b.a.a.g.y yVar) {
        e.x.c.i.e(yVar, "event");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(yVar.a), "audio/*");
        startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r1 = r4.f7062e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041 A[EDGE_INSN: B:20:0x0041->B:17:0x0041 ?: BREAK  , SYNTHETIC] */
    @p.a.a.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpenIntroEvent(b.a.a.g.z r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r4, r0)
            com.appfoundry.previewer.model.JsonApp r4 = b.a.a.n.c.h()
            r0 = 0
            if (r4 == 0) goto L_0x0041
            java.lang.String r1 = "$this$getIntroPageId"
            e.x.c.i.e(r4, r1)
            com.appfoundry.previewer.model.App r4 = r4.d
            if (r4 == 0) goto L_0x001c
            com.appfoundry.previewer.model.Data r1 = r4.f7062e
            if (r1 == 0) goto L_0x001c
            java.util.List<com.appfoundry.previewer.model.Page> r1 = r1.f7108b
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0041
            com.appfoundry.previewer.model.Data r4 = r4.f7062e
            java.util.List<com.appfoundry.previewer.model.Page> r4 = r4.f7108b
            java.util.Iterator r4 = r4.iterator()
        L_0x0027:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r4.next()
            com.appfoundry.previewer.model.Page r1 = (com.appfoundry.previewer.model.Page) r1
            java.lang.String r2 = r1.f7135n
            if (r2 != 0) goto L_0x003f
            java.lang.String r2 = "intro"
            boolean r2 = b.a.a.h.e.x(r1, r2)
            if (r2 == 0) goto L_0x0027
        L_0x003f:
            java.lang.String r0 = r1.a
        L_0x0041:
            r4 = 0
            r1 = 1
            b.f.a.e.o0(r3, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onOpenIntroEvent(b.a.a.g.z):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onOpenQrScannerEvent(a0 a0Var) {
        Serializable serializable;
        e.x.c.i.e(a0Var, "event");
        SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        e.x.c.i.e("user_disabled_ask_for_camera_permission", "key");
        if (!sharedPreferences.getBoolean("user_disabled_ask_for_camera_permission", false) || checkCallingOrSelfPermission("android.permission.CAMERA") != -1) {
            b.l.f.a0.a.a aVar = new b.l.f.a0.a.a(this);
            aVar.f5581b.put("PROMPT_MESSAGE", "");
            aVar.f5581b.put("BEEP_ENABLED", Boolean.FALSE);
            aVar.f5581b.put("SCAN_ORIENTATION_LOCKED", Boolean.TRUE);
            aVar.c = QrScannerActivity.class;
            Activity activity = aVar.a;
            if (aVar.c == null) {
                aVar.c = CaptureActivity.class;
            }
            Intent intent = new Intent(activity, aVar.c);
            intent.setAction("com.google.zxing.client.android.SCAN");
            intent.addFlags(67108864);
            intent.addFlags(524288);
            for (Map.Entry next : aVar.f5581b.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value instanceof Integer) {
                    serializable = (Integer) value;
                } else if (value instanceof Long) {
                    serializable = (Long) value;
                } else if (value instanceof Boolean) {
                    serializable = (Boolean) value;
                } else if (value instanceof Double) {
                    serializable = (Double) value;
                } else if (value instanceof Float) {
                    serializable = (Float) value;
                } else if (value instanceof Bundle) {
                    intent.putExtra(str, (Bundle) value);
                } else if (value instanceof int[]) {
                    intent.putExtra(str, (int[]) value);
                } else if (value instanceof long[]) {
                    intent.putExtra(str, (long[]) value);
                } else if (value instanceof boolean[]) {
                    intent.putExtra(str, (boolean[]) value);
                } else if (value instanceof double[]) {
                    intent.putExtra(str, (double[]) value);
                } else if (value instanceof float[]) {
                    intent.putExtra(str, (float[]) value);
                } else if (value instanceof String[]) {
                    intent.putExtra(str, (String[]) value);
                } else {
                    intent.putExtra(str, value.toString());
                }
                intent.putExtra(str, serializable);
            }
            aVar.a.startActivityForResult(intent, aVar.d);
            return;
        }
        Page q2 = b.a.a.n.f.q("error:noCamera");
        b.f.a.e.o0(this, q2 != null ? q2.a : null, false, false);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onOpenUrlEvent(b.a.a.g.b0 b0Var) {
        e.x.c.i.e(b0Var, "event");
        o();
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = b0Var.a;
        b.e.a.a.a.O(str, "url").track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "url", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(b0Var.a)));
    }

    public void onPause() {
        super.onPause();
        i2.C("foreground", "false");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        Analytics with = Analytics.with(b.f.a.e.c());
        String c2 = b.a.a.e.a.c();
        String uuid = UUID.randomUUID().toString();
        e.x.c.i.d(uuid, "java.util.UUID.randomUUID().toString()");
        b.e.a.a.a.K("Slack", false, with, "App Closed", b.a.a.e.a.b(c2, uuid));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @p.a.a.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPauseEvent(b.a.a.g.c0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r6, r0)
            com.appfoundry.previewer.BravoApp$b r6 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r6 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.a
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            java.lang.Object r6 = r6.get(r0)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x003e
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r6.next()
            r2 = r0
            b.a.a.i.a r2 = (b.a.a.i.a) r2
            java.lang.String r2 = r2.c
            java.lang.String r3 = "action:play"
            boolean r2 = e.x.c.i.a(r2, r3)
            if (r2 == 0) goto L_0x001e
            goto L_0x0037
        L_0x0036:
            r0 = r1
        L_0x0037:
            b.a.a.i.a r0 = (b.a.a.i.a) r0
            if (r0 == 0) goto L_0x003e
            android.view.View r6 = r0.d
            goto L_0x003f
        L_0x003e:
            r6 = r1
        L_0x003f:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r2 = com.appfoundry.previewer.BravoApp.G
            if (r2 == 0) goto L_0x004a
            java.lang.String r2 = r2.a
            goto L_0x004b
        L_0x004a:
            r2 = r1
        L_0x004b:
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0076
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r0.next()
            r3 = r2
            b.a.a.i.a r3 = (b.a.a.i.a) r3
            java.lang.String r3 = r3.c
            java.lang.String r4 = "action:pause"
            boolean r3 = e.x.c.i.a(r3, r4)
            if (r3 == 0) goto L_0x0057
            goto L_0x0070
        L_0x006f:
            r2 = r1
        L_0x0070:
            b.a.a.i.a r2 = (b.a.a.i.a) r2
            if (r2 == 0) goto L_0x0076
            android.view.View r1 = r2.d
        L_0x0076:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x0083
            android.media.MediaPlayer r0 = r0.c
            if (r0 == 0) goto L_0x0083
            r0.pause()
        L_0x0083:
            if (r6 == 0) goto L_0x0089
            r0 = 0
            r6.setVisibility(r0)
        L_0x0089:
            if (r1 == 0) goto L_0x0090
            r6 = 8
            r1.setVisibility(r6)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onPauseEvent(b.a.a.g.c0):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onPdfEvent(d0 d0Var) {
        e.x.c.i.e(d0Var, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = d0Var.a;
        b.e.a.a.a.O(str, "url").track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "pdf", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse(d0Var.a), "application/pdf"));
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onPhoneEvent(b.a.a.g.e0 e0Var) {
        e.x.c.i.e(e0Var, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = e0Var.a;
        b.e.a.a.a.O(str, "phone").track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "phone_call", "action_data", str), new Options().setIntegration("Slack", false));
        Intent intent = new Intent("android.intent.action.DIAL");
        StringBuilder y2 = b.e.a.a.a.y("tel:");
        y2.append(e0Var.a);
        startActivity(intent.setData(Uri.parse(y2.toString())));
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014a  */
    @p.a.a.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPlayEvent(b.a.a.g.f0 r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r11, r0)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r11.f240b
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r11.a
            r3 = 1
            r0[r3] = r1
            q.a.a$b r1 = q.a.a.d
            java.lang.String r4 = "PlayEvent with url: %s and containerId: %s"
            r1.a(r4, r0)
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = r0.a
            java.lang.String r1 = r11.f240b
            boolean r0 = e.x.c.i.a(r0, r1)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x003b
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            java.lang.String r2 = "<set-?>"
            e.x.c.i.e(r1, r2)
            r0.d = r1
        L_0x003b:
            r10.p(r11)
            goto L_0x016c
        L_0x0040:
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            r1 = 0
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = r0.a
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            java.lang.String r4 = r11.f240b
            boolean r0 = e.x.c.i.a(r0, r4)
            r0 = r0 ^ r3
            java.lang.String r3 = "action:play"
            if (r0 == 0) goto L_0x00d5
            b.a.a.i.g r0 = com.appfoundry.previewer.BravoApp.G
            if (r0 == 0) goto L_0x005f
            android.media.MediaPlayer r0 = r0.c
            if (r0 == 0) goto L_0x005f
            r0.stop()
        L_0x005f:
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r4 = com.appfoundry.previewer.BravoApp.G
            if (r4 == 0) goto L_0x0068
            java.lang.String r4 = r4.a
            goto L_0x0069
        L_0x0068:
            r4 = r1
        L_0x0069:
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x009b
            java.util.Iterator r0 = r0.iterator()
        L_0x0075:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r0.next()
            r5 = r4
            b.a.a.i.a r5 = (b.a.a.i.a) r5
            java.lang.String r5 = r5.c
            java.lang.String r6 = "action:pause"
            boolean r5 = e.x.c.i.a(r5, r6)
            if (r5 == 0) goto L_0x0075
            goto L_0x008e
        L_0x008d:
            r4 = r1
        L_0x008e:
            b.a.a.i.a r4 = (b.a.a.i.a) r4
            if (r4 == 0) goto L_0x009b
            android.view.View r0 = r4.d
            if (r0 == 0) goto L_0x009b
            r4 = 8
            r0.setVisibility(r4)
        L_0x009b:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r0 = com.appfoundry.previewer.BravoApp.F
            b.a.a.i.g r4 = com.appfoundry.previewer.BravoApp.G
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r4.a
            goto L_0x00a7
        L_0x00a6:
            r4 = r1
        L_0x00a7:
            java.lang.Object r0 = r0.get(r4)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00d5
            java.util.Iterator r0 = r0.iterator()
        L_0x00b3:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00c9
            java.lang.Object r4 = r0.next()
            r5 = r4
            b.a.a.i.a r5 = (b.a.a.i.a) r5
            java.lang.String r5 = r5.c
            boolean r5 = e.x.c.i.a(r5, r3)
            if (r5 == 0) goto L_0x00b3
            goto L_0x00ca
        L_0x00c9:
            r4 = r1
        L_0x00ca:
            b.a.a.i.a r4 = (b.a.a.i.a) r4
            if (r4 == 0) goto L_0x00d5
            android.view.View r0 = r4.d
            if (r0 == 0) goto L_0x00d5
            r0.setVisibility(r2)
        L_0x00d5:
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            java.lang.String r4 = r11.f240b
            r0.setDataSource(r4)
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r4 = com.appfoundry.previewer.BravoApp.F
            java.lang.String r5 = r11.f240b
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0112
            java.util.Iterator r4 = r4.iterator()
        L_0x00f1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0109
            java.lang.Object r5 = r4.next()
            r6 = r5
            b.a.a.i.a r6 = (b.a.a.i.a) r6
            java.lang.String r6 = r6.c
            java.lang.String r7 = "audio:loading"
            boolean r6 = e.x.c.i.a(r6, r7)
            if (r6 == 0) goto L_0x00f1
            goto L_0x010a
        L_0x0109:
            r5 = r1
        L_0x010a:
            b.a.a.i.a r5 = (b.a.a.i.a) r5
            if (r5 == 0) goto L_0x0112
            android.view.View r4 = r5.d
            r6 = r4
            goto L_0x0113
        L_0x0112:
            r6 = r1
        L_0x0113:
            if (r6 == 0) goto L_0x0118
            r6.setVisibility(r2)
        L_0x0118:
            com.appfoundry.previewer.BravoApp$b r4 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.a>> r4 = com.appfoundry.previewer.BravoApp.F
            java.lang.String r5 = r11.f240b
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0147
            java.util.Iterator r4 = r4.iterator()
        L_0x012a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0140
            java.lang.Object r5 = r4.next()
            r7 = r5
            b.a.a.i.a r7 = (b.a.a.i.a) r7
            java.lang.String r7 = r7.c
            boolean r7 = e.x.c.i.a(r7, r3)
            if (r7 == 0) goto L_0x012a
            goto L_0x0141
        L_0x0140:
            r5 = r1
        L_0x0141:
            b.a.a.i.a r5 = (b.a.a.i.a) r5
            if (r5 == 0) goto L_0x0147
            android.view.View r1 = r5.d
        L_0x0147:
            r7 = r1
            if (r7 == 0) goto L_0x014d
            r7.setClickable(r2)
        L_0x014d:
            com.appfoundry.previewer.activities.BravoActivity$r r1 = new com.appfoundry.previewer.activities.BravoActivity$r
            r1.<init>(r7, r11)
            r0.setOnCompletionListener(r1)
            com.appfoundry.previewer.activities.BravoActivity$s r1 = new com.appfoundry.previewer.activities.BravoActivity$s
            r1.<init>(r6)
            r0.setOnErrorListener(r1)
            r0.prepareAsync()
            com.appfoundry.previewer.activities.BravoActivity$t r1 = new com.appfoundry.previewer.activities.BravoActivity$t
            r4 = r1
            r5 = r10
            r8 = r11
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r0.setOnPreparedListener(r1)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onPlayEvent(b.a.a.g.f0):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onPreviewAppEvent(b.a.a.g.g0 g0Var) {
        String str;
        e.x.c.i.e(g0Var, "event");
        String str2 = g0Var.a;
        if (str2 == null || !e.c0.h.d(str2, "https", false, 2)) {
            StringBuilder y2 = b.e.a.a.a.y("https://apps-service.bravostudio.app/devices/apps/");
            y2.append(g0Var.a);
            str = y2.toString();
        } else {
            str = g0Var.a;
        }
        b.f.a.e.H0(this, str, false, 2);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onPushDialogEvent(b.a.a.g.h0 h0Var) {
        e.x.c.i.e(h0Var, "event");
        BravoApp.b bVar = BravoApp.Q;
        if (!BravoApp.w && !BravoApp.x) {
            b.f.a.e.E0(this);
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onRemoteActionEvent(b.a.a.g.i0 i0Var) {
        Fragment t2;
        e.x.c.i.e(i0Var, "event");
        Page n2 = b.a.a.n.f.n(i0Var.a);
        if (n2 != null && b.a.a.h.e.C(n2) && (t2 = b.f.a.e.t(this, i0Var.a)) != null && (t2 instanceof AppCompatDialogFragment)) {
            ((AppCompatDialogFragment) t2).dismiss();
        }
        String str = i0Var.c;
        if (str == null || !(!e.x.c.i.a(str, ""))) {
            H(i0Var.f241b);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage((CharSequence) i0Var.c);
        builder.setPositiveButton((CharSequence) "Yes", (DialogInterface.OnClickListener) new u(this, i0Var));
        builder.setNegativeButton((CharSequence) "Cancel", (DialogInterface.OnClickListener) v.f7002h);
        builder.create().show();
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        e.x.c.i.e(strArr, "permissions");
        e.x.c.i.e(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                p.a.a.c.b().g(new b.a.a.g.d());
            }
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onResetPasswordEvent(j0 j0Var) {
        e.x.c.i.e(j0Var, "event");
        B();
        r(j0Var.a, "reset-password");
    }

    public void onResume() {
        super.onResume();
        i2.C("foreground", "true");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        Analytics with = Analytics.with(b.f.a.e.c());
        String c2 = b.a.a.e.a.c();
        String uuid = UUID.randomUUID().toString();
        e.x.c.i.d(uuid, "java.util.UUID.randomUUID().toString()");
        with.track("App Opened", b.a.a.e.a.b(c2, uuid), new Options().setIntegration("Slack", false));
        if ((b.a.a.n.c.b() && b.a.a.n.c.s()) || b.a.a.n.c.a()) {
            g.a.p c3 = e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null);
            g.a.x xVar = i0.a;
            e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(g.a.a.m.f9916b.plus(c3)), (e.v.f) null, (g.a.a0) null, new b.a.a.d.c(this, (e.v.d) null), 3, (Object) null);
        }
        BravoApp.b bVar = BravoApp.Q;
        if (BravoApp.B) {
            b.l.a.d.a.i.r<b.l.a.d.a.a.a> b2 = s().b();
            b.a.a.d.i iVar = new b.a.a.d.i(this);
            Objects.requireNonNull(b2);
            b2.c(b.l.a.d.a.i.e.a, iVar);
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onScannedOrEmulatorAppListClicked(k0 k0Var) {
        e.x.c.i.e(k0Var, "event");
        String str = k0Var.a;
        if (str != null) {
            b.a.a.e.a aVar = b.a.a.e.a.f235b;
            Analytics O = b.e.a.a.a.O(str, "url");
            String c2 = b.a.a.e.a.c();
            String uuid = UUID.randomUUID().toString();
            e.x.c.i.d(uuid, "java.util.UUID.randomUUID().toString()");
            b.e.a.a.a.K("Slack", false, O, "Scanned App Loaded", b.a.a.e.a.b(c2, uuid).putValue("url", (Object) str));
            b.f.a.e.H0(this, str, false, 2);
            p.a.a.c.b().g(new b.a.a.g.e());
        }
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onShareEvent(l0 l0Var) {
        e.x.c.i.e(l0Var, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = l0Var.a;
        b.e.a.a.a.O(str, "url").track("Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "share", "action_data", str), new Options().setIntegration("Slack", false));
        startActivity(new Intent("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", l0Var.a).setType("text/plain"));
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onShowEmulatorAppListEvent(m0 m0Var) {
        e.x.c.i.e(m0Var, "event");
        e.x.c.i.e(this, "$this$showDebugAppsActivity");
        startActivity(new Intent(this, DebugAppsActivity.class));
    }

    public void onStart() {
        super.onStart();
        b.f.a.e.r0(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0073, code lost:
        if (b.f.a.e.b(r11.f6933q) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (b.f.a.e.a(r11.s) != false) goto L_0x0084;
     */
    @p.a.a.m(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSubmitEvent(b.a.a.g.o0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            e.x.c.i.e(r12, r0)
            r11.B()
            java.lang.String r12 = r12.a
            if (r12 == 0) goto L_0x013f
            com.appfoundry.previewer.model.Page r0 = b.a.a.n.f.n(r12)
            r1 = 1
            if (r0 == 0) goto L_0x0028
            boolean r0 = b.a.a.h.e.C(r0)
            if (r0 != r1) goto L_0x0028
            androidx.fragment.app.Fragment r0 = b.f.a.e.t(r11, r12)
            if (r0 == 0) goto L_0x0028
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatDialogFragment
            if (r2 == 0) goto L_0x0028
            androidx.appcompat.app.AppCompatDialogFragment r0 = (androidx.appcompat.app.AppCompatDialogFragment) r0
            r0.dismiss()
        L_0x0028:
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.d>> r0 = com.appfoundry.previewer.BravoApp.E
            java.lang.Object r0 = r0.get(r12)
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 == 0) goto L_0x0136
            boolean r3 = r0.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0136
            com.appfoundry.previewer.model.Page r12 = b.a.a.n.f.n(r12)
            r1 = 0
            if (r12 == 0) goto L_0x0046
            java.lang.String r12 = r12.f7138q
            goto L_0x0047
        L_0x0046:
            r12 = r1
        L_0x0047:
            boolean r3 = b.f.a.e.c0(r0)
            if (r3 == 0) goto L_0x0067
            boolean r3 = b.f.a.e.b0(r0)
            if (r3 == 0) goto L_0x0067
            java.util.List<b.a.a.i.f> r1 = r11.f6933q
            boolean r1 = b.f.a.e.b(r1)
            if (r1 == 0) goto L_0x0064
            java.util.List<b.a.a.i.e> r1 = r11.s
            boolean r1 = b.f.a.e.a(r1)
            if (r1 == 0) goto L_0x0064
            goto L_0x0084
        L_0x0064:
            java.lang.String r12 = "Files are not uploaded yet"
            goto L_0x008f
        L_0x0067:
            boolean r3 = b.f.a.e.c0(r0)
            if (r3 == 0) goto L_0x0076
            java.util.List<b.a.a.i.f> r1 = r11.f6933q
            boolean r1 = b.f.a.e.b(r1)
            if (r1 == 0) goto L_0x008d
            goto L_0x0084
        L_0x0076:
            boolean r3 = b.f.a.e.b0(r0)
            if (r3 == 0) goto L_0x0098
            java.util.List<b.a.a.i.e> r1 = r11.s
            boolean r1 = b.f.a.e.a(r1)
            if (r1 == 0) goto L_0x008d
        L_0x0084:
            n.g0 r0 = b.f.a.e.g(r0)
            r11.G(r12, r0)
            goto L_0x013f
        L_0x008d:
            java.lang.String r12 = "Images are not uploaded yet"
        L_0x008f:
            android.widget.Toast r12 = android.widget.Toast.makeText(r11, r12, r2)
            r12.show()
            goto L_0x013f
        L_0x0098:
            java.lang.String r3 = "$this$asRequestBody"
            e.x.c.i.e(r0, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00dc
            java.lang.Object r4 = r0.next()
            b.a.a.i.d r4 = (b.a.a.i.d) r4
            java.lang.String r5 = r4.a
            java.lang.String r6 = "component:input-date"
            boolean r5 = e.x.c.i.a(r5, r6)
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = r4.a
            java.lang.String r6 = "component:date"
            boolean r5 = e.x.c.i.a(r5, r6)
            if (r5 == 0) goto L_0x00c7
            goto L_0x00ce
        L_0x00c7:
            java.lang.String r5 = r4.f310b
            java.lang.String r4 = b.f.a.e.Q(r4)
            goto L_0x00d8
        L_0x00ce:
            java.lang.String r5 = r4.f310b
            java.lang.String r4 = b.f.a.e.Q(r4)
            java.lang.String r4 = b.a.a.h.m.c(r4)
        L_0x00d8:
            r3.put(r5, r4)
            goto L_0x00a6
        L_0x00dc:
            b.a.a.m.b r0 = b.a.a.m.b.f349m
            b.p.a.l<java.util.Map<java.lang.String, java.lang.String>> r0 = b.a.a.m.b.f343g
            java.lang.String r0 = r0.d(r3)
            java.lang.String r3 = "Moshify.formInputsInstance.toJson(idValueMap)"
            e.x.c.i.d(r0, r3)
            n.b0$a r3 = n.b0.f10048e
            java.lang.String r3 = "application/json; charset=utf-8"
            n.b0 r3 = n.b0.a.b(r3)
            java.lang.String r4 = "$this$toRequestBody"
            e.x.c.i.e(r0, r4)
            java.nio.charset.Charset r5 = e.c0.a.a
            if (r3 == 0) goto L_0x0119
            java.util.regex.Pattern r6 = n.b0.c
            java.nio.charset.Charset r1 = r3.a(r1)
            if (r1 != 0) goto L_0x0118
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "; charset=utf-8"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            n.b0 r3 = n.b0.a.b(r1)
            goto L_0x0119
        L_0x0118:
            r5 = r1
        L_0x0119:
            byte[] r0 = r0.getBytes(r5)
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            e.x.c.i.d(r0, r1)
            int r1 = r0.length
            e.x.c.i.e(r0, r4)
            int r4 = r0.length
            long r5 = (long) r4
            long r7 = (long) r2
            long r9 = (long) r1
            n.m0.c.c(r5, r7, r9)
            n.g0$a$a r4 = new n.g0$a$a
            r4.<init>(r0, r3, r1, r2)
            r11.G(r12, r4)
            goto L_0x013f
        L_0x0136:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            q.a.a$b r0 = q.a.a.d
            java.lang.String r1 = "NO FORM INPUTS IN BRAVOAPP"
            r0.b(r1, r12)
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.onSubmitEvent(b.a.a.g.o0):void");
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onTokenExpiredEvent(r0 r0Var) {
        e.x.c.i.e(r0Var, "event");
        BravoApp.b bVar = BravoApp.Q;
        x(BravoApp.K);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onTripleTapEvent(s0 s0Var) {
        e.x.c.i.e(s0Var, "event");
        p.a.a.c.b().g(new a0());
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onUnlinkEvent(t0 t0Var) {
        e.x.c.i.e(t0Var, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        Analytics with = Analytics.with(b.f.a.e.c());
        String c2 = b.a.a.e.a.c();
        String uuid = UUID.randomUUID().toString();
        e.x.c.i.d(uuid, "java.util.UUID.randomUUID().toString()");
        with.track("Action Started", b.a.a.e.a.b(c2, uuid).putValue("action_type", (Object) "unlink"), new Options().setIntegration("Slack", false));
        SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        e.x.c.i.e("unlinks", "key");
        SharedPreferences sharedPreferences2 = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
        e.x.c.i.d(sharedPreferences2, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
        e.x.c.i.e("unlinks", "key");
        sharedPreferences2.edit().putInt("unlinks", sharedPreferences.getInt("unlinks", 0) + 1).apply();
        g();
        BravoApp.b bVar = BravoApp.Q;
        BravoApp.E.clear();
        b.a.a.k.b bVar2 = BravoApp.C;
        if (bVar2 != null) {
            bVar2.a(this);
        }
        bVar.a();
        e.x.c.i.e(this, "$this$unlinkActivity");
        b.f.a.e.k();
        Intent intent = new Intent(this, InitActivity.class);
        intent.putExtra("unlink", true);
        startActivity(intent);
        finish();
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onUpdateEvent(b.a.a.g.u0 u0Var) {
        e.x.c.i.e(u0Var, "event");
        if (!b.a.a.n.c.s()) {
            BravoApp.b bVar = BravoApp.Q;
            String str = BravoApp.y;
            if (str == null) {
                SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                e.x.c.i.e("current_app_url", "key");
                str = sharedPreferences.getString("current_app_url", "");
            }
            if (str != null && (!e.x.c.i.a(str, ""))) {
                b.a.a.e.a aVar = b.a.a.e.a.f235b;
                boolean z = u0Var.a;
                e.x.c.i.e(str, "url");
                b.e.a.a.a.K("Slack", false, Analytics.with(b.f.a.e.c()), "App Updated", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "url", str, "type", z ? "live_push" : "manual"));
                q.a.a.d.a("Update event received: %s", str);
                b.f.a.e.k();
                b.f.a.e.H0(this, str, false, 2);
                return;
            }
            return;
        }
        q.a.a.d.a("Silent PUSH Update received, but previewer is loaded, so ignoring.", new Object[0]);
    }

    @p.a.a.m(threadMode = ThreadMode.MAIN)
    public final void onVideoEvent(v0 v0Var) {
        Intent intent;
        e.x.c.i.e(v0Var, "event");
        b.a.a.e.a aVar = b.a.a.e.a.f235b;
        String str = v0Var.a;
        b.e.a.a.a.K("Slack", false, b.e.a.a.a.O(str, "url"), "Action Started", b.e.a.a.a.P("java.util.UUID.randomUUID().toString()", b.a.a.e.a.c(), "action_type", "video", "action_data", str));
        String str2 = v0Var.a;
        e.x.c.i.e(str2, "$this$isYoutubeVideo");
        if (e.c0.h.b(str2, "youtu", true)) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(v0Var.a)).putExtra("force_fullscreen", true);
            e.x.c.i.d(intent, "Intent(Intent.ACTION_VIE…       true\n            )");
        } else {
            intent = new Intent("android.intent.action.VIEW").setDataAndType(Uri.parse(v0Var.a), "video/*");
        }
        startActivity(intent);
    }

    public final void p(b.a.a.g.f0 f0Var) {
        b.a.a.i.a aVar;
        TextView textView;
        b.a.a.i.a aVar2;
        TextView textView2;
        b.a.a.i.a aVar3;
        b.a.a.i.a aVar4;
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        MediaPlayer mediaPlayer3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        BravoApp.b bVar = BravoApp.Q;
        List list = BravoApp.F.get(f0Var.f240b);
        String str = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (e.x.c.i.a(((b.a.a.i.a) obj4).c, "audio:currenttime")) {
                    break;
                }
            }
            aVar = (b.a.a.i.a) obj4;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            View view = aVar.d;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.TextView");
            textView = (TextView) view;
        } else {
            textView = null;
        }
        BravoApp.b bVar2 = BravoApp.Q;
        List list2 = BravoApp.F.get(f0Var.f240b);
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (e.x.c.i.a(((b.a.a.i.a) obj3).c, "audio:totaltime")) {
                    break;
                }
            }
            aVar2 = (b.a.a.i.a) obj3;
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            View view2 = aVar2.d;
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.TextView");
            textView2 = (TextView) view2;
        } else {
            textView2 = null;
        }
        BravoApp.b bVar3 = BravoApp.Q;
        List list3 = BravoApp.F.get(f0Var.f240b);
        if (list3 != null) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (e.x.c.i.a(((b.a.a.i.a) obj2).c, "action:play")) {
                    break;
                }
            }
            aVar3 = (b.a.a.i.a) obj2;
        } else {
            aVar3 = null;
        }
        View view3 = aVar3 != null ? aVar3.d : null;
        BravoApp.b bVar4 = BravoApp.Q;
        List list4 = BravoApp.F.get(f0Var.f240b);
        if (list4 != null) {
            Iterator it4 = list4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it4.next();
                if (e.x.c.i.a(((b.a.a.i.a) obj).c, "action:pause")) {
                    break;
                }
            }
            aVar4 = (b.a.a.i.a) obj;
        } else {
            aVar4 = null;
        }
        View view4 = aVar4 != null ? aVar4.d : null;
        Object[] objArr = new Object[1];
        BravoApp.b bVar5 = BravoApp.Q;
        b.a.a.i.g gVar = BravoApp.G;
        objArr[0] = (gVar == null || (mediaPlayer3 = gVar.c) == null) ? null : String.valueOf(mediaPlayer3.getDuration());
        q.a.a.d.a("Audio File duration = %s", objArr);
        b.a.a.i.g gVar2 = BravoApp.G;
        if (!(gVar2 == null || (mediaPlayer2 = gVar2.c) == null)) {
            mediaPlayer2.start();
        }
        if (view3 != null) {
            view3.setVisibility(8);
        }
        if (view4 != null) {
            view4.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            b.a.a.i.g gVar3 = BravoApp.G;
            if (!(gVar3 == null || (mediaPlayer = gVar3.c) == null)) {
                str = b.f.a.e.k0(mediaPlayer.getDuration());
            }
            textView2.setText(str);
        }
        if (textView != null) {
            textView.setText(String.valueOf(0));
        }
        runOnUiThread(new d(textView));
    }

    public final Fragment q(Page page) {
        Page page2;
        if (page == null || (page2 = b.a.a.h.e.m(page)) == null) {
            page2 = b.a.a.n.f.j();
        }
        b.a.a.a.b bVar = null;
        if (page2 != null) {
            File v2 = b.a.a.n.c.v(this);
            bVar = b.a.a.h.e.f(page2, (Boolean) null, 1);
            BravoApp.b bVar2 = BravoApp.Q;
            String str = page2.a;
            BravoApp.O = str;
            e.x.c.i.e(this, "$this$addFragment");
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            e.x.c.i.d(supportFragmentManager, "supportFragmentManager");
            b.f.a.e.g0(supportFragmentManager, new b.a.a.h.a(R.id.containerLoading, bVar, str));
            if (v2 != null) {
                View findViewById = findViewById(R.id.containerLoading);
                e.x.c.i.d(findViewById, "findViewById<FrameLayout>(R.id.containerLoading)");
                Resources resources = getResources();
                String absolutePath = v2.getAbsolutePath();
                e.x.c.i.d(absolutePath, "it.absolutePath");
                ((FrameLayout) findViewById).setBackground(new BitmapDrawable(resources, u(absolutePath)));
            }
        }
        return bVar;
    }

    public final void r(String str, String str2) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
        if (relativeLayout != null) {
            b.a.a.h.o.l(relativeLayout);
        }
        g.a.x xVar = i0.a;
        e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(g.a.a.m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (g.a.a0) null, new e(this, str2, str, relativeLayout, (e.v.d) null), 3, (Object) null);
    }

    public final b.l.a.d.a.a.b s() {
        return (b.l.a.d.a.a.b) this.f6930n.getValue();
    }

    public final void t(String str) {
        g.a.x xVar = i0.a;
        e.a.a.a.y0.m.o1.c.S(e.a.a.a.y0.m.o1.c.b(g.a.a.m.f9916b.plus(e.a.a.a.y0.m.o1.c.c((y0) null, 1, (Object) null))), (e.v.f) null, (g.a.a0) null, new b.a.a.d.f(this, str, (e.v.d) null), 3, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if (r0.getStableInsetBottom() == 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap u(java.lang.String r8) {
        /*
            r7 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inMutable = r1
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r8, r0)
            android.view.Window r0 = r7.getWindow()
            java.lang.String r2 = "context.window"
            e.x.c.i.d(r0, r2)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r3 = "context.window.decorView"
            e.x.c.i.d(r0, r3)
            int r0 = r0.getVisibility()
            r0 = r0 & 2
            r4 = 0
            if (r0 == 0) goto L_0x0029
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r0 = r4
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x004f
        L_0x002d:
            android.view.Window r0 = r7.getWindow()
            e.x.c.i.d(r0, r2)
            android.view.View r0 = r0.getDecorView()
            e.x.c.i.d(r0, r3)
            android.view.WindowInsets r2 = r0.getRootWindowInsets()
            if (r2 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L_0x0050
            int r0 = r0.getStableInsetBottom()
            if (r0 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r4
        L_0x0050:
            java.lang.String r0 = "bitmap"
            if (r1 == 0) goto L_0x0089
            e.x.c.i.d(r8, r0)
            android.view.Window r1 = r7.getWindow()
            java.lang.String r2 = "window"
            e.x.c.i.d(r1, r2)
            android.view.View r1 = r1.getDecorView()
            java.lang.String r2 = "window.decorView"
            e.x.c.i.d(r1, r2)
            int r1 = r1.getHeight()
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r3 = "navigation_bar_height"
            java.lang.String r5 = "dimen"
            java.lang.String r6 = "android"
            int r2 = r2.getIdentifier(r3, r5, r6)
            if (r2 <= 0) goto L_0x0085
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            int r4 = r3.getDimensionPixelSize(r2)
        L_0x0085:
            int r1 = r1 - r4
            r8.setHeight(r1)
        L_0x0089:
            e.x.c.i.d(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.u(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d8, code lost:
        if (r0 != null) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r9 = this;
            com.appfoundry.previewer.BravoApp$b r0 = com.appfoundry.previewer.BravoApp.Q
            int r1 = com.appfoundry.previewer.BravoApp.f6909i
            r2 = 1
            if (r1 > r2) goto L_0x000f
            r0.a()
            r9.finish()
            goto L_0x00f2
        L_0x000f:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            java.util.List<java.lang.String> r3 = com.appfoundry.previewer.BravoApp.f6910j
            java.lang.String r3 = r3.toString()
            r0[r1] = r3
            q.a.a$b r1 = q.a.a.d
            java.lang.String r3 = "NAVIGATED PAGES = %s"
            r1.a(r3, r0)
            com.appfoundry.previewer.BravoApp.J = r2
            int r0 = com.appfoundry.previewer.BravoApp.f6909i
            int r0 = r0 + -1
            com.appfoundry.previewer.BravoApp.f6909i = r0
            java.util.List<java.lang.String> r0 = com.appfoundry.previewer.BravoApp.f6910j
            int r1 = r0.size()
            int r1 = r1 + -1
            r0.remove(r1)
            java.util.List<java.lang.String> r0 = com.appfoundry.previewer.BravoApp.f6910j
            java.lang.Object r0 = e.t.g.z(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.appfoundry.previewer.model.Page r0 = b.a.a.n.f.n(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0048
            com.appfoundry.previewer.model.Page r0 = b.a.a.h.e.m(r0)
            goto L_0x0049
        L_0x0048:
            r0 = r1
        L_0x0049:
            r3 = 2131230859(0x7f08008b, float:1.8077783E38)
            if (r0 == 0) goto L_0x0078
            java.io.File r4 = b.a.a.n.c.v(r9)
            if (r4 == 0) goto L_0x0078
            android.view.View r5 = r9.findViewById(r3)
            java.lang.String r6 = "findViewById<FrameLayout>(R.id.containerLoading)"
            e.x.c.i.d(r5, r6)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r9.getResources()
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r8 = "it.absolutePath"
            e.x.c.i.d(r4, r8)
            android.graphics.Bitmap r4 = r9.u(r4)
            r6.<init>(r7, r4)
            r5.setBackground(r6)
        L_0x0078:
            super.onBackPressed()
            java.lang.String r4 = "supportFragmentManager"
            if (r0 == 0) goto L_0x009d
            java.lang.String r5 = r0.a
            com.appfoundry.previewer.BravoApp.O = r5
            b.a.a.a.b r0 = b.a.a.h.e.f(r0, r1, r2)
            java.lang.String r1 = com.appfoundry.previewer.BravoApp.O
            java.lang.String r5 = "$this$addFragment"
            e.x.c.i.e(r9, r5)
            androidx.fragment.app.FragmentManager r5 = r9.getSupportFragmentManager()
            e.x.c.i.d(r5, r4)
            b.a.a.h.a r6 = new b.a.a.h.a
            r6.<init>(r3, r0, r1)
            b.f.a.e.g0(r5, r6)
        L_0x009d:
            java.lang.String r0 = "$this$getVisiblePageId"
            e.x.c.i.e(r9, r0)
            androidx.fragment.app.FragmentManager r0 = r9.getSupportFragmentManager()
            e.x.c.i.d(r0, r4)
            java.util.List r0 = r0.getFragments()
            java.lang.String r1 = "supportFragmentManager.fragments"
            e.x.c.i.d(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x00db
            androidx.fragment.app.FragmentManager r0 = r9.getSupportFragmentManager()
            e.x.c.i.d(r0, r4)
            java.util.List r0 = r0.getFragments()
            e.x.c.i.d(r0, r1)
            java.lang.Object r0 = e.t.g.z(r0)
            java.lang.String r1 = "null cannot be cast to non-null type com.appfoundry.previewer.fragments.BaseBravoFragment"
            java.util.Objects.requireNonNull(r0, r1)
            b.a.a.a.b r0 = (b.a.a.a.b) r0
            com.appfoundry.previewer.model.Page r0 = r0.f74h
            if (r0 == 0) goto L_0x00db
            java.lang.String r0 = r0.a
            if (r0 == 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            java.lang.String r0 = ""
        L_0x00dd:
            java.lang.String r1 = "pageId"
            e.x.c.i.e(r0, r1)
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            java.lang.String r0 = b.a.a.n.f.f(r1, r0)
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            b.a.a.n.f.A(r1, r0)
            java.util.Map<java.lang.String, java.util.List<b.a.a.i.h>> r1 = com.appfoundry.previewer.BravoApp.I
            b.a.a.n.f.N(r1, r0)
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.v():void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r0.g(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        runOnUiThread(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(com.appfoundry.previewer.model.BackendResponse r9, android.widget.RelativeLayout r10, androidx.fragment.app.Fragment r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            if (r9 == 0) goto L_0x00bd
            java.lang.String r2 = r9.a
            java.lang.String r3 = "goto"
            if (r2 != 0) goto L_0x000c
            goto L_0x00a4
        L_0x000c:
            int r4 = r2.hashCode()
            java.lang.String r5 = ""
            r6 = 1
            switch(r4) {
                case -1901722497: goto L_0x0094;
                case -1263172891: goto L_0x0058;
                case -1240638001: goto L_0x0049;
                case 3178851: goto L_0x0027;
                case 1085444827: goto L_0x0018;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x00a4
        L_0x0018:
            java.lang.String r0 = "refresh"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a4
            com.appfoundry.previewer.activities.BravoActivity$a r0 = new com.appfoundry.previewer.activities.BravoActivity$a
            r0.<init>(r6, r8)
            goto L_0x00a1
        L_0x0027:
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x00a4
            p.a.a.c r0 = p.a.a.c.b()
            b.a.a.g.v r2 = new b.a.a.g.v
            com.appfoundry.previewer.model.Params r4 = r9.f7073b
            if (r4 == 0) goto L_0x003c
            java.lang.String r6 = r4.f7148n
            if (r6 == 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r5
        L_0x003d:
            if (r4 == 0) goto L_0x0044
            java.lang.String r4 = r4.A
            if (r4 == 0) goto L_0x0044
            r5 = r4
        L_0x0044:
            r4 = 4
            r2.<init>(r6, r5, r1, r4)
            goto L_0x0090
        L_0x0049:
            java.lang.String r4 = "goback"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00a4
            com.appfoundry.previewer.activities.BravoActivity$a r2 = new com.appfoundry.previewer.activities.BravoActivity$a
            r2.<init>(r0, r8)
            r0 = r2
            goto L_0x00a1
        L_0x0058:
            java.lang.String r0 = "openurl"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a4
            p.a.a.c r0 = p.a.a.c.b()
            b.a.a.g.b0 r2 = new b.a.a.g.b0
            com.appfoundry.previewer.model.Params r4 = r9.f7073b
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = r4.a
            if (r4 == 0) goto L_0x008d
            java.lang.String r7 = "$this$appendHttpsIfNeeded"
            e.x.c.i.e(r4, r7)
            java.lang.String r7 = "http"
            boolean r7 = e.c0.h.A(r4, r7, r6)
            if (r7 != 0) goto L_0x008a
            java.lang.String r7 = "https"
            boolean r6 = e.c0.h.A(r4, r7, r6)
            if (r6 == 0) goto L_0x0084
            goto L_0x008a
        L_0x0084:
            java.lang.String r6 = "https://"
            java.lang.String r4 = b.e.a.a.a.m(r6, r4)
        L_0x008a:
            if (r4 == 0) goto L_0x008d
            r5 = r4
        L_0x008d:
            r2.<init>(r5, r1)
        L_0x0090:
            r0.g(r2)
            goto L_0x00a4
        L_0x0094:
            java.lang.String r0 = "showalert"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00a4
            com.appfoundry.previewer.activities.BravoActivity$f r0 = new com.appfoundry.previewer.activities.BravoActivity$f
            r0.<init>(r8, r9)
        L_0x00a1:
            r8.runOnUiThread(r0)
        L_0x00a4:
            java.lang.String r0 = r9.a
            boolean r0 = e.x.c.i.a(r0, r3)
            if (r0 == 0) goto L_0x00b4
            com.appfoundry.previewer.model.Params r9 = r9.f7073b
            if (r9 == 0) goto L_0x00b2
            java.lang.String r1 = r9.A
        L_0x00b2:
            if (r1 != 0) goto L_0x00cc
        L_0x00b4:
            com.appfoundry.previewer.activities.BravoActivity$g r9 = new com.appfoundry.previewer.activities.BravoActivity$g
            r9.<init>(r8, r11, r10)
            r8.runOnUiThread(r9)
            goto L_0x00cc
        L_0x00bd:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            q.a.a$b r10 = q.a.a.d
            java.lang.String r11 = "Error parsing FormResponse"
            r10.b(r11, r9)
            r9 = 6
            java.lang.String r10 = "ERROR: Form response is null"
            b.f.a.e.J0(r8, r10, r1, r0, r9)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appfoundry.previewer.activities.BravoActivity.w(com.appfoundry.previewer.model.BackendResponse, android.widget.RelativeLayout, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [b.g.a.e.f.g, b.g.a.f.a] */
    public final void x(String str) {
        b.g.a.e.f.b bVar;
        b.g.a.e.f.b bVar2;
        Date date;
        o.b bVar3;
        b.g.a.a aVar = new b.g.a.a(this);
        boolean z = true;
        aVar.d = true;
        b.g.a.e.f.h hVar = new b.g.a.e.f.h(this, new b.g.a.e.b(aVar), new b.g.a.e.f.i(this));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.main_progressbar);
        if (relativeLayout != null) {
            b.a.a.h.o.l(relativeLayout);
        }
        boolean b2 = hVar.b();
        String str2 = AnalyticsContext.Device.DEVICE_TOKEN_KEY;
        if (!b2 || b.f.a.e.v()) {
            String str3 = b.g.a.h.v.a;
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            if (b.a.a.n.f.y(1, 1)) {
                sb.append("code");
                sb.append(" ");
            }
            if (b.a.a.n.f.y(1, 4)) {
                sb.append("id_token");
                sb.append(" ");
            }
            if (b.a.a.n.f.y(1, 2)) {
                sb.append(str2);
            }
            hashMap.put("response_type", sb.toString().trim());
            hashMap.put("scope", "openid");
            if (!"bravovision".equals("bravovision".toLowerCase())) {
                Log.w(b.g.a.h.v.a, "Please provide the scheme in lowercase and make sure it's the same configured in the intent filter. Android expects the scheme to be lowercase.");
            }
            hashMap.put("scope", "openid profile offline_access");
            String format = String.format("https://%s/api/v2/", Arrays.copyOf(new Object[]{b.f.a.e.c().getString(R.string.com_auth0_domain)}, 1));
            e.x.c.i.d(format, "java.lang.String.format(format, *args)");
            hashMap.put("audience", format);
            if (!e.x.c.i.a(str, "passwordless")) {
                hashMap.put("connection", str);
            }
            if (b.f.a.e.v()) {
                b.a.a.f.b bVar4 = b.a.a.f.b.f237b;
                for (Map.Entry next : b.a.a.f.b.a.entrySet()) {
                    if (next.getValue() != null) {
                        hashMap.put(next.getKey(), next.getValue().toString());
                    }
                }
                SharedPreferences sharedPreferences = b.f.a.e.c().getSharedPreferences("com.appfoundry.previewerLoaded", 0);
                e.x.c.i.d(sharedPreferences, "appContext().getSharedPr…ME, Context.MODE_PRIVATE)");
                String str4 = b.f.a.e.c().getPackageName() + "after_logout";
                e.x.c.i.e(str4, "key");
                sharedPreferences.edit().remove(str4).apply();
            }
            i iVar = new i(this, relativeLayout, hVar);
            b.g.a.h.v.f452b = null;
            if (!b.g.a.h.v.a(getPackageManager())) {
                iVar.b(new b.g.a.e.c("a0.browser_not_available", "No Browser application installed to perform web authentication."));
                return;
            }
            b.g.a.h.n nVar = new b.g.a.h.n(aVar, iVar, hashMap);
            nVar.f439e = false;
            nVar.f = true;
            nVar.f442i = null;
            nVar.f441h = null;
            nVar.f443j = null;
            b.g.a.h.v.f452b = nVar;
            String a2 = b.g.a.h.f.a("bravovision", getApplicationContext().getPackageName(), aVar.f405b.f6728i);
            Map<String, String> map = nVar.c;
            if (nVar.f()) {
                try {
                    if (nVar.f441h == null) {
                        nVar.f441h = new b.g.a.h.o(nVar.d, a2);
                    }
                    map.put("code_challenge", nVar.f441h.d);
                    map.put("code_challenge_method", "S256");
                    Log.v(b.g.a.h.n.f437k, "Using PKCE authentication flow");
                } catch (IllegalStateException e2) {
                    Log.e(b.g.a.h.n.f437k, "Some algorithms aren't available on this device and PKCE can't be used. Defaulting to token response_type.", e2);
                }
            }
            Map<String, String> map2 = nVar.c;
            b.g.a.k.c cVar = nVar.a.c;
            if (cVar != null) {
                map2.put("auth0Client", cVar.f464b);
            }
            map2.put("client_id", nVar.a.a);
            map2.put("redirect_uri", a2);
            Map<String, String> map3 = nVar.c;
            map3.put("state", b.g.a.h.n.d(map3.get("state")));
            if (!map3.containsKey("response_type") || (!map3.get("response_type").contains("id_token") && !map3.get("response_type").contains("code"))) {
                z = false;
            }
            if (z) {
                map3.put("nonce", b.g.a.h.n.d(map3.get("nonce")));
            }
            o.b k2 = nVar.a.f405b.k();
            k2.a("authorize");
            Uri.Builder buildUpon = Uri.parse(k2.c().f6728i).buildUpon();
            for (Map.Entry next2 : nVar.c.entrySet()) {
                buildUpon.appendQueryParameter((String) next2.getKey(), (String) next2.getValue());
            }
            Uri build = buildUpon.build();
            build.toString();
            Objects.requireNonNull(nVar.a);
            nVar.f440g = 110;
            if (nVar.f) {
                AuthenticationActivity.a(this, build, nVar.f442i);
                return;
            }
            boolean z2 = nVar.f439e;
            Intent intent = new Intent(this, AuthenticationActivity.class);
            intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", build);
            intent.putExtra("com.auth0.android.EXTRA_USE_BROWSER", false);
            intent.putExtra("com.auth0.android.EXTRA_USE_FULL_SCREEN", z2);
            intent.putExtra("com.auth0.android.EXTRA_CONNECTION_NAME", nVar.c.get("connection"));
            intent.addFlags(67108864);
            startActivityForResult(intent, 110);
            return;
        }
        q.a.a.d.a("HAS VALID CREDENTIALS AND NO FORCELOGIN", new Object[0]);
        h hVar2 = new h(this, hVar, relativeLayout);
        if (!hVar.b()) {
            hVar2.b(new b.g.a.e.f.b("No Credentials were previously set."));
            return;
        }
        try {
            b.g.a.j.a aVar2 = (b.g.a.j.a) hVar.d.c(new String(hVar.c.b(Base64.decode(hVar.f415b.g("com.auth0.credentials"), 0))), b.g.a.j.a.class);
            if ((TextUtils.isEmpty(aVar2.a) && TextUtils.isEmpty(aVar2.c)) || (date = aVar2.f) == null) {
                bVar2 = new b.g.a.e.f.b("No Credentials were previously set.");
            } else if (date.getTime() > System.currentTimeMillis()) {
                hVar2.a(aVar2);
                return;
            } else if (aVar2.d == null) {
                bVar2 = new b.g.a.e.f.b("No Credentials were previously set.");
            } else {
                Log.d(b.g.a.e.f.h.f414g, "Credentials have expired. Renewing them now...");
                b.g.a.e.b bVar5 = hVar.a;
                String str5 = aVar2.d;
                Objects.requireNonNull(bVar5);
                b.g.a.e.d b3 = b.g.a.e.d.b();
                String str6 = bVar5.a.a;
                if (str6 == null) {
                    b3.a.remove("client_id");
                } else {
                    b3.a.put("client_id", str6);
                }
                String str7 = "refresh_token";
                if (str5 == null) {
                    b3.a.remove(str7);
                } else {
                    b3.a.put(str7, str5);
                }
                if (!bVar5.a.d) {
                    str7 = "urn:ietf:params:oauth:grant-type:jwt-bearer";
                }
                b3.a.put("grant_type", str7);
                Map<String, Object> a3 = b3.a();
                b.g.a.a aVar3 = bVar5.a;
                if (aVar3.d) {
                    bVar3 = b.p.b.o.l(aVar3.f405b.f6728i).k();
                    bVar3.b("oauth");
                } else {
                    bVar3 = b.p.b.o.l(aVar3.f405b.f6728i).k();
                    str2 = "delegation";
                }
                bVar3.b(str2);
                b.g.a.i.b.c cVar2 = (b.g.a.i.b.c) bVar5.d.a(bVar3.c(), bVar5.f406b, bVar5.c, b.g.a.j.a.class, bVar5.f407e);
                cVar2.a(a3);
                cVar2.c(new b.g.a.e.f.g(hVar, aVar2, hVar2));
                return;
            }
            hVar2.b(bVar2);
        } catch (b.g.a.e.f.e e3) {
            bVar = new b.g.a.e.f.b(String.format("This device is not compatible with the %s class.", new Object[]{b.g.a.e.f.h.class.getSimpleName()}), e3);
            hVar2.b(bVar);
        } catch (b.g.a.e.f.c e4) {
            hVar.a();
            bVar = new b.g.a.e.f.b("A change on the Lock Screen security settings have deemed the encryption keys invalid and have been recreated. Any previously stored content is now lost. Please, try saving the credentials again.", e4);
            hVar2.b(bVar);
        }
    }

    public final void y(boolean z, Fragment fragment, RelativeLayout relativeLayout) {
        if (fragment != null) {
            if (!z) {
                b.f.a.e.s0(this, fragment);
            }
        } else if (z) {
            if (relativeLayout != null) {
                b.a.a.h.o.l(relativeLayout);
            }
        } else if (relativeLayout != null) {
            b.a.a.h.o.e(relativeLayout);
        }
    }

    public final void z(b.a.a.i.d dVar, b.a.a.i.d dVar2, RelativeLayout relativeLayout) {
        BravoApp.b bVar = BravoApp.Q;
        FirebaseAuth firebaseAuth = BravoApp.D;
        if (firebaseAuth != null) {
            String str = "";
            String Q = dVar != null ? b.f.a.e.Q(dVar) : str;
            if (dVar2 != null) {
                str = b.f.a.e.Q(dVar2);
            }
            b.l.a.c.b.a.x(Q);
            b.l.a.c.b.a.x(str);
            ci ciVar = firebaseAuth.f7333e;
            b.l.d.d dVar3 = firebaseAuth.a;
            String str2 = firebaseAuth.f7336i;
            u0 u0Var = new u0(firebaseAuth);
            Objects.requireNonNull(ciVar);
            wh whVar = new wh(Q, str, str2);
            whVar.d(dVar3);
            whVar.f(u0Var);
            b.l.a.c.k.h b2 = ciVar.b(whVar);
            if (b2 != null) {
                b2.b(this, new j(this, relativeLayout));
            }
        }
    }
}
