package android.net.sip;

public interface SipRegistrationListener {
  void onRegistering(String paramString);
  
  void onRegistrationDone(String paramString, long paramLong);
  
  void onRegistrationFailed(String paramString1, int paramInt, String paramString2);
}


/* Location:              M:\learn_android\android.jar!\android\net\sip\SipRegistrationListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */