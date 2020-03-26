package android.speech;

import android.os.Bundle;

public interface RecognitionListener {
  void onReadyForSpeech(Bundle paramBundle);
  
  void onBeginningOfSpeech();
  
  void onRmsChanged(float paramFloat);
  
  void onBufferReceived(byte[] paramArrayOfbyte);
  
  void onEndOfSpeech();
  
  void onError(int paramInt);
  
  void onResults(Bundle paramBundle);
  
  void onPartialResults(Bundle paramBundle);
  
  void onEvent(int paramInt, Bundle paramBundle);
}


/* Location:              M:\learn_android\android.jar!\android\speech\RecognitionListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */