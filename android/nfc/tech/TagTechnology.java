package android.nfc.tech;

import android.nfc.Tag;
import java.io.Closeable;
import java.io.IOException;

public interface TagTechnology extends Closeable {
  Tag getTag();
  
  void connect() throws IOException;
  
  void close() throws IOException;
  
  boolean isConnected();
}


/* Location:              M:\learn_android\android.jar!\android\nfc\tech\TagTechnology.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */