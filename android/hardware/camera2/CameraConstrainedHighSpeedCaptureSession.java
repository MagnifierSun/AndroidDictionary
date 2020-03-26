/*    */ package android.hardware.camera2;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.List;
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
/*    */ public abstract class CameraConstrainedHighSpeedCaptureSession
/*    */   extends CameraCaptureSession
/*    */ {
/*    */   public CameraConstrainedHighSpeedCaptureSession() {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   @RecentlyNonNull
/*    */   public abstract List<CaptureRequest> createHighSpeedRequestList(@RecentlyNonNull CaptureRequest paramCaptureRequest) throws CameraAccessException;
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\hardware\camera2\CameraConstrainedHighSpeedCaptureSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */