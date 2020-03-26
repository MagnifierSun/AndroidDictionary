/*      */ package android.content;
/*      */ 
/*      */ import android.accounts.Account;
/*      */ import android.content.res.AssetFileDescriptor;
/*      */ import android.database.ContentObserver;
/*      */ import android.database.Cursor;
/*      */ import android.net.Uri;
/*      */ import android.os.Bundle;
/*      */ import android.os.CancellationSignal;
/*      */ import android.os.ParcelFileDescriptor;
/*      */ import android.os.RemoteException;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ import java.io.FileNotFoundException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public abstract class ContentResolver
/*      */ {
/*      */   public static final String ANY_CURSOR_ITEM_TYPE = "vnd.android.cursor.item/*";
/*      */   public static final String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
/*      */   public static final String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
/*      */   public static final String EXTRA_HONORED_ARGS = "android.content.extra.HONORED_ARGS";
/*      */   public static final String EXTRA_REFRESH_SUPPORTED = "android.content.extra.REFRESH_SUPPORTED";
/*      */   public static final String EXTRA_SIZE = "android.content.extra.SIZE";
/*      */   public static final String EXTRA_TOTAL_COUNT = "android.content.extra.TOTAL_COUNT";
/*      */   public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = 2;
/*      */   public static final int NOTIFY_SYNC_TO_NETWORK = 1;
/*      */   public static final String QUERY_ARG_LIMIT = "android:query-arg-limit";
/*      */   public static final String QUERY_ARG_OFFSET = "android:query-arg-offset";
/*      */   public static final String QUERY_ARG_SORT_COLLATION = "android:query-arg-sort-collation";
/*      */   public static final String QUERY_ARG_SORT_COLUMNS = "android:query-arg-sort-columns";
/*      */   public static final String QUERY_ARG_SORT_DIRECTION = "android:query-arg-sort-direction";
/*      */   public static final String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
/*      */   public static final String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
/*      */   public static final String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
/*      */   public static final int QUERY_SORT_DIRECTION_ASCENDING = 0;
/*      */   
/*      */   public ContentResolver(Context context) {
/*   52 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */   public static final int QUERY_SORT_DIRECTION_DESCENDING = 1; public static final String SCHEME_ANDROID_RESOURCE = "android.resource"; public static final String SCHEME_CONTENT = "content"; public static final String SCHEME_FILE = "file"; @Deprecated
/*      */   public static final String SYNC_EXTRAS_ACCOUNT = "account"; public static final String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions"; public static final String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry"; public static final String SYNC_EXTRAS_EXPEDITED = "expedited"; @Deprecated
/*      */   public static final String SYNC_EXTRAS_FORCE = "force"; public static final String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff"; public static final String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings"; public static final String SYNC_EXTRAS_INITIALIZE = "initialize"; public static final String SYNC_EXTRAS_MANUAL = "force"; public static final String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override"; public static final String SYNC_EXTRAS_REQUIRE_CHARGING = "require_charging"; public static final String SYNC_EXTRAS_UPLOAD = "upload";
/*      */   public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
/*      */   public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
/*      */   public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
/*      */   
/*      */   @RecentlyNullable
/*      */   public final String getType(@RecentlyNonNull Uri url) {
/*   63 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public String[] getStreamTypes(@RecentlyNonNull Uri url, @RecentlyNonNull String mimeTypeFilter) {
/*   85 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Cursor query(@RecentlyNonNull Uri uri, @RecentlyNullable String[] projection, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs, @RecentlyNullable String sortOrder) {
/*  123 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Cursor query(@RecentlyNonNull Uri uri, @RecentlyNullable String[] projection, @RecentlyNullable String selection, @RecentlyNullable String[] selectionArgs, @RecentlyNullable String sortOrder, @RecentlyNullable CancellationSignal cancellationSignal) {
/*  166 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Cursor query(@RecentlyNonNull Uri uri, @RecentlyNullable String[] projection, @RecentlyNullable Bundle queryArgs, @RecentlyNullable CancellationSignal cancellationSignal) {
/*  200 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Uri canonicalize(@RecentlyNonNull Uri url) {
/*  234 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Uri uncanonicalize(@RecentlyNonNull Uri url) {
/*  256 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean refresh(@RecentlyNonNull Uri url, @RecentlyNullable Bundle args, @RecentlyNullable CancellationSignal cancellationSignal) {
/*  278 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final InputStream openInputStream(@RecentlyNonNull Uri uri) throws FileNotFoundException {
/*  302 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final OutputStream openOutputStream(@RecentlyNonNull Uri uri) throws FileNotFoundException {
/*  313 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final OutputStream openOutputStream(@RecentlyNonNull Uri uri, @RecentlyNonNull String mode) throws FileNotFoundException {
/*  338 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ParcelFileDescriptor openFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mode) throws FileNotFoundException {
/*  381 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ParcelFileDescriptor openFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mode, @RecentlyNullable CancellationSignal cancellationSignal) throws FileNotFoundException {
/*  427 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final AssetFileDescriptor openAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mode) throws FileNotFoundException {
/*  481 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final AssetFileDescriptor openAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mode, @RecentlyNullable CancellationSignal cancellationSignal) throws FileNotFoundException {
/*  538 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final AssetFileDescriptor openTypedAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mimeType, @RecentlyNullable Bundle opts) throws FileNotFoundException {
/*  573 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final AssetFileDescriptor openTypedAssetFileDescriptor(@RecentlyNonNull Uri uri, @RecentlyNonNull String mimeType, @RecentlyNullable Bundle opts, @RecentlyNullable CancellationSignal cancellationSignal) throws FileNotFoundException {
/*  611 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Uri insert(@RecentlyNonNull Uri url, @RecentlyNullable ContentValues values) {
/*  628 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public ContentProviderResult[] applyBatch(@RecentlyNonNull String authority, @RecentlyNonNull ArrayList<ContentProviderOperation> operations) throws OperationApplicationException, RemoteException {
/*  650 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int bulkInsert(@RecentlyNonNull Uri url, @RecentlyNonNull ContentValues[] values) {
/*  665 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int delete(@RecentlyNonNull Uri url, @RecentlyNullable String where, @RecentlyNullable String[] selectionArgs) {
/*  681 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int update(@RecentlyNonNull Uri uri, @RecentlyNullable ContentValues values, @RecentlyNullable String where, @RecentlyNullable String[] selectionArgs) {
/*  701 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final Bundle call(@RecentlyNonNull Uri uri, @RecentlyNonNull String method, @RecentlyNullable String arg, @RecentlyNullable Bundle extras) {
/*  722 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ContentProviderClient acquireContentProviderClient(@RecentlyNonNull Uri uri) {
/*  737 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ContentProviderClient acquireContentProviderClient(@RecentlyNonNull String name) {
/*  752 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ContentProviderClient acquireUnstableContentProviderClient(@RecentlyNonNull Uri uri) {
/*  774 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public final ContentProviderClient acquireUnstableContentProviderClient(@RecentlyNonNull String name) {
/*  796 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void registerContentObserver(@RecentlyNonNull Uri uri, boolean notifyForDescendants, @RecentlyNonNull ContentObserver observer) {
/*  819 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void unregisterContentObserver(@RecentlyNonNull ContentObserver observer) {
/*  829 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void notifyChange(@RecentlyNonNull Uri uri, @RecentlyNullable ContentObserver observer) {
/*  853 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void notifyChange(@RecentlyNonNull Uri uri, @RecentlyNullable ContentObserver observer, boolean syncToNetwork) {
/*  882 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void notifyChange(@RecentlyNonNull Uri uri, @RecentlyNullable ContentObserver observer, int flags) {
/*  912 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void takePersistableUriPermission(@RecentlyNonNull Uri uri, int modeFlags) {
/*  929 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void releasePersistableUriPermission(@RecentlyNonNull Uri uri, int modeFlags) {
/*  944 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public List<UriPermission> getPersistedUriPermissions() {
/*  959 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public List<UriPermission> getOutgoingPersistedUriPermissions() {
/*  971 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void startSync(Uri uri, Bundle extras) {
/*  994 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void requestSync(Account account, String authority, Bundle extras) {
/* 1016 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void requestSync(SyncRequest request) {
/* 1023 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void validateSyncExtrasBundle(Bundle extras) {
/* 1040 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public void cancelSync(Uri uri) {
/* 1050 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cancelSync(Account account, String authority) {
/* 1061 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static SyncAdapterType[] getSyncAdapterTypes() {
/* 1068 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean getSyncAutomatically(Account account, String authority) {
/* 1080 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setSyncAutomatically(Account account, String authority, boolean sync) {
/* 1092 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void addPeriodicSync(Account account, String authority, Bundle extras, long pollFrequency) {
/* 1128 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void removePeriodicSync(Account account, String authority, Bundle extras) {
/* 1141 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void cancelSync(SyncRequest request) {
/* 1157 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List<PeriodicSync> getPeriodicSyncs(Account account, String authority) {
/* 1169 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int getIsSyncable(Account account, String authority) {
/* 1178 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setIsSyncable(Account account, String authority, int syncable) {
/* 1187 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean getMasterSyncAutomatically() {
/* 1198 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setMasterSyncAutomatically(boolean sync) {
/* 1209 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSyncActive(Account account, String authority) {
/* 1221 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static SyncInfo getCurrentSync() {
/* 1237 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List<SyncInfo> getCurrentSyncs() {
/* 1249 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSyncPending(Account account, String authority) {
/* 1260 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object addStatusChangeListener(int mask, SyncStatusObserver callback) {
/* 1277 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void removeStatusChangeListener(Object handle) {
/* 1284 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\content\ContentResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */