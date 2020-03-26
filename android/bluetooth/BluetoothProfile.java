package android.bluetooth;

import java.util.List;

public interface BluetoothProfile {
  public static final int A2DP = 2;
  
  public static final String EXTRA_PREVIOUS_STATE = "android.bluetooth.profile.extra.PREVIOUS_STATE";
  
  public static final String EXTRA_STATE = "android.bluetooth.profile.extra.STATE";
  
  public static final int GATT = 7;
  
  public static final int GATT_SERVER = 8;
  
  public static final int HEADSET = 1;
  
  public static final int HEALTH = 3;
  
  public static final int HID_DEVICE = 19;
  
  public static final int SAP = 10;
  
  public static final int STATE_CONNECTED = 2;
  
  public static final int STATE_CONNECTING = 1;
  
  public static final int STATE_DISCONNECTED = 0;
  
  public static final int STATE_DISCONNECTING = 3;
  
  List<BluetoothDevice> getConnectedDevices();
  
  List<BluetoothDevice> getDevicesMatchingConnectionStates(int[] paramArrayOfint);
  
  int getConnectionState(BluetoothDevice paramBluetoothDevice);
  
  public static interface ServiceListener {
    void onServiceConnected(int param1Int, BluetoothProfile param1BluetoothProfile);
    
    void onServiceDisconnected(int param1Int);
  }
}


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothProfile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */