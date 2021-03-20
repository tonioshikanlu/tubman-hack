package b.l.a.c.f.e;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;

public final class hi {
    public static final SparseArray<Pair<String, String>> a;

    static {
        SparseArray<Pair<String, String>> sparseArray = new SparseArray<>();
        a = sparseArray;
        sparseArray.put(17000, new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        sparseArray.put(17002, new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        sparseArray.put(17004, new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        sparseArray.put(17008, new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        sparseArray.put(17009, new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        sparseArray.put(17024, new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        sparseArray.put(17014, new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        sparseArray.put(17012, new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        sparseArray.put(17007, new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        sparseArray.put(17025, new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        sparseArray.put(17005, new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        sparseArray.put(17021, new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        sparseArray.put(17011, new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        sparseArray.put(17017, new Pair("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
        sparseArray.put(17006, new Pair("ERROR_OPERATION_NOT_ALLOWED", "The given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
        sparseArray.put(17026, new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
        sparseArray.put(17029, new Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
        sparseArray.put(17030, new Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
        sparseArray.put(17031, new Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
        sparseArray.put(17033, new Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
        sparseArray.put(17032, new Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
        sparseArray.put(17034, new Pair("ERROR_MISSING_EMAIL", "An email address must be provided."));
        sparseArray.put(17035, new Pair("ERROR_MISSING_PASSWORD", "A password must be provided."));
        sparseArray.put(17041, new Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
        sparseArray.put(17042, new Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
        sparseArray.put(17043, new Pair("ERROR_MISSING_VERIFICATION_CODE", "The Phone Auth Credential was created with an empty sms verification Code"));
        sparseArray.put(17044, new Pair("ERROR_INVALID_VERIFICATION_CODE", "The sms verification code used to create the phone auth credential is invalid. Please resend the verification code sms and be sure use the verification code provided by the user."));
        sparseArray.put(17045, new Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID"));
        sparseArray.put(17046, new Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
        sparseArray.put(17049, new Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
        sparseArray.put(17051, new Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
        sparseArray.put(17052, new Pair("ERROR_QUOTA_EXCEEDED", "This project's quota for this operation has been exceeded."));
        sparseArray.put(17028, new Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name and SHA-1 are configured in the Firebase Console."));
        sparseArray.put(17063, new Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
        sparseArray.put(17062, new Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
        sparseArray.put(17064, new Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
        sparseArray.put(17065, new Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
        sparseArray.put(17040, new Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
        sparseArray.put(17068, new Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
        sparseArray.put(17071, new Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
        sparseArray.put(17057, new Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
        sparseArray.put(17058, new Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
        sparseArray.put(17072, new Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
        sparseArray.put(17073, new Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
        sparseArray.put(17074, new Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
        sparseArray.put(17075, new Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials"));
        sparseArray.put(17077, new Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
        sparseArray.put(17079, new Pair("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
        sparseArray.put(17078, new Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
        sparseArray.put(17080, new Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
        sparseArray.put(17081, new Pair("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
        sparseArray.put(17082, new Pair("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
        sparseArray.put(17083, new Pair("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
        sparseArray.put(17084, new Pair("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
        sparseArray.put(17085, new Pair("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
        sparseArray.put(17086, new Pair("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
        sparseArray.put(17087, new Pair("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
        sparseArray.put(17088, new Pair("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
        sparseArray.put(17089, new Pair("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
        sparseArray.put(17090, new Pair("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
        sparseArray.put(17091, new Pair("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
        sparseArray.put(17093, new Pair("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a valid app identifier, meaning that neither SafetyNet checks nor reCAPTCHA checks succeeded. Please try again, or check the logcat for more details."));
        sparseArray.put(17094, new Pair("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
        sparseArray.put(18001, new Pair("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c9, code lost:
        return new b.l.d.b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00df, code lost:
        return new b.l.d.o.m(c(r0), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static b.l.d.i a(com.google.android.gms.common.api.Status r4) {
        /*
            int r0 = r4.f7263i
            android.util.SparseArray<android.util.Pair<java.lang.String, java.lang.String>> r1 = a
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.String r2 = "An internal error has occurred."
            if (r1 == 0) goto L_0x0013
            java.lang.Object r1 = r1.second
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            java.lang.String r1 = b(r1, r4)
            r3 = 17020(0x427c, float:2.385E-41)
            if (r0 == r3) goto L_0x0124
            r3 = 17021(0x427d, float:2.3852E-41)
            if (r0 == r3) goto L_0x011a
            r3 = 17051(0x429b, float:2.3894E-41)
            if (r0 == r3) goto L_0x0110
            r3 = 17052(0x429c, float:2.3895E-41)
            if (r0 == r3) goto L_0x010a
            r3 = 17057(0x42a1, float:2.3902E-41)
            if (r0 == r3) goto L_0x0100
            r3 = 17058(0x42a2, float:2.3903E-41)
            if (r0 == r3) goto L_0x0100
            r3 = 17000(0x4268, float:2.3822E-41)
            if (r0 == r3) goto L_0x0110
            r3 = 17002(0x426a, float:2.3825E-41)
            if (r0 == r3) goto L_0x0110
            r3 = 17049(0x4299, float:2.3891E-41)
            if (r0 == r3) goto L_0x0110
            r3 = 17068(0x42ac, float:2.3917E-41)
            if (r0 == r3) goto L_0x00f6
            r3 = 17077(0x42b5, float:2.393E-41)
            if (r0 == r3) goto L_0x0110
            r3 = 17495(0x4457, float:2.4516E-41)
            if (r0 == r3) goto L_0x00ea
            r3 = 17499(0x445b, float:2.4521E-41)
            if (r0 == r3) goto L_0x00e0
            r3 = 18001(0x4651, float:2.5225E-41)
            if (r0 == r3) goto L_0x00f6
            r3 = 17093(0x42c5, float:2.3952E-41)
            if (r0 == r3) goto L_0x00f6
            r3 = 17094(0x42c6, float:2.3954E-41)
            if (r0 == r3) goto L_0x0110
            switch(r0) {
                case 17004: goto L_0x0110;
                case 17005: goto L_0x011a;
                case 17006: goto L_0x00f6;
                case 17007: goto L_0x00d6;
                case 17008: goto L_0x0110;
                case 17009: goto L_0x0110;
                case 17010: goto L_0x00ca;
                case 17011: goto L_0x011a;
                case 17012: goto L_0x00d6;
                default: goto L_0x005b;
            }
        L_0x005b:
            switch(r0) {
                case 17079: goto L_0x00f6;
                case 17080: goto L_0x00c4;
                case 17081: goto L_0x0110;
                case 17082: goto L_0x0110;
                case 17083: goto L_0x0110;
                case 17084: goto L_0x0110;
                case 17085: goto L_0x00f6;
                case 17086: goto L_0x00f6;
                case 17087: goto L_0x00f6;
                case 17088: goto L_0x00f6;
                case 17089: goto L_0x00f6;
                case 17090: goto L_0x00f6;
                case 17091: goto L_0x00f6;
                default: goto L_0x005e;
            }
        L_0x005e:
            switch(r0) {
                case 17014: goto L_0x008e;
                case 17015: goto L_0x0082;
                case 17016: goto L_0x0076;
                case 17017: goto L_0x011a;
                default: goto L_0x0061;
            }
        L_0x0061:
            switch(r0) {
                case 17024: goto L_0x0110;
                case 17025: goto L_0x00d6;
                case 17026: goto L_0x0098;
                default: goto L_0x0064;
            }
        L_0x0064:
            switch(r0) {
                case 17028: goto L_0x00f6;
                case 17029: goto L_0x00ae;
                case 17030: goto L_0x00ae;
                case 17031: goto L_0x00a4;
                case 17032: goto L_0x00a4;
                case 17033: goto L_0x00a4;
                case 17034: goto L_0x0110;
                case 17035: goto L_0x0110;
                default: goto L_0x0067;
            }
        L_0x0067:
            switch(r0) {
                case 17040: goto L_0x00f6;
                case 17041: goto L_0x0110;
                case 17042: goto L_0x0110;
                case 17043: goto L_0x0110;
                case 17044: goto L_0x0110;
                case 17045: goto L_0x0110;
                case 17046: goto L_0x0110;
                default: goto L_0x006a;
            }
        L_0x006a:
            switch(r0) {
                case 17061: goto L_0x00b8;
                case 17062: goto L_0x0100;
                case 17063: goto L_0x00c4;
                case 17064: goto L_0x00f6;
                case 17065: goto L_0x0100;
                default: goto L_0x006d;
            }
        L_0x006d:
            switch(r0) {
                case 17071: goto L_0x00f6;
                case 17072: goto L_0x00f6;
                case 17073: goto L_0x00f6;
                case 17074: goto L_0x00f6;
                case 17075: goto L_0x0110;
                default: goto L_0x0070;
            }
        L_0x0070:
            b.l.d.i r4 = new b.l.d.i
            r4.<init>(r2)
            return r4
        L_0x0076:
            java.lang.String r0 = "User was not linked to an account with the given provider."
            java.lang.String r4 = b(r0, r4)
            b.l.d.i r0 = new b.l.d.i
            r0.<init>(r4)
            return r0
        L_0x0082:
            java.lang.String r0 = "User has already been linked to the given provider."
            java.lang.String r4 = b(r0, r4)
            b.l.d.i r0 = new b.l.d.i
            r0.<init>(r4)
            return r0
        L_0x008e:
            b.l.d.o.l r4 = new b.l.d.o.l
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x0098:
            b.l.d.o.n r2 = new b.l.d.o.n
            java.lang.String r0 = c(r0)
            java.lang.String r4 = r4.f7264j
            r2.<init>(r0, r1, r4)
            return r2
        L_0x00a4:
            b.l.d.o.g r4 = new b.l.d.o.g
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x00ae:
            b.l.d.o.f r4 = new b.l.d.o.f
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x00b8:
            java.lang.String r0 = "There was a failure in the connection between the web widget and the Firebase Auth backend."
            java.lang.String r4 = b(r0, r4)
            b.l.d.k r0 = new b.l.d.k
            r0.<init>(r4)
            return r0
        L_0x00c4:
            b.l.d.b r4 = new b.l.d.b
            r4.<init>(r1)
            return r4
        L_0x00ca:
            java.lang.String r0 = "We have blocked all requests from this device due to unusual activity. Try again later."
            java.lang.String r4 = b(r0, r4)
            b.l.d.m r0 = new b.l.d.m
            r0.<init>(r4)
            return r0
        L_0x00d6:
            b.l.d.o.m r4 = new b.l.d.o.m
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x00e0:
            java.lang.String r4 = b(r2, r4)
            b.l.d.i r0 = new b.l.d.i
            r0.<init>(r4)
            return r0
        L_0x00ea:
            java.lang.String r0 = "Please sign in before trying to get a token."
            java.lang.String r4 = b(r0, r4)
            b.l.d.y.c.a r0 = new b.l.d.y.c.a
            r0.<init>(r4)
            return r0
        L_0x00f6:
            b.l.d.o.h r4 = new b.l.d.o.h
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x0100:
            b.l.d.o.o r4 = new b.l.d.o.o
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x010a:
            b.l.d.m r4 = new b.l.d.m
            r4.<init>(r1)
            return r4
        L_0x0110:
            b.l.d.o.i r4 = new b.l.d.o.i
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x011a:
            b.l.d.o.j r4 = new b.l.d.o.j
            java.lang.String r0 = c(r0)
            r4.<init>(r0, r1)
            return r4
        L_0x0124:
            java.lang.String r0 = "A network error (such as timeout, interrupted connection or unreachable host) has occurred."
            java.lang.String r4 = b(r0, r4)
            b.l.d.k r0 = new b.l.d.k
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.l.a.c.f.e.hi.a(com.google.android.gms.common.api.Status):b.l.d.i");
    }

    public static String b(String str, Status status) {
        if (TextUtils.isEmpty(status.f7264j)) {
            return str;
        }
        return String.format(String.valueOf(str).concat(" [ %s ]"), new Object[]{status.f7264j});
    }

    public static String c(int i2) {
        Pair pair = a.get(i2);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }
}
