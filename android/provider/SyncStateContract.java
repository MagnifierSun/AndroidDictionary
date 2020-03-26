/*     */ package android.provider;
/*     */ 
/*     */ import android.accounts.Account;
/*     */ import android.content.ContentProviderClient;
/*     */ import android.content.ContentProviderOperation;
/*     */ import android.net.Uri;
/*     */ import android.os.RemoteException;
/*     */ import android.util.Pair;
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
/*     */ public class SyncStateContract
/*     */ {
/*     */   public SyncStateContract() {
/*  33 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static interface Columns
/*     */     extends BaseColumns
/*     */   {
/*     */     public static final String ACCOUNT_NAME = "account_name";
/*     */ 
/*     */ 
/*     */     
/*     */     public static final String ACCOUNT_TYPE = "account_type";
/*     */ 
/*     */     
/*     */     public static final String DATA = "data";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Constants
/*     */     implements Columns
/*     */   {
/*     */     public static final String CONTENT_DIRECTORY = "syncstate";
/*     */ 
/*     */ 
/*     */     
/*     */     public Constants() {
/*  62 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static final class Helpers
/*     */   {
/*     */     public Helpers() {
/*  70 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public static byte[] get(ContentProviderClient provider, Uri uri, Account account) throws RemoteException {
/*  83 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */     public static void set(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException {
/*  96 */       throw new RuntimeException("Stub!");
/*     */     } public static Uri insert(ContentProviderClient provider, Uri uri, Account account, byte[] data) throws RemoteException {
/*  98 */       throw new RuntimeException("Stub!");
/*     */     } public static void update(ContentProviderClient provider, Uri uri, byte[] data) throws RemoteException {
/* 100 */       throw new RuntimeException("Stub!");
/*     */     } public static Pair<Uri, byte[]> getWithUri(ContentProviderClient provider, Uri uri, Account account) throws RemoteException {
/* 102 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static ContentProviderOperation newSetOperation(Uri uri, Account account, byte[] data) {
/* 114 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static ContentProviderOperation newUpdateOperation(Uri uri, byte[] data) {
/* 125 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\provider\SyncStateContract.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */