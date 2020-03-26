/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
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
/*    */ public class ExtractedText
/*    */   implements Parcelable
/*    */ {
/*    */   public ExtractedText() {
/* 32 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void writeToParcel(Parcel dest, int flags) {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 50 */   public static final Parcelable.Creator<ExtractedText> CREATOR = null;
/*    */   public static final int FLAG_SELECTING = 2;
/*    */   public static final int FLAG_SINGLE_LINE = 1;
/*    */   public int flags;
/*    */   public CharSequence hint;
/*    */   public int partialEndOffset;
/*    */   public int partialStartOffset;
/*    */   public int selectionEnd;
/*    */   public int selectionStart;
/*    */   public int startOffset;
/*    */   public CharSequence text;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\view\inputmethod\ExtractedText.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */