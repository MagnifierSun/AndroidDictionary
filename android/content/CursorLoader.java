/*     */ package android.content;
/*     */ 
/*     */ import android.database.Cursor;
/*     */ import android.net.Uri;
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
/*     */ @Deprecated
/*     */ public class CursorLoader
/*     */   extends AsyncTaskLoader<Cursor>
/*     */ {
/*     */   public CursorLoader(Context context) {
/*  50 */     super(null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CursorLoader(Context context, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
/*  59 */     super(null); throw new RuntimeException("Stub!");
/*     */   } public Cursor loadInBackground() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public void cancelLoadInBackground() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public void deliverResult(Cursor cursor) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onStartLoading() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onStopLoading() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   } public void onCanceled(Cursor cursor) {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   } protected void onReset() {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public Uri getUri() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public void setUri(Uri uri) {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getProjection() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public void setProjection(String[] projection) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public String getSelection() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public void setSelection(String selection) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getSelectionArgs() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public void setSelectionArgs(String[] selectionArgs) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public String getSortOrder() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public void setSortOrder(String sortOrder) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\CursorLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */