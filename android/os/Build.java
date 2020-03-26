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
/*     */ public class Build
/*     */ {
/*     */   public Build() {
/*  32 */     throw new RuntimeException("Stub!");
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
/*     */   public static String getSerial() {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getRadioVersion() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  58 */   public static final String BOARD = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  63 */   public static final String BOOTLOADER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  68 */   public static final String BRAND = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  77 */   public static final String CPU_ABI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*  86 */   public static final String CPU_ABI2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  91 */   public static final String DEVICE = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   public static final String DISPLAY = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   public static final String FINGERPRINT = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 106 */   public static final String HARDWARE = null;
/*     */ 
/*     */   
/* 109 */   public static final String HOST = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public static final String ID = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 119 */   public static final String MANUFACTURER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 124 */   public static final String MODEL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 129 */   public static final String PRODUCT = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/* 141 */   public static final String RADIO = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/* 152 */   public static final String SERIAL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 162 */   public static final String[] SUPPORTED_32_BIT_ABIS = new String[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 172 */   public static final String[] SUPPORTED_64_BIT_ABIS = new String[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 182 */   public static final String[] SUPPORTED_ABIS = new String[0];
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 187 */   public static final String TAGS = null;
/*     */ 
/*     */   
/* 190 */   public static final long TIME = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 195 */   public static final String TYPE = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String UNKNOWN = "unknown";
/*     */ 
/*     */   
/* 202 */   public static final String USER = null;
/*     */ 
/*     */   
/*     */   public static class VERSION
/*     */   {
/*     */     public VERSION() {
/* 208 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     public static final String BASE_OS = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     public static final String CODENAME = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 232 */     public static final String INCREMENTAL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 254 */     public static final int PREVIEW_SDK_INT = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 261 */     public static final String RELEASE = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/* 271 */     public static final String SDK = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 284 */     public static final int SDK_INT = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     public static final String SECURITY_PATCH = null; }
/*     */   
/*     */   public static class VERSION_CODES {
/*     */     public static final int BASE = 1;
/*     */     public static final int BASE_1_1 = 2;
/*     */     public static final int CUPCAKE = 3;
/*     */     public static final int CUR_DEVELOPMENT = 10000;
/*     */     public static final int DONUT = 4;
/*     */     public static final int ECLAIR = 5;
/*     */     public static final int ECLAIR_0_1 = 6;
/*     */     
/*     */     public VERSION_CODES() {
/* 303 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final int ECLAIR_MR1 = 7;
/*     */     public static final int FROYO = 8;
/*     */     public static final int GINGERBREAD = 9;
/*     */     public static final int GINGERBREAD_MR1 = 10;
/*     */     public static final int HONEYCOMB = 11;
/*     */     public static final int HONEYCOMB_MR1 = 12;
/*     */     public static final int HONEYCOMB_MR2 = 13;
/*     */     public static final int ICE_CREAM_SANDWICH = 14;
/*     */     public static final int ICE_CREAM_SANDWICH_MR1 = 15;
/*     */     public static final int JELLY_BEAN = 16;
/*     */     public static final int JELLY_BEAN_MR1 = 17;
/*     */     public static final int JELLY_BEAN_MR2 = 18;
/*     */     public static final int KITKAT = 19;
/*     */     public static final int KITKAT_WATCH = 20;
/*     */     public static final int LOLLIPOP = 21;
/*     */     public static final int LOLLIPOP_MR1 = 22;
/*     */     public static final int M = 23;
/*     */     public static final int N = 24;
/*     */     public static final int N_MR1 = 25;
/*     */     public static final int O = 26;
/*     */     public static final int O_MR1 = 27;
/*     */     public static final int P = 28;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\Build.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */