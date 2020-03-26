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
/*     */ public class Equalizer
/*     */   extends AudioEffect
/*     */ {
/*     */   public static final int PARAM_BAND_FREQ_RANGE = 4;
/*     */   public static final int PARAM_BAND_LEVEL = 2;
/*     */   public static final int PARAM_CENTER_FREQ = 3;
/*     */   public static final int PARAM_CURRENT_PRESET = 6;
/*     */   public static final int PARAM_GET_BAND = 5;
/*     */   public static final int PARAM_GET_NUM_OF_PRESETS = 7;
/*     */   public static final int PARAM_GET_PRESET_NAME = 8;
/*     */   public static final int PARAM_LEVEL_RANGE = 1;
/*     */   public static final int PARAM_NUM_BANDS = 0;
/*     */   public static final int PARAM_STRING_SIZE_MAX = 32;
/*     */   
/*     */   public Equalizer(int priority, int audioSession) throws IllegalArgumentException, IllegalStateException, RuntimeException, UnsupportedOperationException {
/*  57 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getNumberOfBands() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public short[] getBandLevelRange() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  79 */     throw new RuntimeException("Stub!");
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
/*     */   public void setBandLevel(short band, short level) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  93 */     throw new RuntimeException("Stub!");
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
/*     */   public short getBandLevel(short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 105 */     throw new RuntimeException("Stub!");
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
/*     */   public int getCenterFreq(short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 117 */     throw new RuntimeException("Stub!");
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
/*     */   public int[] getBandFreqRange(short band) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getBand(int frequency) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getCurrentPreset() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 151 */     throw new RuntimeException("Stub!");
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
/*     */   public void usePreset(short preset) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 163 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getNumberOfPresets() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPresetName(short preset) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParameterListener(OnParameterChangeListener listener) {
/* 192 */     throw new RuntimeException("Stub!");
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
/* 203 */     throw new RuntimeException("Stub!");
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
/* 214 */     throw new RuntimeException("Stub!");
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
/*     */   public static class Settings
/*     */   {
/*     */     public short[] bandLevels;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short curPreset;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 308 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings(String settings) {
/* 316 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 318 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     public short numBands = 0;
/*     */   }
/*     */   
/*     */   public static interface OnParameterChangeListener {
/*     */     void onParameterChange(Equalizer param1Equalizer, int param1Int1, int param1Int2, int param1Int3, int param1Int4);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\Equalizer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */