/*    */ package android.location;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class GnssMeasurementsEvent
/*    */   implements Parcelable
/*    */ {
/*    */   GnssMeasurementsEvent(GnssClock clock, GnssMeasurement[] measurements) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public GnssClock getClock() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public Collection<GnssMeasurement> getMeasurements() {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 56 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 59 */   public static final Parcelable.Creator<GnssMeasurementsEvent> CREATOR = null;
/*    */ 
/*    */   
/*    */   public static abstract class Callback
/*    */   {
/*    */     public static final int STATUS_LOCATION_DISABLED = 2;
/*    */     public static final int STATUS_NOT_ALLOWED = 3;
/*    */     public static final int STATUS_NOT_SUPPORTED = 0;
/*    */     public static final int STATUS_READY = 1;
/*    */     
/*    */     public Callback() {
/* 70 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void onGnssMeasurementsReceived(GnssMeasurementsEvent eventArgs) {
/* 76 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public void onStatusChanged(int status) {
/* 84 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\location\GnssMeasurementsEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */