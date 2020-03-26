/*     */ package android.gesture;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Set;
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
/*     */ public class GestureStore
/*     */ {
/*     */   public static final int ORIENTATION_INVARIANT = 1;
/*     */   public static final int ORIENTATION_SENSITIVE = 2;
/*     */   public static final int SEQUENCE_INVARIANT = 1;
/*     */   public static final int SEQUENCE_SENSITIVE = 2;
/*     */   
/*     */   public GestureStore() {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrientationStyle(int style) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   } public int getOrientationStyle() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSequenceType(int type) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSequenceType() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<String> getGestureEntries() {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<Prediction> recognize(Gesture gesture) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addGesture(String entryName, Gesture gesture) {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeGesture(String entryName, Gesture gesture) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeEntry(String entryName) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<Gesture> getGestures(String entryName) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public boolean hasChanged() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void save(OutputStream stream) throws IOException {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   } public void save(OutputStream stream, boolean closeStream) throws IOException {
/* 115 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void load(InputStream stream) throws IOException {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public void load(InputStream stream, boolean closeStream) throws IOException {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\gesture\GestureStore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */