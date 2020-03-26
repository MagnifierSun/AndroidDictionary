/*     */ package android.os;
/*     */ 
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
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
/*     */ public class DropBoxManager
/*     */ {
/*     */   public static final String ACTION_DROPBOX_ENTRY_ADDED = "android.intent.action.DROPBOX_ENTRY_ADDED";
/*     */   public static final String EXTRA_TAG = "tag";
/*     */   public static final String EXTRA_TIME = "time";
/*     */   public static final int IS_EMPTY = 1;
/*     */   public static final int IS_GZIPPED = 4;
/*     */   public static final int IS_TEXT = 2;
/*     */   
/*     */   protected DropBoxManager() {
/*  44 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addText(String tag, String data) {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addData(String tag, byte[] data, int flags) {
/*  65 */     throw new RuntimeException("Stub!");
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
/*     */   public void addFile(String tag, File file, int flags) throws IOException {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isTagEnabled(String tag) {
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
/*     */   
/*     */   @RecentlyNullable
/*     */   public Entry getNextEntry(@RecentlyNonNull String tag, long msec) {
/* 101 */     throw new RuntimeException("Stub!");
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
/*     */   public static class Entry
/*     */     implements Parcelable, Closeable
/*     */   {
/*     */     public Entry(String tag, long millis) {
/* 151 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public Entry(String tag, long millis, String text) {
/* 155 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Entry(String tag, long millis, byte[] data, int flags) {
/* 162 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Entry(String tag, long millis, ParcelFileDescriptor data, int flags) {
/* 169 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Entry(String tag, long millis, File data, int flags) throws IOException {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public void close() {
/* 180 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public String getTag() {
/* 184 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public long getTimeMillis() {
/* 188 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public int getFlags() {
/* 192 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getText(int maxBytes) {
/* 199 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public InputStream getInputStream() throws IOException {
/* 203 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 205 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel out, int flags) {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 210 */     public static final Parcelable.Creator<Entry> CREATOR = null;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\os\DropBoxManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */