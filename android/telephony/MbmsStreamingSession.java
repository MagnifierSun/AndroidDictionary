/*     */ package android.telephony;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.telephony.mbms.MbmsStreamingSessionCallback;
/*     */ import android.telephony.mbms.StreamingService;
/*     */ import android.telephony.mbms.StreamingServiceCallback;
/*     */ import android.telephony.mbms.StreamingServiceInfo;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.Executor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MbmsStreamingSession
/*     */   implements AutoCloseable
/*     */ {
/*     */   MbmsStreamingSession(Context context, Executor executor, int subscriptionId, MbmsStreamingSessionCallback callback) {
/*  37 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public static MbmsStreamingSession create(@RecentlyNonNull Context context, @RecentlyNonNull Executor executor, int subscriptionId, @RecentlyNonNull MbmsStreamingSessionCallback callback) {
/*  67 */     throw new RuntimeException("Stub!");
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
/*     */   public static MbmsStreamingSession create(@RecentlyNonNull Context context, @RecentlyNonNull Executor executor, @RecentlyNonNull MbmsStreamingSessionCallback callback) {
/*  80 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void requestUpdateStreamingServices(List<String> serviceClassList) {
/* 114 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public StreamingService startStreaming(StreamingServiceInfo serviceInfo, @RecentlyNonNull Executor executor, StreamingServiceCallback callback) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\telephony\MbmsStreamingSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */