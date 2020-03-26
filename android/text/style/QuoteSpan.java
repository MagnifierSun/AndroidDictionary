/*     */ package android.text.style;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Paint;
/*     */ import android.os.Parcel;
/*     */ import android.text.Layout;
/*     */ import android.text.ParcelableSpan;
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
/*     */ public class QuoteSpan
/*     */   implements LeadingMarginSpan, ParcelableSpan
/*     */ {
/*     */   public static final int STANDARD_COLOR = -16776961;
/*     */   public static final int STANDARD_GAP_WIDTH_PX = 2;
/*     */   public static final int STANDARD_STRIPE_WIDTH_PX = 2;
/*     */   
/*     */   public QuoteSpan() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QuoteSpan(int color) {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */   
/*     */   public QuoteSpan(int color, int stripeWidth, int gapWidth) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public QuoteSpan(@RecentlyNonNull Parcel src) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanTypeId() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getColor() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStripeWidth() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGapWidth() {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   } public int getLeadingMargin(boolean first) {
/* 121 */     throw new RuntimeException("Stub!");
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
/*     */   public void drawLeadingMargin(@RecentlyNonNull Canvas c, @RecentlyNonNull Paint p, int x, int dir, int top, int baseline, int bottom, @RecentlyNonNull CharSequence text, int start, int end, boolean first, @RecentlyNonNull Layout layout) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\QuoteSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */