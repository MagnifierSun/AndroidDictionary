/*      */ package android.media;
/*      */ 
/*      */ import android.hardware.Camera;
/*      */ import android.os.Handler;
/*      */ import android.os.PersistableBundle;
/*      */ import android.view.Surface;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import java.io.File;
/*      */ import java.io.FileDescriptor;
/*      */ import java.io.IOException;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class MediaRecorder
/*      */   implements AudioRouting
/*      */ {
/*      */   public static final int MEDIA_ERROR_SERVER_DIED = 100;
/*      */   public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
/*      */   public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
/*      */   public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
/*      */   public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
/*      */   public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
/*      */   public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
/*      */   
/*      */   public MediaRecorder() {
/*   80 */     throw new RuntimeException("Stub!");
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
/*      */   @Deprecated
/*      */   public native void setCamera(Camera paramCamera);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native Surface getSurface();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInputSurface(@RecentlyNonNull Surface surface) {
/*  125 */     throw new RuntimeException("Stub!");
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
/*      */   public void setPreviewDisplay(Surface sv) {
/*  141 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setAudioSource(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int getAudioSourceMax() {
/*  161 */     throw new RuntimeException("Stub!");
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
/*      */   public native void setVideoSource(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProfile(CamcorderProfile profile) {
/*  186 */     throw new RuntimeException("Stub!");
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
/*      */   public void setCaptureRate(double fps) {
/*  205 */     throw new RuntimeException("Stub!");
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
/*      */   public void setOrientationHint(int degrees) {
/*  223 */     throw new RuntimeException("Stub!");
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
/*      */   public void setLocation(float latitude, float longitude) {
/*  242 */     throw new RuntimeException("Stub!");
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
/*      */   public native void setOutputFormat(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setVideoSize(int paramInt1, int paramInt2) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setVideoFrameRate(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setMaxDuration(int paramInt) throws IllegalArgumentException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setMaxFileSize(long paramLong) throws IllegalArgumentException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setAudioEncoder(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void setVideoEncoder(int paramInt) throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAudioSamplingRate(int samplingRate) {
/*  361 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAudioChannels(int numChannels) {
/*  372 */     throw new RuntimeException("Stub!");
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
/*      */   public void setAudioEncodingBitRate(int bitRate) {
/*  384 */     throw new RuntimeException("Stub!");
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
/*      */   public void setVideoEncodingBitRate(int bitRate) {
/*  396 */     throw new RuntimeException("Stub!");
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
/*      */   public void setVideoEncodingProfileLevel(int profile, int level) {
/*  414 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOutputFile(FileDescriptor fd) throws IllegalStateException {
/*  425 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOutputFile(File file) {
/*  436 */     throw new RuntimeException("Stub!");
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
/*      */   public void setNextOutputFile(FileDescriptor fd) throws IOException {
/*  458 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOutputFile(String path) throws IllegalStateException {
/*  469 */     throw new RuntimeException("Stub!");
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
/*      */   public void setNextOutputFile(File file) throws IOException {
/*  489 */     throw new RuntimeException("Stub!");
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
/*      */   public void prepare() throws IOException, IllegalStateException {
/*  501 */     throw new RuntimeException("Stub!");
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
/*      */   public native void start() throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void stop() throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void pause() throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public native void resume() throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void reset() {
/*  566 */     throw new RuntimeException("Stub!");
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
/*      */   public native int getMaxAmplitude() throws IllegalStateException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOnErrorListener(OnErrorListener l) {
/*  587 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOnInfoListener(OnInfoListener listener) {
/*  596 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setPreferredDevice(AudioDeviceInfo deviceInfo) {
/*  607 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDeviceInfo getPreferredDevice() {
/*  614 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public AudioDeviceInfo getRoutedDevice() {
/*  623 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener, Handler handler) {
/*  634 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener listener) {
/*  643 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public List<MicrophoneInfo> getActiveMicrophones() throws IOException {
/*  654 */     throw new RuntimeException("Stub!");
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
/*      */   public native void release();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PersistableBundle getMetrics() {
/*  689 */     throw new RuntimeException("Stub!");
/*      */   } protected void finalize() {
/*  691 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final class AudioEncoder
/*      */   {
/*      */     public static final int AAC = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AAC_ELD = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AMR_NB = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AMR_WB = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEFAULT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HE_AAC = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VORBIS = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     AudioEncoder() {
/*  752 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final class AudioSource
/*      */   {
/*      */     public static final int CAMCORDER = 5;
/*      */ 
/*      */     
/*      */     public static final int DEFAULT = 0;
/*      */ 
/*      */     
/*      */     public static final int MIC = 1;
/*      */ 
/*      */     
/*      */     public static final int REMOTE_SUBMIX = 8;
/*      */ 
/*      */     
/*      */     public static final int UNPROCESSED = 9;
/*      */ 
/*      */     
/*      */     public static final int VOICE_CALL = 4;
/*      */ 
/*      */     
/*      */     public static final int VOICE_COMMUNICATION = 7;
/*      */ 
/*      */     
/*      */     public static final int VOICE_DOWNLINK = 3;
/*      */ 
/*      */     
/*      */     public static final int VOICE_RECOGNITION = 6;
/*      */ 
/*      */     
/*      */     public static final int VOICE_UPLINK = 2;
/*      */ 
/*      */ 
/*      */     
/*      */     AudioSource() {
/*  792 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class MetricsConstants
/*      */   {
/*      */     public static final String AUDIO_BITRATE = "android.media.mediarecorder.audio-bitrate";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String AUDIO_CHANNELS = "android.media.mediarecorder.audio-channels";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String AUDIO_SAMPLERATE = "android.media.mediarecorder.audio-samplerate";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String AUDIO_TIMESCALE = "android.media.mediarecorder.audio-timescale";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CAPTURE_FPS = "android.media.mediarecorder.capture-fps";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String CAPTURE_FPS_ENABLE = "android.media.mediarecorder.capture-fpsenable";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String FRAMERATE = "android.media.mediarecorder.frame-rate";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String HEIGHT = "android.media.mediarecorder.height";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String MOVIE_TIMESCALE = "android.media.mediarecorder.movie-timescale";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String ROTATION = "android.media.mediarecorder.rotation";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VIDEO_BITRATE = "android.media.mediarecorder.video-bitrate";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VIDEO_IFRAME_INTERVAL = "android.media.mediarecorder.video-iframe-interval";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VIDEO_LEVEL = "android.media.mediarecorder.video-encoder-level";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VIDEO_PROFILE = "android.media.mediarecorder.video-encoder-profile";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String VIDEO_TIMESCALE = "android.media.mediarecorder.video-timescale";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final String WIDTH = "android.media.mediarecorder.width";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     MetricsConstants() {
/*  884 */       throw new RuntimeException("Stub!");
/*      */     }
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
/*      */   public static interface OnErrorListener
/*      */   {
/*      */     void onError(MediaRecorder param1MediaRecorder, int param1Int1, int param1Int2);
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
/*      */   public static interface OnInfoListener
/*      */   {
/*      */     void onInfo(MediaRecorder param1MediaRecorder, int param1Int1, int param1Int2);
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
/*      */   public final class OutputFormat
/*      */   {
/*      */     public static final int AAC_ADTS = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AMR_NB = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int AMR_WB = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEFAULT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MPEG_2_TS = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MPEG_4 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static final int RAW_AMR = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int THREE_GPP = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int WEBM = 9;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     OutputFormat() {
/* 1072 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final class VideoEncoder
/*      */   {
/*      */     public static final int DEFAULT = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int H263 = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int H264 = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int HEVC = 5;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int MPEG_4_SP = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int VP8 = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     VideoEncoder() {
/* 1120 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final class VideoSource
/*      */   {
/*      */     public static final int CAMERA = 1;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int DEFAULT = 0;
/*      */ 
/*      */ 
/*      */     
/*      */     public static final int SURFACE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     VideoSource() {
/* 1143 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaRecorder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */