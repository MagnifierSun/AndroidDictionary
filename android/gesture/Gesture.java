/*     */ package android.gesture;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Path;
/*     */ import android.graphics.RectF;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import java.util.ArrayList;
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
/*     */ public class Gesture
/*     */   implements Parcelable
/*     */ {
/*     */   public Gesture() {
/*  30 */     throw new RuntimeException("Stub!");
/*     */   } public Object clone() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList<GestureStroke> getStrokes() {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getStrokesCount() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addStroke(GestureStroke stroke) {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public float getLength() {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RectF getBoundingBox() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   } public Path toPath() {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   } public Path toPath(Path path) {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public Path toPath(int width, int height, int edge, int numSample) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public Path toPath(Path path, int width, int height, int edge, int numSample) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getID() {
/*  81 */     throw new RuntimeException("Stub!");
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
/*     */   public Bitmap toBitmap(int width, int height, int edge, int numSample, int color) {
/*  94 */     throw new RuntimeException("Stub!");
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
/*     */   public Bitmap toBitmap(int width, int height, int inset, int color) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 113 */   public static final Parcelable.Creator<Gesture> CREATOR = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\gesture\Gesture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */