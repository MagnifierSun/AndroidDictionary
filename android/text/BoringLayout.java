/*     */ package android.text;
/*     */ 
/*     */ import android.graphics.Canvas;
/*     */ import android.graphics.Paint;
/*     */ import android.graphics.Path;
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
/*     */ public class BoringLayout
/*     */   extends Layout
/*     */   implements TextUtils.EllipsizeCallback
/*     */ {
/*     */   public BoringLayout(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingMult, float spacingAdd, Metrics metrics, boolean includePad) {
/*  53 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BoringLayout(CharSequence source, TextPaint paint, int outerWidth, Layout.Alignment align, float spacingMult, float spacingAdd, Metrics metrics, boolean includePad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
/*  74 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   public static BoringLayout make(CharSequence source, TextPaint paint, int outerWidth, Layout.Alignment align, float spacingMult, float spacingAdd, Metrics metrics, boolean includePad) {
/*  91 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static BoringLayout make(CharSequence source, TextPaint paint, int outerWidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includePad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingMult, float spacingAdd, Metrics metrics, boolean includePad) {
/* 132 */     throw new RuntimeException("Stub!");
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
/*     */   public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerWidth, Layout.Alignment align, float spacingMult, float spacingAdd, Metrics metrics, boolean includePad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Metrics isBoring(CharSequence text, TextPaint paint) {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Metrics isBoring(CharSequence text, TextPaint paint, Metrics metrics) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   } public int getHeight() {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineCount() {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineTop(int line) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineDescent(int line) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineStart(int line) {
/* 180 */     throw new RuntimeException("Stub!");
/*     */   } public int getParagraphDirection(int line) {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getLineContainsTab(int line) {
/* 184 */     throw new RuntimeException("Stub!");
/*     */   } public float getLineMax(int line) {
/* 186 */     throw new RuntimeException("Stub!");
/*     */   } public float getLineWidth(int line) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   } public final Layout.Directions getLineDirections(int line) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public int getTopPadding() {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   } public int getBottomPadding() {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisCount(int line) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisStart(int line) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsizedWidth() {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   } public void draw(Canvas c, Path highlight, Paint highlightpaint, int cursorOffset) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void ellipsized(int start, int end) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static class Metrics extends Paint.FontMetricsInt { public Metrics() {
/* 212 */       throw new RuntimeException("Stub!");
/*     */     } public int width; public String toString() {
/* 214 */       throw new RuntimeException("Stub!");
/*     */     } }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\BoringLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */