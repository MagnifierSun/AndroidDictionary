package android.hardware;

public interface SensorEventListener {
  void onSensorChanged(SensorEvent paramSensorEvent);
  
  void onAccuracyChanged(Sensor paramSensor, int paramInt);
}


/* Location:              M:\learn_android\android.jar!\android\hardware\SensorEventListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */