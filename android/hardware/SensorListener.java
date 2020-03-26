package android.hardware;

@Deprecated
public interface SensorListener {
  void onSensorChanged(int paramInt, float[] paramArrayOffloat);
  
  void onAccuracyChanged(int paramInt1, int paramInt2);
}


/* Location:              M:\learn_android\android.jar!\android\hardware\SensorListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */