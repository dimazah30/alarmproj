package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AlarmInformationIdSeqHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class AlarmInformationIdSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public AlarmInformationIdSeqHolder ()
  {
  }

  public AlarmInformationIdSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AlarmInformationIdSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AlarmInformationIdSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AlarmInformationIdSeqHelper.type ();
  }

}
