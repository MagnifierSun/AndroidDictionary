package android.os;

public interface Parcelable {
  public static final int CONTENTS_FILE_DESCRIPTOR = 1;
  
  public static final int PARCELABLE_WRITE_RETURN_VALUE = 1;
  
  int describeContents();
  
  void writeToParcel(Parcel paramParcel, int paramInt);
  
  public static interface Creator<T> {
    T createFromParcel(Parcel param1Parcel);
    
    T[] newArray(int param1Int);
  }
  
  public static interface ClassLoaderCreator<T> extends Creator<T> {
    T createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader);
  }
}


/* Location:              M:\learn_android\android.jar!\android\os\Parcelable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */