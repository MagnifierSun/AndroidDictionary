/*     */ package android.preference;
/*     */ 
/*     */ import android.app.Dialog;
/*     */ import android.content.Context;
/*     */ import android.content.DialogInterface;
/*     */ import android.os.Parcelable;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.View;
/*     */ import android.widget.AdapterView;
/*     */ import android.widget.ListAdapter;
/*     */ import android.widget.ListView;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PreferenceScreen
/*     */   extends PreferenceGroup
/*     */   implements AdapterView.OnItemClickListener, DialogInterface.OnDismissListener
/*     */ {
/*     */   PreferenceScreen(Context context, AttributeSet attrs) {
/*  86 */     super((Context)null, (AttributeSet)null); throw new RuntimeException("Stub!");
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
/*     */   public ListAdapter getRootAdapter() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ListAdapter onCreateRootAdapter() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(ListView listView) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } protected void onClick() {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   } public void onDismiss(DialogInterface dialog) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Dialog getDialog() {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public void onItemClick(AdapterView parent, View view, int position, long id) {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean isOnSameScreenAsChildren() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } protected Parcelable onSaveInstanceState() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } protected void onRestoreInstanceState(Parcelable state) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\preference\PreferenceScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */