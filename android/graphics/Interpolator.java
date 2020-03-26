/*     */ package android.graphics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Interpolator
/*     */ {
/*     */   public Interpolator(int valueCount) {
/*  25 */     throw new RuntimeException("Stub!");
/*     */   } public Interpolator(int valueCount, int frameCount) {
/*  27 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset(int valueCount) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset(int valueCount, int frameCount) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public final int getKeyFrameCount() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   } public final int getValueCount() {
/*  47 */     throw new RuntimeException("Stub!");
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
/*     */   public void setKeyFrame(int index, int msec, float[] values) {
/*  60 */     throw new RuntimeException("Stub!");
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
/*     */   public void setKeyFrame(int index, int msec, float[] values, float[] blend) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRepeatMirror(float repeatCount, boolean mirror) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Result timeToValues(float[] values) {
/*  88 */     throw new RuntimeException("Stub!");
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
/*     */   public Result timeToValues(int msec, float[] values) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 107 */   public enum Result { NORMAL, FREEZE_START, FREEZE_END; }
/*     */ 
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\Interpolator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */