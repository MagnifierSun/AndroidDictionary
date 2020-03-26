/*     */ package android.provider;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.content.Context;
/*     */ import android.content.IntentSender;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.Point;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.CancellationSignal;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.FileNotFoundException;
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
/*     */ public final class DocumentsContract
/*     */ {
/*     */   public static final String ACTION_DOCUMENT_SETTINGS = "android.provider.action.DOCUMENT_SETTINGS";
/*     */   public static final String EXTRA_ERROR = "error";
/*     */   public static final String EXTRA_EXCLUDE_SELF = "android.provider.extra.EXCLUDE_SELF";
/*     */   public static final String EXTRA_INFO = "info";
/*     */   public static final String EXTRA_INITIAL_URI = "android.provider.extra.INITIAL_URI";
/*     */   public static final String EXTRA_LOADING = "loading";
/*     */   public static final String EXTRA_ORIENTATION = "android.provider.extra.ORIENTATION";
/*     */   public static final String EXTRA_PROMPT = "android.provider.extra.PROMPT";
/*     */   public static final String PROVIDER_INTERFACE = "android.content.action.DOCUMENTS_PROVIDER";
/*     */   
/*     */   DocumentsContract() {
/*  58 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri buildRootsUri(String authority) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri buildRootUri(String authority, String rootId) {
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
/*     */   public static Uri buildRecentDocumentsUri(String authority, String rootId) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri buildTreeDocumentUri(String authority, String documentId) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri buildDocumentUri(String authority, String documentId) {
/* 108 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri buildDocumentUriUsingTree(Uri treeUri, String documentId) {
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
/*     */   public static Uri buildChildDocumentsUri(String authority, String parentDocumentId) {
/* 148 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri buildChildDocumentsUriUsingTree(Uri treeUri, String parentDocumentId) {
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
/*     */   public static Uri buildSearchDocumentsUri(String authority, String rootId, String query) {
/* 187 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean isDocumentUri(Context context, @RecentlyNullable Uri uri) {
/* 199 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isTreeUri(Uri uri) {
/* 208 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getRootId(Uri rootUri) {
/* 214 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getDocumentId(Uri documentUri) {
/* 222 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getTreeDocumentId(Uri documentUri) {
/* 228 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getSearchDocumentsQuery(Uri searchDocumentsUri) {
/* 235 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bitmap getDocumentThumbnail(ContentResolver resolver, Uri documentUri, Point size, CancellationSignal signal) throws FileNotFoundException {
/* 253 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri createDocument(ContentResolver resolver, Uri parentDocumentUri, String mimeType, String displayName) throws FileNotFoundException {
/* 264 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri renameDocument(ContentResolver resolver, Uri documentUri, String displayName) throws FileNotFoundException {
/* 280 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean deleteDocument(ContentResolver resolver, Uri documentUri) throws FileNotFoundException {
/* 289 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Uri copyDocument(ContentResolver resolver, Uri sourceDocumentUri, Uri targetParentDocumentUri) throws FileNotFoundException {
/* 300 */     throw new RuntimeException("Stub!");
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
/*     */   public static Uri moveDocument(ContentResolver resolver, Uri sourceDocumentUri, Uri sourceParentDocumentUri, Uri targetParentDocumentUri) throws FileNotFoundException {
/* 312 */     throw new RuntimeException("Stub!");
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
/*     */   public static boolean removeDocument(ContentResolver resolver, Uri documentUri, Uri parentDocumentUri) throws FileNotFoundException {
/* 325 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void ejectRoot(ContentResolver resolver, Uri rootUri) {
/* 333 */     throw new RuntimeException("Stub!");
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
/*     */   public static Path findDocumentPath(ContentResolver resolver, Uri treeUri) throws FileNotFoundException {
/* 349 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static IntentSender createWebLinkIntent(ContentResolver resolver, Uri uri, Bundle options) throws FileNotFoundException {
/* 403 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Document
/*     */   {
/*     */     public static final String COLUMN_DISPLAY_NAME = "_display_name";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_DOCUMENT_ID = "document_id";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_FLAGS = "flags";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_ICON = "icon";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_LAST_MODIFIED = "last_modified";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_MIME_TYPE = "mime_type";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_SIZE = "_size";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String COLUMN_SUMMARY = "summary";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_DIR_PREFERS_GRID = 16;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_DIR_PREFERS_LAST_MODIFIED = 32;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_DIR_SUPPORTS_CREATE = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_COPY = 128;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_DELETE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_MOVE = 256;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_REMOVE = 1024;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_RENAME = 64;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_SETTINGS = 2048;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_THUMBNAIL = 1;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_SUPPORTS_WRITE = 2;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_VIRTUAL_DOCUMENT = 512;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int FLAG_WEB_LINKABLE = 4096;
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String MIME_TYPE_DIR = "vnd.android.document/directory";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Document() {
/* 517 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Path
/*     */     implements Parcelable
/*     */   {
/*     */     public Path(@RecentlyNullable String rootId, List<String> path) {
/* 793 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public String getRootId() {
/* 800 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public List<String> getPath() {
/* 808 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object o) {
/* 810 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 812 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 814 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 816 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 818 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 821 */     public static final Parcelable.Creator<Path> CREATOR = null;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class Root
/*     */   {
/*     */     public static final String COLUMN_AVAILABLE_BYTES = "available_bytes";
/*     */     public static final String COLUMN_CAPACITY_BYTES = "capacity_bytes";
/*     */     public static final String COLUMN_DOCUMENT_ID = "document_id";
/*     */     public static final String COLUMN_FLAGS = "flags";
/*     */     public static final String COLUMN_ICON = "icon";
/*     */     public static final String COLUMN_MIME_TYPES = "mime_types";
/*     */     public static final String COLUMN_ROOT_ID = "root_id";
/*     */     public static final String COLUMN_SUMMARY = "summary";
/*     */     
/*     */     Root() {
/* 837 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public static final String COLUMN_TITLE = "title";
/*     */     public static final int FLAG_LOCAL_ONLY = 2;
/*     */     public static final int FLAG_SUPPORTS_CREATE = 1;
/*     */     public static final int FLAG_SUPPORTS_EJECT = 32;
/*     */     public static final int FLAG_SUPPORTS_IS_CHILD = 16;
/*     */     public static final int FLAG_SUPPORTS_RECENTS = 4;
/*     */     public static final int FLAG_SUPPORTS_SEARCH = 8;
/*     */     public static final String MIME_TYPE_ITEM = "vnd.android.document/root";
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\provider\DocumentsContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */