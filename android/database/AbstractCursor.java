/*     */ package android.database;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractCursor
/*     */   implements CrossProcessCursor
/*     */ {
/*     */   @Deprecated
/*     */   protected boolean mClosed;
/*     */   @Deprecated
/*     */   protected ContentResolver mContentResolver;
/*     */   @Deprecated
/*     */   protected int mPos;
/*     */   
/*     */   public abstract int getCount();
/*     */   
/*     */   public abstract String[] getColumnNames();
/*     */   
/*     */   public abstract String getString(int paramInt);
/*     */   
/*     */   public abstract short getShort(int paramInt);
/*     */   
/*     */   public abstract int getInt(int paramInt);
/*     */   
/*     */   public AbstractCursor() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract long getLong(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract float getFloat(int paramInt);
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract double getDouble(int paramInt);
/*     */ 
/*     */   
/*     */   public abstract boolean isNull(int paramInt);
/*     */ 
/*     */   
/*     */   public int getType(int column) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int column) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CursorWindow getWindow() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnCount() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public void deactivate() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   } public boolean requery() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isClosed() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   } public void close() {
/*  71 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean onMove(int oldPosition, int newPosition) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public final int getPosition() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean moveToPosition(int position) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public void fillWindow(int position, CursorWindow window) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean move(int offset) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean moveToFirst() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean moveToLast() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean moveToNext() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean moveToPrevious() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean isFirst() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean isLast() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean isBeforeFirst() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public final boolean isAfterLast() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndex(String columnName) {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } public int getColumnIndexOrThrow(String columnName) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public String getColumnName(int columnIndex) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   } public void registerContentObserver(ContentObserver observer) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterContentObserver(ContentObserver observer) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   } public void registerDataSetObserver(DataSetObserver observer) {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   } public void unregisterDataSetObserver(DataSetObserver observer) {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onChange(boolean selfChange) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNotificationUri(ContentResolver cr, Uri notifyUri) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public Uri getNotificationUri() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getWantsAllOnMoveCalls() {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   } public void setExtras(Bundle extras) {
/* 149 */     throw new RuntimeException("Stub!");
/*     */   } public Bundle getExtras() {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   } public Bundle respond(Bundle extras) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   protected boolean isFieldUpdated(int columnIndex) {
/* 159 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   protected Object getUpdatedField(int columnIndex) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void checkPosition() {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() {
/* 178 */     throw new RuntimeException("Stub!");
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
/*     */   protected static class SelfContentObserver
/*     */     extends ContentObserver
/*     */   {
/*     */     public SelfContentObserver(AbstractCursor cursor) {
/* 204 */       super(null); throw new RuntimeException("Stub!");
/*     */     } public boolean deliverSelfNotifications() {
/* 206 */       throw new RuntimeException("Stub!");
/*     */     } public void onChange(boolean selfChange) {
/* 208 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\database\AbstractCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */