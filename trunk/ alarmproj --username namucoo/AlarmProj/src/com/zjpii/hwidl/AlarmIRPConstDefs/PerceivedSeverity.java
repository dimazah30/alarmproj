package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/PerceivedSeverity.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the levels of severity.
   */
public interface PerceivedSeverity extends PerceivedSeverityOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final short INDETERMINATE = (short)(1);
  public static final short CRITICAL = (short)(2);
  public static final short MAJOR = (short)(3);
  public static final short MINOR = (short)(4);
  public static final short WARNING = (short)(5);
  public static final short CLEARED = (short)(6);
} // interface PerceivedSeverity
