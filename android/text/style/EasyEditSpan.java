/*    */ package android.text.style;
/*    */ 
/*    */ import android.app.PendingIntent;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import androidx.annotation.RecentlyNonNull;
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
/*    */ public class EasyEditSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public static final String EXTRA_TEXT_CHANGED_TYPE = "android.text.style.EXTRA_TEXT_CHANGED_TYPE";
/*    */   public static final int TEXT_DELETED = 1;
/*    */   public static final int TEXT_MODIFIED = 2;
/*    */   
/*    */   public EasyEditSpan() {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EasyEditSpan(PendingIntent pendingIntent) {
/* 50 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EasyEditSpan(@RecentlyNonNull Parcel source) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public int getSpanTypeId() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\EasyEditSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */