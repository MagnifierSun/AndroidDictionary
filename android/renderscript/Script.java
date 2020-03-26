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
/*     */ public class Script
/*     */   extends BaseObj
/*     */ {
/*     */   Script(long id, RenderScript rs) {
/*  29 */     super(0L, null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected KernelID createKernelID(int slot, int sig, Element ein, Element eout) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected InvokeID createInvokeID(int slot) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected FieldID createFieldID(int slot, Element e) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void invoke(int slot) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void invoke(int slot, FieldPacker v) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void forEach(int slot, Allocation ain, Allocation aout, FieldPacker v, LaunchOptions sc) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void forEach(int slot, Allocation[] ains, Allocation aout, FieldPacker v, LaunchOptions sc) {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void reduce(int slot, Allocation[] ains, Allocation aout, LaunchOptions sc) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindAllocation(Allocation va, int slot) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, float v) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public float getVarF(int index) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, double v) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public double getVarD(int index) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, int v) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public int getVarI(int index) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, long v) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   } public long getVarJ(int index) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, boolean v) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public boolean getVarB(int index) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, BaseObj o) {
/* 153 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, FieldPacker v) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVar(int index, FieldPacker v, Element e, int[] dims) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void getVarV(int index, FieldPacker v) {
/* 174 */     throw new RuntimeException("Stub!");
/*     */   } public void setTimeZone(String timeZone) {
/* 176 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     Builder(RenderScript rs) {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class FieldBase
/*     */   {
/*     */     protected Allocation mAllocation;
/*     */     protected Element mElement;
/*     */     
/*     */     protected FieldBase() {
/* 196 */       throw new RuntimeException("Stub!");
/*     */     } protected void init(RenderScript rs, int dimx) {
/* 198 */       throw new RuntimeException("Stub!");
/*     */     } protected void init(RenderScript rs, int dimx, int usages) {
/* 200 */       throw new RuntimeException("Stub!");
/*     */     } public Element getElement() {
/* 202 */       throw new RuntimeException("Stub!");
/*     */     } public Type getType() {
/* 204 */       throw new RuntimeException("Stub!");
/*     */     } public Allocation getAllocation() {
/* 206 */       throw new RuntimeException("Stub!");
/*     */     } public void updateAllocation() {
/* 208 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static final class FieldID
/*     */     extends BaseObj
/*     */   {
/*     */     FieldID(long id, RenderScript rs, Script s, int slot) {
/* 227 */       super(0L, null); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class InvokeID
/*     */     extends BaseObj
/*     */   {
/*     */     InvokeID(long id, RenderScript rs, Script s, int slot) {
/* 242 */       super(0L, null); throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class KernelID
/*     */     extends BaseObj
/*     */   {
/*     */     KernelID(long id, RenderScript rs, Script s, int slot, int sig) {
/* 257 */       super(0L, null); throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static final class LaunchOptions
/*     */   {
/*     */     public LaunchOptions() {
/* 285 */       throw new RuntimeException("Stub!");
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
/*     */     public LaunchOptions setX(int xstartArg, int xendArg) {
/* 297 */       throw new RuntimeException("Stub!");
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
/*     */     public LaunchOptions setY(int ystartArg, int yendArg) {
/* 309 */       throw new RuntimeException("Stub!");
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
/*     */     public LaunchOptions setZ(int zstartArg, int zendArg) {
/* 321 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getXStart() {
/* 329 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getXEnd() {
/* 337 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getYStart() {
/* 345 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getYEnd() {
/* 353 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getZStart() {
/* 361 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getZEnd() {
/* 369 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\renderscript\Script.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */