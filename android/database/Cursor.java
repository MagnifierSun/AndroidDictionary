package android.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import java.io.Closeable;

public interface Cursor extends Closeable {
  public static final int FIELD_TYPE_BLOB = 4;
  
  public static final int FIELD_TYPE_FLOAT = 2;
  
  public static final int FIELD_TYPE_INTEGER = 1;
  
  public static final int FIELD_TYPE_NULL = 0;
  
  public static final int FIELD_TYPE_STRING = 3;
  
  int getCount();
  
  int getPosition();
  
  boolean move(int paramInt);
  
  boolean moveToPosition(int paramInt);
  
  boolean moveToFirst();
  
  boolean moveToLast();
  
  boolean moveToNext();
  
  boolean moveToPrevious();
  
  boolean isFirst();
  
  boolean isLast();
  
  boolean isBeforeFirst();
  
  boolean isAfterLast();
  
  int getColumnIndex(String paramString);
  
  int getColumnIndexOrThrow(String paramString) throws IllegalArgumentException;
  
  String getColumnName(int paramInt);
  
  String[] getColumnNames();
  
  int getColumnCount();
  
  byte[] getBlob(int paramInt);
  
  String getString(int paramInt);
  
  void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer);
  
  short getShort(int paramInt);
  
  int getInt(int paramInt);
  
  long getLong(int paramInt);
  
  float getFloat(int paramInt);
  
  double getDouble(int paramInt);
  
  int getType(int paramInt);
  
  boolean isNull(int paramInt);
  
  @Deprecated
  void deactivate();
  
  @Deprecated
  boolean requery();
  
  void close();
  
  boolean isClosed();
  
  void registerContentObserver(ContentObserver paramContentObserver);
  
  void unregisterContentObserver(ContentObserver paramContentObserver);
  
  void registerDataSetObserver(DataSetObserver paramDataSetObserver);
  
  void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);
  
  void setNotificationUri(ContentResolver paramContentResolver, Uri paramUri);
  
  Uri getNotificationUri();
  
  boolean getWantsAllOnMoveCalls();
  
  void setExtras(Bundle paramBundle);
  
  Bundle getExtras();
  
  Bundle respond(Bundle paramBundle);
}


/* Location:              M:\learn_android\android.jar!\android\database\Cursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */