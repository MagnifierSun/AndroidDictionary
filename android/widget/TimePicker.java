/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.ViewStructure;
/*     */ import android.view.autofill.AutofillValue;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TimePicker
/*     */   extends FrameLayout
/*     */ {
/*     */   public TimePicker(Context context) {
/*  35 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TimePicker(Context context, AttributeSet attrs) {
/*  37 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TimePicker(Context context, AttributeSet attrs, int defStyleAttr) {
/*  39 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public TimePicker(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  41 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHour(int hour) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHour() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinute(int minute) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMinute() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCurrentHour(@RecentlyNonNull Integer currentHour) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public Integer getCurrentHour() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setCurrentMinute(@RecentlyNonNull Integer currentMinute) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public Integer getCurrentMinute() {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIs24HourView(@RecentlyNonNull Boolean is24HourView) {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean is24HourView() {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnTimeChangedListener(OnTimeChangedListener onTimeChangedListener) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public void setEnabled(boolean enabled) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isEnabled() {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   } public int getBaseline() {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean validateInput() {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   } public void dispatchProvideAutofillStructure(ViewStructure structure, int flags) {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   } public void autofill(AutofillValue value) {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getAutofillType() {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public AutofillValue getAutofillValue() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnTimeChangedListener {
/*     */     void onTimeChanged(TimePicker param1TimePicker, int param1Int1, int param1Int2);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\TimePicker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */