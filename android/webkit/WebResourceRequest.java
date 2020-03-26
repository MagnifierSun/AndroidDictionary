package android.webkit;

import android.net.Uri;
import java.util.Map;

public interface WebResourceRequest {
  Uri getUrl();
  
  boolean isForMainFrame();
  
  boolean isRedirect();
  
  boolean hasGesture();
  
  String getMethod();
  
  Map<String, String> getRequestHeaders();
}


/* Location:              M:\learn_android\android.jar!\android\webkit\WebResourceRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */