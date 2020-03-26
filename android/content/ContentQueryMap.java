/*    */ package android.content;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.os.Handler;
/*    */ import java.util.Map;
/*    */ import java.util.Observable;
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
/*    */ public class ContentQueryMap
/*    */   extends Observable
/*    */ {
/*    */   public ContentQueryMap(Cursor cursor, String columnNameOfKey, boolean keepUpdated, Handler handlerForUpdateNotifications) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setKeepUpdated(boolean keepUpdated) {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public synchronized ContentValues getValues(String rowName) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public void requery() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   } public synchronized Map<String, ContentValues> getRows() {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   } public synchronized void close() {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\content\ContentQueryMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */