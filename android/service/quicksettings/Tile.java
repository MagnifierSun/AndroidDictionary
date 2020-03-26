/*     */ package android.service.quicksettings;
/*     */ 
/*     */ import android.graphics.drawable.Icon;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class Tile
/*     */   implements Parcelable
/*     */ {
/*     */   Tile() {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getState() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setState(int state) {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getIcon() {
/*  64 */     throw new RuntimeException("Stub!");
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
/*     */   public void setIcon(Icon icon) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getLabel() {
/*  83 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLabel(CharSequence label) {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getContentDescription() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContentDescription(CharSequence contentDescription) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateTile() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 122 */   public static final Parcelable.Creator<Tile> CREATOR = null;
/*     */   public static final int STATE_ACTIVE = 2;
/*     */   public static final int STATE_INACTIVE = 1;
/*     */   public static final int STATE_UNAVAILABLE = 0;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\quicksettings\Tile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */