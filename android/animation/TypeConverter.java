/*    */ package android.animation;
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
/*    */ public abstract class TypeConverter<T, V>
/*    */ {
/*    */   public TypeConverter(Class<T> fromClass, Class<V> toClass) {
/* 31 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public abstract V convert(T paramT);
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\animation\TypeConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */