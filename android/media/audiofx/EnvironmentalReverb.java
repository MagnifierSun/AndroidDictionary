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
/*     */ public class EnvironmentalReverb
/*     */   extends AudioEffect
/*     */ {
/*     */   public static final int PARAM_DECAY_HF_RATIO = 3;
/*     */   public static final int PARAM_DECAY_TIME = 2;
/*     */   public static final int PARAM_DENSITY = 9;
/*     */   public static final int PARAM_DIFFUSION = 8;
/*     */   public static final int PARAM_REFLECTIONS_DELAY = 5;
/*     */   public static final int PARAM_REFLECTIONS_LEVEL = 4;
/*     */   public static final int PARAM_REVERB_DELAY = 7;
/*     */   public static final int PARAM_REVERB_LEVEL = 6;
/*     */   public static final int PARAM_ROOM_HF_LEVEL = 1;
/*     */   public static final int PARAM_ROOM_LEVEL = 0;
/*     */   
/*     */   public EnvironmentalReverb(int priority, int audioSession) throws IllegalArgumentException, RuntimeException, UnsupportedOperationException {
/*  72 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRoomLevel(short room) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getRoomLevel() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/*  92 */     throw new RuntimeException("Stub!");
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
/*     */   public void setRoomHFLevel(short roomHF) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getRoomHFLevel() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDecayTime(int decayTime) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDecayTime() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 134 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDecayHFRatio(short decayHFRatio) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getDecayHFRatio() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 156 */     throw new RuntimeException("Stub!");
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
/*     */   public void setReflectionsLevel(short reflectionsLevel) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 168 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getReflectionsLevel() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
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
/*     */   public void setReflectionsDelay(int reflectionsDelay) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getReflectionsDelay() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReverbLevel(short reverbLevel) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getReverbLevel() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReverbDelay(int reverbDelay) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getReverbDelay() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 241 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDiffusion(short diffusion) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 254 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getDiffusion() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 264 */     throw new RuntimeException("Stub!");
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
/*     */   public void setDensity(short density) throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public short getDensity() throws IllegalArgumentException, IllegalStateException, UnsupportedOperationException {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParameterListener(OnParameterChangeListener listener) {
/* 296 */     throw new RuntimeException("Stub!");
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
/* 307 */     throw new RuntimeException("Stub!");
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
/* 318 */     throw new RuntimeException("Stub!");
/*     */   }
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
/*     */     public short decayHFRatio;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int decayTime;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short density;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short diffusion;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int reflectionsDelay;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short reflectionsLevel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int reverbDelay;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short reverbLevel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short roomHFLevel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public short roomLevel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings() {
/* 410 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Settings(String settings) {
/* 418 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 420 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static interface OnParameterChangeListener {
/*     */     void onParameterChange(EnvironmentalReverb param1EnvironmentalReverb, int param1Int1, int param1Int2, int param1Int3);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\EnvironmentalReverb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */