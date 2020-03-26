/*    */ package android.view;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.util.List;
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
/*    */ public final class KeyboardShortcutGroup
/*    */   implements Parcelable
/*    */ {
/*    */   public KeyboardShortcutGroup(@RecentlyNullable CharSequence label, @RecentlyNonNull List<KeyboardShortcutInfo> items) {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeyboardShortcutGroup(@RecentlyNullable CharSequence label) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CharSequence getLabel() {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public List<KeyboardShortcutInfo> getItems() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addItem(KeyboardShortcutInfo item) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 70 */   public static final Parcelable.Creator<KeyboardShortcutGroup> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\KeyboardShortcutGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */