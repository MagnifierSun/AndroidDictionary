/*     */ package android.telephony;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.telephony.mbms.DownloadProgressListener;
/*     */ import android.telephony.mbms.DownloadRequest;
/*     */ import android.telephony.mbms.DownloadStatusListener;
/*     */ import android.telephony.mbms.FileInfo;
/*     */ import android.telephony.mbms.MbmsDownloadSessionCallback;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.File;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.Executor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MbmsDownloadSession
/*     */   implements AutoCloseable
/*     */ {
/*     */   public static final String DEFAULT_TOP_LEVEL_TEMP_DIRECTORY = "androidMbmsTempFileRoot";
/*     */   public static final String EXTRA_MBMS_COMPLETED_FILE_URI = "android.telephony.extra.MBMS_COMPLETED_FILE_URI";
/*     */   public static final String EXTRA_MBMS_DOWNLOAD_REQUEST = "android.telephony.extra.MBMS_DOWNLOAD_REQUEST";
/*     */   public static final String EXTRA_MBMS_DOWNLOAD_RESULT = "android.telephony.extra.MBMS_DOWNLOAD_RESULT";
/*     */   public static final String EXTRA_MBMS_FILE_INFO = "android.telephony.extra.MBMS_FILE_INFO";
/*     */   public static final int RESULT_CANCELLED = 2;
/*     */   public static final int RESULT_DOWNLOAD_FAILURE = 6;
/*     */   public static final int RESULT_EXPIRED = 3;
/*     */   public static final int RESULT_FILE_ROOT_UNREACHABLE = 8;
/*     */   public static final int RESULT_IO_ERROR = 4;
/*     */   public static final int RESULT_OUT_OF_STORAGE = 7;
/*     */   public static final int RESULT_SERVICE_ID_NOT_DEFINED = 5;
/*     */   public static final int RESULT_SUCCESSFUL = 1;
/*     */   public static final int STATUS_ACTIVELY_DOWNLOADING = 1;
/*     */   public static final int STATUS_PENDING_DOWNLOAD = 2;
/*     */   public static final int STATUS_PENDING_DOWNLOAD_WINDOW = 4;
/*     */   public static final int STATUS_PENDING_REPAIR = 3;
/*     */   public static final int STATUS_UNKNOWN = 0;
/*     */   
/*     */   MbmsDownloadSession(Context context, Executor executor, int subscriptionId, MbmsDownloadSessionCallback callback) {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   public static MbmsDownloadSession create(@RecentlyNonNull Context context, @RecentlyNonNull Executor executor, @RecentlyNonNull MbmsDownloadSessionCallback callback) {
/*  55 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public static MbmsDownloadSession create(@RecentlyNonNull Context context, @RecentlyNonNull Executor executor, int subscriptionId, @RecentlyNonNull MbmsDownloadSessionCallback callback) {
/*  91 */     throw new RuntimeException("Stub!");
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
/*     */   public void requestUpdateFileServices(@RecentlyNonNull List<String> classList) {
/* 115 */     throw new RuntimeException("Stub!");
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
/*     */   public void setTempFileRootDirectory(@RecentlyNonNull File tempFileRootDirectory) {
/* 145 */     throw new RuntimeException("Stub!");
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
/*     */   public File getTempFileRootDirectory() {
/* 158 */     throw new RuntimeException("Stub!");
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
/*     */   public void download(@RecentlyNonNull DownloadRequest request) {
/* 186 */     throw new RuntimeException("Stub!");
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
/*     */   public List<DownloadRequest> listPendingDownloads() {
/* 198 */     throw new RuntimeException("Stub!");
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
/*     */   public void addStatusListener(@RecentlyNonNull DownloadRequest request, @RecentlyNonNull Executor executor, @RecentlyNonNull DownloadStatusListener listener) {
/* 225 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeStatusListener(@RecentlyNonNull DownloadRequest request, @RecentlyNonNull DownloadStatusListener listener) {
/* 246 */     throw new RuntimeException("Stub!");
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
/*     */   public void addProgressListener(@RecentlyNonNull DownloadRequest request, @RecentlyNonNull Executor executor, @RecentlyNonNull DownloadProgressListener listener) {
/* 273 */     throw new RuntimeException("Stub!");
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
/*     */   public void removeProgressListener(@RecentlyNonNull DownloadRequest request, @RecentlyNonNull DownloadProgressListener listener) {
/* 294 */     throw new RuntimeException("Stub!");
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
/*     */   public void cancelDownload(@RecentlyNonNull DownloadRequest downloadRequest) {
/* 307 */     throw new RuntimeException("Stub!");
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
/*     */   public void requestDownloadState(DownloadRequest downloadRequest, FileInfo fileInfo) {
/* 326 */     throw new RuntimeException("Stub!");
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
/*     */   public void resetDownloadKnowledge(DownloadRequest downloadRequest) {
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
/*     */   public void close() {
/* 366 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\MbmsDownloadSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */