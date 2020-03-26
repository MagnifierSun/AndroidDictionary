package android.text;

public interface TextWatcher extends NoCopySpan {
  void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
  
  void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);
  
  void afterTextChanged(Editable paramEditable);
}


/* Location:              M:\learn_android\android.jar!\android\text\TextWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */