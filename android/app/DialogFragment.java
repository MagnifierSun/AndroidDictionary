/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.DialogInterface;
/*     */ import android.os.Bundle;
/*     */ import android.view.LayoutInflater;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public class DialogFragment
/*     */   extends Fragment
/*     */   implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
/*     */ {
/*     */   public static final int STYLE_NORMAL = 0;
/*     */   public static final int STYLE_NO_FRAME = 2;
/*     */   public static final int STYLE_NO_INPUT = 3;
/*     */   public static final int STYLE_NO_TITLE = 1;
/*     */   
/*     */   public DialogFragment() {
/* 144 */     throw new RuntimeException("Stub!");
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
/*     */   public void setStyle(int style, int theme) {
/* 161 */     throw new RuntimeException("Stub!");
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
/*     */   public void show(FragmentManager manager, String tag) {
/* 175 */     throw new RuntimeException("Stub!");
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
/*     */   public int show(FragmentTransaction transaction, String tag) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dismiss() {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dismissAllowingStateLoss() {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   } public Dialog getDialog() {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   } public int getTheme() {
/* 209 */     throw new RuntimeException("Stub!");
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
/*     */   public void setCancelable(boolean cancelable) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCancelable() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShowsDialog(boolean showsDialog) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getShowsDialog() {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   } public void onAttach(Context context) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   } public void onDetach() {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   } public void onCreate(Bundle savedInstanceState) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
/* 263 */     throw new RuntimeException("Stub!");
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
/*     */   public Dialog onCreateDialog(Bundle savedInstanceState) {
/* 288 */     throw new RuntimeException("Stub!");
/*     */   } public void onCancel(DialogInterface dialog) {
/* 290 */     throw new RuntimeException("Stub!");
/*     */   } public void onDismiss(DialogInterface dialog) {
/* 292 */     throw new RuntimeException("Stub!");
/*     */   } public void onActivityCreated(Bundle savedInstanceState) {
/* 294 */     throw new RuntimeException("Stub!");
/*     */   } public void onStart() {
/* 296 */     throw new RuntimeException("Stub!");
/*     */   } public void onSaveInstanceState(Bundle outState) {
/* 298 */     throw new RuntimeException("Stub!");
/*     */   } public void onStop() {
/* 300 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onDestroyView() {
/* 306 */     throw new RuntimeException("Stub!");
/*     */   } public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
/* 308 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\DialogFragment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */