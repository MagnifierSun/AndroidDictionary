/*     */ package android.view.textclassifier;
/*     */ 
/*     */ import android.os.LocaleList;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.Collection;
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
/*     */ public interface TextClassifier
/*     */ {
/*     */   public static final String HINT_TEXT_IS_EDITABLE = "android.text_is_editable";
/*     */   public static final String HINT_TEXT_IS_NOT_EDITABLE = "android.text_is_not_editable";
/*     */   
/*     */   @RecentlyNonNull
/*     */   default TextSelection suggestSelection(@RecentlyNonNull TextSelection.Request request) {
/*  49 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   default TextSelection suggestSelection(@RecentlyNonNull CharSequence text, int selectionStartIndex, int selectionEndIndex, @RecentlyNullable LocaleList defaultLocales) {
/*  84 */     throw new RuntimeException("Stub!");
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
/*     */   
/*     */   @RecentlyNonNull
/*     */   default TextClassification classifyText(@RecentlyNonNull TextClassification.Request request) {
/* 103 */     throw new RuntimeException("Stub!");
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
/*     */   @RecentlyNonNull
/*     */   default TextClassification classifyText(@RecentlyNonNull CharSequence text, int startIndex, int endIndex, @RecentlyNullable LocaleList defaultLocales) {
/* 138 */     throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   default TextLinks generateLinks(@RecentlyNonNull TextLinks.Request request) {
/* 159 */     throw new RuntimeException("Stub!");
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
/*     */   default int getMaxGenerateLinksTextLength() {
/* 172 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void onSelectionEvent(@RecentlyNonNull SelectionEvent event) {
/* 183 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void destroy() {
/* 194 */     throw new RuntimeException("Stub!");
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
/*     */   default boolean isDestroyed() {
/* 206 */     throw new RuntimeException("Stub!");
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
/* 221 */   public static final TextClassifier NO_OP = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_ADDRESS = "address";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_DATE = "date";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_DATE_TIME = "datetime";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_EMAIL = "email";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_FLIGHT_NUMBER = "flight";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_OTHER = "other";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_PHONE = "phone";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_UNKNOWN = "";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String TYPE_URL = "url";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_CUSTOM_EDITTEXT = "customedit";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_CUSTOM_TEXTVIEW = "customview";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW = "nosel-customview";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_EDITTEXT = "edittext";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_EDIT_WEBVIEW = "edit-webview";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_TEXTVIEW = "textview";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_UNKNOWN = "unknown";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_UNSELECTABLE_TEXTVIEW = "nosel-textview";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String WIDGET_TYPE_WEBVIEW = "webview";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class EntityConfig
/*     */     implements Parcelable
/*     */   {
/*     */     EntityConfig(Parcel in) {
/* 311 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static EntityConfig createWithHints(@RecentlyNullable Collection<String> hints) {
/* 321 */       throw new RuntimeException("Stub!");
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
/*     */     public static EntityConfig create(@RecentlyNullable Collection<String> hints, @RecentlyNullable Collection<String> includedEntityTypes, @RecentlyNullable Collection<String> excludedEntityTypes) {
/* 338 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static EntityConfig createWithExplicitEntityList(@RecentlyNullable Collection<String> entityTypes) {
/* 349 */       throw new RuntimeException("Stub!");
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
/*     */     public Collection<String> resolveEntityListModifications(@RecentlyNonNull Collection<String> entities) {
/* 361 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Collection<String> getHints() {
/* 369 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 371 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 373 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 376 */     public static final Parcelable.Creator<EntityConfig> CREATOR = null;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textclassifier\TextClassifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */