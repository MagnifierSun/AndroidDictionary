/*     */ package android.graphics;
/*     */ 
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
/*     */ public class Region
/*     */   implements Parcelable
/*     */ {
/*     */   public Region() {
/*  28 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public Region(Region region) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public Region(Rect r) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public Region(int left, int top, int right, int bottom) {
/*  43 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEmpty() {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean set(Region region) {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean set(Rect r) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean set(int left, int top, int right, int bottom) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setPath(Path path, Region clip) {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean isEmpty();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean isRect();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean isComplex();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Rect getBounds() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getBounds(Rect r) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Path getBoundaryPath() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getBoundaryPath(Path path) {
/* 118 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean contains(int paramInt1, int paramInt2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean quickContains(Rect r) {
/* 133 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean quickContains(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean quickReject(Rect r) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean quickReject(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public native boolean quickReject(Region paramRegion);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void translate(int dx, int dy) {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public native void translate(int paramInt1, int paramInt2, Region paramRegion);
/*     */ 
/*     */   
/*     */   public final boolean union(Rect r) {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean op(Rect r, Op op) {
/* 188 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean op(int left, int top, int right, int bottom, Op op) {
/* 195 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean op(Region region, Op op) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean op(Rect rect, Region region, Op op) {
/* 209 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean op(Region region1, Region region2, Op op) {
/* 216 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 218 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel p, int flags) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/* 230 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 232 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 235 */   public static final Parcelable.Creator<Region> CREATOR = null;
/*     */   
/*     */   public enum Op {
/* 238 */     DIFFERENCE, INTERSECT, UNION, XOR, REVERSE_DIFFERENCE, REPLACE;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\Region.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */