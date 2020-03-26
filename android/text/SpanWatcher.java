package android.text;

public interface SpanWatcher extends NoCopySpan {
  void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);
  
  void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);
  
  void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}


/* Location:              M:\learn_android\android.jar!\android\text\SpanWatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */