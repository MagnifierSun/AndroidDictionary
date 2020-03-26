/*     */ package android.widget;
/*     */ 
/*     */ import android.database.DataSetObserver;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BaseExpandableListAdapter
/*     */   implements ExpandableListAdapter, HeterogeneousExpandableList
/*     */ {
/*     */   public BaseExpandableListAdapter() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public void registerDataSetObserver(DataSetObserver observer) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterDataSetObserver(DataSetObserver observer) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void notifyDataSetInvalidated() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void notifyDataSetChanged() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public boolean areAllItemsEnabled() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public void onGroupCollapsed(int groupPosition) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   } public void onGroupExpanded(int groupPosition) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getCombinedChildId(long groupId, long childId) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getCombinedGroupId(long groupId) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChildType(int groupPosition, int childPosition) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChildTypeCount() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGroupType(int groupPosition) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGroupTypeCount() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\BaseExpandableListAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */