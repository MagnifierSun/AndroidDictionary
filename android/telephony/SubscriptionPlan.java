/*     */ package android.telephony;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.Range;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.time.Period;
/*     */ import java.time.ZonedDateTime;
/*     */ import java.util.Iterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class SubscriptionPlan
/*     */   implements Parcelable
/*     */ {
/*     */   public static final long BYTES_UNKNOWN = -1L;
/*     */   public static final long BYTES_UNLIMITED = 9223372036854775807L;
/*     */   
/*     */   SubscriptionPlan(Parcel source) {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public CharSequence getTitle() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public CharSequence getSummary() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDataLimitBytes() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDataLimitBehavior() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDataUsageBytes() {
/*  90 */     throw new RuntimeException("Stub!");
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
/*     */   public long getDataUsageTime() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Iterator<Range<ZonedDateTime>> cycleIterator() {
/* 110 */     throw new RuntimeException("Stub!");
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
/* 121 */   public static final Parcelable.Creator<SubscriptionPlan> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int LIMIT_BEHAVIOR_BILLED = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int LIMIT_BEHAVIOR_DISABLED = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int LIMIT_BEHAVIOR_THROTTLED = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int LIMIT_BEHAVIOR_UNKNOWN = -1;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long TIME_UNKNOWN = -1L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Builder
/*     */   {
/*     */     Builder(ZonedDateTime start, ZonedDateTime end, Period period) {
/* 151 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static Builder createNonrecurring(ZonedDateTime start, ZonedDateTime end) {
/* 161 */       throw new RuntimeException("Stub!");
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
/*     */     public static Builder createRecurring(ZonedDateTime start, Period period) {
/* 178 */       throw new RuntimeException("Stub!");
/*     */     } public SubscriptionPlan build() {
/* 180 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setTitle(@RecentlyNullable CharSequence title) {
/* 187 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Builder setSummary(@RecentlyNullable CharSequence summary) {
/* 194 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setDataLimit(long dataLimitBytes, int dataLimitBehavior) {
/* 208 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setDataUsage(long dataUsageBytes, long dataUsageTime) {
/* 221 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\SubscriptionPlan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */