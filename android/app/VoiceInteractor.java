/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Bundle;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class VoiceInteractor
/*     */ {
/*     */   VoiceInteractor() {
/*  51 */     throw new RuntimeException("Stub!");
/*     */   } public boolean submitRequest(Request request) {
/*  53 */     throw new RuntimeException("Stub!");
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
/*     */   public boolean submitRequest(Request request, String name) {
/*  67 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Request[] getActiveRequests() {
/*  73 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Request getActiveRequest(String name) {
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
/*     */   public boolean[] supportsCommands(String[] commands) {
/*  95 */     throw new RuntimeException("Stub!");
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
/*     */   public static class AbortVoiceRequest
/*     */     extends Request
/*     */   {
/*     */     public AbortVoiceRequest(@RecentlyNullable VoiceInteractor.Prompt prompt, @RecentlyNullable Bundle extras) {
/* 121 */       throw new RuntimeException("Stub!");
/*     */     } public void onAbortResult(Bundle result) {
/* 123 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class CommandRequest
/*     */     extends Request
/*     */   {
/*     */     public CommandRequest(String command, Bundle args) {
/* 151 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onCommandResult(boolean isCompleted, Bundle result) {
/* 159 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class CompleteVoiceRequest
/*     */     extends Request
/*     */   {
/*     */     public CompleteVoiceRequest(@RecentlyNullable VoiceInteractor.Prompt prompt, @RecentlyNullable Bundle extras) {
/* 185 */       throw new RuntimeException("Stub!");
/*     */     } public void onCompleteResult(Bundle result) {
/* 187 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ConfirmationRequest
/*     */     extends Request
/*     */   {
/*     */     public ConfirmationRequest(@RecentlyNullable VoiceInteractor.Prompt prompt, @RecentlyNullable Bundle extras) {
/* 218 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onConfirmationResult(boolean confirmed, Bundle result) {
/* 227 */       throw new RuntimeException("Stub!");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class PickOptionRequest
/*     */     extends Request
/*     */   {
/*     */     public PickOptionRequest(@RecentlyNullable VoiceInteractor.Prompt prompt, Option[] options, @RecentlyNullable Bundle extras) {
/* 253 */       throw new RuntimeException("Stub!");
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
/*     */     public void onPickOptionResult(boolean finished, Option[] selections, Bundle result) {
/* 267 */       throw new RuntimeException("Stub!");
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
/*     */     public static final class Option
/*     */       implements Parcelable
/*     */     {
/*     */       public Option(CharSequence label, int index) {
/* 287 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Option addSynonym(CharSequence synonym) {
/* 296 */         throw new RuntimeException("Stub!");
/*     */       } public CharSequence getLabel() {
/* 298 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public int getIndex() {
/* 305 */         throw new RuntimeException("Stub!");
/*     */       } public int countSynonyms() {
/* 307 */         throw new RuntimeException("Stub!");
/*     */       } public CharSequence getSynonymAt(int index) {
/* 309 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public void setExtras(Bundle extras) {
/* 316 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       public Bundle getExtras() {
/* 325 */         throw new RuntimeException("Stub!");
/*     */       } public int describeContents() {
/* 327 */         throw new RuntimeException("Stub!");
/*     */       } public void writeToParcel(Parcel dest, int flags) {
/* 329 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */       
/* 332 */       public static final Parcelable.Creator<Option> CREATOR = null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Prompt
/*     */     implements Parcelable
/*     */   {
/*     */     public Prompt(@RecentlyNonNull CharSequence[] voicePrompts, @RecentlyNonNull CharSequence visualPrompt) {
/* 357 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Prompt(@RecentlyNonNull CharSequence prompt) {
/* 366 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public CharSequence getVoicePromptAt(int index) {
/* 374 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int countVoicePrompts() {
/* 380 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public CharSequence getVisualPrompt() {
/* 388 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 390 */       throw new RuntimeException("Stub!");
/*     */     } public int describeContents() {
/* 392 */       throw new RuntimeException("Stub!");
/*     */     } public void writeToParcel(Parcel dest, int flags) {
/* 394 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 397 */     public static final Parcelable.Creator<Prompt> CREATOR = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static abstract class Request
/*     */   {
/*     */     Request() {
/* 408 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getName() {
/* 415 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void cancel() {
/* 421 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Context getContext() {
/* 428 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public Activity getActivity() {
/* 435 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onCancel() {
/* 443 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void onAttached(Activity activity) {
/* 450 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void onDetached() {
/* 456 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 458 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\app\VoiceInteractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */