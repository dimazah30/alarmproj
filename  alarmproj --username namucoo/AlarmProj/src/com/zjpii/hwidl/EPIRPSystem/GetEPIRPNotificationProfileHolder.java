package EPIRPSystem;

/**
* EPIRPSystem/GetEPIRPNotificationProfileHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class GetEPIRPNotificationProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.GetEPIRPNotificationProfile value = null;

  public GetEPIRPNotificationProfileHolder ()
  {
  }

  public GetEPIRPNotificationProfileHolder (EPIRPSystem.GetEPIRPNotificationProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.GetEPIRPNotificationProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.GetEPIRPNotificationProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.GetEPIRPNotificationProfileHelper.type ();
  }

}
