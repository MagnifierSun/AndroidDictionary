/*     */ package android.renderscript;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Sampler
/*     */   extends BaseObj
/*     */ {
/*     */   Sampler(long id, RenderScript rs) {
/*  35 */     super(0L, null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Value getMinification() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Value getMagnification() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Value getWrapS() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Value getWrapT() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float getAnisotropy() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler CLAMP_NEAREST(RenderScript rs) {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler CLAMP_LINEAR(RenderScript rs) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler CLAMP_LINEAR_MIP_LINEAR(RenderScript rs) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler WRAP_NEAREST(RenderScript rs) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler WRAP_LINEAR(RenderScript rs) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler WRAP_LINEAR_MIP_LINEAR(RenderScript rs) {
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
/*     */   public static Sampler MIRRORED_REPEAT_NEAREST(RenderScript rs) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler MIRRORED_REPEAT_LINEAR(RenderScript rs) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Sampler MIRRORED_REPEAT_LINEAR_MIP_LINEAR(RenderScript rs) {
/* 164 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(RenderScript rs) {
/* 173 */       throw new RuntimeException("Stub!");
/*     */     } public void setMinification(Sampler.Value v) {
/* 175 */       throw new RuntimeException("Stub!");
/*     */     } public void setMagnification(Sampler.Value v) {
/* 177 */       throw new RuntimeException("Stub!");
/*     */     } public void setWrapS(Sampler.Value v) {
/* 179 */       throw new RuntimeException("Stub!");
/*     */     } public void setWrapT(Sampler.Value v) {
/* 181 */       throw new RuntimeException("Stub!");
/*     */     } public void setAnisotropy(float v) {
/* 183 */       throw new RuntimeException("Stub!");
/*     */     } public Sampler create() {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public enum Value {
/* 190 */     NEAREST, LINEAR, LINEAR_MIP_LINEAR, LINEAR_MIP_NEAREST, WRAP, CLAMP, MIRRORED_REPEAT;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\renderscript\Sampler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */