/*     */ package android.hardware;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SensorAdditionalInfo
/*     */ {
/*     */   public static final int TYPE_FRAME_BEGIN = 0;
/*     */   public static final int TYPE_FRAME_END = 1;
/*     */   public static final int TYPE_INTERNAL_TEMPERATURE = 65537;
/*     */   public static final int TYPE_SAMPLING = 65540;
/*     */   public static final int TYPE_SENSOR_PLACEMENT = 65539;
/*     */   public static final int TYPE_UNTRACKED_DELAY = 65536;
/*     */   public static final int TYPE_VEC3_CALIBRATION = 65538;
/*     */   
/*     */   SensorAdditionalInfo(Sensor aSensor, int aType, int aSerial, int[] aIntValues, float[] aFloatValues) {
/*  35 */     throw new RuntimeException("Stub!");
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
/* 108 */   public final float[] floatValues = new float[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 116 */   public final int[] intValues = new int[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 124 */   public final Sensor sensor = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 131 */   public final int serial = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 138 */   public final int type = 0;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\SensorAdditionalInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */