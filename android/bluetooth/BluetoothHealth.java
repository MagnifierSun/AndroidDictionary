/*     */ package android.bluetooth;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.ParcelFileDescriptor;
/*     */ import java.util.List;
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
/*     */ public final class BluetoothHealth
/*     */   implements BluetoothProfile
/*     */ {
/*     */   public static final int APP_CONFIG_REGISTRATION_FAILURE = 1;
/*     */   public static final int APP_CONFIG_REGISTRATION_SUCCESS = 0;
/*     */   public static final int APP_CONFIG_UNREGISTRATION_FAILURE = 3;
/*     */   public static final int APP_CONFIG_UNREGISTRATION_SUCCESS = 2;
/*     */   public static final int CHANNEL_TYPE_RELIABLE = 10;
/*     */   public static final int CHANNEL_TYPE_STREAMING = 11;
/*     */   public static final int SINK_ROLE = 2;
/*     */   public static final int SOURCE_ROLE = 1;
/*     */   public static final int STATE_CHANNEL_CONNECTED = 2;
/*     */   public static final int STATE_CHANNEL_CONNECTING = 1;
/*     */   public static final int STATE_CHANNEL_DISCONNECTED = 0;
/*     */   public static final int STATE_CHANNEL_DISCONNECTING = 3;
/*     */   
/*     */   BluetoothHealth(Context context, BluetoothProfile.ServiceListener l) {
/*  56 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean registerSinkAppConfiguration(String name, int dataType, BluetoothHealthCallback callback) {
/*  74 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean unregisterAppConfiguration(BluetoothHealthAppConfiguration config) {
/*  86 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean connectChannelToSource(BluetoothDevice device, BluetoothHealthAppConfiguration config) {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean disconnectChannel(BluetoothDevice device, BluetoothHealthAppConfiguration config, int channelId) {
/* 117 */     throw new RuntimeException("Stub!");
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
/*     */   public ParcelFileDescriptor getMainChannelFd(BluetoothDevice device, BluetoothHealthAppConfiguration config) {
/* 133 */     throw new RuntimeException("Stub!");
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
/*     */   public int getConnectionState(BluetoothDevice device) {
/* 150 */     throw new RuntimeException("Stub!");
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
/*     */   public List<BluetoothDevice> getConnectedDevices() {
/* 167 */     throw new RuntimeException("Stub!");
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
/*     */   public List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] states) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothHealth.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */