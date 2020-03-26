/*     */ package android.app.slice;
/*     */ 
/*     */ import android.app.PendingIntent;
/*     */ import android.app.RemoteInput;
/*     */ import android.graphics.drawable.Icon;
/*     */ import android.os.Bundle;
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
/*     */ public final class SliceItem
/*     */   implements Parcelable
/*     */ {
/*     */   SliceItem(Parcel in) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public List<String> getHints() {
/*  62 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFormat() {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSubType() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public CharSequence getText() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Bundle getBundle() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Icon getIcon() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public PendingIntent getAction() {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public RemoteInput getRemoteInput() {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInt() {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Slice getSlice() {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getLong() {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasHint(String hint) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 153 */   public static final Parcelable.Creator<SliceItem> CREATOR = null;
/*     */   public static final String FORMAT_ACTION = "action";
/*     */   public static final String FORMAT_BUNDLE = "bundle";
/*     */   public static final String FORMAT_IMAGE = "image";
/*     */   public static final String FORMAT_INT = "int";
/*     */   public static final String FORMAT_LONG = "long";
/*     */   public static final String FORMAT_REMOTE_INPUT = "input";
/*     */   public static final String FORMAT_SLICE = "slice";
/*     */   public static final String FORMAT_TEXT = "text";
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\slice\SliceItem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */