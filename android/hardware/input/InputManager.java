/*    */ package android.hardware.input;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.view.InputDevice;
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
/*    */ public final class InputManager
/*    */ {
/*    */   public static final String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
/*    */   public static final String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
/*    */   
/*    */   InputManager() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InputDevice getInputDevice(int id) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int[] getInputDeviceIds() {
/* 48 */     throw new RuntimeException("Stub!");
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
/*    */   public void registerInputDeviceListener(InputDeviceListener listener, Handler handler) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void unregisterInputDeviceListener(InputDeviceListener listener) {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface InputDeviceListener {
/*    */     void onInputDeviceAdded(int param1Int);
/*    */     
/*    */     void onInputDeviceRemoved(int param1Int);
/*    */     
/*    */     void onInputDeviceChanged(int param1Int);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\input\InputManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */