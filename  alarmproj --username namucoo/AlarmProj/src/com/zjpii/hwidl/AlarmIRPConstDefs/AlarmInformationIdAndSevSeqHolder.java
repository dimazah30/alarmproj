package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdAndSevSeqHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   Define set of the above structure of Alarm ID and Perceived Severity.
   */
public final class AlarmInformationIdAndSevSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AlarmInformationIdAndSev value[] = null;

  public AlarmInformationIdAndSevSeqHolder ()
  {
  }

  public AlarmInformationIdAndSevSeqHolder (AlarmIRPConstDefs.AlarmInformationIdAndSev[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmInformationIdAndSevSeqHelper.type ();
  }

}
