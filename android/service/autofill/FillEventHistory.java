/*     */ package android.service.autofill;
/*     */ 
/*     */ import android.os.Bundle;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.ArraySet;
/*     */ import android.view.autofill.AutofillId;
/*     */ import androidx.annotation.RecentlyNonNull;
/*     */ import androidx.annotation.RecentlyNullable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class FillEventHistory
/*     */   implements Parcelable
/*     */ {
/*     */   FillEventHistory(int sessionId, Bundle clientState) {
/*  48 */     throw new RuntimeException("Stub!");
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
/*     */   @Deprecated
/*     */   @RecentlyNullable
/*     */   public Bundle getClientState() {
/*  62 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public List<Event> getEvents() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  75 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/*  77 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */   
/*  80 */   public static final Parcelable.Creator<FillEventHistory> CREATOR = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Event
/*     */   {
/*     */     public static final int TYPE_AUTHENTICATION_SELECTED = 2;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int TYPE_CONTEXT_COMMITTED = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int TYPE_DATASET_SELECTED = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final int TYPE_SAVE_SHOWN = 3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     Event(int eventType, String datasetId, Bundle clientState, List<String> selectedDatasetIds, ArraySet<String> ignoredDatasetIds, ArrayList<AutofillId> changedFieldIds, ArrayList<String> changedDatasetIds, ArrayList<AutofillId> manuallyFilledFieldIds, ArrayList<ArrayList<String>> manuallyFilledDatasetIds, AutofillId[] detectedFieldIds, FieldClassification[] detectedFieldClassifications) {
/* 115 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getType() {
/* 123 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNullable
/*     */     public String getDatasetId() {
/* 131 */       throw new RuntimeException("Stub!");
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
/*     */     @RecentlyNullable
/*     */     public Bundle getClientState() {
/* 144 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Set<String> getSelectedDatasetIds() {
/* 154 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public Set<String> getIgnoredDatasetIds() {
/* 164 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     public Map<AutofillId, String> getChangedFields() {
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
/*     */     @RecentlyNonNull
/*     */     public Map<AutofillId, FieldClassification> getFieldsClassification() {
/* 221 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */     public Map<AutofillId, Set<String>> getManuallyEnteredField() {
/* 271 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 273 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\service\autofill\FillEventHistory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */