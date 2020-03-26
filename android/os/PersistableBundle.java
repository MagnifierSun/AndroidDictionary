/*     */ package android.os;
/*     */ 
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class PersistableBundle
/*     */   extends BaseBundle
/*     */   implements Cloneable, Parcelable
/*     */ {
/*     */   public PersistableBundle() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PersistableBundle(int capacity) {
/*  46 */     throw new RuntimeException("Stub!");
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
/*     */   public PersistableBundle(PersistableBundle b) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PersistableBundle deepCopy() {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */   public void putPersistableBundle(@RecentlyNullable String key, @RecentlyNullable PersistableBundle value) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public PersistableBundle getPersistableBundle(@RecentlyNullable String key) {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void writeToParcel(Parcel parcel, int flags) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   } public synchronized String toString() {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 119 */   public static final Parcelable.Creator<PersistableBundle> CREATOR = null;
/*     */ 
/*     */   
/* 122 */   public static final PersistableBundle EMPTY = null;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\PersistableBundle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */