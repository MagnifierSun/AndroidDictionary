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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Element
/*     */   extends BaseObj
/*     */ {
/*     */   Element(long id, RenderScript rs) {
/*  59 */     super(0L, null); throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getBytesSize() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getVectorSize() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isComplex() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSubElementCount() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Element getSubElement(int index) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubElementName(int index) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSubElementArraySize(int index) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSubElementOffsetBytes(int index) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DataType getDataType() {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public DataKind getDataKind() {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Element BOOLEAN(RenderScript rs) {
/* 151 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Element U8(RenderScript rs) {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Element I8(RenderScript rs) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U16(RenderScript rs) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I16(RenderScript rs) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U32(RenderScript rs) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I32(RenderScript rs) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U64(RenderScript rs) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I64(RenderScript rs) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F16(RenderScript rs) {
/* 185 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F32(RenderScript rs) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F64(RenderScript rs) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   } public static Element ELEMENT(RenderScript rs) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   } public static Element TYPE(RenderScript rs) {
/* 193 */     throw new RuntimeException("Stub!");
/*     */   } public static Element ALLOCATION(RenderScript rs) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   } public static Element SAMPLER(RenderScript rs) {
/* 197 */     throw new RuntimeException("Stub!");
/*     */   } public static Element SCRIPT(RenderScript rs) {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   } public static Element MESH(RenderScript rs) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   } public static Element PROGRAM_FRAGMENT(RenderScript rs) {
/* 203 */     throw new RuntimeException("Stub!");
/*     */   } public static Element PROGRAM_VERTEX(RenderScript rs) {
/* 205 */     throw new RuntimeException("Stub!");
/*     */   } public static Element PROGRAM_RASTER(RenderScript rs) {
/* 207 */     throw new RuntimeException("Stub!");
/*     */   } public static Element PROGRAM_STORE(RenderScript rs) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   } public static Element FONT(RenderScript rs) {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   } public static Element A_8(RenderScript rs) {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   } public static Element RGB_565(RenderScript rs) {
/* 215 */     throw new RuntimeException("Stub!");
/*     */   } public static Element RGB_888(RenderScript rs) {
/* 217 */     throw new RuntimeException("Stub!");
/*     */   } public static Element RGBA_5551(RenderScript rs) {
/* 219 */     throw new RuntimeException("Stub!");
/*     */   } public static Element RGBA_4444(RenderScript rs) {
/* 221 */     throw new RuntimeException("Stub!");
/*     */   } public static Element RGBA_8888(RenderScript rs) {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F16_2(RenderScript rs) {
/* 225 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F16_3(RenderScript rs) {
/* 227 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F16_4(RenderScript rs) {
/* 229 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F32_2(RenderScript rs) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F32_3(RenderScript rs) {
/* 233 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F32_4(RenderScript rs) {
/* 235 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F64_2(RenderScript rs) {
/* 237 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F64_3(RenderScript rs) {
/* 239 */     throw new RuntimeException("Stub!");
/*     */   } public static Element F64_4(RenderScript rs) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U8_2(RenderScript rs) {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U8_3(RenderScript rs) {
/* 245 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U8_4(RenderScript rs) {
/* 247 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I8_2(RenderScript rs) {
/* 249 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I8_3(RenderScript rs) {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I8_4(RenderScript rs) {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U16_2(RenderScript rs) {
/* 255 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U16_3(RenderScript rs) {
/* 257 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U16_4(RenderScript rs) {
/* 259 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I16_2(RenderScript rs) {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I16_3(RenderScript rs) {
/* 263 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I16_4(RenderScript rs) {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U32_2(RenderScript rs) {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U32_3(RenderScript rs) {
/* 269 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U32_4(RenderScript rs) {
/* 271 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I32_2(RenderScript rs) {
/* 273 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I32_3(RenderScript rs) {
/* 275 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I32_4(RenderScript rs) {
/* 277 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U64_2(RenderScript rs) {
/* 279 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U64_3(RenderScript rs) {
/* 281 */     throw new RuntimeException("Stub!");
/*     */   } public static Element U64_4(RenderScript rs) {
/* 283 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I64_2(RenderScript rs) {
/* 285 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I64_3(RenderScript rs) {
/* 287 */     throw new RuntimeException("Stub!");
/*     */   } public static Element I64_4(RenderScript rs) {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   } public static Element YUV(RenderScript rs) {
/* 291 */     throw new RuntimeException("Stub!");
/*     */   } public static Element MATRIX_4X4(RenderScript rs) {
/* 293 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static Element MATRIX4X4(RenderScript rs) {
/* 298 */     throw new RuntimeException("Stub!");
/*     */   } public static Element MATRIX_3X3(RenderScript rs) {
/* 300 */     throw new RuntimeException("Stub!");
/*     */   } public static Element MATRIX_2X2(RenderScript rs) {
/* 302 */     throw new RuntimeException("Stub!");
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
/*     */   public static Element createVector(RenderScript rs, DataType dt, int size) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Element createPixel(RenderScript rs, DataType dt, DataKind dk) {
/* 333 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean isCompatible(Element e) {
/* 347 */     throw new RuntimeException("Stub!");
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
/*     */   public static class Builder
/*     */   {
/*     */     public Builder(RenderScript rs) {
/* 364 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder add(Element element, String name, int arraySize) {
/* 374 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder add(Element element, String name) {
/* 383 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Element create() {
/* 392 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum DataKind
/*     */   {
/* 404 */     USER, PIXEL_L, PIXEL_A, PIXEL_LA, PIXEL_RGB, PIXEL_RGBA, PIXEL_DEPTH, PIXEL_YUV;
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
/*     */   public enum DataType
/*     */   {
/* 427 */     NONE, FLOAT_16, FLOAT_32, FLOAT_64, SIGNED_8, SIGNED_16, SIGNED_32, SIGNED_64, UNSIGNED_8, UNSIGNED_16, UNSIGNED_32, UNSIGNED_64, BOOLEAN, UNSIGNED_5_6_5, UNSIGNED_5_5_5_1, UNSIGNED_4_4_4_4, MATRIX_4X4, MATRIX_3X3, MATRIX_2X2, RS_ELEMENT, RS_TYPE, RS_ALLOCATION, RS_SAMPLER, RS_SCRIPT, RS_MESH, RS_PROGRAM_FRAGMENT, RS_PROGRAM_VERTEX, RS_PROGRAM_RASTER, RS_PROGRAM_STORE, RS_FONT;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\renderscript\Element.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */