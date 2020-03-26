/*     */ package android.media;
/*     */ 
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AudioDeviceInfo
/*     */ {
/*     */   public static final int TYPE_AUX_LINE = 19;
/*     */   public static final int TYPE_BLUETOOTH_A2DP = 8;
/*     */   public static final int TYPE_BLUETOOTH_SCO = 7;
/*     */   public static final int TYPE_BUILTIN_EARPIECE = 1;
/*     */   public static final int TYPE_BUILTIN_MIC = 15;
/*     */   public static final int TYPE_BUILTIN_SPEAKER = 2;
/*     */   public static final int TYPE_BUS = 21;
/*     */   public static final int TYPE_DOCK = 13;
/*     */   public static final int TYPE_FM = 14;
/*     */   public static final int TYPE_FM_TUNER = 16;
/*     */   public static final int TYPE_HDMI = 9;
/*     */   public static final int TYPE_HDMI_ARC = 10;
/*     */   
/*     */   AudioDeviceInfo() {
/*  28 */     throw new RuntimeException("Stub!");
/*     */   } public static final int TYPE_HEARING_AID = 23; public static final int TYPE_IP = 20; public static final int TYPE_LINE_ANALOG = 5; public static final int TYPE_LINE_DIGITAL = 6; public static final int TYPE_TELEPHONY = 18; public static final int TYPE_TV_TUNER = 17; public static final int TYPE_UNKNOWN = 0; public static final int TYPE_USB_ACCESSORY = 12; public static final int TYPE_USB_DEVICE = 11; public static final int TYPE_USB_HEADSET = 22; public static final int TYPE_WIRED_HEADPHONES = 4; public static final int TYPE_WIRED_HEADSET = 3; public boolean equals(Object o) {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getProductName() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String getAddress() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSource() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSink() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public int[] getSampleRates() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public int[] getChannelMasks() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public int[] getChannelIndexMasks() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public int[] getChannelCounts() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public int[] getEncodings() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\AudioDeviceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */