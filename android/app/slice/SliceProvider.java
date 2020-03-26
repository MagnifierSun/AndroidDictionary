/*     */ package android.app.slice;
/*     */ 
/*     */ import android.app.PendingIntent;
/*     */ import android.content.ContentProvider;
/*     */ import android.content.ContentValues;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.pm.ProviderInfo;
/*     */ import android.database.Cursor;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.CancellationSignal;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import java.util.Collection;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class SliceProvider
/*     */   extends ContentProvider
/*     */ {
/*     */   public static final String SLICE_TYPE = "vnd.android.slice";
/*     */   
/*     */   public SliceProvider(@RecentlyNonNull String... autoGrantPermissions) {
/*  85 */     throw new RuntimeException("Stub!");
/*     */   } public SliceProvider() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   } public void attachInfo(Context context, ProviderInfo info) {
/*  89 */     throw new RuntimeException("Stub!");
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
/*     */   public Slice onBindSlice(Uri sliceUri, Set<SliceSpec> supportedSpecs) {
/* 109 */     throw new RuntimeException("Stub!");
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
/*     */   public void onSlicePinned(Uri sliceUri) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onSliceUnpinned(Uri sliceUri) {
/* 141 */     throw new RuntimeException("Stub!");
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
/*     */   public Collection<Uri> onGetSliceDescendants(@RecentlyNonNull Uri uri) {
/* 156 */     throw new RuntimeException("Stub!");
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
/*     */   public Uri onMapIntentToUri(Intent intent) {
/* 172 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public PendingIntent onCreatePermissionRequest(Uri sliceUri) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   } public final int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
/* 192 */     throw new RuntimeException("Stub!");
/*     */   } public final int delete(Uri uri, String selection, String[] selectionArgs) {
/* 194 */     throw new RuntimeException("Stub!");
/*     */   } public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   } public final Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, CancellationSignal cancellationSignal) {
/* 198 */     throw new RuntimeException("Stub!");
/*     */   } public final Cursor query(Uri uri, String[] projection, Bundle queryArgs, CancellationSignal cancellationSignal) {
/* 200 */     throw new RuntimeException("Stub!");
/*     */   } public final Uri insert(Uri uri, ContentValues values) {
/* 202 */     throw new RuntimeException("Stub!");
/*     */   } public final String getType(Uri uri) {
/* 204 */     throw new RuntimeException("Stub!");
/*     */   } public Bundle call(String method, String arg, Bundle extras) {
/* 206 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\slice\SliceProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */