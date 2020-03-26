package android.view.textclassifier;

import androidx.annotation.RecentlyNonNull;

public interface TextClassificationSessionFactory {
  @RecentlyNonNull
  TextClassifier createTextClassificationSession(@RecentlyNonNull TextClassificationContext paramTextClassificationContext);
}


/* Location:              M:\learn_android\android.jar!\android\view\textclassifier\TextClassificationSessionFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */