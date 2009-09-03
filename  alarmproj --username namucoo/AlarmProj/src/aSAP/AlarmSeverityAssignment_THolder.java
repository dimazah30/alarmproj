package aSAP;

/**
* aSAP/AlarmSeverityAssignment_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

public final class AlarmSeverityAssignment_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.AlarmSeverityAssignment_T value = null;

  public AlarmSeverityAssignment_THolder ()
  {
  }

  public AlarmSeverityAssignment_THolder (aSAP.AlarmSeverityAssignment_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.AlarmSeverityAssignment_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.AlarmSeverityAssignment_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.AlarmSeverityAssignment_THelper.type ();
  }

}
