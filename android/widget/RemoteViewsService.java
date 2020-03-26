/*    */ package android.widget;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class RemoteViewsService
/*    */   extends Service
/*    */ {
/*    */   public RemoteViewsService() {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   } public IBinder onBind(Intent intent) {
/* 33 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract RemoteViewsFactory onGetViewFactory(Intent paramIntent);
/*    */   
/*    */   public static interface RemoteViewsFactory {
/*    */     void onCreate();
/*    */     
/*    */     void onDataSetChanged();
/*    */     
/*    */     void onDestroy();
/*    */     
/*    */     int getCount();
/*    */     
/*    */     RemoteViews getViewAt(int param1Int);
/*    */     
/*    */     RemoteViews getLoadingView();
/*    */     
/*    */     int getViewTypeCount();
/*    */     
/*    */     long getItemId(int param1Int);
/*    */     
/*    */     boolean hasStableIds();
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\widget\RemoteViewsService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */