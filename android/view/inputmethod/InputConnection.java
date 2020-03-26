package android.view.inputmethod;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public interface InputConnection {
  public static final int CURSOR_UPDATE_IMMEDIATE = 1;
  
  public static final int CURSOR_UPDATE_MONITOR = 2;
  
  public static final int GET_EXTRACTED_TEXT_MONITOR = 1;
  
  public static final int GET_TEXT_WITH_STYLES = 1;
  
  public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
  
  CharSequence getTextBeforeCursor(int paramInt1, int paramInt2);
  
  CharSequence getTextAfterCursor(int paramInt1, int paramInt2);
  
  CharSequence getSelectedText(int paramInt);
  
  int getCursorCapsMode(int paramInt);
  
  ExtractedText getExtractedText(ExtractedTextRequest paramExtractedTextRequest, int paramInt);
  
  boolean deleteSurroundingText(int paramInt1, int paramInt2);
  
  boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2);
  
  boolean setComposingText(CharSequence paramCharSequence, int paramInt);
  
  boolean setComposingRegion(int paramInt1, int paramInt2);
  
  boolean finishComposingText();
  
  boolean commitText(CharSequence paramCharSequence, int paramInt);
  
  boolean commitCompletion(CompletionInfo paramCompletionInfo);
  
  boolean commitCorrection(CorrectionInfo paramCorrectionInfo);
  
  boolean setSelection(int paramInt1, int paramInt2);
  
  boolean performEditorAction(int paramInt);
  
  boolean performContextMenuAction(int paramInt);
  
  boolean beginBatchEdit();
  
  boolean endBatchEdit();
  
  boolean sendKeyEvent(KeyEvent paramKeyEvent);
  
  boolean clearMetaKeyStates(int paramInt);
  
  boolean reportFullscreenMode(boolean paramBoolean);
  
  boolean performPrivateCommand(String paramString, Bundle paramBundle);
  
  boolean requestCursorUpdates(int paramInt);
  
  Handler getHandler();
  
  void closeConnection();
  
  boolean commitContent(@RecentlyNonNull InputContentInfo paramInputContentInfo, int paramInt, @RecentlyNullable Bundle paramBundle);
}


/* Location:              M:\learn_android\android.jar!\android\view\inputmethod\InputConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */