/*     */ package android.content;
/*     */ 
/*     */ import android.os.Bundle;
/*     */ import android.os.PersistableBundle;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RestrictionsManager
/*     */ {
/*     */   public static final String ACTION_PERMISSION_RESPONSE_RECEIVED = "android.content.action.PERMISSION_RESPONSE_RECEIVED";
/*     */   public static final String ACTION_REQUEST_LOCAL_APPROVAL = "android.content.action.REQUEST_LOCAL_APPROVAL";
/*     */   public static final String ACTION_REQUEST_PERMISSION = "android.content.action.REQUEST_PERMISSION";
/*     */   public static final String EXTRA_PACKAGE_NAME = "android.content.extra.PACKAGE_NAME";
/*     */   public static final String EXTRA_REQUEST_BUNDLE = "android.content.extra.REQUEST_BUNDLE";
/*     */   public static final String EXTRA_REQUEST_ID = "android.content.extra.REQUEST_ID";
/*     */   public static final String EXTRA_REQUEST_TYPE = "android.content.extra.REQUEST_TYPE";
/*     */   public static final String EXTRA_RESPONSE_BUNDLE = "android.content.extra.RESPONSE_BUNDLE";
/*     */   public static final String META_DATA_APP_RESTRICTIONS = "android.content.APP_RESTRICTIONS";
/*     */   public static final String REQUEST_KEY_APPROVE_LABEL = "android.request.approve_label";
/*     */   public static final String REQUEST_KEY_DATA = "android.request.data";
/*     */   public static final String REQUEST_KEY_DENY_LABEL = "android.request.deny_label";
/*     */   public static final String REQUEST_KEY_ICON = "android.request.icon";
/*     */   public static final String REQUEST_KEY_ID = "android.request.id";
/*     */   public static final String REQUEST_KEY_MESSAGE = "android.request.mesg";
/*     */   public static final String REQUEST_KEY_NEW_REQUEST = "android.request.new_request";
/*     */   public static final String REQUEST_KEY_TITLE = "android.request.title";
/*     */   public static final String REQUEST_TYPE_APPROVAL = "android.request.type.approval";
/*     */   public static final String RESPONSE_KEY_ERROR_CODE = "android.response.errorcode";
/*     */   public static final String RESPONSE_KEY_MESSAGE = "android.response.msg";
/*     */   public static final String RESPONSE_KEY_RESPONSE_TIMESTAMP = "android.response.timestamp";
/*     */   public static final String RESPONSE_KEY_RESULT = "android.response.result";
/*     */   public static final int RESULT_APPROVED = 1;
/*     */   public static final int RESULT_DENIED = 2;
/*     */   public static final int RESULT_ERROR = 5;
/*     */   public static final int RESULT_ERROR_BAD_REQUEST = 1;
/*     */   public static final int RESULT_ERROR_INTERNAL = 3;
/*     */   public static final int RESULT_ERROR_NETWORK = 2;
/*     */   public static final int RESULT_NO_RESPONSE = 3;
/*     */   public static final int RESULT_UNKNOWN_REQUEST = 4;
/*     */   
/*     */   RestrictionsManager() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Bundle getApplicationRestrictions() {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hasRestrictionsProvider() {
/* 126 */     throw new RuntimeException("Stub!");
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
/*     */   public void requestPermission(String requestType, String requestId, PersistableBundle request) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public Intent createLocalApprovalIntent() {
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
/*     */   public void notifyPermissionResponse(String packageName, PersistableBundle response) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<RestrictionEntry> getManifestRestrictions(String packageName) {
/* 171 */     throw new RuntimeException("Stub!");
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
/*     */   public static Bundle convertRestrictionsToBundle(List<RestrictionEntry> entries) {
/* 190 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\content\RestrictionsManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */