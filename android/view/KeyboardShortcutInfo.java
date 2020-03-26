/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class KeyboardShortcutInfo
/*    */   implements Parcelable
/*    */ {
/*    */   public KeyboardShortcutInfo(CharSequence label, int keycode, int modifiers) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeyboardShortcutInfo(CharSequence label, char baseCharacter, int modifiers) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public CharSequence getLabel() {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getKeycode() {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public char getBaseCharacter() {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getModifiers() {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 84 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 86 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 89 */   public static final Parcelable.Creator<KeyboardShortcutInfo> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\KeyboardShortcutInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */