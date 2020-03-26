/*     */ package android.media;
/*     */ 
/*     */ import android.util.Pair;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class MicrophoneInfo
/*     */ {
/*     */   public static final int CHANNEL_MAPPING_DIRECT = 1;
/*     */   public static final int CHANNEL_MAPPING_PROCESSED = 2;
/*     */   public static final int DIRECTIONALITY_BI_DIRECTIONAL = 2;
/*     */   public static final int DIRECTIONALITY_CARDIOID = 3;
/*     */   public static final int DIRECTIONALITY_HYPER_CARDIOID = 4;
/*     */   public static final int DIRECTIONALITY_OMNI = 1;
/*     */   public static final int DIRECTIONALITY_SUPER_CARDIOID = 5;
/*     */   public static final int DIRECTIONALITY_UNKNOWN = 0;
/*     */   public static final int GROUP_UNKNOWN = -1;
/*     */   public static final int INDEX_IN_THE_GROUP_UNKNOWN = -1;
/*     */   public static final int LOCATION_MAINBODY = 1;
/*     */   public static final int LOCATION_MAINBODY_MOVABLE = 2;
/*     */   public static final int LOCATION_PERIPHERAL = 3;
/*     */   public static final int LOCATION_UNKNOWN = 0;
/*     */   
/*     */   MicrophoneInfo(String deviceId, int type, String address, int location, int group, int indexInTheGroup, Coordinate3F position, Coordinate3F orientation, List<Pair<Float, Float>> frequencyResponse, List<Pair<Integer, Integer>> channelMapping, float sensitivity, float maxSpl, float minSpl, int directionality) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescription() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getId() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public String getAddress() {
/*  68 */     throw new RuntimeException("Stub!");
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
/*     */   public int getLocation() {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getGroup() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getIndexInTheGroup() {
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
/*     */   public Coordinate3F getPosition() {
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
/*     */   public Coordinate3F getOrientation() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Pair<Float, Float>> getFrequencyResponse() {
/* 130 */     throw new RuntimeException("Stub!");
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
/*     */   public List<Pair<Integer, Integer>> getChannelMapping() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getSensitivity() {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMaxSpl() {
/* 162 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getMinSpl() {
/* 170 */     throw new RuntimeException("Stub!");
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
/*     */   public int getDirectionality() {
/* 183 */     throw new RuntimeException("Stub!");
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
/* 274 */   public static final Coordinate3F ORIENTATION_UNKNOWN = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 281 */   public static final Coordinate3F POSITION_UNKNOWN = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float SENSITIVITY_UNKNOWN = -3.4028235E38F;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float SPL_UNKNOWN = -3.4028235E38F;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Coordinate3F
/*     */   {
/*     */     Coordinate3F(float x, float y, float z) {
/* 298 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object obj) {
/* 300 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 303 */     public final float x = 0.0F;
/*     */ 
/*     */     
/* 306 */     public final float y = 0.0F;
/*     */ 
/*     */     
/* 309 */     public final float z = 0.0F;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\MicrophoneInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */