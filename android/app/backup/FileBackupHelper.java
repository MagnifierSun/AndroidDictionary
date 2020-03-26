/*    */ package android.app.backup;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.ParcelFileDescriptor;
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
/*    */ public class FileBackupHelper
/*    */   implements BackupHelper
/*    */ {
/*    */   public FileBackupHelper(Context context, String... files) {
/* 49 */     throw new RuntimeException("Stub!");
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
/*    */ 
/*    */   
/*    */   public void performBackup(ParcelFileDescriptor oldState, BackupDataOutput data, ParcelFileDescriptor newState) {
/* 64 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void restoreEntity(BackupDataInputStream data) {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   } public void writeNewStateDescription(ParcelFileDescriptor fd) {
/* 75 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() throws Throwable {
/* 77 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\backup\FileBackupHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */