/*      */ package android.content.pm;
/*      */ 
/*      */ import android.content.ComponentName;
/*      */ import android.content.Intent;
/*      */ import android.content.IntentFilter;
/*      */ import android.content.res.Resources;
/*      */ import android.content.res.XmlResourceParser;
/*      */ import android.graphics.Rect;
/*      */ import android.graphics.drawable.Drawable;
/*      */ import android.os.Bundle;
/*      */ import android.os.UserHandle;
/*      */ import android.util.AndroidException;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
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
/*      */ public abstract class PackageManager
/*      */ {
/*      */   public static final int CERT_INPUT_RAW_X509 = 0;
/*      */   public static final int CERT_INPUT_SHA256 = 1;
/*      */   public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
/*      */   public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
/*      */   public static final int COMPONENT_ENABLED_STATE_DISABLED_UNTIL_USED = 4;
/*      */   public static final int COMPONENT_ENABLED_STATE_DISABLED_USER = 3;
/*      */   public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
/*      */   public static final int DONT_KILL_APP = 1;
/*      */   public static final String EXTRA_VERIFICATION_ID = "android.content.pm.extra.VERIFICATION_ID";
/*      */   public static final String EXTRA_VERIFICATION_RESULT = "android.content.pm.extra.VERIFICATION_RESULT";
/*      */   public static final String FEATURE_ACTIVITIES_ON_SECONDARY_DISPLAYS = "android.software.activities_on_secondary_displays";
/*      */   public static final String FEATURE_APP_WIDGETS = "android.software.app_widgets";
/*      */   public static final String FEATURE_AUDIO_LOW_LATENCY = "android.hardware.audio.low_latency";
/*      */   public static final String FEATURE_AUDIO_OUTPUT = "android.hardware.audio.output";
/*      */   public static final String FEATURE_AUDIO_PRO = "android.hardware.audio.pro";
/*      */   public static final String FEATURE_AUTOFILL = "android.software.autofill";
/*      */   public static final String FEATURE_AUTOMOTIVE = "android.hardware.type.automotive";
/*      */   public static final String FEATURE_BACKUP = "android.software.backup";
/*      */   public static final String FEATURE_BLUETOOTH = "android.hardware.bluetooth";
/*      */   
/*      */   public PackageManager() {
/*   53 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_BLUETOOTH_LE = "android.hardware.bluetooth_le";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA = "android.hardware.camera";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_ANY = "android.hardware.camera.any";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_AR = "android.hardware.camera.ar";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_AUTOFOCUS = "android.hardware.camera.autofocus";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING = "android.hardware.camera.capability.manual_post_processing";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR = "android.hardware.camera.capability.manual_sensor";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_CAPABILITY_RAW = "android.hardware.camera.capability.raw";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_EXTERNAL = "android.hardware.camera.external";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_FLASH = "android.hardware.camera.flash";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_FRONT = "android.hardware.camera.front";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CAMERA_LEVEL_FULL = "android.hardware.camera.level.full";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CANT_SAVE_STATE = "android.software.cant_save_state";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_COMPANION_DEVICE_SETUP = "android.software.companion_device_setup";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CONNECTION_SERVICE = "android.software.connectionservice";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_CONSUMER_IR = "android.hardware.consumerir";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_DEVICE_ADMIN = "android.software.device_admin";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_EMBEDDED = "android.hardware.type.embedded";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_ETHERNET = "android.hardware.ethernet";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_FAKETOUCH = "android.hardware.faketouch";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT = "android.hardware.faketouch.multitouch.distinct";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND = "android.hardware.faketouch.multitouch.jazzhand";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_FINGERPRINT = "android.hardware.fingerprint";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_FREEFORM_WINDOW_MANAGEMENT = "android.software.freeform_window_management";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_GAMEPAD = "android.hardware.gamepad";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_HIFI_SENSORS = "android.hardware.sensor.hifi_sensors";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_HOME_SCREEN = "android.software.home_screen";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_INPUT_METHODS = "android.software.input_methods";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LEANBACK = "android.software.leanback";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LEANBACK_ONLY = "android.software.leanback_only";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LIVE_TV = "android.software.live_tv";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LIVE_WALLPAPER = "android.software.live_wallpaper";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LOCATION = "android.hardware.location";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LOCATION_GPS = "android.hardware.location.gps";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_LOCATION_NETWORK = "android.hardware.location.network";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_MANAGED_USERS = "android.software.managed_users";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_MICROPHONE = "android.hardware.microphone";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_MIDI = "android.software.midi";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_NFC = "android.hardware.nfc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_NFC_HOST_CARD_EMULATION = "android.hardware.nfc.hce";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_NFC_HOST_CARD_EMULATION_NFCF = "android.hardware.nfc.hcef";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_OPENGLES_EXTENSION_PACK = "android.hardware.opengles.aep";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_PC = "android.hardware.type.pc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_PICTURE_IN_PICTURE = "android.software.picture_in_picture";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_PRINTING = "android.software.print";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_RAM_LOW = "android.hardware.ram.low";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_RAM_NORMAL = "android.hardware.ram.normal";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SCREEN_LANDSCAPE = "android.hardware.screen.landscape";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SCREEN_PORTRAIT = "android.hardware.screen.portrait";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SECURELY_REMOVES_USERS = "android.software.securely_removes_users";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_ACCELEROMETER = "android.hardware.sensor.accelerometer";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_AMBIENT_TEMPERATURE = "android.hardware.sensor.ambient_temperature";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_BAROMETER = "android.hardware.sensor.barometer";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_COMPASS = "android.hardware.sensor.compass";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_GYROSCOPE = "android.hardware.sensor.gyroscope";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_HEART_RATE = "android.hardware.sensor.heartrate";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_HEART_RATE_ECG = "android.hardware.sensor.heartrate.ecg";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_LIGHT = "android.hardware.sensor.light";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_PROXIMITY = "android.hardware.sensor.proximity";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_RELATIVE_HUMIDITY = "android.hardware.sensor.relative_humidity";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_STEP_COUNTER = "android.hardware.sensor.stepcounter";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SENSOR_STEP_DETECTOR = "android.hardware.sensor.stepdetector";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SIP = "android.software.sip";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_SIP_VOIP = "android.software.sip.voip";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_STRONGBOX_KEYSTORE = "android.hardware.strongbox_keystore";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TELEPHONY = "android.hardware.telephony";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TELEPHONY_CDMA = "android.hardware.telephony.cdma";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TELEPHONY_EUICC = "android.hardware.telephony.euicc";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TELEPHONY_GSM = "android.hardware.telephony.gsm";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TELEPHONY_MBMS = "android.hardware.telephony.mbms";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final String FEATURE_TELEVISION = "android.hardware.type.television";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TOUCHSCREEN = "android.hardware.touchscreen";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH = "android.hardware.touchscreen.multitouch";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT = "android.hardware.touchscreen.multitouch.distinct";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND = "android.hardware.touchscreen.multitouch.jazzhand";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_USB_ACCESSORY = "android.hardware.usb.accessory";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_USB_HOST = "android.hardware.usb.host";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VERIFIED_BOOT = "android.software.verified_boot";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VR_HEADTRACKING = "android.hardware.vr.headtracking";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final String FEATURE_VR_MODE = "android.software.vr.mode";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VR_MODE_HIGH_PERFORMANCE = "android.hardware.vr.high_performance";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VULKAN_HARDWARE_COMPUTE = "android.hardware.vulkan.compute";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VULKAN_HARDWARE_LEVEL = "android.hardware.vulkan.level";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_VULKAN_HARDWARE_VERSION = "android.hardware.vulkan.version";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WATCH = "android.hardware.type.watch";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WEBVIEW = "android.software.webview";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WIFI = "android.hardware.wifi";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WIFI_AWARE = "android.hardware.wifi.aware";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WIFI_DIRECT = "android.hardware.wifi.direct";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WIFI_PASSPOINT = "android.hardware.wifi.passpoint";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final String FEATURE_WIFI_RTT = "android.hardware.wifi.rtt";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_ACTIVITIES = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_CONFIGURATIONS = 16384;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final int GET_DISABLED_COMPONENTS = 512;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final int GET_DISABLED_UNTIL_USED_COMPONENTS = 32768;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_GIDS = 256;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_INSTRUMENTATION = 16;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_INTENT_FILTERS = 32;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_META_DATA = 128;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_PERMISSIONS = 4096;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_PROVIDERS = 8;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_RECEIVERS = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_RESOLVED_FILTER = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_SERVICES = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_SHARED_LIBRARY_FILES = 1024;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final int GET_SIGNATURES = 64;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_SIGNING_CERTIFICATES = 134217728;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Deprecated
/*      */   public static final int GET_UNINSTALLED_PACKAGES = 8192;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int GET_URI_PERMISSION_PATTERNS = 2048;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INSTALL_REASON_DEVICE_RESTORE = 2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INSTALL_REASON_DEVICE_SETUP = 3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INSTALL_REASON_POLICY = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INSTALL_REASON_UNKNOWN = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int INSTALL_REASON_USER = 4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_ALL = 131072;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_DEFAULT_ONLY = 65536;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_DIRECT_BOOT_AWARE = 524288;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_DIRECT_BOOT_UNAWARE = 262144;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_DISABLED_COMPONENTS = 512;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_DISABLED_UNTIL_USED_COMPONENTS = 32768;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_SYSTEM_ONLY = 1048576;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int MATCH_UNINSTALLED_PACKAGES = 8192;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final long MAXIMUM_VERIFICATION_TIMEOUT = 3600000L;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int PERMISSION_DENIED = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int PERMISSION_GRANTED = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_MATCH = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_NEITHER_SIGNED = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_NO_MATCH = -3;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int VERIFICATION_ALLOW = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int VERIFICATION_REJECT = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final int VERSION_CODE_HIGHEST = -1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract PackageInfo getPackageInfo(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract PackageInfo getPackageInfo(VersionedPackage paramVersionedPackage, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract String[] currentToCanonicalPackageNames(String[] paramArrayOfString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract String[] canonicalToCurrentPackageNames(String[] paramArrayOfString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public abstract Intent getLaunchIntentForPackage(@RecentlyNonNull String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public abstract Intent getLeanbackLaunchIntentForPackage(@RecentlyNonNull String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int[] getPackageGids(@RecentlyNonNull String paramString) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int[] getPackageGids(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int getPackageUid(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract PermissionInfo getPermissionInfo(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<PermissionInfo> queryPermissionsByGroup(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract PermissionGroupInfo getPermissionGroupInfo(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<PermissionGroupInfo> getAllPermissionGroups(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ApplicationInfo getApplicationInfo(String paramString, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ActivityInfo getActivityInfo(ComponentName paramComponentName, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ActivityInfo getReceiverInfo(ComponentName paramComponentName, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ServiceInfo getServiceInfo(ComponentName paramComponentName, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ProviderInfo getProviderInfo(ComponentName paramComponentName, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<PackageInfo> getInstalledPackages(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<PackageInfo> getPackagesHoldingPermissions(String[] paramArrayOfString, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int checkPermission(String paramString1, String paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean isPermissionRevokedByPolicy(@RecentlyNonNull String paramString1, @RecentlyNonNull String paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean addPermission(PermissionInfo paramPermissionInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean addPermissionAsync(PermissionInfo paramPermissionInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void removePermission(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int checkSignatures(String paramString1, String paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int checkSignatures(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public abstract String[] getPackagesForUid(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public abstract String getNameForUid(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ApplicationInfo> getInstalledApplications(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean isInstantApp();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean isInstantApp(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int getInstantAppCookieMaxBytes();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public abstract byte[] getInstantAppCookie();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void clearInstantAppCookie();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void updateInstantAppCookie(@RecentlyNullable byte[] paramArrayOfbyte);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract String[] getSystemSharedLibraryNames();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNonNull
/*      */   public abstract List<SharedLibraryInfo> getSharedLibraries(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @RecentlyNullable
/*      */   public abstract ChangedPackages getChangedPackages(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract FeatureInfo[] getSystemAvailableFeatures();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean hasSystemFeature(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean hasSystemFeature(String paramString, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ResolveInfo resolveActivity(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ResolveInfo> queryIntentActivities(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ResolveInfo> queryIntentActivityOptions(@RecentlyNullable ComponentName paramComponentName, @RecentlyNullable Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ResolveInfo> queryBroadcastReceivers(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ResolveInfo resolveService(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ResolveInfo> queryIntentServices(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ResolveInfo> queryIntentContentProviders(Intent paramIntent, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract ProviderInfo resolveContentProvider(String paramString, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<ProviderInfo> queryContentProviders(String paramString, int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract InstrumentationInfo getInstrumentationInfo(ComponentName paramComponentName, int paramInt) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<InstrumentationInfo> queryInstrumentation(String paramString, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getDrawable(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityIcon(ComponentName paramComponentName) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityIcon(Intent paramIntent) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityBanner(ComponentName paramComponentName) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityBanner(Intent paramIntent) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getDefaultActivityIcon();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationIcon(ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationIcon(String paramString) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationBanner(ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationBanner(String paramString) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityLogo(ComponentName paramComponentName) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getActivityLogo(Intent paramIntent) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationLogo(ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getApplicationLogo(String paramString) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getUserBadgedIcon(Drawable paramDrawable, UserHandle paramUserHandle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Drawable getUserBadgedDrawableForDensity(Drawable paramDrawable, UserHandle paramUserHandle, Rect paramRect, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract CharSequence getUserBadgedLabel(CharSequence paramCharSequence, UserHandle paramUserHandle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract CharSequence getText(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract XmlResourceParser getXml(String paramString, int paramInt, ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract CharSequence getApplicationLabel(ApplicationInfo paramApplicationInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Resources getResourcesForActivity(ComponentName paramComponentName) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Resources getResourcesForApplication(ApplicationInfo paramApplicationInfo) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract Resources getResourcesForApplication(String paramString) throws NameNotFoundException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags) {
/* 1354 */     throw new RuntimeException("Stub!");
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
/*      */   public abstract void verifyPendingInstall(int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void extendVerificationTimeout(int paramInt1, int paramInt2, long paramLong);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void setInstallerPackageName(String paramString1, String paramString2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract String getInstallerPackageName(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public abstract void addPackageToPreferred(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public abstract void removePackageFromPreferred(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract List<PackageInfo> getPreferredPackages(int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public abstract void addPreferredActivity(IntentFilter paramIntentFilter, int paramInt, ComponentName[] paramArrayOfComponentName, ComponentName paramComponentName);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void clearPackagePreferredActivities(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int getPreferredActivities(@RecentlyNonNull List<IntentFilter> paramList, @RecentlyNonNull List<ComponentName> paramList1, String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void setComponentEnabledSetting(@RecentlyNonNull ComponentName paramComponentName, int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int getComponentEnabledSetting(ComponentName paramComponentName);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract void setApplicationEnabledSetting(@RecentlyNonNull String paramString, int paramInt1, int paramInt2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract int getApplicationEnabledSetting(String paramString);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean isSafeMode();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean isPackageSuspended() {
/* 1613 */     throw new RuntimeException("Stub!");
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
/*      */   @RecentlyNullable
/*      */   public Bundle getSuspendedPackageAppExtras() {
/* 1636 */     throw new RuntimeException("Stub!");
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
/*      */   public abstract void setApplicationCategoryHint(@RecentlyNonNull String paramString, int paramInt);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*      */   public abstract PackageInstaller getPackageInstaller();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public abstract boolean canRequestPackageInstalls();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean hasSigningCertificate(String packageName, byte[] certificate, int type) {
/* 1697 */     throw new RuntimeException("Stub!");
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
/*      */   public boolean hasSigningCertificate(int uid, byte[] certificate, int type) {
/* 1719 */     throw new RuntimeException("Stub!");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class NameNotFoundException
/*      */     extends AndroidException
/*      */   {
/*      */     public NameNotFoundException() {
/* 3042 */       throw new RuntimeException("Stub!");
/*      */     } public NameNotFoundException(String name) {
/* 3044 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\content\pm\PackageManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */