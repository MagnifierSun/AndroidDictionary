package android.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface TargetApi {
  int value();
}


/* Location:              M:\learn_android\android.jar!\android\annotation\TargetApi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */