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
/*     */ 
/*     */ public abstract class AbstractWindowedCursor
/*     */   extends AbstractCursor
/*     */ {
/*     */   protected CursorWindow mWindow;
/*     */   
/*     */   public AbstractWindowedCursor() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public byte[] getBlob(int columnIndex) {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public String getString(int columnIndex) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public short getShort(int columnIndex) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public int getInt(int columnIndex) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public long getLong(int columnIndex) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public float getFloat(int columnIndex) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public double getDouble(int columnIndex) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isNull(int columnIndex) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean isBlob(int columnIndex) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean isString(int columnIndex) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean isLong(int columnIndex) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean isFloat(int columnIndex) {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public int getType(int columnIndex) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } protected void checkPosition() {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   } public CursorWindow getWindow() {
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWindow(CursorWindow window) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasWindow() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\database\AbstractWindowedCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */