/*      */ package android.view;
/*      */ 
/*      */ import android.os.IBinder;
/*      */ import android.os.Parcel;
/*      */ import android.os.Parcelable;
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
/*      */ public interface WindowManager
/*      */   extends ViewManager
/*      */ {
/*      */   Display getDefaultDisplay();
/*      */   
/*      */   void removeViewImmediate(View paramView);
/*      */   
/*      */   public static class BadTokenException
/*      */     extends RuntimeException
/*      */   {
/*      */     public BadTokenException() {
/*   85 */       throw new RuntimeException("Stub!");
/*      */     } public BadTokenException(String name) {
/*   87 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class InvalidDisplayException
/*      */     extends RuntimeException
/*      */   {
/*      */     public InvalidDisplayException() {
/*   98 */       throw new RuntimeException("Stub!");
/*      */     } public InvalidDisplayException(String name) {
/*  100 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */   public static class LayoutParams extends ViewGroup.LayoutParams implements Parcelable { public static final int ALPHA_CHANGED = 128; public static final int ANIMATION_CHANGED = 16; public static final float BRIGHTNESS_OVERRIDE_FULL = 1.0F; public static final float BRIGHTNESS_OVERRIDE_NONE = -1.0F;
/*      */     public static final float BRIGHTNESS_OVERRIDE_OFF = 0.0F;
/*      */     
/*  106 */     public LayoutParams() { super((ViewGroup.LayoutParams)null);
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
/* 1139 */       this.alpha = 1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1148 */       this.buttonBrightness = -1.0F;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1156 */       this.dimAmount = 1.0F;
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
/* 1250 */       this.layoutInDisplayCutoutMode = 0;
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
/* 1302 */       this.rotationAnimation = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1311 */       this.screenBrightness = -1.0F;
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
/* 1322 */       this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int _type) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int _type, int _flags) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int _type, int _flags, int _format) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int w, int h, int _type, int _flags, int _format) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(int w, int h, int xpos, int ypos, int _type, int _flags, int _format) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1; throw new RuntimeException("Stub!"); } public LayoutParams(Parcel in) { super((ViewGroup.LayoutParams)null); this.alpha = 1.0F; this.buttonBrightness = -1.0F; this.dimAmount = 1.0F; this.layoutInDisplayCutoutMode = 0; this.rotationAnimation = 0; this.screenBrightness = -1.0F; this.screenOrientation = -1;
/*      */       throw new RuntimeException("Stub!"); }
/*      */ 
/*      */     
/*      */     public static boolean mayUseInputMethod(int flags) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public final void setTitle(CharSequence title) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public final CharSequence getTitle() {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public void setColorMode(int colorMode) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public int getColorMode() {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public int describeContents() {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public void writeToParcel(Parcel out, int parcelableFlags) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public final int copyFrom(LayoutParams o) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public String debug(String output) {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public String toString() {
/*      */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public static final Parcelable.Creator<LayoutParams> CREATOR = null;
/*      */     public static final int DIM_AMOUNT_CHANGED = 32;
/*      */     public static final int FIRST_APPLICATION_WINDOW = 1;
/*      */     public static final int FIRST_SUB_WINDOW = 1000;
/*      */     public static final int FIRST_SYSTEM_WINDOW = 2000;
/*      */     public static final int FLAGS_CHANGED = 4;
/*      */     public static final int FLAG_ALLOW_LOCK_WHILE_SCREEN_ON = 1;
/*      */     public static final int FLAG_ALT_FOCUSABLE_IM = 131072;
/*      */     @Deprecated
/*      */     public static final int FLAG_BLUR_BEHIND = 4;
/*      */     public static final int FLAG_DIM_BEHIND = 2;
/*      */     @Deprecated
/*      */     public static final int FLAG_DISMISS_KEYGUARD = 4194304;
/*      */     @Deprecated
/*      */     public static final int FLAG_DITHER = 4096;
/*      */     public static final int FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS = -2147483648;
/*      */     public static final int FLAG_FORCE_NOT_FULLSCREEN = 2048;
/*      */     public static final int FLAG_FULLSCREEN = 1024;
/*      */     public static final int FLAG_HARDWARE_ACCELERATED = 16777216;
/*      */     public static final int FLAG_IGNORE_CHEEK_PRESSES = 32768;
/*      */     public static final int FLAG_KEEP_SCREEN_ON = 128;
/*      */     public static final int FLAG_LAYOUT_ATTACHED_IN_DECOR = 1073741824;
/*      */     public static final int FLAG_LAYOUT_INSET_DECOR = 65536;
/*      */     public static final int FLAG_LAYOUT_IN_OVERSCAN = 33554432;
/*      */     public static final int FLAG_LAYOUT_IN_SCREEN = 256;
/*      */     public static final int FLAG_LAYOUT_NO_LIMITS = 512;
/*      */     public static final int FLAG_LOCAL_FOCUS_MODE = 268435456;
/*      */     public static final int FLAG_NOT_FOCUSABLE = 8;
/*      */     public static final int FLAG_NOT_TOUCHABLE = 16;
/*      */     public static final int FLAG_NOT_TOUCH_MODAL = 32;
/*      */     public static final int FLAG_SCALED = 16384;
/*      */     public static final int FLAG_SECURE = 8192;
/*      */     public static final int FLAG_SHOW_WALLPAPER = 1048576;
/*      */     @Deprecated
/*      */     public static final int FLAG_SHOW_WHEN_LOCKED = 524288;
/*      */     public static final int FLAG_SPLIT_TOUCH = 8388608;
/*      */     @Deprecated
/*      */     public static final int FLAG_TOUCHABLE_WHEN_WAKING = 64;
/*      */     public static final int FLAG_TRANSLUCENT_NAVIGATION = 134217728;
/*      */     public static final int FLAG_TRANSLUCENT_STATUS = 67108864;
/*      */     @Deprecated
/*      */     public static final int FLAG_TURN_SCREEN_ON = 2097152;
/*      */     public static final int FLAG_WATCH_OUTSIDE_TOUCH = 262144;
/*      */     public static final int FORMAT_CHANGED = 8;
/*      */     public static final int LAST_APPLICATION_WINDOW = 99;
/*      */     public static final int LAST_SUB_WINDOW = 1999;
/*      */     public static final int LAST_SYSTEM_WINDOW = 2999;
/*      */     public static final int LAYOUT_CHANGED = 1;
/*      */     public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_DEFAULT = 0;
/*      */     public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_NEVER = 2;
/*      */     public static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = 1;
/*      */     public static final int MEMORY_TYPE_CHANGED = 256;
/*      */     @Deprecated
/*      */     public static final int MEMORY_TYPE_GPU = 2;
/*      */     @Deprecated
/*      */     public static final int MEMORY_TYPE_HARDWARE = 1;
/*      */     @Deprecated
/*      */     public static final int MEMORY_TYPE_NORMAL = 0;
/*      */     @Deprecated
/*      */     public static final int MEMORY_TYPE_PUSH_BUFFERS = 3;
/*      */     public static final int ROTATION_ANIMATION_CHANGED = 4096;
/*      */     public static final int ROTATION_ANIMATION_CROSSFADE = 1;
/*      */     public static final int ROTATION_ANIMATION_JUMPCUT = 2;
/*      */     public static final int ROTATION_ANIMATION_ROTATE = 0;
/*      */     public static final int ROTATION_ANIMATION_SEAMLESS = 3;
/*      */     public static final int SCREEN_BRIGHTNESS_CHANGED = 2048;
/*      */     public static final int SCREEN_ORIENTATION_CHANGED = 1024;
/*      */     public static final int SOFT_INPUT_ADJUST_NOTHING = 48;
/*      */     public static final int SOFT_INPUT_ADJUST_PAN = 32;
/*      */     public static final int SOFT_INPUT_ADJUST_RESIZE = 16;
/*      */     public static final int SOFT_INPUT_ADJUST_UNSPECIFIED = 0;
/*      */     public static final int SOFT_INPUT_IS_FORWARD_NAVIGATION = 256;
/*      */     public static final int SOFT_INPUT_MASK_ADJUST = 240;
/*      */     public static final int SOFT_INPUT_MASK_STATE = 15;
/*      */     public static final int SOFT_INPUT_MODE_CHANGED = 512;
/*      */     public static final int SOFT_INPUT_STATE_ALWAYS_HIDDEN = 3;
/*      */     public static final int SOFT_INPUT_STATE_ALWAYS_VISIBLE = 5;
/*      */     public static final int SOFT_INPUT_STATE_HIDDEN = 2;
/*      */     public static final int SOFT_INPUT_STATE_UNCHANGED = 1;
/*      */     public static final int SOFT_INPUT_STATE_UNSPECIFIED = 0;
/*      */     public static final int SOFT_INPUT_STATE_VISIBLE = 4;
/*      */     public static final int TITLE_CHANGED = 64;
/*      */     public static final int TYPE_ACCESSIBILITY_OVERLAY = 2032;
/*      */     public static final int TYPE_APPLICATION = 2;
/*      */     public static final int TYPE_APPLICATION_ATTACHED_DIALOG = 1003;
/*      */     public static final int TYPE_APPLICATION_MEDIA = 1001;
/*      */     public static final int TYPE_APPLICATION_OVERLAY = 2038;
/*      */     public static final int TYPE_APPLICATION_PANEL = 1000;
/*      */     public static final int TYPE_APPLICATION_STARTING = 3;
/*      */     public static final int TYPE_APPLICATION_SUB_PANEL = 1002;
/*      */     public static final int TYPE_BASE_APPLICATION = 1;
/*      */     public static final int TYPE_CHANGED = 2;
/*      */     public static final int TYPE_DRAWN_APPLICATION = 4;
/*      */     public static final int TYPE_INPUT_METHOD = 2011;
/*      */     public static final int TYPE_INPUT_METHOD_DIALOG = 2012;
/*      */     public static final int TYPE_KEYGUARD_DIALOG = 2009;
/*      */     @Deprecated
/*      */     public static final int TYPE_PHONE = 2002;
/*      */     @Deprecated
/*      */     public static final int TYPE_PRIORITY_PHONE = 2007;
/*      */     public static final int TYPE_PRIVATE_PRESENTATION = 2030;
/*      */     public static final int TYPE_SEARCH_BAR = 2001;
/*      */     public static final int TYPE_STATUS_BAR = 2000;
/*      */     public static final int TYPE_STATUS_BAR_PANEL = 2014;
/*      */     @Deprecated
/*      */     public static final int TYPE_SYSTEM_ALERT = 2003;
/*      */     public static final int TYPE_SYSTEM_DIALOG = 2008;
/*      */     @Deprecated
/*      */     public static final int TYPE_SYSTEM_ERROR = 2010;
/*      */     @Deprecated
/*      */     public static final int TYPE_SYSTEM_OVERLAY = 2006;
/*      */     @Deprecated
/*      */     public static final int TYPE_TOAST = 2005;
/*      */     public static final int TYPE_WALLPAPER = 2013;
/*      */     public float alpha;
/*      */     public float buttonBrightness;
/*      */     public float dimAmount;
/*      */     @ExportedProperty(flagMapping = {@FlagToString(mask = 1, equals = 1, name = "ALLOW_LOCK_WHILE_SCREEN_ON"), @FlagToString(mask = 2, equals = 2, name = "DIM_BEHIND"), @FlagToString(mask = 4, equals = 4, name = "BLUR_BEHIND"), @FlagToString(mask = 8, equals = 8, name = "NOT_FOCUSABLE"), @FlagToString(mask = 16, equals = 16, name = "NOT_TOUCHABLE"), @FlagToString(mask = 32, equals = 32, name = "NOT_TOUCH_MODAL"), @FlagToString(mask = 64, equals = 64, name = "TOUCHABLE_WHEN_WAKING"), @FlagToString(mask = 128, equals = 128, name = "KEEP_SCREEN_ON"), @FlagToString(mask = 256, equals = 256, name = "LAYOUT_IN_SCREEN"), @FlagToString(mask = 512, equals = 512, name = "LAYOUT_NO_LIMITS"), @FlagToString(mask = 1024, equals = 1024, name = "FULLSCREEN"), @FlagToString(mask = 2048, equals = 2048, name = "FORCE_NOT_FULLSCREEN"), @FlagToString(mask = 4096, equals = 4096, name = "DITHER"), @FlagToString(mask = 8192, equals = 8192, name = "SECURE"), @FlagToString(mask = 16384, equals = 16384, name = "SCALED"), @FlagToString(mask = 32768, equals = 32768, name = "IGNORE_CHEEK_PRESSES"), @FlagToString(mask = 65536, equals = 65536, name = "LAYOUT_INSET_DECOR"), @FlagToString(mask = 131072, equals = 131072, name = "ALT_FOCUSABLE_IM"), @FlagToString(mask = 262144, equals = 262144, name = "WATCH_OUTSIDE_TOUCH"), @FlagToString(mask = 524288, equals = 524288, name = "SHOW_WHEN_LOCKED"), @FlagToString(mask = 1048576, equals = 1048576, name = "SHOW_WALLPAPER"), @FlagToString(mask = 2097152, equals = 2097152, name = "TURN_SCREEN_ON"), @FlagToString(mask = 4194304, equals = 4194304, name = "DISMISS_KEYGUARD"), @FlagToString(mask = 8388608, equals = 8388608, name = "SPLIT_TOUCH"), @FlagToString(mask = 16777216, equals = 16777216, name = "HARDWARE_ACCELERATED"), @FlagToString(mask = 33554432, equals = 33554432, name = "LOCAL_FOCUS_MODE"), @FlagToString(mask = 67108864, equals = 67108864, name = "TRANSLUCENT_STATUS"), @FlagToString(mask = 134217728, equals = 134217728, name = "TRANSLUCENT_NAVIGATION"), @FlagToString(mask = 268435456, equals = 268435456, name = "LOCAL_FOCUS_MODE"), @FlagToString(mask = 536870912, equals = 536870912, name = "FLAG_SLIPPERY"), @FlagToString(mask = 1073741824, equals = 1073741824, name = "FLAG_LAYOUT_ATTACHED_IN_DECOR"), @FlagToString(mask = -2147483648, equals = -2147483648, name = "DRAWS_SYSTEM_BAR_BACKGROUNDS")}, formatToHexString = true)
/*      */     public int flags;
/*      */     public int format;
/*      */     public int gravity;
/*      */     public float horizontalMargin;
/*      */     @ExportedProperty
/*      */     public float horizontalWeight;
/*      */     public int layoutInDisplayCutoutMode;
/*      */     @Deprecated
/*      */     public int memoryType;
/*      */     public String packageName;
/*      */     public int preferredDisplayModeId;
/*      */     @Deprecated
/*      */     public float preferredRefreshRate;
/*      */     public int rotationAnimation;
/*      */     public float screenBrightness;
/*      */     public int screenOrientation;
/*      */     public int softInputMode;
/*      */     public int systemUiVisibility;
/*      */     public IBinder token;
/*      */     @ExportedProperty(mapping = {@IntToString(from = 1, to = "BASE_APPLICATION"), @IntToString(from = 2, to = "APPLICATION"), @IntToString(from = 3, to = "APPLICATION_STARTING"), @IntToString(from = 4, to = "DRAWN_APPLICATION"), @IntToString(from = 1000, to = "APPLICATION_PANEL"), @IntToString(from = 1001, to = "APPLICATION_MEDIA"), @IntToString(from = 1002, to = "APPLICATION_SUB_PANEL"), @IntToString(from = 1005, to = "APPLICATION_ABOVE_SUB_PANEL"), @IntToString(from = 1003, to = "APPLICATION_ATTACHED_DIALOG"), @IntToString(from = 1004, to = "APPLICATION_MEDIA_OVERLAY"), @IntToString(from = 2000, to = "STATUS_BAR"), @IntToString(from = 2001, to = "SEARCH_BAR"), @IntToString(from = 2002, to = "PHONE"), @IntToString(from = 2003, to = "SYSTEM_ALERT"), @IntToString(from = 2005, to = "TOAST"), @IntToString(from = 2006, to = "SYSTEM_OVERLAY"), @IntToString(from = 2007, to = "PRIORITY_PHONE"), @IntToString(from = 2008, to = "SYSTEM_DIALOG"), @IntToString(from = 2009, to = "KEYGUARD_DIALOG"), @IntToString(from = 2010, to = "SYSTEM_ERROR"), @IntToString(from = 2011, to = "INPUT_METHOD"), @IntToString(from = 2012, to = "INPUT_METHOD_DIALOG"), @IntToString(from = 2013, to = "WALLPAPER"), @IntToString(from = 2014, to = "STATUS_BAR_PANEL"), @IntToString(from = 2015, to = "SECURE_SYSTEM_OVERLAY"), @IntToString(from = 2016, to = "DRAG"), @IntToString(from = 2017, to = "STATUS_BAR_SUB_PANEL"), @IntToString(from = 2018, to = "POINTER"), @IntToString(from = 2019, to = "NAVIGATION_BAR"), @IntToString(from = 2020, to = "VOLUME_OVERLAY"), @IntToString(from = 2021, to = "BOOT_PROGRESS"), @IntToString(from = 2022, to = "INPUT_CONSUMER"), @IntToString(from = 2023, to = "DREAM"), @IntToString(from = 2024, to = "NAVIGATION_BAR_PANEL"), @IntToString(from = 2026, to = "DISPLAY_OVERLAY"), @IntToString(from = 2027, to = "MAGNIFICATION_OVERLAY"), @IntToString(from = 2037, to = "PRESENTATION"), @IntToString(from = 2030, to = "PRIVATE_PRESENTATION"), @IntToString(from = 2031, to = "VOICE_INTERACTION"), @IntToString(from = 2033, to = "VOICE_INTERACTION_STARTING"), @IntToString(from = 2034, to = "DOCK_DIVIDER"), @IntToString(from = 2035, to = "QS_DIALOG"), @IntToString(from = 2036, to = "SCREENSHOT"), @IntToString(from = 2038, to = "APPLICATION_OVERLAY")})
/*      */     public int type;
/*      */     public float verticalMargin;
/*      */     @ExportedProperty
/*      */     public float verticalWeight;
/*      */     public int windowAnimations;
/*      */     @ExportedProperty
/*      */     public int x;
/*      */     @ExportedProperty
/*      */     public int y; }
/*      */ 
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\view\WindowManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */