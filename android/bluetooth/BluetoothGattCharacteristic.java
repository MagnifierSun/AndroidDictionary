/*     */ package android.bluetooth;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.List;
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
/*     */ public class BluetoothGattCharacteristic
/*     */   implements Parcelable
/*     */ {
/*     */   public BluetoothGattCharacteristic(UUID uuid, int properties, int permissions) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addDescriptor(BluetoothGattDescriptor descriptor) {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BluetoothGattService getService() {
/*  64 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UUID getUuid() {
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
/*     */   public int getInstanceId() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getProperties() {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getPermissions() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getWriteType() {
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
/*     */   
/*     */   public void setWriteType(int writeType) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<BluetoothGattDescriptor> getDescriptors() {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BluetoothGattDescriptor getDescriptor(UUID uuid) {
/* 140 */     throw new RuntimeException("Stub!");
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
/* 153 */     throw new RuntimeException("Stub!");
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
/*     */   public Integer getIntValue(int formatType, int offset) {
/* 169 */     throw new RuntimeException("Stub!");
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
/*     */   public Float getFloatValue(int formatType, int offset) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStringValue(int offset) {
/* 191 */     throw new RuntimeException("Stub!");
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
/* 206 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean setValue(int value, int formatType, int offset) {
/* 218 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean setValue(int mantissa, int exponent, int formatType, int offset) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setValue(String value) {
/* 241 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 244 */   public static final Parcelable.Creator<BluetoothGattCharacteristic> CREATOR = null;
/*     */   public static final int FORMAT_FLOAT = 52;
/*     */   public static final int FORMAT_SFLOAT = 50;
/*     */   public static final int FORMAT_SINT16 = 34;
/*     */   public static final int FORMAT_SINT32 = 36;
/*     */   public static final int FORMAT_SINT8 = 33;
/*     */   public static final int FORMAT_UINT16 = 18;
/*     */   public static final int FORMAT_UINT32 = 20;
/*     */   public static final int FORMAT_UINT8 = 17;
/*     */   public static final int PERMISSION_READ = 1;
/*     */   public static final int PERMISSION_READ_ENCRYPTED = 2;
/*     */   public static final int PERMISSION_READ_ENCRYPTED_MITM = 4;
/*     */   public static final int PERMISSION_WRITE = 16;
/*     */   public static final int PERMISSION_WRITE_ENCRYPTED = 32;
/*     */   public static final int PERMISSION_WRITE_ENCRYPTED_MITM = 64;
/*     */   public static final int PERMISSION_WRITE_SIGNED = 128;
/*     */   public static final int PERMISSION_WRITE_SIGNED_MITM = 256;
/*     */   public static final int PROPERTY_BROADCAST = 1;
/*     */   public static final int PROPERTY_EXTENDED_PROPS = 128;
/*     */   public static final int PROPERTY_INDICATE = 32;
/*     */   public static final int PROPERTY_NOTIFY = 16;
/*     */   public static final int PROPERTY_READ = 2;
/*     */   public static final int PROPERTY_SIGNED_WRITE = 64;
/*     */   public static final int PROPERTY_WRITE = 8;
/*     */   public static final int PROPERTY_WRITE_NO_RESPONSE = 4;
/*     */   public static final int WRITE_TYPE_DEFAULT = 2;
/*     */   public static final int WRITE_TYPE_NO_RESPONSE = 1;
/*     */   public static final int WRITE_TYPE_SIGNED = 4;
/*     */   protected List<BluetoothGattDescriptor> mDescriptors;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\bluetooth\BluetoothGattCharacteristic.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */