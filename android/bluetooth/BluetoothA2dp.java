/*    */ package android.bluetooth;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.util.List;
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
/*    */ public final class BluetoothA2dp
/*    */   implements BluetoothProfile
/*    */ {
/*    */   public static final String ACTION_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
/*    */   public static final String ACTION_PLAYING_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED";
/*    */   public static final int STATE_NOT_PLAYING = 11;
/*    */   public static final int STATE_PLAYING = 10;
/*    */   
/*    */   BluetoothA2dp(Context context, BluetoothProfile.ServiceListener l) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public void finalize() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<BluetoothDevice> getConnectedDevices() {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getConnectionState(BluetoothDevice device) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isA2dpPlaying(BluetoothDevice device) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothA2dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */