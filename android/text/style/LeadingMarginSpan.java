/*     */ package android.text.style;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Paint;
/*     */ import android.os.Parcel;
/*     */ import android.text.Layout;
/*     */ import android.text.ParcelableSpan;
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
/*     */ public interface LeadingMarginSpan
/*     */   extends ParagraphStyle
/*     */ {
/*     */   int getLeadingMargin(boolean paramBoolean);
/*     */   
/*     */   void drawLeadingMargin(Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, CharSequence paramCharSequence, int paramInt6, int paramInt7, boolean paramBoolean, Layout paramLayout);
/*     */   
/*     */   public static class Standard
/*     */     implements LeadingMarginSpan, ParcelableSpan
/*     */   {
/*     */     public Standard(int first, int rest) {
/* 107 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Standard(int every) {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     } public Standard(Parcel src) {
/* 116 */       throw new RuntimeException("Stub!");
/*     */     } public int getSpanTypeId() {
/* 118 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 120 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 122 */       throw new RuntimeException("Stub!");
/*     */     } public int getLeadingMargin(boolean first) {
/* 124 */       throw new RuntimeException("Stub!");
/*     */     } public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) {
/* 126 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface LeadingMarginSpan2 extends LeadingMarginSpan, WrapTogetherSpan {
/*     */     int getLeadingMarginLineCount();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\LeadingMarginSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */