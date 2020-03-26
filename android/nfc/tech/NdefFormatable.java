/*     */ package android.nfc.tech;
/*     */ 
/*     */ import android.nfc.FormatException;
/*     */ import android.nfc.NdefMessage;
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
/*     */ public final class NdefFormatable
/*     */   implements TagTechnology
/*     */ {
/*     */   NdefFormatable(Tag tag) throws RemoteException {
/*  51 */     throw new RuntimeException("Stub!");
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
/*     */   public static NdefFormatable get(Tag tag) {
/*  63 */     throw new RuntimeException("Stub!");
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
/*     */   public void format(NdefMessage firstMessage) throws FormatException, IOException {
/*  84 */     throw new RuntimeException("Stub!");
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
/*     */   public void formatReadOnly(NdefMessage firstMessage) throws FormatException, IOException {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isConnected() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public Tag getTag() {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public void close() throws IOException {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   } public void connect() throws IOException {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\nfc\tech\NdefFormatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */