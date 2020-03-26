package android.view.inputmethod;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public interface InputMethodSession {
  void finishInput();
  
  void updateSelection(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  void viewClicked(boolean paramBoolean);
  
  void updateCursor(Rect paramRect);
  
  void displayCompletions(CompletionInfo[] paramArrayOfCompletionInfo);
  
  void updateExtractedText(int paramInt, ExtractedText paramExtractedText);
  
  void dispatchKeyEvent(int paramInt, KeyEvent paramKeyEvent, EventCallback paramEventCallback);
  
  void dispatchTrackballEvent(int paramInt, MotionEvent paramMotionEvent, EventCallback paramEventCallback);
  
  void dispatchGenericMotionEvent(int paramInt, MotionEvent paramMotionEvent, EventCallback paramEventCallback);
  
  void appPrivateCommand(String paramString, Bundle paramBundle);
  
  void toggleSoftInput(int paramInt1, int paramInt2);
  
  void updateCursorAnchorInfo(CursorAnchorInfo paramCursorAnchorInfo);
  
  public static interface EventCallback {
    void finishedEvent(int param1Int, boolean param1Boolean);
  }
}


/* Location:              M:\learn_android\android.jar!\android\view\inputmethod\InputMethodSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */