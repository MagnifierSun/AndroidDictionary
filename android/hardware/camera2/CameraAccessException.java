/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import android.util.AndroidException;
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
/*    */ public class CameraAccessException
/*    */   extends AndroidException
/*    */ {
/*    */   public static final int CAMERA_DISABLED = 1;
/*    */   public static final int CAMERA_DISCONNECTED = 2;
/*    */   public static final int CAMERA_ERROR = 3;
/*    */   public static final int CAMERA_IN_USE = 4;
/*    */   public static final int MAX_CAMERAS_IN_USE = 5;
/*    */   
/*    */   public CameraAccessException(int problem) {
/* 37 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CameraAccessException(int problem, String message) {
/* 43 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CameraAccessException(int problem, String message, Throwable cause) {
/* 49 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CameraAccessException(int problem, Throwable cause) {
/* 55 */     throw new RuntimeException("Stub!");
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
/*    */   public final int getReason() {
/* 67 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\camera2\CameraAccessException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */