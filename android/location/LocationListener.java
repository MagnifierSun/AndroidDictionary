package android.location;

import android.os.Bundle;

public interface LocationListener {
  void onLocationChanged(Location paramLocation);
  
  void onStatusChanged(String paramString, int paramInt, Bundle paramBundle);
  
  void onProviderEnabled(String paramString);
  
  void onProviderDisabled(String paramString);
}


/* Location:              M:\learn_android\android.jar!\android\location\LocationListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */