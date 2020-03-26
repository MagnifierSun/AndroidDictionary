/*     */ package android.widget;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.database.Cursor;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class CursorTreeAdapter
/*     */   extends BaseExpandableListAdapter
/*     */   implements Filterable
/*     */ {
/*     */   public CursorTreeAdapter(Cursor cursor, Context context) {
/*  43 */     throw new RuntimeException("Stub!");
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
/*     */   public CursorTreeAdapter(Cursor cursor, Context context, boolean autoRequery) {
/*  55 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGroupCursor(Cursor cursor) {
/*  85 */     throw new RuntimeException("Stub!");
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
/*     */   public void setChildrenCursor(int groupPosition, Cursor childrenCursor) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public Cursor getChild(int groupPosition, int childPosition) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public long getChildId(int groupPosition, int childPosition) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public int getChildrenCount(int groupPosition) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public Cursor getGroup(int groupPosition) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public int getGroupCount() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public long getGroupId(int groupPosition) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
/* 111 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
/* 138 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isChildSelectable(int groupPosition, int childPosition) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   } public boolean hasStableIds() {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   } public void notifyDataSetChanged() {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void notifyDataSetChanged(boolean releaseCursors) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public void notifyDataSetInvalidated() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } public void onGroupCollapsed(int groupPosition) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String convertToString(Cursor cursor) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Cursor runQueryOnBackgroundThread(CharSequence constraint) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   } public Filter getFilter() {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FilterQueryProvider getFilterQueryProvider() {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void changeCursor(Cursor cursor) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Cursor getCursor() {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   protected abstract Cursor getChildrenCursor(Cursor paramCursor);
/*     */   
/*     */   protected abstract View newGroupView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*     */   
/*     */   protected abstract void bindGroupView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/*     */   
/*     */   protected abstract View newChildView(Context paramContext, Cursor paramCursor, boolean paramBoolean, ViewGroup paramViewGroup);
/*     */   
/*     */   protected abstract void bindChildView(View paramView, Context paramContext, Cursor paramCursor, boolean paramBoolean);
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\CursorTreeAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */