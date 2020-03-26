/*     */ package android.text.style;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Paint;
/*     */ import android.os.Parcel;
/*     */ import android.text.Layout;
/*     */ import android.text.ParcelableSpan;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ public class BulletSpan
/*     */   implements LeadingMarginSpan, ParcelableSpan
/*     */ {
/*     */   public static final int STANDARD_GAP_WIDTH = 2;
/*     */   
/*     */   public BulletSpan() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BulletSpan(int gapWidth) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BulletSpan(int gapWidth, int color) {
/*  80 */     throw new RuntimeException("Stub!");
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
/*     */   public BulletSpan(int gapWidth, int color, int bulletRadius) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BulletSpan(@RecentlyNonNull Parcel src) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanTypeId() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public int getLeadingMargin(boolean first) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGapWidth() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBulletRadius() {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getColor() {
/* 136 */     throw new RuntimeException("Stub!");
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
/*     */   public void drawLeadingMargin(@RecentlyNonNull Canvas canvas, @RecentlyNonNull Paint paint, int x, int dir, int top, int baseline, int bottom, @RecentlyNonNull CharSequence text, int start, int end, boolean first, @RecentlyNullable Layout layout) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\BulletSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */