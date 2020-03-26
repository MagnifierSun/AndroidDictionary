/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.os.Bundle;
/*    */ import android.widget.TimePicker;
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
/*    */ public class TimePickerDialog
/*    */   extends AlertDialog
/*    */   implements DialogInterface.OnClickListener, TimePicker.OnTimeChangedListener
/*    */ {
/*    */   public TimePickerDialog(Context context, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) {
/* 45 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   }
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
/*    */   public TimePickerDialog(Context context, int themeResId, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) {
/* 64 */     super((Context)null); throw new RuntimeException("Stub!");
/*    */   } public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
/* 66 */     throw new RuntimeException("Stub!");
/*    */   } public void show() {
/* 68 */     throw new RuntimeException("Stub!");
/*    */   } public void onClick(DialogInterface dialog, int which) {
/* 70 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void updateTime(int hourOfDay, int minuteOfHour) {
/* 79 */     throw new RuntimeException("Stub!");
/*    */   } public Bundle onSaveInstanceState() {
/* 81 */     throw new RuntimeException("Stub!");
/*    */   } public void onRestoreInstanceState(Bundle savedInstanceState) {
/* 83 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   public static interface OnTimeSetListener {
/*    */     void onTimeSet(TimePicker param1TimePicker, int param1Int1, int param1Int2);
/*    */   }
/*    */ }


/* Location:              M:\learn_android\android.jar!\android\app\TimePickerDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */