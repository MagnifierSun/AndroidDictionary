package android.text.style;

import android.graphics.Paint;
import android.text.TextPaint;

public interface LineHeightSpan extends ParagraphStyle, WrapTogetherSpan {
  void chooseHeight(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint.FontMetricsInt paramFontMetricsInt);
  
  public static interface WithDensity extends LineHeightSpan {
    void chooseHeight(CharSequence param1CharSequence, int param1Int1, int param1Int2, int param1Int3, int param1Int4, Paint.FontMetricsInt param1FontMetricsInt, TextPaint param1TextPaint);
  }
}


/* Location:              M:\learn_android\android.jar!\android\text\style\LineHeightSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */