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
/*     */ public class PresetReverb
/*     */   extends AudioEffect
/*     */ {
/*     */   public static final int PARAM_PRESET = 0;
/*     */   public static final short PRESET_LARGEHALL = 5;
/*     */   public static final short PRESET_LARGEROOM = 3;
/*     */   public static final short PRESET_MEDIUMHALL = 4;
/*     */   public static final short PRESET_MEDIUMROOM = 2;
/*     */   public static final short PRESET_NONE = 0;
/*     */   public static final short PRESET_PLATE = 6;
/*     */   public static final short PRESET_SMALLROOM = 1;
/*     */   
/*     */   public PresetReverb(int priority, int audioSession) throws IllegalArgumentException, RuntimeException, UnsupportedOperationException {
/*  72 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
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
/*     */   public void setPreset(short preset) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getPreset() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParameterListener(OnParameterChangeListener listener) {
/* 103 */     throw new RuntimeException("Stub!");
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
/* 114 */     throw new RuntimeException("Stub!");
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
/* 125 */     throw new RuntimeException("Stub!");
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
/*     */     public short preset;
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
/*     */     public Settings() {
/* 205 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings(String settings) {
/* 213 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 215 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface OnParameterChangeListener {
/*     */     void onParameterChange(PresetReverb param1PresetReverb, int param1Int1, int param1Int2, short param1Short);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\PresetReverb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */