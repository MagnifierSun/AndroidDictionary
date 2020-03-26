/*     */ package android.media;
/*     */ 
/*     */ import java.nio.ByteBuffer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class MediaFormat
/*     */ {
/*     */   public static final int COLOR_RANGE_FULL = 1;
/*     */   public static final int COLOR_RANGE_LIMITED = 2;
/*     */   public static final int COLOR_STANDARD_BT2020 = 6;
/*     */   public static final int COLOR_STANDARD_BT601_NTSC = 4;
/*     */   public static final int COLOR_STANDARD_BT601_PAL = 2;
/*     */   public static final int COLOR_STANDARD_BT709 = 1;
/*     */   public static final int COLOR_TRANSFER_HLG = 7;
/*     */   public static final int COLOR_TRANSFER_LINEAR = 1;
/*     */   public static final int COLOR_TRANSFER_SDR_VIDEO = 3;
/*     */   public static final int COLOR_TRANSFER_ST2084 = 6;
/*     */   public static final String KEY_AAC_DRC_ATTENUATION_FACTOR = "aac-drc-cut-level";
/*     */   public static final String KEY_AAC_DRC_BOOST_FACTOR = "aac-drc-boost-level";
/*     */   public static final String KEY_AAC_DRC_EFFECT_TYPE = "aac-drc-effect-type";
/*     */   public static final String KEY_AAC_DRC_HEAVY_COMPRESSION = "aac-drc-heavy-compression";
/*     */   public static final String KEY_AAC_DRC_TARGET_REFERENCE_LEVEL = "aac-target-ref-level";
/*     */   public static final String KEY_AAC_ENCODED_TARGET_LEVEL = "aac-encoded-target-level";
/*     */   public static final String KEY_AAC_MAX_OUTPUT_CHANNEL_COUNT = "aac-max-output-channel_count";
/*     */   public static final String KEY_AAC_PROFILE = "aac-profile";
/*     */   public static final String KEY_AAC_SBR_MODE = "aac-sbr-mode";
/*     */   public static final String KEY_AUDIO_SESSION_ID = "audio-session-id";
/*     */   public static final String KEY_BITRATE_MODE = "bitrate-mode";
/*     */   public static final String KEY_BIT_RATE = "bitrate";
/*     */   public static final String KEY_CAPTURE_RATE = "capture-rate";
/*     */   public static final String KEY_CHANNEL_COUNT = "channel-count";
/*     */   public static final String KEY_CHANNEL_MASK = "channel-mask";
/*     */   public static final String KEY_COLOR_FORMAT = "color-format";
/*     */   public static final String KEY_COLOR_RANGE = "color-range";
/*     */   public static final String KEY_COLOR_STANDARD = "color-standard";
/*     */   public static final String KEY_COLOR_TRANSFER = "color-transfer";
/*     */   public static final String KEY_COMPLEXITY = "complexity";
/*     */   public static final String KEY_DURATION = "durationUs";
/*     */   public static final String KEY_FLAC_COMPRESSION_LEVEL = "flac-compression-level";
/*     */   public static final String KEY_FRAME_RATE = "frame-rate";
/*     */   public static final String KEY_GRID_COLUMNS = "grid-cols";
/*     */   public static final String KEY_GRID_ROWS = "grid-rows";
/*     */   public static final String KEY_HDR_STATIC_INFO = "hdr-static-info";
/*     */   public static final String KEY_HEIGHT = "height";
/*     */   public static final String KEY_INTRA_REFRESH_PERIOD = "intra-refresh-period";
/*     */   public static final String KEY_IS_ADTS = "is-adts";
/*     */   public static final String KEY_IS_AUTOSELECT = "is-autoselect";
/*     */   public static final String KEY_IS_DEFAULT = "is-default";
/*     */   public static final String KEY_IS_FORCED_SUBTITLE = "is-forced-subtitle";
/*     */   public static final String KEY_I_FRAME_INTERVAL = "i-frame-interval";
/*     */   public static final String KEY_LANGUAGE = "language";
/*     */   public static final String KEY_LATENCY = "latency";
/*     */   public static final String KEY_LEVEL = "level";
/*     */   public static final String KEY_MAX_HEIGHT = "max-height";
/*     */   public static final String KEY_MAX_INPUT_SIZE = "max-input-size";
/*     */   public static final String KEY_MAX_WIDTH = "max-width";
/*     */   public static final String KEY_MIME = "mime";
/*     */   public static final String KEY_OPERATING_RATE = "operating-rate";
/*     */   public static final String KEY_OUTPUT_REORDER_DEPTH = "output-reorder-depth";
/*     */   public static final String KEY_PCM_ENCODING = "pcm-encoding";
/*     */   public static final String KEY_PRIORITY = "priority";
/*     */   public static final String KEY_PROFILE = "profile";
/*     */   public static final String KEY_PUSH_BLANK_BUFFERS_ON_STOP = "push-blank-buffers-on-shutdown";
/*     */   public static final String KEY_QUALITY = "quality";
/*     */   public static final String KEY_REPEAT_PREVIOUS_FRAME_AFTER = "repeat-previous-frame-after";
/*     */   public static final String KEY_ROTATION = "rotation-degrees";
/*     */   public static final String KEY_SAMPLE_RATE = "sample-rate";
/*     */   public static final String KEY_SLICE_HEIGHT = "slice-height";
/*     */   public static final String KEY_STRIDE = "stride";
/*     */   public static final String KEY_TEMPORAL_LAYERING = "ts-schema";
/*     */   public static final String KEY_TILE_HEIGHT = "tile-height";
/*     */   public static final String KEY_TILE_WIDTH = "tile-width";
/*     */   public static final String KEY_TRACK_ID = "track-id";
/*     */   public static final String KEY_WIDTH = "width";
/*     */   public static final String MIMETYPE_AUDIO_AAC = "audio/mp4a-latm";
/*     */   public static final String MIMETYPE_AUDIO_AC3 = "audio/ac3";
/*     */   public static final String MIMETYPE_AUDIO_AMR_NB = "audio/3gpp";
/*     */   public static final String MIMETYPE_AUDIO_AMR_WB = "audio/amr-wb";
/*     */   public static final String MIMETYPE_AUDIO_EAC3 = "audio/eac3";
/*     */   public static final String MIMETYPE_AUDIO_FLAC = "audio/flac";
/*     */   public static final String MIMETYPE_AUDIO_G711_ALAW = "audio/g711-alaw";
/*     */   public static final String MIMETYPE_AUDIO_G711_MLAW = "audio/g711-mlaw";
/*     */   public static final String MIMETYPE_AUDIO_MPEG = "audio/mpeg";
/*     */   public static final String MIMETYPE_AUDIO_MSGSM = "audio/gsm";
/*     */   public static final String MIMETYPE_AUDIO_OPUS = "audio/opus";
/*     */   public static final String MIMETYPE_AUDIO_QCELP = "audio/qcelp";
/*     */   public static final String MIMETYPE_AUDIO_RAW = "audio/raw";
/*     */   public static final String MIMETYPE_AUDIO_SCRAMBLED = "audio/scrambled";
/*     */   public static final String MIMETYPE_AUDIO_VORBIS = "audio/vorbis";
/*     */   public static final String MIMETYPE_IMAGE_ANDROID_HEIC = "image/vnd.android.heic";
/*     */   public static final String MIMETYPE_TEXT_CEA_608 = "text/cea-608";
/*     */   public static final String MIMETYPE_TEXT_CEA_708 = "text/cea-708";
/*     */   public static final String MIMETYPE_TEXT_SUBRIP = "application/x-subrip";
/*     */   public static final String MIMETYPE_TEXT_VTT = "text/vtt";
/*     */   public static final String MIMETYPE_VIDEO_AVC = "video/avc";
/*     */   public static final String MIMETYPE_VIDEO_DOLBY_VISION = "video/dolby-vision";
/*     */   public static final String MIMETYPE_VIDEO_H263 = "video/3gpp";
/*     */   public static final String MIMETYPE_VIDEO_HEVC = "video/hevc";
/*     */   public static final String MIMETYPE_VIDEO_MPEG2 = "video/mpeg2";
/*     */   public static final String MIMETYPE_VIDEO_MPEG4 = "video/mp4v-es";
/*     */   public static final String MIMETYPE_VIDEO_RAW = "video/raw";
/*     */   public static final String MIMETYPE_VIDEO_SCRAMBLED = "video/scrambled";
/*     */   public static final String MIMETYPE_VIDEO_VP8 = "video/x-vnd.on2.vp8";
/*     */   public static final String MIMETYPE_VIDEO_VP9 = "video/x-vnd.on2.vp9";
/*     */   
/*     */   public MediaFormat() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean containsKey(String name) {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getInteger(String name) {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getLong(String name) {
/* 135 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public float getFloat(String name) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getString(String name) {
/* 147 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ByteBuffer getByteBuffer(String name) {
/* 153 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean getFeatureEnabled(String feature) {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInteger(String name, int value) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLong(String name, long value) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFloat(String name, float value) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setString(String name, String value) {
/* 189 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setByteBuffer(String name, ByteBuffer bytes) {
/* 195 */     throw new RuntimeException("Stub!");
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
/*     */   public void setFeatureEnabled(String feature, boolean enabled) {
/* 211 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MediaFormat createAudioFormat(String mime, int sampleRate, int channelCount) {
/* 220 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MediaFormat createSubtitleFormat(String mime, String language) {
/* 231 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static MediaFormat createVideoFormat(String mime, int width, int height) {
/* 240 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 242 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaFormat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */