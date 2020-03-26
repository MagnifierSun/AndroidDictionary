/*     */ package android.content.pm;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.List;
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
/*     */ public final class SharedLibraryInfo
/*     */   implements Parcelable
/*     */ {
/*     */   SharedLibraryInfo(Parcel parcel) {
/*  31 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getType() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/*  50 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public int getVersion() {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public long getLongVersion() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public VersionedPackage getDeclaringPackage() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public List<VersionedPackage> getDependentPackages() {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 100 */   public static final Parcelable.Creator<SharedLibraryInfo> CREATOR = null;
/*     */   public static final int TYPE_BUILTIN = 0;
/*     */   public static final int TYPE_DYNAMIC = 1;
/*     */   public static final int TYPE_STATIC = 2;
/*     */   public static final int VERSION_UNDEFINED = -1;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\SharedLibraryInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */