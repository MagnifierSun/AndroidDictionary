/*     */ package android.media;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Looper;
/*     */ import android.view.KeyEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public final class RemoteController
/*     */ {
/*     */   public static final int POSITION_SYNCHRONIZATION_CHECK = 1;
/*     */   public static final int POSITION_SYNCHRONIZATION_NONE = 0;
/*     */   
/*     */   public RemoteController(Context context, OnClientUpdateListener updateListener) throws IllegalArgumentException {
/*  58 */     throw new RuntimeException("Stub!");
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
/*     */   public RemoteController(Context context, OnClientUpdateListener updateListener, Looper looper) throws IllegalArgumentException {
/*  70 */     throw new RuntimeException("Stub!");
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
/*     */   public long getEstimatedMediaPosition() {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean sendMediaKeyEvent(KeyEvent keyEvent) throws IllegalArgumentException {
/* 119 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean seekTo(long timeMs) throws IllegalArgumentException {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setArtworkConfiguration(int width, int height) throws IllegalArgumentException {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean clearArtworkConfiguration() {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean setSynchronizationMode(int sync) throws IllegalArgumentException {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MetadataEditor editMetadata() {
/* 166 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface OnClientUpdateListener
/*     */   {
/*     */     void onClientChange(boolean param1Boolean);
/*     */ 
/*     */ 
/*     */     
/*     */     void onClientPlaybackStateUpdate(int param1Int);
/*     */ 
/*     */ 
/*     */     
/*     */     void onClientPlaybackStateUpdate(int param1Int, long param1Long1, long param1Long2, float param1Float);
/*     */ 
/*     */ 
/*     */     
/*     */     void onClientTransportControlUpdate(int param1Int);
/*     */ 
/*     */ 
/*     */     
/*     */     void onClientMetadataUpdate(RemoteController.MetadataEditor param1MetadataEditor);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class MetadataEditor
/*     */     extends MediaMetadataEditor
/*     */   {
/*     */     MetadataEditor() {
/* 199 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public synchronized void apply() {
/* 207 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\RemoteController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */