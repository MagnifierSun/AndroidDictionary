/*     */ package android.database;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MatrixCursor
/*     */   extends AbstractCursor
/*     */ {
/*     */   public MatrixCursor(String[] columnNames, int initialCapacity) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MatrixCursor(String[] columnNames) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RowBuilder newRow() {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public void addRow(Object[] columnValues) {
/*  70 */     throw new RuntimeException("Stub!");
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
/*     */   public void addRow(Iterable<?> columnValues) {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public int getCount() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public String[] getColumnNames() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int column) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int column) {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int column) {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int column) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int column) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int column) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int column) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public int getType(int column) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isNull(int column) {
/* 104 */     throw new RuntimeException("Stub!");
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
/*     */   public class RowBuilder
/*     */   {
/*     */     RowBuilder(int row) {
/* 123 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public RowBuilder add(Object columnValue) {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public RowBuilder add(String columnName, Object value) {
/* 142 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\database\MatrixCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */