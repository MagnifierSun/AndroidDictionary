/*    */ package android.widget;
/*    */ 
/*    */ import android.database.Cursor;
/*    */ import android.database.DataSetObserver;
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
/*    */ public class AlphabetIndexer
/*    */   extends DataSetObserver
/*    */   implements SectionIndexer
/*    */ {
/*    */   protected CharSequence mAlphabet;
/*    */   protected int mColumnIndex;
/*    */   protected Cursor mDataCursor;
/*    */   
/*    */   public AlphabetIndexer(Cursor cursor, int sortedColumnIndex, CharSequence alphabet) {
/* 48 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object[] getSections() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCursor(Cursor cursor) {
/* 62 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected int compare(String word, String letter) {
/* 68 */     throw new RuntimeException("Stub!");
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
/*    */   public int getPositionForSection(int sectionIndex) {
/* 80 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getSectionForPosition(int position) {
/* 87 */     throw new RuntimeException("Stub!");
/*    */   } public void onChanged() {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   } public void onInvalidated() {
/* 91 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\widget\AlphabetIndexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */