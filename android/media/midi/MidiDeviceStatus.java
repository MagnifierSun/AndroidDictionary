/*    */ package android.media.midi;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ 
/*    */ 
/*    */ public final class MidiDeviceStatus
/*    */   implements Parcelable
/*    */ {
/*    */   MidiDeviceStatus(MidiDeviceInfo deviceInfo) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MidiDeviceInfo getDeviceInfo() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isInputPortOpen(int portNumber) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getOutputPortOpenCount(int portNumber) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 70 */   public static final Parcelable.Creator<MidiDeviceStatus> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\midi\MidiDeviceStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */