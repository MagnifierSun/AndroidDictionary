package android.icu.util;

public interface Freezable<T> extends Cloneable {
  boolean isFrozen();
  
  T freeze();
  
  T cloneAsThawed();
}


/* Location:              M:\learn_android\android.jar!\android\ic\\util\Freezable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */