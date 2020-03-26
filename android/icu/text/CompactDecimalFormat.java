/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.CurrencyAmount;
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.ParsePosition;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CompactDecimalFormat
/*    */   extends DecimalFormat
/*    */ {
/*    */   CompactDecimalFormat(ULocale locale, CompactStyle style) {
/* 54 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static CompactDecimalFormat getInstance(ULocale locale, CompactStyle style) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static CompactDecimalFormat getInstance(Locale locale, CompactStyle style) {
/* 74 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Number parse(String text, ParsePosition parsePosition) {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CurrencyAmount parseCurrency(CharSequence text, ParsePosition parsePosition) {
/* 86 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public enum CompactStyle
/*    */   {
/* 93 */     SHORT, LONG;
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\icu\text\CompactDecimalFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */