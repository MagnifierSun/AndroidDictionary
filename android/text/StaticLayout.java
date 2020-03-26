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
/*     */ public class StaticLayout
/*     */   extends Layout
/*     */ {
/*     */   @Deprecated
/*     */   public StaticLayout(CharSequence source, TextPaint paint, int width, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) {
/*  40 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) {
/*  46 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) {
/*  52 */     super(null, null, 0, null, 0.0F, 0.0F); throw new RuntimeException("Stub!");
/*     */   } public int getLineForVertical(int vertical) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineCount() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineTop(int line) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineDescent(int line) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public int getLineStart(int line) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public int getParagraphDirection(int line) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getLineContainsTab(int line) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public final Layout.Directions getLineDirections(int line) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public int getTopPadding() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public int getBottomPadding() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisCount(int line) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsisStart(int line) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public int getEllipsizedWidth() {
/*  78 */     throw new RuntimeException("Stub!");
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
/*  91 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public static Builder obtain(@RecentlyNonNull CharSequence source, int start, int end, @RecentlyNonNull TextPaint paint, int width) {
/* 111 */       throw new RuntimeException("Stub!");
/*     */     } public Builder setText(CharSequence source) {
/* 113 */       throw new RuntimeException("Stub!");
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
/* 125 */       throw new RuntimeException("Stub!");
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
/* 139 */       throw new RuntimeException("Stub!");
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
/* 154 */       throw new RuntimeException("Stub!");
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
/* 167 */       throw new RuntimeException("Stub!");
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
/* 185 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setEllipsizedWidth(int ellipsizedWidth) {
/* 199 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setEllipsize(@RecentlyNullable TextUtils.TruncateAt ellipsize) {
/* 214 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setMaxLines(int maxLines) {
/* 228 */       throw new RuntimeException("Stub!");
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
/* 241 */       throw new RuntimeException("Stub!");
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
/* 256 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setIndents(@RecentlyNullable int[] leftIndents, @RecentlyNullable int[] rightIndents) {
/* 271 */       throw new RuntimeException("Stub!");
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
/* 285 */       throw new RuntimeException("Stub!");
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
/*     */     public StaticLayout build() {
/* 299 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\StaticLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */