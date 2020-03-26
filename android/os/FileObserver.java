/*    */ package android.os;
/*    */ 
/*    */ import androidx.annotation.RecentlyNullable;
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
/*    */ public abstract class FileObserver
/*    */ {
/*    */   public static final int ACCESS = 1;
/*    */   public static final int ALL_EVENTS = 4095;
/*    */   public static final int ATTRIB = 4;
/*    */   public static final int CLOSE_NOWRITE = 16;
/*    */   public static final int CLOSE_WRITE = 8;
/*    */   public static final int CREATE = 256;
/*    */   public static final int DELETE = 512;
/*    */   public static final int DELETE_SELF = 1024;
/*    */   public static final int MODIFY = 2;
/*    */   public static final int MOVED_FROM = 64;
/*    */   public static final int MOVED_TO = 128;
/*    */   public static final int MOVE_SELF = 2048;
/*    */   public static final int OPEN = 32;
/*    */   
/*    */   public FileObserver(String path) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FileObserver(String path, int mask) {
/* 58 */     throw new RuntimeException("Stub!");
/*    */   } protected void finalize() {
/* 60 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void startWatching() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void stopWatching() {
/* 76 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract void onEvent(int paramInt, @RecentlyNullable String paramString);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\FileObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */