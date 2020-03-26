/*      */ package android.media.audiofx;
/*      */ 
/*      */ import androidx.annotation.RecentlyNonNull;
/*      */ import androidx.annotation.RecentlyNullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class DynamicsProcessing
/*      */   extends AudioEffect
/*      */ {
/*      */   public static final int VARIANT_FAVOR_FREQUENCY_RESOLUTION = 0;
/*      */   public static final int VARIANT_FAVOR_TIME_RESOLUTION = 1;
/*      */   
/*      */   public DynamicsProcessing(int audioSession) {
/*   93 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public DynamicsProcessing(int priority, int audioSession, @RecentlyNullable Config cfg) {
/*  113 */     super(null, null, 0, 0); throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Config getConfig() {
/*  120 */     throw new RuntimeException("Stub!");
/*      */   } public Channel getChannelByChannelIndex(int channelIndex) {
/*  122 */     throw new RuntimeException("Stub!");
/*      */   } public void setChannelTo(int channelIndex, Channel channel) {
/*  124 */     throw new RuntimeException("Stub!");
/*      */   } public void setAllChannelsTo(Channel channel) {
/*  126 */     throw new RuntimeException("Stub!");
/*      */   } public float getInputGainByChannelIndex(int channelIndex) {
/*  128 */     throw new RuntimeException("Stub!");
/*      */   } public void setInputGainbyChannel(int channelIndex, float inputGain) {
/*  130 */     throw new RuntimeException("Stub!");
/*      */   } public void setInputGainAllChannelsTo(float inputGain) {
/*  132 */     throw new RuntimeException("Stub!");
/*      */   } public Eq getPreEqByChannelIndex(int channelIndex) {
/*  134 */     throw new RuntimeException("Stub!");
/*      */   } public void setPreEqByChannelIndex(int channelIndex, Eq preEq) {
/*  136 */     throw new RuntimeException("Stub!");
/*      */   } public void setPreEqAllChannelsTo(Eq preEq) {
/*  138 */     throw new RuntimeException("Stub!");
/*      */   } public EqBand getPreEqBandByChannelIndex(int channelIndex, int band) {
/*  140 */     throw new RuntimeException("Stub!");
/*      */   } public void setPreEqBandByChannelIndex(int channelIndex, int band, EqBand preEqBand) {
/*  142 */     throw new RuntimeException("Stub!");
/*      */   } public void setPreEqBandAllChannelsTo(int band, EqBand preEqBand) {
/*  144 */     throw new RuntimeException("Stub!");
/*      */   } public Mbc getMbcByChannelIndex(int channelIndex) {
/*  146 */     throw new RuntimeException("Stub!");
/*      */   } public void setMbcByChannelIndex(int channelIndex, Mbc mbc) {
/*  148 */     throw new RuntimeException("Stub!");
/*      */   } public void setMbcAllChannelsTo(Mbc mbc) {
/*  150 */     throw new RuntimeException("Stub!");
/*      */   } public MbcBand getMbcBandByChannelIndex(int channelIndex, int band) {
/*  152 */     throw new RuntimeException("Stub!");
/*      */   } public void setMbcBandByChannelIndex(int channelIndex, int band, MbcBand mbcBand) {
/*  154 */     throw new RuntimeException("Stub!");
/*      */   } public void setMbcBandAllChannelsTo(int band, MbcBand mbcBand) {
/*  156 */     throw new RuntimeException("Stub!");
/*      */   } public Eq getPostEqByChannelIndex(int channelIndex) {
/*  158 */     throw new RuntimeException("Stub!");
/*      */   } public void setPostEqByChannelIndex(int channelIndex, Eq postEq) {
/*  160 */     throw new RuntimeException("Stub!");
/*      */   } public void setPostEqAllChannelsTo(Eq postEq) {
/*  162 */     throw new RuntimeException("Stub!");
/*      */   } public EqBand getPostEqBandByChannelIndex(int channelIndex, int band) {
/*  164 */     throw new RuntimeException("Stub!");
/*      */   } public void setPostEqBandByChannelIndex(int channelIndex, int band, EqBand postEqBand) {
/*  166 */     throw new RuntimeException("Stub!");
/*      */   } public void setPostEqBandAllChannelsTo(int band, EqBand postEqBand) {
/*  168 */     throw new RuntimeException("Stub!");
/*      */   } public Limiter getLimiterByChannelIndex(int channelIndex) {
/*  170 */     throw new RuntimeException("Stub!");
/*      */   } public void setLimiterByChannelIndex(int channelIndex, Limiter limiter) {
/*  172 */     throw new RuntimeException("Stub!");
/*      */   } public void setLimiterAllChannelsTo(Limiter limiter) {
/*  174 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getChannelCount() {
/*  181 */     throw new RuntimeException("Stub!");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class BandBase
/*      */   {
/*      */     public BandBase(boolean enabled, float cutoffFrequency) {
/*  211 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  213 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isEnabled() {
/*  220 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setEnabled(boolean enabled) {
/*  227 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getCutoffFrequency() {
/*  234 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setCutoffFrequency(float frequency) {
/*  244 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class BandStage
/*      */     extends Stage
/*      */   {
/*      */     public BandStage(boolean inUse, boolean enabled, int bandCount) {
/*  264 */       super(false, false); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getBandCount() {
/*  271 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  273 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Channel
/*      */   {
/*      */     public Channel(float inputGain, boolean preEqInUse, int preEqBandCount, boolean mbcInUse, int mbcBandCount, boolean postEqInUse, int postEqBandCount, boolean limiterInUse) {
/*  302 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Channel(Channel cfg) {
/*  309 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  311 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getInputGain() {
/*  318 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setInputGain(float inputGain) {
/*  325 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Eq getPreEq() {
/*  332 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPreEq(DynamicsProcessing.Eq preEq) {
/*  340 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.EqBand getPreEqBand(int band) {
/*  348 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPreEqBand(int band, DynamicsProcessing.EqBand preEqBand) {
/*  356 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Mbc getMbc() {
/*  363 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMbc(DynamicsProcessing.Mbc mbc) {
/*  371 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.MbcBand getMbcBand(int band) {
/*  379 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setMbcBand(int band, DynamicsProcessing.MbcBand mbcBand) {
/*  387 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Eq getPostEq() {
/*  394 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPostEq(DynamicsProcessing.Eq postEq) {
/*  402 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.EqBand getPostEqBand(int band) {
/*  410 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPostEqBand(int band, DynamicsProcessing.EqBand postEqBand) {
/*  418 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Limiter getLimiter() {
/*  425 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setLimiter(DynamicsProcessing.Limiter limiter) {
/*  432 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Config
/*      */   {
/*      */     Config(@RecentlyNonNull Config cfg) {
/*  449 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  451 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getVariant() {
/*  459 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getPreferredFrameDuration() {
/*  466 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isPreEqInUse() {
/*  473 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getPreEqBandCount() {
/*  480 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isMbcInUse() {
/*  487 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getMbcBandCount() {
/*  494 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isPostEqInUse() {
/*  501 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getPostEqBandCount() {
/*  508 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isLimiterInUse() {
/*  515 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Channel getChannelByChannelIndex(int channelIndex) {
/*  523 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setChannelTo(int channelIndex, DynamicsProcessing.Channel channel) {
/*  533 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setAllChannelsTo(DynamicsProcessing.Channel channel) {
/*  541 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getInputGainByChannelIndex(int channelIndex) {
/*  549 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setInputGainByChannelIndex(int channelIndex, float inputGain) {
/*  557 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setInputGainAllChannelsTo(float inputGain) {
/*  564 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.Eq getPreEqByChannelIndex(int channelIndex) {
/*  572 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPreEqByChannelIndex(int channelIndex, DynamicsProcessing.Eq preEq) {
/*  581 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPreEqAllChannelsTo(DynamicsProcessing.Eq preEq) {
/*  589 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.EqBand getPreEqBandByChannelIndex(int channelIndex, int band) {
/*  591 */       throw new RuntimeException("Stub!");
/*      */     } public void setPreEqBandByChannelIndex(int channelIndex, int band, DynamicsProcessing.EqBand preEqBand) {
/*  593 */       throw new RuntimeException("Stub!");
/*      */     } public void setPreEqBandAllChannelsTo(int band, DynamicsProcessing.EqBand preEqBand) {
/*  595 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.Mbc getMbcByChannelIndex(int channelIndex) {
/*  597 */       throw new RuntimeException("Stub!");
/*      */     } public void setMbcByChannelIndex(int channelIndex, DynamicsProcessing.Mbc mbc) {
/*  599 */       throw new RuntimeException("Stub!");
/*      */     } public void setMbcAllChannelsTo(DynamicsProcessing.Mbc mbc) {
/*  601 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.MbcBand getMbcBandByChannelIndex(int channelIndex, int band) {
/*  603 */       throw new RuntimeException("Stub!");
/*      */     } public void setMbcBandByChannelIndex(int channelIndex, int band, DynamicsProcessing.MbcBand mbcBand) {
/*  605 */       throw new RuntimeException("Stub!");
/*      */     } public void setMbcBandAllChannelsTo(int band, DynamicsProcessing.MbcBand mbcBand) {
/*  607 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.Eq getPostEqByChannelIndex(int channelIndex) {
/*  609 */       throw new RuntimeException("Stub!");
/*      */     } public void setPostEqByChannelIndex(int channelIndex, DynamicsProcessing.Eq postEq) {
/*  611 */       throw new RuntimeException("Stub!");
/*      */     } public void setPostEqAllChannelsTo(DynamicsProcessing.Eq postEq) {
/*  613 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.EqBand getPostEqBandByChannelIndex(int channelIndex, int band) {
/*  615 */       throw new RuntimeException("Stub!");
/*      */     } public void setPostEqBandByChannelIndex(int channelIndex, int band, DynamicsProcessing.EqBand postEqBand) {
/*  617 */       throw new RuntimeException("Stub!");
/*      */     } public void setPostEqBandAllChannelsTo(int band, DynamicsProcessing.EqBand postEqBand) {
/*  619 */       throw new RuntimeException("Stub!");
/*      */     } public DynamicsProcessing.Limiter getLimiterByChannelIndex(int channelIndex) {
/*  621 */       throw new RuntimeException("Stub!");
/*      */     } public void setLimiterByChannelIndex(int channelIndex, DynamicsProcessing.Limiter limiter) {
/*  623 */       throw new RuntimeException("Stub!");
/*      */     } public void setLimiterAllChannelsTo(DynamicsProcessing.Limiter limiter) {
/*  625 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */     
/*      */     public static final class Builder { public Builder(int variant, int channelCount, boolean preEqInUse, int preEqBandCount, boolean mbcInUse, int mbcBandCount, boolean postEqInUse, int postEqBandCount, boolean limiterInUse) {
/*  629 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setPreferredFrameDuration(float frameDuration) {
/*  631 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setInputGainByChannelIndex(int channelIndex, float inputGain) {
/*  633 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setInputGainAllChannelsTo(float inputGain) {
/*  635 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setChannelTo(int channelIndex, DynamicsProcessing.Channel channel) {
/*  637 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setAllChannelsTo(DynamicsProcessing.Channel channel) {
/*  639 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setPreEqByChannelIndex(int channelIndex, DynamicsProcessing.Eq preEq) {
/*  641 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setPreEqAllChannelsTo(DynamicsProcessing.Eq preEq) {
/*  643 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setMbcByChannelIndex(int channelIndex, DynamicsProcessing.Mbc mbc) {
/*  645 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setMbcAllChannelsTo(DynamicsProcessing.Mbc mbc) {
/*  647 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setPostEqByChannelIndex(int channelIndex, DynamicsProcessing.Eq postEq) {
/*  649 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setPostEqAllChannelsTo(DynamicsProcessing.Eq postEq) {
/*  651 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setLimiterByChannelIndex(int channelIndex, DynamicsProcessing.Limiter limiter) {
/*  653 */         throw new RuntimeException("Stub!");
/*      */       } public Builder setLimiterAllChannelsTo(DynamicsProcessing.Limiter limiter) {
/*  655 */         throw new RuntimeException("Stub!");
/*      */       } public DynamicsProcessing.Config build() {
/*  657 */         throw new RuntimeException("Stub!");
/*      */       } }
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Eq
/*      */     extends BandStage
/*      */   {
/*      */     public Eq(boolean inUse, boolean enabled, int bandCount) {
/*  678 */       super(false, false, 0); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Eq(Eq cfg) {
/*  685 */       super(false, false, 0); throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  687 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setBand(int band, DynamicsProcessing.EqBand bandCfg) {
/*  695 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.EqBand getBand(int band) {
/*  703 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class EqBand
/*      */     extends BandBase
/*      */   {
/*      */     public EqBand(boolean enabled, float cutoffFrequency, float gain) {
/*  726 */       super(false, 0.0F); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public EqBand(EqBand cfg) {
/*  733 */       super(false, 0.0F); throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  735 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getGain() {
/*  742 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setGain(float gain) {
/*  749 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Limiter
/*      */     extends Stage
/*      */   {
/*      */     public Limiter(boolean inUse, boolean enabled, int linkGroup, float attackTime, float releaseTime, float ratio, float threshold, float postGain) {
/*  780 */       super(false, false); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Limiter(Limiter cfg) {
/*  787 */       super(false, false); throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  789 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public int getLinkGroup() {
/*  797 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setLinkGroup(int linkGroup) {
/*  804 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getAttackTime() {
/*  811 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setAttackTime(float attackTime) {
/*  818 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getReleaseTime() {
/*  825 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setReleaseTime(float releaseTime) {
/*  832 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getRatio() {
/*  839 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setRatio(float ratio) {
/*  846 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getThreshold() {
/*  854 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setThreshold(float threshold) {
/*  862 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getPostGain() {
/*  870 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPostGain(float postGain) {
/*  878 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class Mbc
/*      */     extends BandStage
/*      */   {
/*      */     public Mbc(boolean inUse, boolean enabled, int bandCount) {
/*  897 */       super(false, false, 0); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public Mbc(Mbc cfg) {
/*  904 */       super(false, false, 0); throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  906 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setBand(int band, DynamicsProcessing.MbcBand bandCfg) {
/*  914 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public DynamicsProcessing.MbcBand getBand(int band) {
/*  922 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final class MbcBand
/*      */     extends BandBase
/*      */   {
/*      */     public MbcBand(boolean enabled, float cutoffFrequency, float attackTime, float releaseTime, float ratio, float threshold, float kneeWidth, float noiseGateThreshold, float expanderRatio, float preGain, float postGain) {
/*  957 */       super(false, 0.0F); throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public MbcBand(MbcBand cfg) {
/*  964 */       super(false, 0.0F); throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/*  966 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getAttackTime() {
/*  973 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setAttackTime(float attackTime) {
/*  980 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getReleaseTime() {
/*  987 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setReleaseTime(float releaseTime) {
/*  994 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getRatio() {
/* 1001 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setRatio(float ratio) {
/* 1008 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getThreshold() {
/* 1016 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setThreshold(float threshold) {
/* 1024 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getKneeWidth() {
/* 1033 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setKneeWidth(float kneeWidth) {
/* 1042 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getNoiseGateThreshold() {
/* 1052 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setNoiseGateThreshold(float noiseGateThreshold) {
/* 1061 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getExpanderRatio() {
/* 1068 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setExpanderRatio(float expanderRatio) {
/* 1075 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getPreGain() {
/* 1083 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPreGain(float preGain) {
/* 1091 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public float getPostGain() {
/* 1099 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setPostGain(float postGain) {
/* 1107 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Stage
/*      */   {
/*      */     public Stage(boolean inUse, boolean enabled) {
/* 1125 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isEnabled() {
/* 1132 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setEnabled(boolean enabled) {
/* 1139 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public boolean isInUse() {
/* 1147 */       throw new RuntimeException("Stub!");
/*      */     } public String toString() {
/* 1149 */       throw new RuntimeException("Stub!");
/*      */     }
/*      */   }
/*      */ }


/* Location:              M:\learn_android\android.jar!\android\media\audiofx\DynamicsProcessing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */