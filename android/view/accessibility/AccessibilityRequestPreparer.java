/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Message;
/*    */ import android.view.View;
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public abstract class AccessibilityRequestPreparer
/*    */ {
/*    */   public static final int REQUEST_TYPE_EXTRA_DATA = 1;
/*    */   
/*    */   public AccessibilityRequestPreparer(View view, int requestTypes) {
/* 53 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract void onPrepareExtraData(int paramInt, String paramString, Bundle paramBundle, Message paramMessage);
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
/*    */   @RecentlyNullable
/*    */   public View getView() {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\accessibility\AccessibilityRequestPreparer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */