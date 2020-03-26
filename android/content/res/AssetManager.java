/*     */ package android.content.res;
/*     */ 
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ 
/*     */ public final class AssetManager
/*     */   implements AutoCloseable
/*     */ {
/*     */   public static final int ACCESS_BUFFER = 3;
/*     */   public static final int ACCESS_RANDOM = 1;
/*     */   public static final int ACCESS_STREAMING = 2;
/*     */   public static final int ACCESS_UNKNOWN = 0;
/*     */   
/*     */   AssetManager() {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/*  48 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public InputStream open(@RecentlyNonNull String fileName) throws IOException {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public InputStream open(@RecentlyNonNull String fileName, int accessMode) throws IOException {
/*  86 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public AssetFileDescriptor openFd(@RecentlyNonNull String fileName) throws IOException {
/* 102 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public String[] list(@RecentlyNonNull String path) throws IOException {
/* 119 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public AssetFileDescriptor openNonAssetFd(@RecentlyNonNull String fileName) throws IOException {
/* 134 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public AssetFileDescriptor openNonAssetFd(int cookie, @RecentlyNonNull String fileName) throws IOException {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public XmlResourceParser openXmlResourceParser(@RecentlyNonNull String fileName) throws IOException {
/* 161 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public XmlResourceParser openXmlResourceParser(int cookie, @RecentlyNonNull String fileName) throws IOException {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 175 */     throw new RuntimeException("Stub!");
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
/*     */   public String[] getLocales() {
/* 189 */     throw new RuntimeException("Stub!");
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
/*     */   public final class AssetInputStream
/*     */     extends InputStream
/*     */   {
/*     */     AssetInputStream(long assetNativePtr) {
/* 221 */       throw new RuntimeException("Stub!");
/*     */     } public int read() throws IOException {
/* 223 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int read(@RecentlyNonNull byte[] b) throws IOException {
/* 229 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int read(@RecentlyNonNull byte[] b, int off, int len) throws IOException {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     } public long skip(long n) throws IOException {
/* 237 */       throw new RuntimeException("Stub!");
/*     */     } public int available() throws IOException {
/* 239 */       throw new RuntimeException("Stub!");
/*     */     } public boolean markSupported() {
/* 241 */       throw new RuntimeException("Stub!");
/*     */     } public void mark(int readlimit) {
/* 243 */       throw new RuntimeException("Stub!");
/*     */     } public void reset() throws IOException {
/* 245 */       throw new RuntimeException("Stub!");
/*     */     } public void close() throws IOException {
/* 247 */       throw new RuntimeException("Stub!");
/*     */     } protected void finalize() throws Throwable {
/* 249 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\res\AssetManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */