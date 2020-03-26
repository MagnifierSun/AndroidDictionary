/*     */ package android.content.res;
/*     */ 
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.ParcelFileDescriptor;
/*     */ import android.os.Parcelable;
/*     */ import java.io.Closeable;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
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
/*     */ public class AssetFileDescriptor
/*     */   implements Parcelable, Closeable
/*     */ {
/*     */   public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length) {
/*  43 */     throw new RuntimeException("Stub!");
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
/*     */   public AssetFileDescriptor(ParcelFileDescriptor fd, long startOffset, long length, Bundle extras) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ParcelFileDescriptor getParcelFileDescriptor() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileDescriptor getFileDescriptor() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getStartOffset() {
/*  78 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Bundle getExtras() {
/*  85 */     throw new RuntimeException("Stub!");
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
/*     */   public long getLength() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDeclaredLength() {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() throws IOException {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileInputStream createInputStream() throws IOException {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOutputStream createOutputStream() throws IOException {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel out, int flags) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/* 147 */   public static final Parcelable.Creator<AssetFileDescriptor> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long UNKNOWN_LENGTH = -1L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class AutoCloseInputStream
/*     */     extends ParcelFileDescriptor.AutoCloseInputStream
/*     */   {
/*     */     public AutoCloseInputStream(AssetFileDescriptor fd) throws IOException {
/* 165 */       super(null); throw new RuntimeException("Stub!");
/*     */     } public int available() throws IOException {
/* 167 */       throw new RuntimeException("Stub!");
/*     */     } public int read() throws IOException {
/* 169 */       throw new RuntimeException("Stub!");
/*     */     } public int read(byte[] buffer, int offset, int count) throws IOException {
/* 171 */       throw new RuntimeException("Stub!");
/*     */     } public int read(byte[] buffer) throws IOException {
/* 173 */       throw new RuntimeException("Stub!");
/*     */     } public long skip(long count) throws IOException {
/* 175 */       throw new RuntimeException("Stub!");
/*     */     } public void mark(int readlimit) {
/* 177 */       throw new RuntimeException("Stub!");
/*     */     } public boolean markSupported() {
/* 179 */       throw new RuntimeException("Stub!");
/*     */     } public synchronized void reset() throws IOException {
/* 181 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class AutoCloseOutputStream
/*     */     extends ParcelFileDescriptor.AutoCloseOutputStream
/*     */   {
/*     */     public AutoCloseOutputStream(AssetFileDescriptor fd) throws IOException {
/* 193 */       super(null); throw new RuntimeException("Stub!");
/*     */     } public void write(byte[] buffer, int offset, int count) throws IOException {
/* 195 */       throw new RuntimeException("Stub!");
/*     */     } public void write(byte[] buffer) throws IOException {
/* 197 */       throw new RuntimeException("Stub!");
/*     */     } public void write(int oneByte) throws IOException {
/* 199 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\res\AssetFileDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */