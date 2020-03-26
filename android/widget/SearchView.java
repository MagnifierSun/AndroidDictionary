/*     */ package android.widget;
/*     */ 
/*     */ import android.app.SearchableInfo;
/*     */ import android.content.Context;
/*     */ import android.graphics.Rect;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.CollapsibleActionView;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.View;
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
/*     */ public class SearchView
/*     */   extends LinearLayout
/*     */   implements CollapsibleActionView
/*     */ {
/*     */   public SearchView(Context context) {
/*  64 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public SearchView(Context context, AttributeSet attrs) {
/*  66 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public SearchView(Context context, AttributeSet attrs, int defStyleAttr) {
/*  68 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   } public SearchView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
/*  70 */     super((Context)null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSearchableInfo(SearchableInfo searchable) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImeOptions(int imeOptions) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getImeOptions() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInputType(int inputType) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInputType() {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public void clearFocus() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnQueryTextListener(OnQueryTextListener listener) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnCloseListener(OnCloseListener listener) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener listener) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnSuggestionListener(OnSuggestionListener listener) {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOnSearchClickListener(View.OnClickListener listener) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getQuery() {
/* 182 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuery(CharSequence query, boolean submit) {
/* 193 */     throw new RuntimeException("Stub!");
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
/*     */   public void setQueryHint(@RecentlyNullable CharSequence hint) {
/* 207 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public CharSequence getQueryHint() {
/* 227 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIconifiedByDefault(boolean iconified) {
/* 242 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIconfiedByDefault() {
/* 251 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIconified(boolean iconify) {
/* 264 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isIconified() {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSubmitButtonEnabled(boolean enabled) {
/* 284 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSubmitButtonEnabled() {
/* 292 */     throw new RuntimeException("Stub!");
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
/*     */   public void setQueryRefinementEnabled(boolean enable) {
/* 309 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isQueryRefinementEnabled() {
/* 316 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSuggestionsAdapter(CursorAdapter adapter) {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CursorAdapter getSuggestionsAdapter() {
/* 332 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxWidth(int maxpixels) {
/* 340 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxWidth() {
/* 350 */     throw new RuntimeException("Stub!");
/*     */   } protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
/* 352 */     throw new RuntimeException("Stub!");
/*     */   } protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
/* 354 */     throw new RuntimeException("Stub!");
/*     */   } protected void onDetachedFromWindow() {
/* 356 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean onKeyDown(int keyCode, KeyEvent event) {
/* 368 */     throw new RuntimeException("Stub!");
/*     */   } public void onWindowFocusChanged(boolean hasWindowFocus) {
/* 370 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onActionViewCollapsed() {
/* 376 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onActionViewExpanded() {
/* 382 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 384 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 386 */     throw new RuntimeException("Stub!");
/*     */   } public CharSequence getAccessibilityClassName() {
/* 388 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnSuggestionListener {
/*     */     boolean onSuggestionSelect(int param1Int);
/*     */     
/*     */     boolean onSuggestionClick(int param1Int);
/*     */   }
/*     */   
/*     */   public static interface OnQueryTextListener {
/*     */     boolean onQueryTextSubmit(String param1String);
/*     */     
/*     */     boolean onQueryTextChange(String param1String);
/*     */   }
/*     */   
/*     */   public static interface OnCloseListener {
/*     */     boolean onClose();
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\widget\SearchView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */