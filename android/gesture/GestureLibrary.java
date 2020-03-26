/*    */ package android.gesture;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.Set;
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
/*    */ public abstract class GestureLibrary
/*    */ {
/*    */   public abstract boolean save();
/*    */   
/*    */   protected GestureLibrary() {
/* 25 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract boolean load();
/*    */   
/*    */   public boolean isReadOnly() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public void setOrientationStyle(int style) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   } public int getOrientationStyle() {
/* 35 */     throw new RuntimeException("Stub!");
/*    */   } public void setSequenceType(int type) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   } public int getSequenceType() {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   } public Set<String> getGestureEntries() {
/* 41 */     throw new RuntimeException("Stub!");
/*    */   } public ArrayList<Prediction> recognize(Gesture gesture) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   } public void addGesture(String entryName, Gesture gesture) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   } public void removeGesture(String entryName, Gesture gesture) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   } public void removeEntry(String entryName) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   } public ArrayList<Gesture> getGestures(String entryName) {
/* 51 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/* 54 */   protected final GestureStore mStore = null;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\gesture\GestureLibrary.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */