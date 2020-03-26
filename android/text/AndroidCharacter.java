/*    */ package android.text;
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
/*    */ @Deprecated
/*    */ public class AndroidCharacter
/*    */ {
/*    */   public static final int EAST_ASIAN_WIDTH_AMBIGUOUS = 1;
/*    */   public static final int EAST_ASIAN_WIDTH_FULL_WIDTH = 3;
/*    */   public static final int EAST_ASIAN_WIDTH_HALF_WIDTH = 2;
/*    */   public static final int EAST_ASIAN_WIDTH_NARROW = 4;
/*    */   public static final int EAST_ASIAN_WIDTH_NEUTRAL = 0;
/*    */   public static final int EAST_ASIAN_WIDTH_WIDE = 5;
/*    */   
/*    */   public AndroidCharacter() {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static native void getDirectionalities(char[] paramArrayOfchar, byte[] paramArrayOfbyte, int paramInt);
/*    */   
/*    */   public static native int getEastAsianWidth(char paramChar);
/*    */   
/*    */   public static native void getEastAsianWidths(char[] paramArrayOfchar, int paramInt1, int paramInt2, byte[] paramArrayOfbyte);
/*    */   
/*    */   public static native boolean mirror(char[] paramArrayOfchar, int paramInt1, int paramInt2);
/*    */   
/*    */   public static native char getMirror(char paramChar);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\AndroidCharacter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */