package android.database;

public interface CrossProcessCursor extends Cursor {
  CursorWindow getWindow();
  
  void fillWindow(int paramInt, CursorWindow paramCursorWindow);
  
  boolean onMove(int paramInt1, int paramInt2);
}


/* Location:              M:\learn_android\android.jar!\android\database\CrossProcessCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */