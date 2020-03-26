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
/*    */ public class DrmInfoEvent
/*    */   extends DrmEvent
/*    */ {
/*    */   public static final int TYPE_ACCOUNT_ALREADY_REGISTERED = 5;
/*    */   public static final int TYPE_ALREADY_REGISTERED_BY_ANOTHER_ACCOUNT = 1;
/*    */   public static final int TYPE_REMOVE_RIGHTS = 2;
/*    */   public static final int TYPE_RIGHTS_INSTALLED = 3;
/*    */   public static final int TYPE_RIGHTS_REMOVED = 6;
/*    */   public static final int TYPE_WAIT_FOR_RIGHTS = 4;
/*    */   
/*    */   public DrmInfoEvent(int uniqueId, int type, String message) {
/* 39 */     super(0, 0, (String)null); throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public DrmInfoEvent(int uniqueId, int type, String message, HashMap<String, Object> attributes) {
/* 52 */     super(0, 0, (String)null); throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\drm\DrmInfoEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */