/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcelable;
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
/*    */ public abstract class InputEvent
/*    */   implements Parcelable
/*    */ {
/*    */   InputEvent() {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract int getDeviceId();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final InputDevice getDevice() {
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
/*    */   public abstract int getSource();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isFromSource(int source) {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract long getEventTime();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int describeContents() {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 83 */   public static final Parcelable.Creator<InputEvent> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\InputEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */