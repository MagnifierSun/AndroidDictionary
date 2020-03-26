package android.database;

import android.database.sqlite.SQLiteDatabase;

public interface DatabaseErrorHandler {
  void onCorruption(SQLiteDatabase paramSQLiteDatabase);
}


/* Location:              M:\learn_android\android.jar!\android\database\DatabaseErrorHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */