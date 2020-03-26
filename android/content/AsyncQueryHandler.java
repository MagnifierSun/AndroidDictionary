/*     */ package android.content;
/*     */ 
/*     */ import android.database.Cursor;
/*     */ import android.net.Uri;
/*     */ import android.os.Handler;
/*     */ import android.os.Looper;
/*     */ import android.os.Message;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AsyncQueryHandler
/*     */   extends Handler
/*     */ {
/*     */   public AsyncQueryHandler(ContentResolver cr) {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   } protected Handler createHandler(Looper looper) {
/*  32 */     throw new RuntimeException("Stub!");
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
/*     */   public void startQuery(int token, Object cookie, Uri uri, String[] projection, String selection, String[] selectionArgs, String orderBy) {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public final void cancelOperation(int token) {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */   public final void startInsert(int token, Object cookie, Uri uri, ContentValues initialValues) {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public final void startUpdate(int token, Object cookie, Uri uri, ContentValues values, String selection, String[] selectionArgs) {
/*  95 */     throw new RuntimeException("Stub!");
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
/*     */   public final void startDelete(int token, Object cookie, Uri uri, String selection, String[] selectionArgs) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onQueryComplete(int token, Object cookie, Cursor cursor) {
/* 119 */     throw new RuntimeException("Stub!");
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
/*     */   protected void onInsertComplete(int token, Object cookie, Uri uri) {
/* 131 */     throw new RuntimeException("Stub!");
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
/*     */   protected void onUpdateComplete(int token, Object cookie, int result) {
/* 143 */     throw new RuntimeException("Stub!");
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
/*     */   protected void onDeleteComplete(int token, Object cookie, int result) {
/* 155 */     throw new RuntimeException("Stub!");
/*     */   } public void handleMessage(Message msg) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   protected static final class WorkerArgs { protected WorkerArgs() {
/* 161 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     
/*     */     public Object cookie;
/*     */     
/*     */     public Handler handler;
/*     */     
/*     */     public String orderBy;
/*     */     
/*     */     public String[] projection;
/*     */     
/*     */     public Object result;
/*     */     
/*     */     public String selection;
/*     */     public String[] selectionArgs;
/*     */     public Uri uri;
/*     */     public ContentValues values; }
/*     */ 
/*     */   
/*     */   protected class WorkerHandler
/*     */     extends Handler
/*     */   {
/*     */     public WorkerHandler(Looper looper) {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     } public void handleMessage(Message msg) {
/* 187 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\AsyncQueryHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */