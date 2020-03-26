/*     */ package android.view.textclassifier;
/*     */ 
/*     */ import android.os.LocaleList;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.text.Spannable;
/*     */ import android.text.style.ClickableSpan;
/*     */ import android.view.View;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.function.Function;
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
/*     */ public final class TextLinks
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int APPLY_STRATEGY_IGNORE = 0;
/*     */   public static final int APPLY_STRATEGY_REPLACE = 1;
/*     */   
/*     */   TextLinks(Parcel in) {
/*  37 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNonNull
/*     */   public Collection<TextLink> getLinks() {
/*  45 */     throw new RuntimeException("Stub!");
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
/*     */   public int apply(@RecentlyNonNull Spannable text, int applyStrategy, @RecentlyNullable Function<TextLink, TextLinkSpan> spanFactory) {
/*  69 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  75 */     throw new RuntimeException("Stub!");
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
/*  92 */   public static final Parcelable.Creator<TextLinks> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_DIFFERENT_TEXT = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_LINKS_APPLIED = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_NO_LINKS_APPLIED = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int STATUS_NO_LINKS_FOUND = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder(@RecentlyNonNull String fullText) {
/* 124 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder addLink(int start, int end, Map<String, Float> entityScores) {
/* 136 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder clearTextLinks() {
/* 144 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public TextLinks build() {
/* 154 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Request
/*     */     implements Parcelable
/*     */   {
/*     */     Request(Parcel in) {
/* 164 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public CharSequence getText() {
/* 172 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public LocaleList getDefaultLocales() {
/* 181 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public TextClassifier.EntityConfig getEntityConfig() {
/* 189 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 191 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 193 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 196 */     public static final Parcelable.Creator<Request> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final class Builder
/*     */     {
/*     */       public Builder(@RecentlyNonNull CharSequence text) {
/* 208 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public Builder setDefaultLocales(@RecentlyNullable LocaleList defaultLocales) {
/* 218 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public Builder setEntityConfig(@RecentlyNullable TextClassifier.EntityConfig entityConfig) {
/* 230 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public TextLinks.Request build() {
/* 238 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class TextLink
/*     */     implements Parcelable
/*     */   {
/*     */     TextLink(Parcel in) {
/* 250 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getStart() {
/* 258 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEnd() {
/* 266 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEntityCount() {
/* 274 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public String getEntity(int index) {
/* 286 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public float getConfidenceScore(String entityType) {
/* 297 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 299 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 301 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 303 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 306 */     public static final Parcelable.Creator<TextLink> CREATOR = null;
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
/*     */   public static class TextLinkSpan
/*     */     extends ClickableSpan
/*     */   {
/*     */     public TextLinkSpan(@RecentlyNonNull TextLinks.TextLink textLink) {
/* 322 */       throw new RuntimeException("Stub!");
/*     */     } public void onClick(View widget) {
/* 324 */       throw new RuntimeException("Stub!");
/*     */     } public final TextLinks.TextLink getTextLink() {
/* 326 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textclassifier\TextLinks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */