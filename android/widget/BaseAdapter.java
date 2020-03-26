/*    */ package android.widget;
/*    */ 
/*    */ import android.database.DataSetObserver;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
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
/*    */ public abstract class BaseAdapter
/*    */   implements ListAdapter, SpinnerAdapter
/*    */ {
/*    */   public BaseAdapter() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   } public boolean hasStableIds() {
/* 34 */     throw new RuntimeException("Stub!");
/*    */   } public void registerDataSetObserver(DataSetObserver observer) {
/* 36 */     throw new RuntimeException("Stub!");
/*    */   } public void unregisterDataSetObserver(DataSetObserver observer) {
/* 38 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void notifyDataSetChanged() {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void notifyDataSetInvalidated() {
/* 53 */     throw new RuntimeException("Stub!");
/*    */   } public boolean areAllItemsEnabled() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isEnabled(int position) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public View getDropDownView(int position, View convertView, ViewGroup parent) {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public int getItemViewType(int position) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public int getViewTypeCount() {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public boolean isEmpty() {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public CharSequence[] getAutofillOptions() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAutofillOptions(@RecentlyNullable CharSequence... options) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\widget\BaseAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */