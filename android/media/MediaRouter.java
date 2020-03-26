/*      */ package android.media;
/*      */ 
/*      */ import android.content.Context;
/*      */ import android.graphics.drawable.Drawable;
/*      */ import android.view.Display;
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class MediaRouter
/*      */ {
/*      */   public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
/*      */   public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
/*      */   public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
/*      */   public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
/*      */   public static final int ROUTE_TYPE_USER = 8388608;
/*      */   
/*      */   MediaRouter(Context context) {
/*   41 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteInfo getDefaultRoute() {
/*   52 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteInfo getSelectedRoute(int type) {
/*   61 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addCallback(int types, Callback cb) {
/*   76 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addCallback(int types, Callback cb, int flags) {
/*   95 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeCallback(Callback cb) {
/*  103 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void selectRoute(int types, @RecentlyNonNull RouteInfo route) {
/*  120 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void addUserRoute(UserRouteInfo info) {
/*  131 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void removeUserRoute(UserRouteInfo info) {
/*  140 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void clearUserRoutes() {
/*  148 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getCategoryCount() {
/*  157 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteCategory getCategoryAt(int index) {
/*  167 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getRouteCount() {
/*  176 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteInfo getRouteAt(int index) {
/*  185 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public UserRouteInfo createUserRoute(RouteCategory category) {
/*  198 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteCategory createRouteCategory(CharSequence name, boolean isGroupable) {
/*  208 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RouteCategory createRouteCategory(int nameResId, boolean isGroupable) {
/*  218 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static abstract class Callback
/*      */   {
/*      */     public Callback() {
/*  306 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteSelected(MediaRouter param1MediaRouter, int param1Int, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteUnselected(MediaRouter param1MediaRouter, int param1Int, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteAdded(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteRemoved(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteChanged(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteGrouped(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo, MediaRouter.RouteGroup param1RouteGroup, int param1Int);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteUngrouped(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo, MediaRouter.RouteGroup param1RouteGroup);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public abstract void onRouteVolumeChanged(MediaRouter param1MediaRouter, MediaRouter.RouteInfo param1RouteInfo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void onRoutePresentationDisplayChanged(MediaRouter router, MediaRouter.RouteInfo info) {
/*  403 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RouteCategory
/*      */   {
/*      */     RouteCategory(CharSequence name, int types, boolean groupable) {
/*  413 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence getName() {
/*  419 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence getName(Context context) {
/*  428 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public List<MediaRouter.RouteInfo> getRoutes(List<MediaRouter.RouteInfo> out) {
/*  444 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int getSupportedTypes() {
/*  450 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isGroupable() {
/*  461 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  463 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static class RouteGroup
/*      */     extends RouteInfo
/*      */   {
/*      */     RouteGroup(MediaRouter.RouteCategory category) {
/*  473 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addRoute(MediaRouter.RouteInfo route) {
/*  481 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void addRoute(MediaRouter.RouteInfo route, int insertAt) {
/*  490 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeRoute(MediaRouter.RouteInfo route) {
/*  498 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void removeRoute(int index) {
/*  506 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int getRouteCount() {
/*  512 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaRouter.RouteInfo getRouteAt(int index) {
/*  521 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setIconDrawable(Drawable icon) {
/*  530 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setIconResource(int resId) {
/*  539 */       throw new RuntimeException("Stub!");
/*      */     } public void requestSetVolume(int volume) {
/*  541 */       throw new RuntimeException("Stub!");
/*      */     } public void requestUpdateVolume(int direction) {
/*  543 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  545 */       throw new RuntimeException("Stub!");
/*      */     } }
/*      */   
/*      */   public static class RouteInfo {
/*      */     public static final int DEVICE_TYPE_BLUETOOTH = 3;
/*      */     public static final int DEVICE_TYPE_SPEAKER = 2;
/*      */     public static final int DEVICE_TYPE_TV = 1;
/*      */     public static final int DEVICE_TYPE_UNKNOWN = 0;
/*      */     
/*      */     RouteInfo(MediaRouter.RouteCategory category) {
/*  555 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */     
/*      */     public static final int PLAYBACK_TYPE_LOCAL = 0;
/*      */     
/*      */     public static final int PLAYBACK_TYPE_REMOTE = 1;
/*      */     
/*      */     public static final int PLAYBACK_VOLUME_FIXED = 0;
/*      */     
/*      */     public static final int PLAYBACK_VOLUME_VARIABLE = 1;
/*      */     
/*      */     public CharSequence getName() {
/*  568 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence getName(Context context) {
/*  582 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence getDescription() {
/*  594 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public CharSequence getStatus() {
/*  601 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public int getSupportedTypes() {
/*  607 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getDeviceType() {
/*  619 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaRouter.RouteGroup getGroup() {
/*  625 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     public MediaRouter.RouteCategory getCategory() {
/*  631 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Drawable getIconDrawable() {
/*  640 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setTag(Object tag) {
/*  654 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Object getTag() {
/*  661 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getPlaybackType() {
/*  669 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getPlaybackStream() {
/*  676 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getVolume() {
/*  686 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void requestSetVolume(int volume) {
/*  693 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void requestUpdateVolume(int direction) {
/*  700 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getVolumeMax() {
/*  707 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getVolumeHandling() {
/*  715 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Display getPresentationDisplay() {
/*  746 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isEnabled() {
/*  754 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isConnecting() {
/*  763 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  765 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class SimpleCallback
/*      */     extends Callback
/*      */   {
/*      */     public SimpleCallback() {
/*  846 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteSelected(MediaRouter router, int type, MediaRouter.RouteInfo info) {
/*  848 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteUnselected(MediaRouter router, int type, MediaRouter.RouteInfo info) {
/*  850 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteAdded(MediaRouter router, MediaRouter.RouteInfo info) {
/*  852 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteRemoved(MediaRouter router, MediaRouter.RouteInfo info) {
/*  854 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteChanged(MediaRouter router, MediaRouter.RouteInfo info) {
/*  856 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteGrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group, int index) {
/*  858 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteUngrouped(MediaRouter router, MediaRouter.RouteInfo info, MediaRouter.RouteGroup group) {
/*  860 */       throw new RuntimeException("Stub!");
/*      */     } public void onRouteVolumeChanged(MediaRouter router, MediaRouter.RouteInfo info) {
/*  862 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class UserRouteInfo
/*      */     extends RouteInfo
/*      */   {
/*      */     UserRouteInfo(MediaRouter.RouteCategory category) {
/*  876 */       super(null); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setName(CharSequence name) {
/*  883 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setName(int resId) {
/*  895 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setDescription(CharSequence description) {
/*  907 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setStatus(CharSequence status) {
/*  915 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setRemoteControlClient(RemoteControlClient rcc) {
/*  931 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public RemoteControlClient getRemoteControlClient() {
/*  940 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setIconDrawable(Drawable icon) {
/*  949 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setIconResource(int resId) {
/*  958 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setVolumeCallback(MediaRouter.VolumeCallback vcb) {
/*  965 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPlaybackType(int type) {
/*  976 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setVolumeHandling(int volumeHandling) {
/*  987 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setVolume(int volume) {
/*  995 */       throw new RuntimeException("Stub!");
/*      */     } public void requestSetVolume(int volume) {
/*  997 */       throw new RuntimeException("Stub!");
/*      */     } public void requestUpdateVolume(int direction) {
/*  999 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setVolumeMax(int volumeMax) {
/* 1008 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPlaybackStream(int stream) {
/* 1015 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static abstract class VolumeCallback
/*      */   {
/*      */     public VolumeCallback() {
/* 1031 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public abstract void onVolumeUpdateRequest(MediaRouter.RouteInfo param1RouteInfo, int param1Int);
/*      */     
/*      */     public abstract void onVolumeSetRequest(MediaRouter.RouteInfo param1RouteInfo, int param1Int);
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\media\MediaRouter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */