package android.database.sqlite;

public interface SQLiteTransactionListener {
  void onBegin();
  
  void onCommit();
  
  void onRollback();
}


/* Location:              M:\learn_android\android.jar!\android\database\sqlite\SQLiteTransactionListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */