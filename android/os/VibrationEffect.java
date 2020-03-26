/*     */ package android.os;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class VibrationEffect
/*     */   implements Parcelable
/*     */ {
/*     */   VibrationEffect() {
/*  34 */     throw new RuntimeException("Stub!");
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
/*     */   public static VibrationEffect createOneShot(long milliseconds, int amplitude) {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   public static VibrationEffect createWaveform(long[] timings, int repeat) {
/*  77 */     throw new RuntimeException("Stub!");
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
/*     */   public static VibrationEffect createWaveform(long[] timings, int[] amplitudes, int repeat) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 107 */   public static final Parcelable.Creator<VibrationEffect> CREATOR = null;
/*     */   public static final int DEFAULT_AMPLITUDE = -1;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\VibrationEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */