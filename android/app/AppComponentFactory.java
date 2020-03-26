/*     */ package android.app;
/*     */ 
/*     */ import android.content.BroadcastReceiver;
/*     */ import android.content.ContentProvider;
/*     */ import android.content.Intent;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
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
/*     */ public class AppComponentFactory
/*     */ {
/*     */   public AppComponentFactory() {
/*  35 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public Application instantiateApplication(@RecentlyNonNull ClassLoader cl, @RecentlyNonNull String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
/*  54 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public Activity instantiateActivity(@RecentlyNonNull ClassLoader cl, @RecentlyNonNull String className, @RecentlyNullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
/*  75 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public BroadcastReceiver instantiateReceiver(@RecentlyNonNull ClassLoader cl, @RecentlyNonNull String className, @RecentlyNullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Service instantiateService(@RecentlyNonNull ClassLoader cl, @RecentlyNonNull String className, @RecentlyNullable Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
/* 113 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   public ContentProvider instantiateProvider(@RecentlyNonNull ClassLoader cl, @RecentlyNonNull String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\AppComponentFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */