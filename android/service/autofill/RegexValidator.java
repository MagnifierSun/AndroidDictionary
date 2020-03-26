/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.view.autofill.AutofillId;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.regex.Pattern;
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
/*    */ public final class RegexValidator
/*    */   implements Validator, Parcelable
/*    */ {
/*    */   public RegexValidator(@RecentlyNonNull AutofillId id, @RecentlyNonNull Pattern regex) {
/* 42 */     throw new RuntimeException("Stub!");
/*    */   } public String toString() {
/* 44 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 46 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel parcel, int flags) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 51 */   public static final Parcelable.Creator<RegexValidator> CREATOR = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\RegexValidator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */