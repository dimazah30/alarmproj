package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AckState.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
public interface AckState extends AckStateOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final short ACKNOWLEDGED = (short)(1);
  public static final short UNACKNOWLEDGED = (short)(2);
} // interface AckState
