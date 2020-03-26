package android.view.inputmethod;

import android.os.IBinder;
import android.os.ResultReceiver;

public interface InputMethod {
  public static final String SERVICE_INTERFACE = "android.view.InputMethod";
  
  public static final String SERVICE_META_DATA = "android.view.im";
  
  public static final int SHOW_EXPLICIT = 1;
  
  public static final int SHOW_FORCED = 2;
  
  void attachToken(IBinder paramIBinder);
  
  void bindInput(InputBinding paramInputBinding);
  
  void unbindInput();
  
  void startInput(InputConnection paramInputConnection, EditorInfo paramEditorInfo);
  
  void restartInput(InputConnection paramInputConnection, EditorInfo paramEditorInfo);
  
  void createSession(SessionCallback paramSessionCallback);
  
  void setSessionEnabled(InputMethodSession paramInputMethodSession, boolean paramBoolean);
  
  void revokeSession(InputMethodSession paramInputMethodSession);
  
  void showSoftInput(int paramInt, ResultReceiver paramResultReceiver);
  
  void hideSoftInput(int paramInt, ResultReceiver paramResultReceiver);
  
  void changeInputMethodSubtype(InputMethodSubtype paramInputMethodSubtype);
  
  public static interface SessionCallback {
    void sessionCreated(InputMethodSession param1InputMethodSession);
  }
}


/* Location:              M:\learn_android\android.jar!\android\view\inputmethod\InputMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */