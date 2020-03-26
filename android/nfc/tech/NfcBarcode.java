/*     */ package android.nfc.tech;
/*     */ 
/*     */ import android.nfc.Tag;
/*     */ import android.os.RemoteException;
/*     */ import java.io.IOException;
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
/*     */ public final class NfcBarcode
/*     */   implements TagTechnology
/*     */ {
/*     */   public static final int TYPE_KOVIO = 1;
/*     */   public static final int TYPE_UNKNOWN = -1;
/*     */   
/*     */   NfcBarcode(Tag tag) throws RemoteException {
/*  37 */     throw new RuntimeException("Stub!");
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
/*     */   public static NfcBarcode get(Tag tag) {
/*  50 */     throw new RuntimeException("Stub!");
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
/*     */   public int getType() {
/*  62 */     throw new RuntimeException("Stub!");
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
/*     */   public byte[] getBarcode() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isConnected() {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } public Tag getTag() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } public void close() throws IOException {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } public void connect() throws IOException {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\nfc\tech\NfcBarcode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */