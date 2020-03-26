/*     */ package android.database.sqlite;
/*     */ 
/*     */ import android.database.AbstractWindowedCursor;
/*     */ import android.database.CursorWindow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SQLiteCursor
/*     */   extends AbstractWindowedCursor
/*     */ {
/*     */   @Deprecated
/*     */   public SQLiteCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query) {
/*  48 */     throw new RuntimeException("Stub!");
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
/*     */   public SQLiteCursor(SQLiteCursorDriver driver, String editTable, SQLiteQuery query) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SQLiteDatabase getDatabase() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onMove(int oldPosition, int newPosition) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public int getCount() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndex(String columnName) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getColumnNames() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public void deactivate() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public boolean requery() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public void setWindow(CursorWindow window) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSelectionArguments(String[] selectionArgs) {
/*  90 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFillWindowForwardOnly(boolean fillWindowForwardOnly) {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void finalize() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\database\sqlite\SQLiteCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */