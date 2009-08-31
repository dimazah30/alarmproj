package CosNotifyComm;

/**
* CosNotifyComm/InvalidEventTypeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/

public final class InvalidEventTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.InvalidEventType value = null;

  public InvalidEventTypeHolder ()
  {
  }

  public InvalidEventTypeHolder (CosNotifyComm.InvalidEventType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.InvalidEventTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.InvalidEventTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.InvalidEventTypeHelper.type ();
  }

}
