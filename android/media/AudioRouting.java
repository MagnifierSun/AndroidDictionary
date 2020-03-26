package android.media;

import android.os.Handler;

public interface AudioRouting {
  boolean setPreferredDevice(AudioDeviceInfo paramAudioDeviceInfo);
  
  AudioDeviceInfo getPreferredDevice();
  
  AudioDeviceInfo getRoutedDevice();
  
  void addOnRoutingChangedListener(OnRoutingChangedListener paramOnRoutingChangedListener, Handler paramHandler);
  
  void removeOnRoutingChangedListener(OnRoutingChangedListener paramOnRoutingChangedListener);
  
  public static interface OnRoutingChangedListener {
    void onRoutingChanged(AudioRouting param1AudioRouting);
  }
}


/* Location:              M:\learn_android\android.jar!\android\media\AudioRouting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */