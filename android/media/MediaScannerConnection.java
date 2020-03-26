/*     */ package android.media;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.ServiceConnection;
/*     */ import android.net.Uri;
/*     */ import android.os.IBinder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MediaScannerConnection
/*     */   implements ServiceConnection
/*     */ {
/*     */   public MediaScannerConnection(Context context, MediaScannerConnectionClient client) {
/*  45 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void connect() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void disconnect() {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized boolean isConnected() {
/*  66 */     throw new RuntimeException("Stub!");
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
/*     */   public void scanFile(String path, String mimeType) {
/*  78 */     throw new RuntimeException("Stub!");
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
/*     */   public static void scanFile(Context context, String[] paths, String[] mimeTypes, OnScanCompletedListener callback) {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onServiceConnected(ComponentName className, IBinder service) {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onServiceDisconnected(ComponentName className) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnScanCompletedListener {
/*     */     void onScanCompleted(String param1String, Uri param1Uri);
/*     */   }
/*     */   
/*     */   public static interface MediaScannerConnectionClient extends OnScanCompletedListener {
/*     */     void onMediaScannerConnected();
/*     */     
/*     */     void onScanCompleted(String param1String, Uri param1Uri);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaScannerConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */