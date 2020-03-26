/*     */ package android.view;
/*     */ 
/*     */ import java.lang.annotation.ElementType;
/*     */ import java.lang.annotation.Retention;
/*     */ import java.lang.annotation.RetentionPolicy;
/*     */ import java.lang.annotation.Target;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ViewDebug
/*     */ {
/*     */   @Deprecated
/*     */   public static final boolean TRACE_HIERARCHY = false;
/*     */   @Deprecated
/*     */   public static final boolean TRACE_RECYCLER = false;
/*     */   
/*     */   public ViewDebug() {
/*  35 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void trace(View view, RecyclerTraceType type, int... parameters) {
/*  41 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void startRecyclerTracing(String prefix, View view) {
/*  47 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void stopRecyclerTracing() {
/*  53 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void trace(View view, HierarchyTraceType type) {
/*  59 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void startHierarchyTracing(String prefix, View view) {
/*  65 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public static void stopHierarchyTracing() {
/*  71 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void dumpCapturedView(String tag, Object view) {
/*  81 */     throw new RuntimeException("Stub!");
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
/*     */   @Target({ElementType.FIELD, ElementType.METHOD})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface CapturedViewProperty
/*     */   {
/*     */     boolean retrieveReturn() default false;
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
/*     */   @Target({ElementType.FIELD, ElementType.METHOD})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface ExportedProperty
/*     */   {
/*     */     boolean resolveId() default false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ViewDebug.IntToString[] mapping() default {};
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ViewDebug.IntToString[] indexMapping() default {};
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ViewDebug.FlagToString[] flagMapping() default {};
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     boolean deepExport() default false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     String prefix() default "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     String category() default "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     boolean formatToHexString() default false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     boolean hasAdjacentMapping() default false;
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
/*     */   @Target({ElementType.TYPE})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface FlagToString
/*     */   {
/*     */     int mask();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int equals();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     String name();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     boolean outputIf() default true;
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
/*     */   @Deprecated
/*     */   public enum HierarchyTraceType
/*     */   {
/* 298 */     INVALIDATE, INVALIDATE_CHILD, INVALIDATE_CHILD_IN_PARENT, REQUEST_LAYOUT, ON_LAYOUT, ON_MEASURE, DRAW, BUILD_CACHE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Target({ElementType.TYPE})
/*     */   @Retention(RetentionPolicy.RUNTIME)
/*     */   public static @interface IntToString
/*     */   {
/*     */     int from();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     String to();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public enum RecyclerTraceType
/*     */   {
/* 334 */     NEW_VIEW, BIND_VIEW, RECYCLE_FROM_ACTIVE_HEAP, RECYCLE_FROM_SCRAP_HEAP, MOVE_TO_SCRAP_HEAP, MOVE_FROM_ACTIVE_TO_SCRAP_HEAP;
/*     */   }
/*     */ }


/* Location:              M:\learn_android\android.jar!\android\view\ViewDebug.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */