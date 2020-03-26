/*     */ package android.service.notification;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.net.Uri;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
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
/*     */ public final class Condition
/*     */   implements Parcelable
/*     */ {
/*     */   public Condition(Uri id, String summary, int state) {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   } public Condition(Uri id, String summary, String line1, String line2, int icon, int state, int flags) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   } public Condition(Parcel source) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   } public static String stateToString(int state) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   } public static String relevanceToString(int flags) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   } public Condition copy() {
/*  56 */     throw new RuntimeException("Stub!");
/*     */   } public static Uri.Builder newId(Context context) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   } public static boolean isValidId(Uri id, String pkg) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  63 */   public static final Parcelable.Creator<Condition> CREATOR = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int FLAG_RELEVANT_ALWAYS = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int FLAG_RELEVANT_NOW = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String SCHEME = "condition";
/*     */ 
/*     */   
/*     */   public static final int STATE_ERROR = 3;
/*     */ 
/*     */   
/*     */   public static final int STATE_FALSE = 0;
/*     */ 
/*     */   
/*     */   public static final int STATE_TRUE = 1;
/*     */ 
/*     */   
/*     */   public static final int STATE_UNKNOWN = 2;
/*     */ 
/*     */   
/*  90 */   public final int flags = 0;
/*     */ 
/*     */   
/*  93 */   public final int icon = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 101 */   public final Uri id = null;
/*     */ 
/*     */   
/* 104 */   public final String line1 = null;
/*     */ 
/*     */   
/* 107 */   public final String line2 = null;
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
/* 118 */   public final int state = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 126 */   public final String summary = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\notification\Condition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */