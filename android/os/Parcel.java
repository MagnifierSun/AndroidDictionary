/*      */ package android.os;
/*      */ 
/*      */ import android.util.Size;
/*      */ import android.util.SizeF;
/*      */ import android.util.SparseArray;
/*      */ import android.util.SparseBooleanArray;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ import java.io.FileDescriptor;
/*      */ import java.io.Serializable;
/*      */ import java.util.ArrayList;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class Parcel
/*      */ {
/*      */   Parcel(long nativePtr) {
/*  179 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public static Parcel obtain() {
/*  185 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void recycle() {
/*  192 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int dataSize() {
/*  198 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int dataAvail() {
/*  205 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int dataPosition() {
/*  212 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int dataCapacity() {
/*  221 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataSize(int size) {
/*  231 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataPosition(int pos) {
/*  239 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataCapacity(int size) {
/*  249 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public byte[] marshall() {
/*  263 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void unmarshall(byte[] data, int offset, int length) {
/*  269 */     throw new RuntimeException("Stub!");
/*      */   } public void appendFrom(Parcel parcel, int offset, int length) {
/*  271 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasFileDescriptors() {
/*  277 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeInterfaceToken(String interfaceName) {
/*  285 */     throw new RuntimeException("Stub!");
/*      */   } public void enforceInterface(String interfaceName) {
/*  287 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeByteArray(byte[] b) {
/*  295 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeByteArray(byte[] b, int offset, int len) {
/*  305 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeInt(int val) {
/*  312 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeLong(long val) {
/*  319 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeFloat(float val) {
/*  326 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeDouble(double val) {
/*  333 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeString(String val) {
/*  340 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeStrongBinder(IBinder val) {
/*  347 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeStrongInterface(IInterface val) {
/*  354 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeFileDescriptor(FileDescriptor val) {
/*  367 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeByte(byte val) {
/*  374 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeMap(Map val) {
/*  388 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeBundle(Bundle val) {
/*  395 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writePersistableBundle(PersistableBundle val) {
/*  402 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeSize(Size val) {
/*  409 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeSizeF(SizeF val) {
/*  416 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeList(List val) {
/*  424 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeArray(Object[] val) {
/*  432 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeSparseArray(SparseArray<Object> val) {
/*  441 */     throw new RuntimeException("Stub!");
/*      */   } public void writeSparseBooleanArray(SparseBooleanArray val) {
/*  443 */     throw new RuntimeException("Stub!");
/*      */   }
/*  445 */   public void writeBooleanArray(boolean[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public boolean[] createBooleanArray() {
/*  447 */     throw new RuntimeException("Stub!");
/*      */   } public void readBooleanArray(boolean[] val) {
/*  449 */     throw new RuntimeException("Stub!");
/*      */   }
/*  451 */   public void writeCharArray(char[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public char[] createCharArray() {
/*  453 */     throw new RuntimeException("Stub!");
/*      */   } public void readCharArray(char[] val) {
/*  455 */     throw new RuntimeException("Stub!");
/*      */   }
/*  457 */   public void writeIntArray(int[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public int[] createIntArray() {
/*  459 */     throw new RuntimeException("Stub!");
/*      */   } public void readIntArray(int[] val) {
/*  461 */     throw new RuntimeException("Stub!");
/*      */   }
/*  463 */   public void writeLongArray(long[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public long[] createLongArray() {
/*  465 */     throw new RuntimeException("Stub!");
/*      */   } public void readLongArray(long[] val) {
/*  467 */     throw new RuntimeException("Stub!");
/*      */   }
/*  469 */   public void writeFloatArray(float[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public float[] createFloatArray() {
/*  471 */     throw new RuntimeException("Stub!");
/*      */   } public void readFloatArray(float[] val) {
/*  473 */     throw new RuntimeException("Stub!");
/*      */   }
/*  475 */   public void writeDoubleArray(double[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public double[] createDoubleArray() {
/*  477 */     throw new RuntimeException("Stub!");
/*      */   } public void readDoubleArray(double[] val) {
/*  479 */     throw new RuntimeException("Stub!");
/*      */   }
/*  481 */   public void writeStringArray(String[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public String[] createStringArray() {
/*  483 */     throw new RuntimeException("Stub!");
/*      */   } public void readStringArray(String[] val) {
/*  485 */     throw new RuntimeException("Stub!");
/*      */   }
/*  487 */   public void writeBinderArray(IBinder[] val) { throw new RuntimeException("Stub!"); } @RecentlyNullable
/*      */   public IBinder[] createBinderArray() {
/*  489 */     throw new RuntimeException("Stub!");
/*      */   } public void readBinderArray(IBinder[] val) {
/*  491 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Parcelable> void writeTypedList(List<T> val) {
/*  508 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeStringList(List<String> val) {
/*  522 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeBinderList(List<IBinder> val) {
/*  536 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Parcelable> void writeTypedArray(T[] val, int parcelableFlags) {
/*  557 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Parcelable> void writeTypedObject(T val, int parcelableFlags) {
/*  569 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeValue(Object v) {
/*  615 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeParcelable(Parcelable p, int parcelableFlags) {
/*  626 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeSerializable(Serializable s) {
/*  635 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeException(Exception e) {
/*  662 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void writeNoException() {
/*  672 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readException() {
/*  684 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readException(int code, String msg) {
/*  694 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public int readInt() {
/*  700 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public long readLong() {
/*  706 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public float readFloat() {
/*  713 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public double readDouble() {
/*  720 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public String readString() {
/*  726 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public IBinder readStrongBinder() {
/*  732 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public ParcelFileDescriptor readFileDescriptor() {
/*  738 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public byte readByte() {
/*  744 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readMap(Map outVal, ClassLoader loader) {
/*  752 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readList(List outVal, ClassLoader loader) {
/*  760 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public HashMap readHashMap(@RecentlyNullable ClassLoader loader) {
/*  770 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Bundle readBundle() {
/*  778 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Bundle readBundle(@RecentlyNullable ClassLoader loader) {
/*  787 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public PersistableBundle readPersistableBundle() {
/*  795 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public PersistableBundle readPersistableBundle(@RecentlyNullable ClassLoader loader) {
/*  804 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public Size readSize() {
/*  810 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public SizeF readSizeF() {
/*  816 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public byte[] createByteArray() {
/*  822 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readByteArray(byte[] val) {
/*  829 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public ArrayList readArrayList(@RecentlyNullable ClassLoader loader) {
/*  838 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Object[] readArray(@RecentlyNullable ClassLoader loader) {
/*  847 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public SparseArray readSparseArray(@RecentlyNullable ClassLoader loader) {
/*  856 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public SparseBooleanArray readSparseBooleanArray() {
/*  864 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public <T> ArrayList<T> createTypedArrayList(@RecentlyNonNull Parcelable.Creator<T> c) {
/*  880 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T> void readTypedList(List<T> list, Parcelable.Creator<T> c) {
/*  895 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public ArrayList<String> createStringArrayList() {
/*  909 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public ArrayList<IBinder> createBinderArrayList() {
/*  923 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readStringList(List<String> list) {
/*  932 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void readBinderList(List<IBinder> list) {
/*  941 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public <T> T[] createTypedArray(@RecentlyNonNull Parcelable.Creator<T> c) {
/*  956 */     throw new RuntimeException("Stub!");
/*      */   } public <T> void readTypedArray(T[] val, Parcelable.Creator<T> c) {
/*  958 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public <T> T readTypedObject(@RecentlyNonNull Parcelable.Creator<T> c) {
/*  972 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public <T extends Parcelable> void writeParcelableArray(T[] value, int parcelableFlags) {
/*  988 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Object readValue(@RecentlyNullable ClassLoader loader) {
/*  996 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public <T extends Parcelable> T readParcelable(@RecentlyNullable ClassLoader loader) {
/* 1010 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Parcelable[] readParcelableArray(@RecentlyNullable ClassLoader loader) {
/* 1019 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public Serializable readSerializable() {
/* 1027 */     throw new RuntimeException("Stub!");
/*      */   } protected void finalize() throws Throwable {
/* 1029 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */   
/* 1032 */   public static final Parcelable.Creator<String> STRING_CREATOR = null;
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\os\Parcel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */