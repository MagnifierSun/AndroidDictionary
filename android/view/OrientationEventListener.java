/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
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
/*    */ public abstract class OrientationEventListener
/*    */ {
/*    */   public static final int ORIENTATION_UNKNOWN = -1;
/*    */   
/*    */   public OrientationEventListener(Context context) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public OrientationEventListener(Context context, int rate) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void enable() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void disable() {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   } public boolean canDetectOrientation() {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onOrientationChanged(int paramInt);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\OrientationEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */