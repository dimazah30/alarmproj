package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/TrendIndicationTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
public final class TrendIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.TrendIndicationType value = null;

  public TrendIndicationTypeHolder ()
  {
  }

  public TrendIndicationTypeHolder (AlarmIRPConstDefs.TrendIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.TrendIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.TrendIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.TrendIndicationTypeHelper.type ();
  }

}
