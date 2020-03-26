/*    */ package android.drm;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DrmEvent
/*    */ {
/*    */   public static final String DRM_INFO_OBJECT = "drm_info_object";
/*    */   public static final String DRM_INFO_STATUS_OBJECT = "drm_info_status_object";
/*    */   public static final int TYPE_ALL_RIGHTS_REMOVED = 1001;
/*    */   public static final int TYPE_DRM_INFO_PROCESSED = 1002;
/*    */   
/*    */   protected DrmEvent(int uniqueId, int type, String message, HashMap<String, Object> attributes) {
/* 39 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected DrmEvent(int uniqueId, int type, String message) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getUniqueId() {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getType() {
/* 65 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getMessage() {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object getAttribute(String key) {
/* 82 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\drm\DrmEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */