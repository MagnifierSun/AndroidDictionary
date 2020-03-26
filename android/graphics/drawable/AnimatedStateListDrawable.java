/*     */ package android.graphics.drawable;
/*     */ 
/*     */ import android.content.res.Resources;
/*     */ import android.util.AttributeSet;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.io.IOException;
/*     */ import org.xmlpull.v1.XmlPullParser;
/*     */ import org.xmlpull.v1.XmlPullParserException;
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
/*     */ public class AnimatedStateListDrawable
/*     */   extends StateListDrawable
/*     */ {
/*     */   public AnimatedStateListDrawable() {
/*  49 */     throw new RuntimeException("Stub!");
/*     */   } public boolean setVisible(boolean visible, boolean restart) {
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
/*     */   public void addState(@RecentlyNonNull int[] stateSet, @RecentlyNonNull Drawable drawable, int id) {
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
/*     */   public <T extends Drawable & Animatable> void addTransition(int fromId, int toId, @RecentlyNonNull T transition, boolean reversible) {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public boolean isStateful() {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   } protected boolean onStateChange(int[] stateSet) {
/*  79 */     throw new RuntimeException("Stub!");
/*     */   } public void jumpToCurrentState() {
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
/*     */   
/*     */   public void inflate(@RecentlyNonNull Resources r, @RecentlyNonNull XmlPullParser parser, @RecentlyNonNull AttributeSet attrs, @RecentlyNullable Resources.Theme theme) throws IOException, XmlPullParserException {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyTheme(@RecentlyNullable Resources.Theme theme) {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public Drawable mutate() {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void setConstantState(@RecentlyNonNull DrawableContainer.DrawableContainerState state) {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\graphics\drawable\AnimatedStateListDrawable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */