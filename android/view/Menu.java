/*     */ package android.view;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Intent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface Menu
/*     */ {
/*     */   public static final int CATEGORY_ALTERNATIVE = 262144;
/*     */   public static final int CATEGORY_CONTAINER = 65536;
/*     */   public static final int CATEGORY_SECONDARY = 196608;
/*     */   public static final int CATEGORY_SYSTEM = 131072;
/*     */   public static final int FIRST = 1;
/*     */   public static final int FLAG_ALWAYS_PERFORM_CLOSE = 2;
/*     */   public static final int FLAG_APPEND_TO_GROUP = 1;
/*     */   public static final int FLAG_PERFORM_NO_CLOSE = 1;
/*     */   public static final int NONE = 0;
/*     */   public static final int SUPPORTED_MODIFIERS_MASK = 69647;
/*     */   
/*     */   MenuItem add(CharSequence paramCharSequence);
/*     */   
/*     */   MenuItem add(int paramInt);
/*     */   
/*     */   MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence);
/*     */   
/*     */   MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   SubMenu addSubMenu(CharSequence paramCharSequence);
/*     */   
/*     */   SubMenu addSubMenu(int paramInt);
/*     */   
/*     */   SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence);
/*     */   
/*     */   SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */   
/*     */   int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem);
/*     */   
/*     */   void removeItem(int paramInt);
/*     */   
/*     */   void removeGroup(int paramInt);
/*     */   
/*     */   void clear();
/*     */   
/*     */   void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2);
/*     */   
/*     */   void setGroupVisible(int paramInt, boolean paramBoolean);
/*     */   
/*     */   void setGroupEnabled(int paramInt, boolean paramBoolean);
/*     */   
/*     */   boolean hasVisibleItems();
/*     */   
/*     */   MenuItem findItem(int paramInt);
/*     */   
/*     */   int size();
/*     */   
/*     */   MenuItem getItem(int paramInt);
/*     */   
/*     */   void close();
/*     */   
/*     */   boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2);
/*     */   
/*     */   boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent);
/*     */   
/*     */   boolean performIdentifierAction(int paramInt1, int paramInt2);
/*     */   
/*     */   void setQwertyMode(boolean paramBoolean);
/*     */   
/*     */   default void setGroupDividerEnabled(boolean groupDividerEnabled) {
/* 392 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\Menu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */