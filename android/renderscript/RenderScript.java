/*     */ package android.renderscript;
/*     */ 
/*     */ import android.content.Context;
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
/*     */ public class RenderScript
/*     */ {
/*     */   public static final int CREATE_FLAG_LOW_LATENCY = 2;
/*     */   public static final int CREATE_FLAG_LOW_POWER = 4;
/*     */   public static final int CREATE_FLAG_NONE = 0;
/*     */   
/*     */   RenderScript(Context ctx) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static long getMinorVersion() {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   } public void setMessageHandler(RSMessageHandler msg) {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public RSMessageHandler getMessageHandler() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void sendMessage(int id, int[] data) {
/*  61 */     throw new RuntimeException("Stub!");
/*     */   } public void setErrorHandler(RSErrorHandler msg) {
/*  63 */     throw new RuntimeException("Stub!");
/*     */   } public RSErrorHandler getErrorHandler() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPriority(Priority p) {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final Context getApplicationContext() {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static RenderScript create(Context ctx) {
/*  92 */     throw new RuntimeException("Stub!");
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
/*     */   public static RenderScript create(Context ctx, ContextType ct) {
/* 104 */     throw new RuntimeException("Stub!");
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
/*     */   public static RenderScript create(Context ctx, ContextType ct, int flags) {
/* 127 */     throw new RuntimeException("Stub!");
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
/*     */   public static void releaseAllContexts() {
/* 142 */     throw new RuntimeException("Stub!");
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
/*     */   public static RenderScript createMultiContext(Context ctx, ContextType ct, int flags, int API_number) {
/* 157 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void contextDump() {
/* 165 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void finish() {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } protected void finalize() throws Throwable {
/* 175 */     throw new RuntimeException("Stub!");
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
/*     */   public void destroy() {
/* 188 */     throw new RuntimeException("Stub!");
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
/*     */   public enum ContextType
/*     */   {
/* 202 */     NORMAL, DEBUG, PROFILE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public enum Priority
/*     */   {
/* 213 */     LOW, NORMAL;
/*     */   }
/*     */ 
/*     */   
/*     */   public static class RSErrorHandler
/*     */     implements Runnable
/*     */   {
/*     */     protected String mErrorMessage;
/*     */     
/*     */     protected int mErrorNum;
/*     */ 
/*     */     
/*     */     public RSErrorHandler() {
/* 226 */       throw new RuntimeException("Stub!");
/*     */     } public void run() {
/* 228 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class RSMessageHandler
/*     */     implements Runnable
/*     */   {
/*     */     protected int[] mData;
/*     */ 
/*     */ 
/*     */     
/*     */     protected int mID;
/*     */ 
/*     */     
/*     */     protected int mLength;
/*     */ 
/*     */ 
/*     */     
/*     */     public RSMessageHandler() {
/* 250 */       throw new RuntimeException("Stub!");
/*     */     } public void run() {
/* 252 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\renderscript\RenderScript.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */