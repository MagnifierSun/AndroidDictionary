/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.text.Layout;
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
/*    */ public interface AlignmentSpan
/*    */   extends ParagraphStyle
/*    */ {
/*    */   Layout.Alignment getAlignment();
/*    */   
/*    */   public static class Standard
/*    */     implements AlignmentSpan, ParcelableSpan
/*    */   {
/*    */     public Standard(@RecentlyNonNull Layout.Alignment align) {
/* 65 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     public Standard(@RecentlyNonNull Parcel src) {
/* 73 */       throw new RuntimeException("Stub!");
/*    */     } public int getSpanTypeId() {
/* 75 */       throw new RuntimeException("Stub!");
/*    */     } public int describeContents() {
/* 77 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/*    */     public void writeToParcel(@RecentlyNonNull Parcel dest, int flags) {
/* 83 */       throw new RuntimeException("Stub!");
/*    */     } public Layout.Alignment getAlignment() {
/* 85 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\AlignmentSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */