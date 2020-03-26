/*    */ package android.graphics;
/*    */ 
/*    */ import java.io.InputStream;
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
/*    */ @Deprecated
/*    */ public class Movie
/*    */ {
/*    */   public native int width();
/*    */   
/*    */   public native int height();
/*    */   
/*    */   public native boolean isOpaque();
/*    */   
/*    */   Movie(long nativeMovie) {
/* 28 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public native int duration();
/*    */ 
/*    */   
/*    */   public native boolean setTime(int paramInt);
/*    */ 
/*    */   
/*    */   public void draw(Canvas canvas, float x, float y, Paint paint) {
/* 40 */     throw new RuntimeException("Stub!");
/*    */   } public void draw(Canvas canvas, float x, float y) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public static Movie decodeStream(InputStream is) {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   public static native Movie decodeByteArray(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
/*    */   public static Movie decodeFile(String pathName) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\Movie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */