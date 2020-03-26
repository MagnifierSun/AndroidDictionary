/*     */ package android.media.audiofx;
/*     */ 
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AudioEffect
/*     */ {
/*     */   public static final String ACTION_CLOSE_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION";
/*     */   public static final String ACTION_DISPLAY_AUDIO_EFFECT_CONTROL_PANEL = "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL";
/*     */   public static final String ACTION_OPEN_AUDIO_EFFECT_CONTROL_SESSION = "android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION";
/*     */   public static final int ALREADY_EXISTS = -2;
/*     */   public static final int CONTENT_TYPE_GAME = 2;
/*     */   public static final int CONTENT_TYPE_MOVIE = 1;
/*     */   public static final int CONTENT_TYPE_MUSIC = 0;
/*     */   public static final int CONTENT_TYPE_VOICE = 3;
/*     */   public static final String EFFECT_AUXILIARY = "Auxiliary";
/*     */   public static final String EFFECT_INSERT = "Insert";
/*     */   
/*     */   AudioEffect(UUID type, UUID uuid, int priority, int audioSession) throws IllegalArgumentException, RuntimeException, UnsupportedOperationException {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void release() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Descriptor getDescriptor() throws IllegalStateException {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Descriptor[] queryEffects() {
/* 116 */     throw new RuntimeException("Stub!");
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
/*     */   public int setEnabled(boolean enabled) throws IllegalStateException {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() throws IllegalStateException {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getEnabled() throws IllegalStateException {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasControl() throws IllegalStateException {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnableStatusListener(OnEnableStatusChangeListener listener) {
/* 170 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControlStatusListener(OnControlStatusChangeListener listener) {
/* 179 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 293 */   public static final UUID EFFECT_TYPE_AEC = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 300 */   public static final UUID EFFECT_TYPE_AGC = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 307 */   public static final UUID EFFECT_TYPE_BASS_BOOST = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 314 */   public static final UUID EFFECT_TYPE_DYNAMICS_PROCESSING = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 321 */   public static final UUID EFFECT_TYPE_ENV_REVERB = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 328 */   public static final UUID EFFECT_TYPE_EQUALIZER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 335 */   public static final UUID EFFECT_TYPE_LOUDNESS_ENHANCER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 342 */   public static final UUID EFFECT_TYPE_NS = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 349 */   public static final UUID EFFECT_TYPE_PRESET_REVERB = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 356 */   public static final UUID EFFECT_TYPE_VIRTUALIZER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR_BAD_VALUE = -4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR_DEAD_OBJECT = -7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR_INVALID_OPERATION = -5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR_NO_INIT = -3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ERROR_NO_MEMORY = -6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String EXTRA_AUDIO_SESSION = "android.media.extra.AUDIO_SESSION";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String EXTRA_CONTENT_TYPE = "android.media.extra.CONTENT_TYPE";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String EXTRA_PACKAGE_NAME = "android.media.extra.PACKAGE_NAME";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int SUCCESS = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnEnableStatusChangeListener
/*     */   {
/*     */     void onEnableStatusChange(AudioEffect param1AudioEffect, boolean param1Boolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnControlStatusChangeListener
/*     */   {
/*     */     void onControlStatusChange(AudioEffect param1AudioEffect, boolean param1Boolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Descriptor
/*     */   {
/*     */     public String connectMode;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String implementor;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String name;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UUID type;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public UUID uuid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Descriptor() {
/* 459 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Descriptor(String type, String uuid, String connectMode, String name, String implementor) {
/* 476 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\AudioEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */