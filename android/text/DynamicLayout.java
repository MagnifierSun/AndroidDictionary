/*     */ package android.text;
/*     */ 
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
/*     */ public class DynamicLayout
/*     */   extends Layout
/*     */ {
/*     */   @Deprecated
/*     */   public DynamicLayout(@RecentlyNonNull CharSequence base, @RecentlyNonNull TextPaint paint, int width, @RecentlyNonNull Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) {
/*  48 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public DynamicLayout(@RecentlyNonNull CharSequence base, @RecentlyNonNull CharSequence display, @RecentlyNonNull TextPaint paint, int width, @RecentlyNonNull Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) {
/*  66 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public DynamicLayout(@RecentlyNonNull CharSequence base, @RecentlyNonNull CharSequence display, @RecentlyNonNull TextPaint paint, int width, @RecentlyNonNull Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, @RecentlyNullable TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
/*  88 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
/*     */   } public int getLineCount() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineTop(int line) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineDescent(int line) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineStart(int line) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getLineContainsTab(int line) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public int getParagraphDirection(int line) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public final Layout.Directions getLineDirections(int line) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public int getTopPadding() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public int getBottomPadding() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsizedWidth() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisStart(int line) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisCount(int line) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     Builder() {
/* 125 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public static Builder obtain(@RecentlyNonNull CharSequence base, @RecentlyNonNull TextPaint paint, int width) {
/* 136 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setDisplayText(@RecentlyNonNull CharSequence display) {
/* 150 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setAlignment(@RecentlyNonNull Layout.Alignment alignment) {
/* 162 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setTextDirection(@RecentlyNonNull TextDirectionHeuristic textDir) {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setLineSpacing(float spacingAdd, float spacingMult) {
/* 191 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setIncludePad(boolean includePad) {
/* 204 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setUseLineSpacingFromFallbacks(boolean useLineSpacingFromFallbacks) {
/* 222 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setEllipsizedWidth(int ellipsizedWidth) {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public Builder setEllipsize(@RecentlyNullable TextUtils.TruncateAt ellipsize) {
/* 250 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setBreakStrategy(int breakStrategy) {
/* 263 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setHyphenationFrequency(int hyphenationFrequency) {
/* 278 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public Builder setJustificationMode(int justificationMode) {
/* 292 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     @RecentlyNonNull
/*     */     public DynamicLayout build() {
/* 306 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\DynamicLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */