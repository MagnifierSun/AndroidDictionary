/*    */ package android.util;
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
/*    */ public interface AttributeSet
/*    */ {
/*    */   int getAttributeCount();
/*    */   
/*    */   default String getAttributeNamespace(int index) {
/* 89 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   String getAttributeName(int paramInt);
/*    */   
/*    */   String getAttributeValue(int paramInt);
/*    */   
/*    */   String getAttributeValue(String paramString1, String paramString2);
/*    */   
/*    */   String getPositionDescription();
/*    */   
/*    */   int getAttributeNameResource(int paramInt);
/*    */   
/*    */   int getAttributeListValue(String paramString1, String paramString2, String[] paramArrayOfString, int paramInt);
/*    */   
/*    */   boolean getAttributeBooleanValue(String paramString1, String paramString2, boolean paramBoolean);
/*    */   
/*    */   int getAttributeResourceValue(String paramString1, String paramString2, int paramInt);
/*    */   
/*    */   int getAttributeIntValue(String paramString1, String paramString2, int paramInt);
/*    */   
/*    */   int getAttributeUnsignedIntValue(String paramString1, String paramString2, int paramInt);
/*    */   
/*    */   float getAttributeFloatValue(String paramString1, String paramString2, float paramFloat);
/*    */   
/*    */   int getAttributeListValue(int paramInt1, String[] paramArrayOfString, int paramInt2);
/*    */   
/*    */   boolean getAttributeBooleanValue(int paramInt, boolean paramBoolean);
/*    */   
/*    */   int getAttributeResourceValue(int paramInt1, int paramInt2);
/*    */   
/*    */   int getAttributeIntValue(int paramInt1, int paramInt2);
/*    */   
/*    */   int getAttributeUnsignedIntValue(int paramInt1, int paramInt2);
/*    */   
/*    */   float getAttributeFloatValue(int paramInt, float paramFloat);
/*    */   
/*    */   String getIdAttribute();
/*    */   
/*    */   String getClassAttribute();
/*    */   
/*    */   int getIdAttributeResourceValue(int paramInt);
/*    */   
/*    */   int getStyleAttribute();
/*    */ }


/* Location:              M:\learn_android\android.jar!\androi\\util\AttributeSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */