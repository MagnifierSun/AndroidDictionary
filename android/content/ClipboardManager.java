/*     */ package android.content;
/*     */ 
/*     */ import android.text.ClipboardManager;
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
/*     */ public class ClipboardManager
/*     */   extends ClipboardManager
/*     */ {
/*     */   ClipboardManager() {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   public void setPrimaryClip(@RecentlyNonNull ClipData clip) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearPrimaryClip() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ClipData getPrimaryClip() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public ClipDescription getPrimaryClipDescription() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasPrimaryClip() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public void addPrimaryClipChangedListener(OnPrimaryClipChangedListener what) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void removePrimaryClipChangedListener(OnPrimaryClipChangedListener what) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public CharSequence getText() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void setText(CharSequence text) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean hasText() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnPrimaryClipChangedListener {
/*     */     void onPrimaryClipChanged();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\ClipboardManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */