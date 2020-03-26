package android.content;

import androidx.annotation.RecentlyNullable;
import java.util.Map;
import java.util.Set;

public interface SharedPreferences {
  Map<String, ?> getAll();
  
  @RecentlyNullable
  String getString(String paramString1, @RecentlyNullable String paramString2);
  
  @RecentlyNullable
  Set<String> getStringSet(String paramString, @RecentlyNullable Set<String> paramSet);
  
  int getInt(String paramString, int paramInt);
  
  long getLong(String paramString, long paramLong);
  
  float getFloat(String paramString, float paramFloat);
  
  boolean getBoolean(String paramString, boolean paramBoolean);
  
  boolean contains(String paramString);
  
  Editor edit();
  
  void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener);
  
  void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener);
  
  public static interface OnSharedPreferenceChangeListener {
    void onSharedPreferenceChanged(SharedPreferences param1SharedPreferences, String param1String);
  }
  
  public static interface Editor {
    Editor putString(String param1String1, @RecentlyNullable String param1String2);
    
    Editor putStringSet(String param1String, @RecentlyNullable Set<String> param1Set);
    
    Editor putInt(String param1String, int param1Int);
    
    Editor putLong(String param1String, long param1Long);
    
    Editor putFloat(String param1String, float param1Float);
    
    Editor putBoolean(String param1String, boolean param1Boolean);
    
    Editor remove(String param1String);
    
    Editor clear();
    
    boolean commit();
    
    void apply();
  }
}


/* Location:              M:\learn_android\android.jar!\android\content\SharedPreferences.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */