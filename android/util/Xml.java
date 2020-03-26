/*     */ package android.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.Reader;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import org.xml.sax.ContentHandler;
/*     */ import org.xml.sax.SAXException;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlSerializer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Xml
/*     */ {
/*     */   Xml() {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void parse(String xml, ContentHandler contentHandler) throws SAXException {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void parse(Reader in, ContentHandler contentHandler) throws IOException, SAXException {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void parse(InputStream in, Encoding encoding, ContentHandler contentHandler) throws IOException, SAXException {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static XmlPullParser newPullParser() {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static XmlSerializer newSerializer() {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static Encoding findEncodingByName(String encodingName) throws UnsupportedEncodingException {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AttributeSet asAttributeSet(XmlPullParser parser) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  97 */   public static String FEATURE_RELAXED = "http://xmlpull.org/v1/doc/features.html#relaxed";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Encoding
/*     */   {
/* 104 */     US_ASCII, UTF_8, UTF_16, ISO_8859_1;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\androi\\util\Xml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */