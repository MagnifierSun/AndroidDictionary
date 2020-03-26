/*     */ package android.system;
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
/*     */ public final class StructStat
/*     */ {
/*     */   public StructStat(long st_dev, long st_ino, int st_mode, long st_nlink, int st_uid, int st_gid, long st_rdev, long st_size, long st_atime, long st_mtime, long st_ctime, long st_blksize, long st_blocks) {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public StructStat(long st_dev, long st_ino, int st_mode, long st_nlink, int st_uid, int st_gid, long st_rdev, long st_size, StructTimespec st_atim, StructTimespec st_mtim, StructTimespec st_ctim, long st_blksize, long st_blocks) {
/*  39 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  46 */   public final StructTimespec st_atim = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  51 */   public final long st_atime = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   public final long st_blksize = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  64 */   public final long st_blocks = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   public final StructTimespec st_ctim = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   public final long st_ctime = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   public final long st_dev = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   public final int st_gid = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   public final long st_ino = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  94 */   public final int st_mode = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  99 */   public final StructTimespec st_mtim = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 104 */   public final long st_mtime = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 109 */   public final long st_nlink = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 114 */   public final long st_rdev = 0L;
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
/* 125 */   public final long st_size = 0L;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 130 */   public final int st_uid = 0;
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\system\StructStat.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */