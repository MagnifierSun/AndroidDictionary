/*     */ package android.app;
/*     */ 
/*     */ import android.content.Intent;
/*     */ import android.content.pm.ResolveInfo;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.Bundle;
/*     */ import android.view.View;
/*     */ import android.widget.ListView;
/*     */ import java.util.List;
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
/*     */ public abstract class LauncherActivity
/*     */   extends ListActivity
/*     */ {
/*     */   public LauncherActivity() {
/*  36 */     throw new RuntimeException("Stub!");
/*     */   } protected void onCreate(Bundle icicle) {
/*  38 */     throw new RuntimeException("Stub!");
/*     */   } public void setTitle(CharSequence title) {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   } public void setTitle(int titleId) {
/*  42 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onSetContentView() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } protected void onListItemClick(ListView l, View v, int position, long id) {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Intent intentForPosition(int position) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ListItem itemForPosition(int position) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Intent getTargetIntent() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected List<ResolveInfo> onQueryPackageManager(Intent queryIntent) {
/*  81 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<ListItem> makeListItems() {
/*  87 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class IconResizer
/*     */   {
/*     */     public IconResizer() {
/*  95 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */     
/*     */     public Drawable createIconThumbnail(Drawable icon) {
/* 110 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */   
/*     */   public static class ListItem {
/*     */     public String className;
/*     */     public Bundle extras;
/*     */     public Drawable icon;
/*     */     
/*     */     public ListItem() {
/* 120 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/*     */     public CharSequence label;
/*     */     public String packageName;
/*     */     public ResolveInfo resolveInfo;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\LauncherActivity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */