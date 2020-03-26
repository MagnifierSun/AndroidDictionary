/*     */ package android.telecom;
/*     */ 
/*     */ import android.bluetooth.BluetoothDevice;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class CallAudioState
/*     */   implements Parcelable
/*     */ {
/*     */   public CallAudioState(boolean muted, int route, int supportedRouteMask) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isMuted() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getRoute() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSupportedRouteMask() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BluetoothDevice getActiveBluetoothDevice() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection<BluetoothDevice> getSupportedBluetoothDevices() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String audioRouteToString(int route) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel destination, int flags) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   public static final Parcelable.Creator<CallAudioState> CREATOR = null;
/*     */   public static final int ROUTE_BLUETOOTH = 2;
/*     */   public static final int ROUTE_EARPIECE = 1;
/*     */   public static final int ROUTE_SPEAKER = 8;
/*     */   public static final int ROUTE_WIRED_HEADSET = 4;
/*     */   public static final int ROUTE_WIRED_OR_EARPIECE = 5;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telecom\CallAudioState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */