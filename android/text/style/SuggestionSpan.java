/*     */ package android.text.style;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.text.ParcelableSpan;
/*     */ import android.text.TextPaint;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.Locale;
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
/*     */ public class SuggestionSpan
/*     */   extends CharacterStyle
/*     */   implements ParcelableSpan
/*     */ {
/*     */   public static final String ACTION_SUGGESTION_PICKED = "android.text.style.SUGGESTION_PICKED";
/*     */   
/*     */   public SuggestionSpan(Context context, String[] suggestions, int flags) {
/*  46 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SuggestionSpan(Locale locale, String[] suggestions, int flags) {
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
/*     */   public SuggestionSpan(Context context, Locale locale, String[] suggestions, int flags, Class<?> notificationTargetClass) {
/*  66 */     throw new RuntimeException("Stub!");
/*     */   } public SuggestionSpan(Parcel src) {
/*  68 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getSuggestions() {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   @RecentlyNonNull
/*     */   public String getLocale() {
/*  83 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNullable
/*     */   public Locale getLocaleObject() {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public int getFlags() {
/*  99 */     throw new RuntimeException("Stub!");
/*     */   } public void setFlags(int flags) {
/* 101 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/* 103 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/* 105 */     throw new RuntimeException("Stub!");
/*     */   } public int getSpanTypeId() {
/* 107 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object o) {
/* 109 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/* 111 */     throw new RuntimeException("Stub!");
/*     */   } public void updateDrawState(TextPaint tp) {
/* 113 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public static final Parcelable.Creator<SuggestionSpan> CREATOR = null;
/*     */   public static final int FLAG_AUTO_CORRECTION = 4;
/*     */   public static final int FLAG_EASY_CORRECT = 1;
/*     */   public static final int FLAG_MISSPELLED = 2;
/*     */   public static final int SUGGESTIONS_MAX_SIZE = 5;
/*     */   public static final String SUGGESTION_SPAN_PICKED_AFTER = "after";
/*     */   public static final String SUGGESTION_SPAN_PICKED_BEFORE = "before";
/*     */   public static final String SUGGESTION_SPAN_PICKED_HASHCODE = "hashcode";
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\SuggestionSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */