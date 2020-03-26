/*     */ package android.inputmethodservice;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.res.Resources;
/*     */ import android.content.res.XmlResourceParser;
/*     */ import android.graphics.drawable.Drawable;
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
/*     */ public class Keyboard
/*     */ {
/*     */   public static final int EDGE_BOTTOM = 8;
/*     */   public static final int EDGE_LEFT = 1;
/*     */   public static final int EDGE_RIGHT = 2;
/*     */   public static final int EDGE_TOP = 4;
/*     */   public static final int KEYCODE_ALT = -6;
/*     */   public static final int KEYCODE_CANCEL = -3;
/*     */   public static final int KEYCODE_DELETE = -5;
/*     */   public static final int KEYCODE_DONE = -4;
/*     */   public static final int KEYCODE_MODE_CHANGE = -2;
/*     */   public static final int KEYCODE_SHIFT = -1;
/*     */   
/*     */   public Keyboard(Context context, int xmlLayoutResId) {
/*  55 */     throw new RuntimeException("Stub!");
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
/*     */   public Keyboard(Context context, int xmlLayoutResId, int modeId, int width, int height) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Keyboard(Context context, int xmlLayoutResId, int modeId) {
/*  77 */     throw new RuntimeException("Stub!");
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
/*     */   public Keyboard(Context context, int layoutTemplateResId, CharSequence characters, int columns, int horizontalPadding) {
/*  94 */     throw new RuntimeException("Stub!");
/*     */   } public List<Key> getKeys() {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   } public List<Key> getModifierKeys() {
/*  98 */     throw new RuntimeException("Stub!");
/*     */   } protected int getHorizontalGap() {
/* 100 */     throw new RuntimeException("Stub!");
/*     */   } protected void setHorizontalGap(int gap) {
/* 102 */     throw new RuntimeException("Stub!");
/*     */   } protected int getVerticalGap() {
/* 104 */     throw new RuntimeException("Stub!");
/*     */   } protected void setVerticalGap(int gap) {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   } protected int getKeyHeight() {
/* 108 */     throw new RuntimeException("Stub!");
/*     */   } protected void setKeyHeight(int height) {
/* 110 */     throw new RuntimeException("Stub!");
/*     */   } protected int getKeyWidth() {
/* 112 */     throw new RuntimeException("Stub!");
/*     */   } protected void setKeyWidth(int width) {
/* 114 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHeight() {
/* 121 */     throw new RuntimeException("Stub!");
/*     */   } public int getMinWidth() {
/* 123 */     throw new RuntimeException("Stub!");
/*     */   } public boolean setShifted(boolean shiftState) {
/* 125 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isShifted() {
/* 127 */     throw new RuntimeException("Stub!");
/*     */   } public int getShiftKeyIndex() {
/* 129 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int[] getNearestKeys(int x, int y) {
/* 139 */     throw new RuntimeException("Stub!");
/*     */   } protected Row createRowFromXml(Resources res, XmlResourceParser parser) {
/* 141 */     throw new RuntimeException("Stub!");
/*     */   } protected Key createKeyFromXml(Resources res, Row parent, int x, int y, XmlResourceParser parser) {
/* 143 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Key
/*     */   {
/*     */     public int[] codes;
/*     */     
/*     */     public int edgeFlags;
/*     */     
/*     */     public int gap;
/*     */     
/*     */     public int height;
/*     */     
/*     */     public Drawable icon;
/*     */     
/*     */     public Drawable iconPreview;
/*     */     
/*     */     public CharSequence label;
/*     */     
/*     */     public boolean modifier;
/*     */     
/*     */     public boolean on;
/*     */     
/*     */     public CharSequence popupCharacters;
/*     */     
/*     */     public int popupResId;
/*     */     
/*     */     public boolean pressed;
/*     */     
/*     */     public boolean repeatable;
/*     */     
/*     */     public boolean sticky;
/*     */     
/*     */     public CharSequence text;
/*     */     
/*     */     public int width;
/*     */     
/*     */     public int x;
/*     */     
/*     */     public int y;
/*     */ 
/*     */     
/*     */     public Key(Keyboard.Row parent) {
/* 188 */       throw new RuntimeException("Stub!");
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
/*     */     public Key(Resources res, Keyboard.Row parent, int x, int y, XmlResourceParser parser) {
/* 200 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onPressed() {
/* 208 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onReleased(boolean inside) {
/* 228 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isInside(int x, int y) {
/* 239 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int squaredDistanceFrom(int x, int y) {
/* 248 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int[] getCurrentDrawableState() {
/* 256 */       throw new RuntimeException("Stub!");
/*     */     }
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
/*     */   public static class Row
/*     */   {
/*     */     public int defaultHeight;
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
/*     */     public int defaultHorizontalGap;
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
/*     */     public int defaultWidth;
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
/*     */     public int mode;
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
/*     */     public int rowEdgeFlags;
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
/*     */     public int verticalGap;
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
/*     */     public Row(Keyboard parent) {
/* 357 */       throw new RuntimeException("Stub!");
/*     */     } public Row(Resources res, Keyboard parent, XmlResourceParser parser) {
/* 359 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\inputmethodservice\Keyboard.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */