package android.accounts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public interface AccountManagerFuture<V> {
  boolean cancel(boolean paramBoolean);
  
  boolean isCancelled();
  
  boolean isDone();
  
  V getResult() throws AuthenticatorException, IOException, OperationCanceledException;
  
  V getResult(long paramLong, TimeUnit paramTimeUnit) throws AuthenticatorException, IOException, OperationCanceledException;
}


/* Location:              M:\learn_android\android.jar!\android\accounts\AccountManagerFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */