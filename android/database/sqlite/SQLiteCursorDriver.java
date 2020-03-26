package android.database.sqlite;

import android.database.Cursor;

public interface SQLiteCursorDriver {
  Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString);
  
  void cursorDeactivated();
  
  void cursorRequeried(Cursor paramCursor);
  
  void cursorClosed();
  
  void setBindArguments(String[] paramArrayOfString);
}


/* Location:              M:\learn_android\android.jar!\android\database\sqlite\SQLiteCursorDriver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */