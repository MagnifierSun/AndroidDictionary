/*     */ package android.accessibilityservice;
/*     */ 
/*     */ import android.content.pm.PackageManager;
/*     */ import android.content.pm.ResolveInfo;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AccessibilityServiceInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int CAPABILITY_CAN_CONTROL_MAGNIFICATION = 16;
/*     */   public static final int CAPABILITY_CAN_PERFORM_GESTURES = 32;
/*     */   @Deprecated
/*     */   public static final int CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 4;
/*     */   public static final int CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS = 8;
/*     */   public static final int CAPABILITY_CAN_REQUEST_FINGERPRINT_GESTURES = 64;
/*     */   public static final int CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION = 2;
/*     */   public static final int CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT = 1;
/*     */   
/*     */   public AccessibilityServiceInfo() {
/*  72 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getId() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResolveInfo getResolveInfo() {
/*  92 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSettingsActivityName() {
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
/*     */   @Deprecated
/*     */   public boolean getCanRetrieveWindowContent() {
/* 116 */     throw new RuntimeException("Stub!");
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
/*     */   public int getCapabilities() {
/* 131 */     throw new RuntimeException("Stub!");
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
/*     */   public CharSequence loadSummary(PackageManager packageManager) {
/* 143 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   public String getDescription() {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String loadDescription(PackageManager packageManager) {
/* 167 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int describeContents() {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flagz) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/* 181 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String feedbackTypeToString(int feedbackType) {
/* 191 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String flagToString(int flag) {
/* 201 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String capabilityToString(int capability) {
/* 212 */     throw new RuntimeException("Stub!");
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
/* 268 */   public static final Parcelable.Creator<AccessibilityServiceInfo> CREATOR = null;
/*     */   public static final int DEFAULT = 1;
/*     */   public static final int FEEDBACK_ALL_MASK = -1;
/*     */   public static final int FEEDBACK_AUDIBLE = 4;
/*     */   public static final int FEEDBACK_BRAILLE = 32;
/*     */   public static final int FEEDBACK_GENERIC = 16;
/*     */   public static final int FEEDBACK_HAPTIC = 2;
/*     */   public static final int FEEDBACK_SPOKEN = 1;
/*     */   public static final int FEEDBACK_VISUAL = 8;
/*     */   public static final int FLAG_ENABLE_ACCESSIBILITY_VOLUME = 128;
/*     */   public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 2;
/*     */   public static final int FLAG_REPORT_VIEW_IDS = 16;
/*     */   public static final int FLAG_REQUEST_ACCESSIBILITY_BUTTON = 256;
/*     */   @Deprecated
/*     */   public static final int FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY = 8;
/*     */   public static final int FLAG_REQUEST_FILTER_KEY_EVENTS = 32;
/*     */   public static final int FLAG_REQUEST_FINGERPRINT_GESTURES = 512;
/*     */   public static final int FLAG_REQUEST_TOUCH_EXPLORATION_MODE = 4;
/*     */   public static final int FLAG_RETRIEVE_INTERACTIVE_WINDOWS = 64;
/*     */   public int eventTypes;
/*     */   public int feedbackType;
/*     */   public int flags;
/*     */   public long notificationTimeout;
/*     */   public String[] packageNames;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\accessibilityservice\AccessibilityServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */