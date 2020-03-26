package android.os;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.io.FileDescriptor;

public interface IBinder {
  public static final int DUMP_TRANSACTION = 1598311760;
  
  public static final int FIRST_CALL_TRANSACTION = 1;
  
  public static final int FLAG_ONEWAY = 1;
  
  public static final int INTERFACE_TRANSACTION = 1598968902;
  
  public static final int LAST_CALL_TRANSACTION = 16777215;
  
  public static final int LIKE_TRANSACTION = 1598835019;
  
  public static final int PING_TRANSACTION = 1599098439;
  
  public static final int TWEET_TRANSACTION = 1599362900;
  
  @RecentlyNullable
  String getInterfaceDescriptor() throws RemoteException;
  
  boolean pingBinder();
  
  boolean isBinderAlive();
  
  @RecentlyNullable
  IInterface queryLocalInterface(@RecentlyNonNull String paramString);
  
  void dump(@RecentlyNonNull FileDescriptor paramFileDescriptor, @RecentlyNullable String[] paramArrayOfString) throws RemoteException;
  
  void dumpAsync(@RecentlyNonNull FileDescriptor paramFileDescriptor, @RecentlyNullable String[] paramArrayOfString) throws RemoteException;
  
  boolean transact(int paramInt1, @RecentlyNonNull Parcel paramParcel1, @RecentlyNullable Parcel paramParcel2, int paramInt2) throws RemoteException;
  
  void linkToDeath(@RecentlyNonNull DeathRecipient paramDeathRecipient, int paramInt) throws RemoteException;
  
  boolean unlinkToDeath(@RecentlyNonNull DeathRecipient paramDeathRecipient, int paramInt);
  
  public static interface DeathRecipient {
    void binderDied();
  }
}


/* Location:              M:\learn_android\android.jar!\android\os\IBinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */