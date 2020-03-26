/*     */ package android.database;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CursorWrapper
/*     */   implements Cursor
/*     */ {
/*     */   public CursorWrapper(Cursor cursor) {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Cursor getWrappedCursor() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*  48 */   public int getCount() { throw new RuntimeException("Stub!"); } @Deprecated
/*     */   public void deactivate() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveToFirst() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndex(String columnName) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexOrThrow(String columnName) throws IllegalArgumentException {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnName(int columnIndex) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getColumnNames() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int columnIndex) {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtras(Bundle extras) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public Bundle getExtras() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int columnIndex) {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int columnIndex) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int columnIndex) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int columnIndex) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int columnIndex) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   } public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int columnIndex) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getWantsAllOnMoveCalls() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isAfterLast() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isBeforeFirst() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isFirst() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isLast() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public int getType(int columnIndex) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isNull(int columnIndex) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveToLast() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public boolean move(int offset) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveToPosition(int position) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveToNext() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public int getPosition() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public boolean moveToPrevious() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public void registerContentObserver(ContentObserver observer) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/* 112 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); } @Deprecated
/*     */   public boolean requery() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public Bundle respond(Bundle extras) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public void setNotificationUri(ContentResolver cr, Uri uri) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public Uri getNotificationUri() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterContentObserver(ContentObserver observer) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterDataSetObserver(DataSetObserver observer) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\database\CursorWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */