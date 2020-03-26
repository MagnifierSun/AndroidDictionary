/*     */ package android.media.audiofx;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BassBoost
/*     */   extends AudioEffect
/*     */ {
/*     */   public static final int PARAM_STRENGTH = 1;
/*     */   public static final int PARAM_STRENGTH_SUPPORTED = 0;
/*     */   
/*     */   public BassBoost(int priority, int audioSession) throws IllegalArgumentException, IllegalStateException, RuntimeException, UnsupportedOperationException {
/*  56 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getStrengthSupported() {
/*  64 */     throw new RuntimeException("Stub!");
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
/*     */   public void setStrength(short strength) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getRoundedStrength() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParameterListener(OnParameterChangeListener listener) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Settings getProperties() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProperties(Settings settings) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 118 */     throw new RuntimeException("Stub!");
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
/*     */   public static class Settings
/*     */   {
/*     */     public short strength;
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
/*     */     public Settings() {
/* 162 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings(String settings) {
/* 170 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 172 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface OnParameterChangeListener {
/*     */     void onParameterChange(BassBoost param1BassBoost, int param1Int1, int param1Int2, short param1Short);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\BassBoost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */