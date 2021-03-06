/*     */ package android.app;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AppOpsManager
/*     */ {
/*     */   public static final int MODE_ALLOWED = 0;
/*     */   public static final int MODE_DEFAULT = 3;
/*     */   public static final int MODE_ERRORED = 2;
/*     */   public static final int MODE_IGNORED = 1;
/*     */   public static final String OPSTR_ADD_VOICEMAIL = "android:add_voicemail";
/*     */   public static final String OPSTR_ANSWER_PHONE_CALLS = "android:answer_phone_calls";
/*     */   public static final String OPSTR_BODY_SENSORS = "android:body_sensors";
/*     */   public static final String OPSTR_CALL_PHONE = "android:call_phone";
/*     */   public static final String OPSTR_CAMERA = "android:camera";
/*     */   public static final String OPSTR_COARSE_LOCATION = "android:coarse_location";
/*     */   public static final String OPSTR_FINE_LOCATION = "android:fine_location";
/*     */   public static final String OPSTR_GET_USAGE_STATS = "android:get_usage_stats";
/*     */   public static final String OPSTR_MOCK_LOCATION = "android:mock_location";
/*     */   public static final String OPSTR_MONITOR_HIGH_POWER_LOCATION = "android:monitor_location_high_power";
/*     */   public static final String OPSTR_MONITOR_LOCATION = "android:monitor_location";
/*     */   public static final String OPSTR_PICTURE_IN_PICTURE = "android:picture_in_picture";
/*     */   public static final String OPSTR_PROCESS_OUTGOING_CALLS = "android:process_outgoing_calls";
/*     */   public static final String OPSTR_READ_CALENDAR = "android:read_calendar";
/*     */   public static final String OPSTR_READ_CALL_LOG = "android:read_call_log";
/*     */   
/*     */   AppOpsManager() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   public static final String OPSTR_READ_CELL_BROADCASTS = "android:read_cell_broadcasts"; public static final String OPSTR_READ_CONTACTS = "android:read_contacts"; public static final String OPSTR_READ_EXTERNAL_STORAGE = "android:read_external_storage"; public static final String OPSTR_READ_PHONE_NUMBERS = "android:read_phone_numbers"; public static final String OPSTR_READ_PHONE_STATE = "android:read_phone_state"; public static final String OPSTR_READ_SMS = "android:read_sms"; public static final String OPSTR_RECEIVE_MMS = "android:receive_mms"; public static final String OPSTR_RECEIVE_SMS = "android:receive_sms"; public static final String OPSTR_RECEIVE_WAP_PUSH = "android:receive_wap_push"; public static final String OPSTR_RECORD_AUDIO = "android:record_audio"; public static final String OPSTR_SEND_SMS = "android:send_sms";
/*     */   public static final String OPSTR_SYSTEM_ALERT_WINDOW = "android:system_alert_window";
/*     */   public static final String OPSTR_USE_FINGERPRINT = "android:use_fingerprint";
/*     */   public static final String OPSTR_USE_SIP = "android:use_sip";
/*     */   public static final String OPSTR_WRITE_CALENDAR = "android:write_calendar";
/*     */   public static final String OPSTR_WRITE_CALL_LOG = "android:write_call_log";
/*     */   public static final String OPSTR_WRITE_CONTACTS = "android:write_contacts";
/*     */   public static final String OPSTR_WRITE_EXTERNAL_STORAGE = "android:write_external_storage";
/*     */   public static final String OPSTR_WRITE_SETTINGS = "android:write_settings";
/*     */   
/*     */   public static String permissionToOp(String permission) {
/*  48 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void startWatchingMode(String op, String packageName, OnOpChangedListener callback) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void stopWatchingMode(OnOpChangedListener callback) {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkOp(String op, int uid, String packageName) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int checkOpNoThrow(String op, int uid, String packageName) {
/* 103 */     throw new RuntimeException("Stub!");
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
/*     */   public int noteOp(String op, int uid, String packageName) {
/* 120 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int noteOpNoThrow(String op, int uid, String packageName) {
/* 127 */     throw new RuntimeException("Stub!");
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
/*     */   public int noteProxyOp(String op, String proxiedPackageName) {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int noteProxyOpNoThrow(String op, String proxiedPackageName) {
/* 152 */     throw new RuntimeException("Stub!");
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
/*     */   public int startOp(String op, int uid, String packageName) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int startOpNoThrow(String op, int uid, String packageName) {
/* 178 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void finishOp(String op, int uid, String packageName) {
/* 187 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void checkPackage(int uid, String packageName) {
/* 196 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*     */   public static interface OnOpChangedListener {
/*     */     void onOpChanged(String param1String1, String param1String2);
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\AppOpsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */