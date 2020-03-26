/*     */ package android.content.pm;
/*     */ 
/*     */ import android.os.Parcel;
/*     */ import android.util.Printer;
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
/*     */ public class ComponentInfo
/*     */   extends PackageItemInfo
/*     */ {
/*     */   public ApplicationInfo applicationInfo;
/*     */   public int descriptionRes;
/*     */   
/*     */   public ComponentInfo() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   } public ComponentInfo(ComponentInfo orig) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   } protected ComponentInfo(Parcel source) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEnabled() {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getIconResource() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getLogoResource() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getBannerResource() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } protected void dumpFront(Printer pw, String prefix) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } protected void dumpBack(Printer pw, String prefix) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int parcelableFlags) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public boolean directBootAware = false;
/*     */   public boolean enabled = true;
/*     */   public boolean exported = false;
/*     */   public String processName;
/*     */   public String splitName;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\ComponentInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */