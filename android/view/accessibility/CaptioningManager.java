/*     */ package android.view.accessibility;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.graphics.Typeface;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CaptioningManager
/*     */ {
/*     */   CaptioningManager(Context context) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isEnabled() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final Locale getLocale() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getFontScale() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public CaptionStyle getUserStyle() {
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
/*     */   public void addCaptioningChangeListener(@RecentlyNonNull CaptioningChangeListener listener) {
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
/*     */   public void removeCaptioningChangeListener(@RecentlyNonNull CaptioningChangeListener listener) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static final class CaptionStyle {
/*     */     public static final int EDGE_TYPE_DEPRESSED = 4;
/*     */     public static final int EDGE_TYPE_DROP_SHADOW = 2;
/*     */     public static final int EDGE_TYPE_NONE = 0;
/*     */     
/*     */     CaptionStyle(int foregroundColor, int backgroundColor, int edgeType, int edgeColor, int windowColor, String rawTypeface) {
/*  98 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int EDGE_TYPE_OUTLINE = 1;
/*     */     public static final int EDGE_TYPE_RAISED = 3;
/*     */     public static final int EDGE_TYPE_UNSPECIFIED = -1;
/*     */     
/*     */     public boolean hasBackgroundColor() {
/* 106 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasForegroundColor() {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasEdgeType() {
/* 122 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasEdgeColor() {
/* 130 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean hasWindowColor() {
/* 138 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public Typeface getTypeface() {
/* 145 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     public final int backgroundColor = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 182 */     public final int edgeColor = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 197 */     public final int edgeType = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     public final int foregroundColor = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     public final int windowColor = 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class CaptioningChangeListener
/*     */   {
/*     */     public CaptioningChangeListener() {
/* 218 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onEnabledChanged(boolean enabled) {
/* 226 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onUserStyleChanged(@RecentlyNonNull CaptioningManager.CaptionStyle userStyle) {
/* 236 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onLocaleChanged(@RecentlyNullable Locale locale) {
/* 246 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onFontScaleChanged(float fontScale) {
/* 255 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\accessibility\CaptioningManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */