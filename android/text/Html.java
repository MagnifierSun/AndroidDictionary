/*    */ package android.text;
/*    */ 
/*    */ import android.graphics.drawable.Drawable;
/*    */ import org.xml.sax.XMLReader;
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
/*    */ public class Html
/*    */ {
/*    */   public static final int FROM_HTML_MODE_COMPACT = 63;
/*    */   public static final int FROM_HTML_MODE_LEGACY = 0;
/*    */   public static final int FROM_HTML_OPTION_USE_CSS_COLORS = 256;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_BLOCKQUOTE = 32;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_DIV = 16;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_HEADING = 2;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST = 8;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_LIST_ITEM = 4;
/*    */   public static final int FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH = 1;
/*    */   public static final int TO_HTML_PARAGRAPH_LINES_CONSECUTIVE = 0;
/*    */   public static final int TO_HTML_PARAGRAPH_LINES_INDIVIDUAL = 1;
/*    */   
/*    */   Html() {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static Spanned fromHtml(String source) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Spanned fromHtml(String source, int flags) {
/* 52 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static Spanned fromHtml(String source, ImageGetter imageGetter, TagHandler tagHandler) {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Spanned fromHtml(String source, int flags, ImageGetter imageGetter, TagHandler tagHandler) {
/* 72 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   
/*    */   @Deprecated
/*    */   public static String toHtml(Spanned text) {
/* 78 */     throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public static String toHtml(Spanned text, int option) {
/* 91 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static String escapeHtml(CharSequence text) {
/* 97 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface TagHandler {
/*    */     void handleTag(boolean param1Boolean, String param1String, Editable param1Editable, XMLReader param1XMLReader);
/*    */   }
/*    */   
/*    */   public static interface ImageGetter {
/*    */     Drawable getDrawable(String param1String);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\Html.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */