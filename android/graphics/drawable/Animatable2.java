/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface Animatable2
/*    */   extends Animatable
/*    */ {
/*    */   void registerAnimationCallback(@RecentlyNonNull AnimationCallback paramAnimationCallback);
/*    */   
/*    */   boolean unregisterAnimationCallback(@RecentlyNonNull AnimationCallback paramAnimationCallback);
/*    */   
/*    */   void clearAnimationCallbacks();
/*    */   
/*    */   public static abstract class AnimationCallback
/*    */   {
/*    */     public AnimationCallback() {
/* 57 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void onAnimationStart(Drawable drawable) {
/* 65 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void onAnimationEnd(Drawable drawable) {
/* 73 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\Animatable2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */