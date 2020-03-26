/*     */ package android.content;
/*     */ 
/*     */ import android.content.res.AssetFileDescriptor;
/*     */ import android.database.Cursor;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.CancellationSignal;
/*     */ import android.os.ParcelFileDescriptor;
/*     */ import android.os.RemoteException;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.FileNotFoundException;
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
/*     */ public class ContentProviderClient
/*     */   implements AutoCloseable
/*     */ {
/*     */   ContentProviderClient() {
/*  45 */     throw new RuntimeException("Stub!");
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
/*     */   public Cursor query(@RecentlyNonNull Uri url, @RecentlyNullable String[] projection, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs, @RecentlyNullable String sortOrder) throws RemoteException {
/*  57 */     throw new RuntimeException("Stub!");
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
/*     */   public Cursor query(@RecentlyNonNull Uri uri, @RecentlyNullable String[] projection, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs, @RecentlyNullable String sortOrder, @RecentlyNullable CancellationSignal cancellationSignal) throws RemoteException {
/*  70 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Cursor query(@RecentlyNonNull Uri uri, @RecentlyNullable String[] projection, Bundle queryArgs, @RecentlyNullable CancellationSignal cancellationSignal) throws RemoteException {
/*  80 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getType(@RecentlyNonNull Uri url) throws RemoteException {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String[] getStreamTypes(@RecentlyNonNull Uri url, @RecentlyNonNull String mimeTypeFilter) throws RemoteException {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final Uri canonicalize(@RecentlyNonNull Uri url) throws RemoteException {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final Uri uncanonicalize(@RecentlyNonNull Uri url) throws RemoteException {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean refresh(Uri url, @RecentlyNullable Bundle args, @RecentlyNullable CancellationSignal cancellationSignal) throws RemoteException {
/* 122 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Uri insert(@RecentlyNonNull Uri url, @RecentlyNullable ContentValues initialValues) throws RemoteException {
/* 131 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int bulkInsert(@RecentlyNonNull Uri url, @RecentlyNonNull ContentValues[] initialValues) throws RemoteException {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int delete(@RecentlyNonNull Uri url, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs) throws RemoteException {
/* 151 */     throw new RuntimeException("Stub!");
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
/*     */   public int update(@RecentlyNonNull Uri url, @RecentlyNullable ContentValues values, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs) throws RemoteException {
/* 164 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public ParcelFileDescriptor openFile(@RecentlyNonNull Uri url, @RecentlyNonNull String mode) throws FileNotFoundException, RemoteException {
/* 178 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public ParcelFileDescriptor openFile(@RecentlyNonNull Uri url, @RecentlyNonNull String mode, @RecentlyNullable CancellationSignal signal) throws FileNotFoundException, RemoteException {
/* 193 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public AssetFileDescriptor openAssetFile(@RecentlyNonNull Uri url, @RecentlyNonNull String mode) throws FileNotFoundException, RemoteException {
/* 207 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public AssetFileDescriptor openAssetFile(@RecentlyNonNull Uri url, @RecentlyNonNull String mode, @RecentlyNullable CancellationSignal signal) throws FileNotFoundException, RemoteException {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final AssetFileDescriptor openTypedAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mimeType, @RecentlyNullable Bundle opts) throws FileNotFoundException, RemoteException {
/* 232 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public final AssetFileDescriptor openTypedAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mimeType, @RecentlyNullable Bundle opts, @RecentlyNullable CancellationSignal signal) throws FileNotFoundException, RemoteException {
/* 243 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public ContentProviderResult[] applyBatch(@RecentlyNonNull ArrayList<ContentProviderOperation> operations) throws OperationApplicationException, RemoteException {
/* 251 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Bundle call(@RecentlyNonNull String method, @RecentlyNullable String arg, @RecentlyNullable Bundle extras) throws RemoteException {
/* 261 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 268 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public boolean release() {
/* 274 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 276 */     throw new RuntimeException("Stub!");
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
/*     */   public ContentProvider getLocalContentProvider() {
/* 288 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\ContentProviderClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */