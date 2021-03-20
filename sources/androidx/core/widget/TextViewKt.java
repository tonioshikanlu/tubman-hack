package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import e.x.b.l;
import e.x.b.r;
import e.x.c.i;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a>\u0010\u0007\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\b¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\t\u001a\u00020\u0006*\u00020\u00002(\b\u0004\u0010\u0005\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\b¢\u0006\u0004\b\t\u0010\b\u001a,\u0010\f\u001a\u00020\u0006*\u00020\u00002\u0016\b\u0004\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\b¢\u0006\u0004\b\f\u0010\r\u001a\u0001\u0010\u0011\u001a\u00020\u0006*\u00020\u00002(\b\u0006\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012(\b\u0006\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u0016\b\u0006\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00040\nH\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function4;", "", "", "Le/r;", "action", "Landroid/text/TextWatcher;", "doBeforeTextChanged", "(Landroid/widget/TextView;Le/x/b/r;)Landroid/text/TextWatcher;", "doOnTextChanged", "Lkotlin/Function1;", "Landroid/text/Editable;", "doAfterTextChanged", "(Landroid/widget/TextView;Le/x/b/l;)Landroid/text/TextWatcher;", "beforeTextChanged", "onTextChanged", "afterTextChanged", "addTextChangedListener", "(Landroid/widget/TextView;Le/x/b/r;Le/x/b/r;Le/x/b/l;)Landroid/text/TextWatcher;", "core-ktx_release"}, k = 2, mv = {1, 1, 15})
public final class TextViewKt {
    public static final TextWatcher addTextChangedListener(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, e.r> rVar, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, e.r> rVar2, l<? super Editable, e.r> lVar) {
        i.f(textView, "$this$addTextChangedListener");
        i.f(rVar, "beforeTextChanged");
        i.f(rVar2, "onTextChanged");
        i.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static /* synthetic */ TextWatcher addTextChangedListener$default(TextView textView, r rVar, r rVar2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rVar = TextViewKt$addTextChangedListener$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            rVar2 = TextViewKt$addTextChangedListener$2.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            lVar = TextViewKt$addTextChangedListener$3.INSTANCE;
        }
        i.f(textView, "$this$addTextChangedListener");
        i.f(rVar, "beforeTextChanged");
        i.f(rVar2, "onTextChanged");
        i.f(lVar, "afterTextChanged");
        TextViewKt$addTextChangedListener$textWatcher$1 textViewKt$addTextChangedListener$textWatcher$1 = new TextViewKt$addTextChangedListener$textWatcher$1(lVar, rVar, rVar2);
        textView.addTextChangedListener(textViewKt$addTextChangedListener$textWatcher$1);
        return textViewKt$addTextChangedListener$textWatcher$1;
    }

    public static final TextWatcher doAfterTextChanged(TextView textView, l<? super Editable, e.r> lVar) {
        i.f(textView, "$this$doAfterTextChanged");
        i.f(lVar, "action");
        TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1 textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1 = new TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1(lVar);
        textView.addTextChangedListener(textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1);
        return textViewKt$doAfterTextChanged$$inlined$addTextChangedListener$1;
    }

    public static final TextWatcher doBeforeTextChanged(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, e.r> rVar) {
        i.f(textView, "$this$doBeforeTextChanged");
        i.f(rVar, "action");
        TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$1 textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$1 = new TextViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$1(rVar);
        textView.addTextChangedListener(textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$1);
        return textViewKt$doBeforeTextChanged$$inlined$addTextChangedListener$1;
    }

    public static final TextWatcher doOnTextChanged(TextView textView, r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, e.r> rVar) {
        i.f(textView, "$this$doOnTextChanged");
        i.f(rVar, "action");
        TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$1 textViewKt$doOnTextChanged$$inlined$addTextChangedListener$1 = new TextViewKt$doOnTextChanged$$inlined$addTextChangedListener$1(rVar);
        textView.addTextChangedListener(textViewKt$doOnTextChanged$$inlined$addTextChangedListener$1);
        return textViewKt$doOnTextChanged$$inlined$addTextChangedListener$1;
    }
}
