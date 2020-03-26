/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentSender;
/*     */ import android.os.Bundle;
/*     */ import android.os.Handler;
/*     */ import android.view.LayoutInflater;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.PrintWriter;
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
/*     */ @Deprecated
/*     */ public abstract class FragmentHostCallback<E>
/*     */   extends FragmentContainer
/*     */ {
/*     */   public FragmentHostCallback(Context context, Handler handler, int windowAnimations) {
/*  42 */     throw new RuntimeException("Stub!");
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
/*     */   public void onDump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
/*  54 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onShouldSaveFragmentState(Fragment fragment) {
/*  60 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LayoutInflater onGetLayoutInflater() {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onUseFragmentManagerInflaterFactory() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public abstract E onGetHost();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onInvalidateOptionsMenu() {
/*  90 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStartActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intent, int requestCode, @RecentlyNullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onRequestPermissionsFromFragment(@RecentlyNonNull Fragment fragment, @RecentlyNonNull String[] permissions, int requestCode) {
/* 117 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onHasWindowAnimations() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int onGetWindowAnimations() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onAttachFragment(Fragment fragment) {
/* 137 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public <T extends android.view.View> T onFindViewById(int id) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   } public boolean onHasView() {
/* 145 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\FragmentHostCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */