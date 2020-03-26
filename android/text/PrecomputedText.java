/*     */ package android.text;
/*     */ 
/*     */ import android.graphics.Rect;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrecomputedText
/*     */   implements Spannable
/*     */ {
/*     */   PrecomputedText() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static PrecomputedText create(@RecentlyNonNull CharSequence text, @RecentlyNonNull Params params) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Params getParams() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParagraphCount() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParagraphStart(int paraIndex) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getParagraphEnd(int paraIndex) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getWidth(int start, int end) {
/* 137 */     throw new RuntimeException("Stub!");
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
/*     */   public void getBounds(int start, int end, @RecentlyNonNull Rect bounds) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpan(Object what, int start, int end, int flags) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeSpan(Object what) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   } public <T> T[] getSpans(int start, int end, Class<T> type) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanStart(Object tag) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanEnd(Object tag) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanFlags(Object tag) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public int nextSpanTransition(int start, int limit, Class type) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public int length() {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public char charAt(int index) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence subSequence(int start, int end) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 183 */     throw new RuntimeException("Stub!");
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
/*     */   public static final class Params
/*     */   {
/*     */     Params(@RecentlyNonNull TextPaint paint, @RecentlyNonNull TextDirectionHeuristic textDir, int strategy, int frequency) {
/* 197 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public TextPaint getTextPaint() {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public TextDirectionHeuristic getTextDirection() {
/* 217 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getBreakStrategy() {
/* 227 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getHyphenationFrequency() {
/* 237 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean equals(@RecentlyNullable Object o) {
/* 246 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 248 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
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
/*     */ 
/*     */     
/*     */     public static class Builder
/*     */     {
/*     */       public Builder(@RecentlyNonNull TextPaint paint) {
/* 266 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder setBreakStrategy(int strategy) {
/* 280 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder setHyphenationFrequency(int frequency) {
/* 294 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Builder setTextDirection(@RecentlyNonNull TextDirectionHeuristic textDir) {
/* 307 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public PrecomputedText.Params build() {
/* 317 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\PrecomputedText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */