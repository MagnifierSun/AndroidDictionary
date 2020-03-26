/*     */ package android.transition;
/*     */ 
/*     */ import android.animation.TimeInterpolator;
/*     */ import android.content.Context;
/*     */ import android.util.AttributeSet;
/*     */ import android.view.View;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TransitionSet
/*     */   extends Transition
/*     */ {
/*     */   public static final int ORDERING_SEQUENTIAL = 1;
/*     */   public static final int ORDERING_TOGETHER = 0;
/*     */   
/*     */   public TransitionSet() {
/*  55 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet(Context context, AttributeSet attrs) {
/*  57 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TransitionSet setOrdering(int ordering) {
/*  68 */     throw new RuntimeException("Stub!");
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
/*     */   public int getOrdering() {
/*  80 */     throw new RuntimeException("Stub!");
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
/*     */   public TransitionSet addTransition(Transition transition) {
/*  96 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTransitionCount() {
/* 106 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Transition getTransitionAt(int index) {
/* 116 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TransitionSet setDuration(long duration) {
/* 126 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet setStartDelay(long startDelay) {
/* 128 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet setInterpolator(TimeInterpolator interpolator) {
/* 130 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet addTarget(View target) {
/* 132 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet addTarget(int targetId) {
/* 134 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet addTarget(String targetName) {
/* 136 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet addTarget(Class targetType) {
/* 138 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet addListener(Transition.TransitionListener listener) {
/* 140 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet removeTarget(int targetId) {
/* 142 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet removeTarget(View target) {
/* 144 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet removeTarget(Class target) {
/* 146 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet removeTarget(String target) {
/* 148 */     throw new RuntimeException("Stub!");
/*     */   } public Transition excludeTarget(View target, boolean exclude) {
/* 150 */     throw new RuntimeException("Stub!");
/*     */   } public Transition excludeTarget(String targetName, boolean exclude) {
/* 152 */     throw new RuntimeException("Stub!");
/*     */   } public Transition excludeTarget(int targetId, boolean exclude) {
/* 154 */     throw new RuntimeException("Stub!");
/*     */   } public Transition excludeTarget(Class type, boolean exclude) {
/* 156 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet removeListener(Transition.TransitionListener listener) {
/* 158 */     throw new RuntimeException("Stub!");
/*     */   } public void setPathMotion(PathMotion pathMotion) {
/* 160 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public TransitionSet removeTransition(Transition transition) {
/* 169 */     throw new RuntimeException("Stub!");
/*     */   } public void captureStartValues(TransitionValues transitionValues) {
/* 171 */     throw new RuntimeException("Stub!");
/*     */   } public void captureEndValues(TransitionValues transitionValues) {
/* 173 */     throw new RuntimeException("Stub!");
/*     */   } public void setPropagation(TransitionPropagation propagation) {
/* 175 */     throw new RuntimeException("Stub!");
/*     */   } public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
/* 177 */     throw new RuntimeException("Stub!");
/*     */   } public TransitionSet clone() {
/* 179 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\transition\TransitionSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */