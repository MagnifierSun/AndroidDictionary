/*     */ package android.print;
/*     */ 
/*     */ import android.content.pm.PackageManager;
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
/*     */ public final class PrintAttributes
/*     */   implements Parcelable
/*     */ {
/*     */   public static final int COLOR_MODE_COLOR = 2;
/*     */   public static final int COLOR_MODE_MONOCHROME = 1;
/*     */   
/*     */   PrintAttributes() {
/*  32 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public MediaSize getMediaSize() {
/*  40 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Resolution getResolution() {
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
/*     */ 
/*     */ 
/*     */   
/*     */   @RecentlyNullable
/*     */   public Margins getMinMargins() {
/*  64 */     throw new RuntimeException("Stub!");
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
/*     */   public int getColorMode() {
/*  76 */     throw new RuntimeException("Stub!");
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
/*     */   public int getDuplexMode() {
/*  89 */     throw new RuntimeException("Stub!");
/*     */   } public void writeToParcel(Parcel parcel, int flags) {
/*  91 */     throw new RuntimeException("Stub!");
/*     */   } public int describeContents() {
/*  93 */     throw new RuntimeException("Stub!");
/*     */   } public int hashCode() {
/*  95 */     throw new RuntimeException("Stub!");
/*     */   } public boolean equals(Object obj) {
/*  97 */     throw new RuntimeException("Stub!");
/*     */   } public String toString() {
/*  99 */     throw new RuntimeException("Stub!");
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
/* 110 */   public static final Parcelable.Creator<PrintAttributes> CREATOR = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int DUPLEX_MODE_LONG_EDGE = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int DUPLEX_MODE_NONE = 1;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int DUPLEX_MODE_SHORT_EDGE = 4;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final class Builder
/*     */   {
/*     */     public Builder() {
/* 130 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setMediaSize(@RecentlyNonNull PrintAttributes.MediaSize mediaSize) {
/* 142 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setResolution(@RecentlyNonNull PrintAttributes.Resolution resolution) {
/* 154 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setMinMargins(@RecentlyNonNull PrintAttributes.Margins margins) {
/* 167 */       throw new RuntimeException("Stub!");
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
/*     */     @RecentlyNonNull
/*     */     public Builder setColorMode(int colorMode) {
/* 181 */       throw new RuntimeException("Stub!");
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
/*     */     public Builder setDuplexMode(int duplexMode) {
/* 196 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public PrintAttributes build() {
/* 206 */       throw new RuntimeException("Stub!");
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
/*     */   public static final class Margins
/*     */   {
/*     */     public Margins(int leftMils, int topMils, int rightMils, int bottomMils) {
/* 227 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getLeftMils() {
/* 235 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getTopMils() {
/* 243 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getRightMils() {
/* 251 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getBottomMils() {
/* 259 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 261 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object obj) {
/* 263 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 265 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */     
/* 268 */     public static final Margins NO_MARGINS = null;
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
/*     */   public static final class MediaSize
/*     */   {
/*     */     public MediaSize(@RecentlyNonNull String id, @RecentlyNonNull String label, int widthMils, int heightMils) {
/* 299 */       throw new RuntimeException("Stub!");
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
/*     */     public String getId() {
/* 314 */       throw new RuntimeException("Stub!");
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
/*     */     public String getLabel(@RecentlyNonNull PackageManager packageManager) {
/* 326 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getWidthMils() {
/* 336 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getHeightMils() {
/* 346 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isPortrait() {
/* 356 */       throw new RuntimeException("Stub!");
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
/*     */     public MediaSize asPortrait() {
/* 368 */       throw new RuntimeException("Stub!");
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
/*     */     public MediaSize asLandscape() {
/* 380 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 382 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object obj) {
/* 384 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 386 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 391 */     public static final MediaSize ISO_A0 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 396 */     public static final MediaSize ISO_A1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 401 */     public static final MediaSize ISO_A10 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 406 */     public static final MediaSize ISO_A2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 411 */     public static final MediaSize ISO_A3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 416 */     public static final MediaSize ISO_A4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 421 */     public static final MediaSize ISO_A5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 426 */     public static final MediaSize ISO_A6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 431 */     public static final MediaSize ISO_A7 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 436 */     public static final MediaSize ISO_A8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 441 */     public static final MediaSize ISO_A9 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 446 */     public static final MediaSize ISO_B0 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 451 */     public static final MediaSize ISO_B1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 456 */     public static final MediaSize ISO_B10 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 461 */     public static final MediaSize ISO_B2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 466 */     public static final MediaSize ISO_B3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 471 */     public static final MediaSize ISO_B4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 476 */     public static final MediaSize ISO_B5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 481 */     public static final MediaSize ISO_B6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 486 */     public static final MediaSize ISO_B7 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     public static final MediaSize ISO_B8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 496 */     public static final MediaSize ISO_B9 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 501 */     public static final MediaSize ISO_C0 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 506 */     public static final MediaSize ISO_C1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 511 */     public static final MediaSize ISO_C10 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 516 */     public static final MediaSize ISO_C2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 521 */     public static final MediaSize ISO_C3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 526 */     public static final MediaSize ISO_C4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 531 */     public static final MediaSize ISO_C5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 536 */     public static final MediaSize ISO_C6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 541 */     public static final MediaSize ISO_C7 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 546 */     public static final MediaSize ISO_C8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 551 */     public static final MediaSize ISO_C9 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 556 */     public static final MediaSize JIS_B0 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 561 */     public static final MediaSize JIS_B1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 566 */     public static final MediaSize JIS_B10 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 571 */     public static final MediaSize JIS_B2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 576 */     public static final MediaSize JIS_B3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 581 */     public static final MediaSize JIS_B4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 586 */     public static final MediaSize JIS_B5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 591 */     public static final MediaSize JIS_B6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 596 */     public static final MediaSize JIS_B7 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 601 */     public static final MediaSize JIS_B8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 606 */     public static final MediaSize JIS_B9 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 611 */     public static final MediaSize JIS_EXEC = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 616 */     public static final MediaSize JPN_CHOU2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 621 */     public static final MediaSize JPN_CHOU3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 626 */     public static final MediaSize JPN_CHOU4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 631 */     public static final MediaSize JPN_HAGAKI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 636 */     public static final MediaSize JPN_KAHU = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 641 */     public static final MediaSize JPN_KAKU2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 646 */     public static final MediaSize JPN_OUFUKU = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 651 */     public static final MediaSize JPN_YOU4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 656 */     public static final MediaSize NA_FOOLSCAP = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 661 */     public static final MediaSize NA_GOVT_LETTER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 666 */     public static final MediaSize NA_INDEX_3X5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 671 */     public static final MediaSize NA_INDEX_4X6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 676 */     public static final MediaSize NA_INDEX_5X8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 681 */     public static final MediaSize NA_JUNIOR_LEGAL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 686 */     public static final MediaSize NA_LEDGER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 691 */     public static final MediaSize NA_LEGAL = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 696 */     public static final MediaSize NA_LETTER = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 701 */     public static final MediaSize NA_MONARCH = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 706 */     public static final MediaSize NA_QUARTO = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 711 */     public static final MediaSize NA_TABLOID = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 716 */     public static final MediaSize OM_DAI_PA_KAI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 721 */     public static final MediaSize OM_JUURO_KU_KAI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 726 */     public static final MediaSize OM_PA_KAI = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 731 */     public static final MediaSize PRC_1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 736 */     public static final MediaSize PRC_10 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 741 */     public static final MediaSize PRC_16K = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 746 */     public static final MediaSize PRC_2 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 751 */     public static final MediaSize PRC_3 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 756 */     public static final MediaSize PRC_4 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 761 */     public static final MediaSize PRC_5 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 766 */     public static final MediaSize PRC_6 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 771 */     public static final MediaSize PRC_7 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 776 */     public static final MediaSize PRC_8 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 781 */     public static final MediaSize PRC_9 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 786 */     public static final MediaSize ROC_16K = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 791 */     public static final MediaSize ROC_8K = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 802 */     public static final MediaSize UNKNOWN_LANDSCAPE = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 813 */     public static final MediaSize UNKNOWN_PORTRAIT = null;
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
/*     */   public static final class Resolution
/*     */   {
/*     */     public Resolution(@RecentlyNonNull String id, @RecentlyNonNull String label, int horizontalDpi, int verticalDpi) {
/* 845 */       throw new RuntimeException("Stub!");
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
/*     */     public String getId() {
/* 860 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @RecentlyNonNull
/*     */     public String getLabel() {
/* 870 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getHorizontalDpi() {
/* 880 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public int getVerticalDpi() {
/* 890 */       throw new RuntimeException("Stub!");
/*     */     } public int hashCode() {
/* 892 */       throw new RuntimeException("Stub!");
/*     */     } public boolean equals(Object obj) {
/* 894 */       throw new RuntimeException("Stub!");
/*     */     } public String toString() {
/* 896 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\print\PrintAttributes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */