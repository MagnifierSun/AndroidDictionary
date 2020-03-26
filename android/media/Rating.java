/*     */ package android.media;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Rating
/*     */   implements Parcelable
/*     */ {
/*     */   Rating(int ratingStyle, float rating) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  39 */     throw new RuntimeException("Stub!");
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
/*     */   public static Rating newUnratedRating(int ratingStyle) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Rating newHeartRating(boolean hasHeart) {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Rating newThumbRating(boolean thumbIsUp) {
/*  72 */     throw new RuntimeException("Stub!");
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
/*     */   public static Rating newStarRating(int starRatingStyle, float starRating) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Rating newPercentageRating(float percent) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isRated() {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRatingStyle() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasHeart() {
/* 124 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isThumbUp() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getStarRating() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getPercentRating() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 151 */   public static final Parcelable.Creator<Rating> CREATOR = null;
/*     */   public static final int RATING_3_STARS = 3;
/*     */   public static final int RATING_4_STARS = 4;
/*     */   public static final int RATING_5_STARS = 5;
/*     */   public static final int RATING_HEART = 1;
/*     */   public static final int RATING_NONE = 0;
/*     */   public static final int RATING_PERCENTAGE = 6;
/*     */   public static final int RATING_THUMB_UP_DOWN = 2;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\Rating.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */