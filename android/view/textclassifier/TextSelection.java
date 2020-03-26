/*     */ package android.view.textclassifier;
/*     */ 
/*     */ import android.os.LocaleList;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class TextSelection
/*     */   implements Parcelable
/*     */ {
/*     */   TextSelection(Parcel in) {
/*  29 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSelectionStartIndex() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getSelectionEndIndex() {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getEntityCount() {
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
/*     */   @RecentlyNonNull
/*     */   public String getEntity(int index) {
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
/*     */   public float getConfidenceScore(String entity) {
/*  74 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public String getId() {
/*  82 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  84 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  86 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel dest, int flags) {
/*  88 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  91 */   public static final Parcelable.Creator<TextSelection> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder(int startIndex, int endIndex) {
/* 109 */       throw new RuntimeException("Stub!");
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
/*     */     @RecentlyNonNull
/*     */     public Builder setEntityType(@RecentlyNonNull String type, float confidenceScore) {
/* 124 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Builder setId(@RecentlyNullable String id) {
/* 133 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public TextSelection build() {
/* 141 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Request
/*     */     implements Parcelable
/*     */   {
/*     */     Request(Parcel in) {
/* 151 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public CharSequence getText() {
/* 160 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getStartIndex() {
/* 168 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getEndIndex() {
/* 176 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public LocaleList getDefaultLocales() {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 187 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 189 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 192 */     public static final Parcelable.Creator<Request> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */       public Builder(@RecentlyNonNull CharSequence text, int startIndex, int endIndex) {
/* 211 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public Builder setDefaultLocales(@RecentlyNullable LocaleList defaultLocales) {
/* 222 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @RecentlyNonNull
/*     */       public TextSelection.Request build() {
/* 230 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\textclassifier\TextSelection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */