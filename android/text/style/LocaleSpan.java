/*    */ package android.text.style;
/*    */ 
/*    */ import android.os.LocaleList;
/*    */ import android.os.Parcel;
/*    */ import android.text.ParcelableSpan;
/*    */ import android.text.TextPaint;
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import androidx.annotation.RecentlyNullable;
/*    */ import java.util.Locale;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LocaleSpan
/*    */   extends MetricAffectingSpan
/*    */   implements ParcelableSpan
/*    */ {
/*    */   public LocaleSpan(@RecentlyNullable Locale locale) {
/* 45 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public LocaleSpan(@RecentlyNonNull LocaleList locales) {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   } public LocaleSpan(Parcel source) {
/* 57 */     throw new RuntimeException("Stub!");
/*    */   } public int getSpanTypeId() {
/* 59 */     throw new RuntimeException("Stub!");
/*    */   } public int describeContents() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   } public void writeToParcel(Parcel dest, int flags) {
/* 63 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNullable
/*    */   public Locale getLocale() {
/* 73 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @RecentlyNonNull
/*    */   public LocaleList getLocales() {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public void updateDrawState(TextPaint ds) {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   } public void updateMeasureState(TextPaint paint) {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\text\style\LocaleSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */