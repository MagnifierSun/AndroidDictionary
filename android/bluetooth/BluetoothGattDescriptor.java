/*     */ package android.bluetooth;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BluetoothGattDescriptor
/*     */   implements Parcelable
/*     */ {
/*     */   public BluetoothGattDescriptor(UUID uuid, int permissions) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BluetoothGattCharacteristic getCharacteristic() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UUID getUuid() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPermissions() {
/*  69 */     throw new RuntimeException("Stub!");
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
/*     */   public byte[] getValue() {
/*  82 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean setValue(byte[] value) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 100 */   public static final Parcelable.Creator<BluetoothGattDescriptor> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 107 */   public static final byte[] DISABLE_NOTIFICATION_VALUE = new byte[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public static final byte[] ENABLE_INDICATION_VALUE = new byte[0];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 121 */   public static final byte[] ENABLE_NOTIFICATION_VALUE = new byte[0];
/*     */   public static final int PERMISSION_READ = 1;
/*     */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*     */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*     */   public static final int PERMISSION_WRITE = 16;
/*     */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*     */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*     */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*     */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothGattDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */