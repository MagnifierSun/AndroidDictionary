package android.content.res;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public interface XmlResourceParser extends XmlPullParser, AttributeSet, AutoCloseable {
  String getAttributeNamespace(int paramInt);
  
  void close();
}


/* Location:              M:\learn_android\android.jar!\android\content\res\XmlResourceParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */