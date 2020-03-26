/*     */ package android.text.style;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.ColorStateList;
/*     */ import android.os.Parcel;
/*     */ import android.text.ParcelableSpan;
/*     */ import android.text.TextPaint;
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
/*     */ public class TextAppearanceSpan
/*     */   extends MetricAffectingSpan
/*     */   implements ParcelableSpan
/*     */ {
/*     */   public TextAppearanceSpan(Context context, int appearance) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextAppearanceSpan(Context context, int appearance, int colorList) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TextAppearanceSpan(String family, int style, int size, ColorStateList color, ColorStateList linkColor) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public TextAppearanceSpan(Parcel src) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanTypeId() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFamily() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ColorStateList getTextColor() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ColorStateList getLinkTextColor() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTextSize() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTextStyle() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public void updateDrawState(TextPaint ds) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public void updateMeasureState(TextPaint ds) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\TextAppearanceSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */