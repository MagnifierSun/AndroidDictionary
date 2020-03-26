/*    */ package android.os.strictmode;
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
/*    */ public class InstanceCountViolation
/*    */   extends Violation
/*    */ {
/*    */   InstanceCountViolation(Class klass, long instances, int limit) {
/* 25 */     super(null); throw new RuntimeException("Stub!");
/*    */   } public long getNumberOfInstances() {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\os\strictmode\InstanceCountViolation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */