/*     */ package android.text;
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
/*     */ public abstract class LoginFilter
/*     */   implements InputFilter
/*     */ {
/*     */   LoginFilter() {
/*  33 */     throw new RuntimeException("Stub!");
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
/*     */   public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStart() {
/*  52 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onInvalidCharacter(char c) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStop() {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract boolean isAllowed(char paramChar);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class PasswordFilterGMail
/*     */     extends LoginFilter
/*     */   {
/*     */     public PasswordFilterGMail() {
/*  82 */       throw new RuntimeException("Stub!");
/*     */     } public PasswordFilterGMail(boolean appendInvalid) {
/*  84 */       throw new RuntimeException("Stub!");
/*     */     } public boolean isAllowed(char c) {
/*  86 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class UsernameFilterGMail
/*     */     extends LoginFilter
/*     */   {
/*     */     public UsernameFilterGMail() {
/*  99 */       throw new RuntimeException("Stub!");
/*     */     } public UsernameFilterGMail(boolean appendInvalid) {
/* 101 */       throw new RuntimeException("Stub!");
/*     */     } public boolean isAllowed(char c) {
/* 103 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class UsernameFilterGeneric
/*     */     extends LoginFilter
/*     */   {
/*     */     public UsernameFilterGeneric() {
/* 115 */       throw new RuntimeException("Stub!");
/*     */     } public UsernameFilterGeneric(boolean appendInvalid) {
/* 117 */       throw new RuntimeException("Stub!");
/*     */     } public boolean isAllowed(char c) {
/* 119 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\LoginFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */