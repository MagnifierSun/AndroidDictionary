/*    */ package android.media;
/*    */ 
/*    */ import androidx.annotation.RecentlyNonNull;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
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
/*    */ 
/*    */ 
/*    */ public final class AudioPresentation
/*    */ {
/*    */   public static final int MASTERED_FOR_3D = 3;
/*    */   public static final int MASTERED_FOR_HEADPHONE = 4;
/*    */   public static final int MASTERED_FOR_STEREO = 1;
/*    */   public static final int MASTERED_FOR_SURROUND = 2;
/*    */   public static final int MASTERING_NOT_INDICATED = 0;
/*    */   
/*    */   AudioPresentation(int presentationId, int programId, @RecentlyNonNull Map<String, String> labels, @RecentlyNonNull String language, int masteringIndication, boolean audioDescriptionAvailable, boolean spokenSubtitlesAvailable, boolean dialogueEnhancementAvailable) {
/* 47 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map<Locale, String> getLabels() {
/* 55 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Locale getLocale() {
/* 61 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMasteringIndication() {
/* 71 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasAudioDescription() {
/* 78 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasSpokenSubtitles() {
/* 85 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean hasDialogueEnhancement() {
/* 92 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\media\AudioPresentation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */