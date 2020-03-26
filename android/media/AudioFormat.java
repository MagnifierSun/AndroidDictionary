/*     */ package android.media;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class AudioFormat
/*     */   implements Parcelable
/*     */ {
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_DEFAULT = 1;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_INVALID = 0;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_MONO = 2;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_CONFIGURATION_STEREO = 3;
/*     */   public static final int CHANNEL_INVALID = 0;
/*     */   public static final int CHANNEL_IN_BACK = 32;
/*     */   public static final int CHANNEL_IN_BACK_PROCESSED = 512;
/*     */   public static final int CHANNEL_IN_DEFAULT = 1;
/*     */   public static final int CHANNEL_IN_FRONT = 16;
/*     */   public static final int CHANNEL_IN_FRONT_PROCESSED = 256;
/*     */   public static final int CHANNEL_IN_LEFT = 4;
/*     */   public static final int CHANNEL_IN_LEFT_PROCESSED = 64;
/*     */   public static final int CHANNEL_IN_MONO = 16;
/*     */   public static final int CHANNEL_IN_PRESSURE = 1024;
/*     */   public static final int CHANNEL_IN_RIGHT = 8;
/*     */   public static final int CHANNEL_IN_RIGHT_PROCESSED = 128;
/*     */   public static final int CHANNEL_IN_STEREO = 12;
/*     */   public static final int CHANNEL_IN_VOICE_DNLINK = 32768;
/*     */   public static final int CHANNEL_IN_VOICE_UPLINK = 16384;
/*     */   public static final int CHANNEL_IN_X_AXIS = 2048;
/*     */   public static final int CHANNEL_IN_Y_AXIS = 4096;
/*     */   public static final int CHANNEL_IN_Z_AXIS = 8192;
/*     */   public static final int CHANNEL_OUT_5POINT1 = 252;
/*     */   @Deprecated
/*     */   public static final int CHANNEL_OUT_7POINT1 = 1020;
/*     */   public static final int CHANNEL_OUT_7POINT1_SURROUND = 6396;
/*     */   public static final int CHANNEL_OUT_BACK_CENTER = 1024;
/*     */   public static final int CHANNEL_OUT_BACK_LEFT = 64;
/*     */   public static final int CHANNEL_OUT_BACK_RIGHT = 128;
/*     */   public static final int CHANNEL_OUT_DEFAULT = 1;
/*     */   public static final int CHANNEL_OUT_FRONT_CENTER = 16;
/*     */   public static final int CHANNEL_OUT_FRONT_LEFT = 4;
/*     */   public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = 256;
/*     */   public static final int CHANNEL_OUT_FRONT_RIGHT = 8;
/*     */   public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = 512;
/*     */   public static final int CHANNEL_OUT_LOW_FREQUENCY = 32;
/*     */   public static final int CHANNEL_OUT_MONO = 4;
/*     */   public static final int CHANNEL_OUT_QUAD = 204;
/*     */   public static final int CHANNEL_OUT_SIDE_LEFT = 2048;
/*     */   public static final int CHANNEL_OUT_SIDE_RIGHT = 4096;
/*     */   public static final int CHANNEL_OUT_STEREO = 12;
/*     */   public static final int CHANNEL_OUT_SURROUND = 1052;
/*     */   
/*     */   AudioFormat() {
/* 213 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEncoding() {
/* 223 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSampleRate() {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChannelMask() {
/* 242 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChannelIndexMask() {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getChannelCount() {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 263 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 265 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 267 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 269 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 271 */     throw new RuntimeException("Stub!");
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
/* 370 */   public static final Parcelable.Creator<AudioFormat> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AAC_ELD = 15;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AAC_HE_V1 = 11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AAC_HE_V2 = 12;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AAC_LC = 10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AAC_XHE = 16;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AC3 = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_AC4 = 17;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_DEFAULT = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_DOLBY_TRUEHD = 14;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_DTS = 7;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_DTS_HD = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_E_AC3 = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_E_AC3_JOC = 18;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_IEC61937 = 13;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_INVALID = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_MP3 = 9;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_PCM_16BIT = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_PCM_8BIT = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int ENCODING_PCM_FLOAT = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int SAMPLE_RATE_UNSPECIFIED = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     public Builder() {
/* 489 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder(AudioFormat af) {
/* 496 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public AudioFormat build() {
/* 504 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setEncoding(int encoding) throws IllegalArgumentException {
/* 514 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setChannelMask(int channelMask) {
/* 551 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setChannelIndexMask(int channelIndexMask) {
/* 595 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setSampleRate(int sampleRate) throws IllegalArgumentException {
/* 604 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\AudioFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */