/*     */ package android.speech.tts;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.Locale;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Voice
/*     */   implements Parcelable
/*     */ {
/*     */   public Voice(String name, Locale locale, int quality, int latency, boolean requiresNetworkConnection, Set<String> features) {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  34 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Locale getLocale() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getQuality() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getLatency() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isNetworkConnectionRequired() {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  74 */     throw new RuntimeException("Stub!");
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
/*     */   public Set<String> getFeatures() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 100 */   public static final Parcelable.Creator<Voice> CREATOR = null;
/*     */   public static final int LATENCY_HIGH = 400;
/*     */   public static final int LATENCY_LOW = 200;
/*     */   public static final int LATENCY_NORMAL = 300;
/*     */   public static final int LATENCY_VERY_HIGH = 500;
/*     */   public static final int LATENCY_VERY_LOW = 100;
/*     */   public static final int QUALITY_HIGH = 400;
/*     */   public static final int QUALITY_LOW = 200;
/*     */   public static final int QUALITY_NORMAL = 300;
/*     */   public static final int QUALITY_VERY_HIGH = 500;
/*     */   public static final int QUALITY_VERY_LOW = 100;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\speech\tts\Voice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */