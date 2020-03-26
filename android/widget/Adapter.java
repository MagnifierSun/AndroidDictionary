/*     */ package android.widget;
/*     */ 
/*     */ import android.database.DataSetObserver;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface Adapter
/*     */ {
/*     */   public static final int IGNORE_ITEM_VIEW_TYPE = -1;
/*     */   public static final int NO_SELECTION = -2147483648;
/*     */   
/*     */   void registerDataSetObserver(DataSetObserver paramDataSetObserver);
/*     */   
/*     */   void unregisterDataSetObserver(DataSetObserver paramDataSetObserver);
/*     */   
/*     */   int getCount();
/*     */   
/*     */   Object getItem(int paramInt);
/*     */   
/*     */   long getItemId(int paramInt);
/*     */   
/*     */   boolean hasStableIds();
/*     */   
/*     */   View getView(int paramInt, View paramView, ViewGroup paramViewGroup);
/*     */   
/*     */   int getItemViewType(int paramInt);
/*     */   
/*     */   int getViewTypeCount();
/*     */   
/*     */   boolean isEmpty();
/*     */   
/*     */   @RecentlyNullable
/*     */   default CharSequence[] getAutofillOptions() {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\Adapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */