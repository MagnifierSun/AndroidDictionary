/*     */ package android.content;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.PersistableBundle;
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
/*     */ 
/*     */ public class ClipDescription
/*     */   implements Parcelable
/*     */ {
/*     */   public ClipDescription(CharSequence label, String[] mimeTypes) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ClipDescription(ClipDescription o) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean compareMimeTypes(String concreteType, String desiredType) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getTimestamp() {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getLabel() {
/*  76 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasMimeType(String mimeType) {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] filterMimeTypes(String mimeType) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMimeTypeCount() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMimeType(int index) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PersistableBundle getExtras() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExtras(PersistableBundle extras) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 137 */   public static final Parcelable.Creator<ClipDescription> CREATOR = null;
/*     */   public static final String MIMETYPE_TEXT_HTML = "text/html";
/*     */   public static final String MIMETYPE_TEXT_INTENT = "text/vnd.android.intent";
/*     */   public static final String MIMETYPE_TEXT_PLAIN = "text/plain";
/*     */   public static final String MIMETYPE_TEXT_URILIST = "text/uri-list";
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\ClipDescription.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */