package CosNotification;

/**
* CosNotification/QoSError_codeHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public final class QoSError_codeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.QoSError_code value = null;

  public QoSError_codeHolder ()
  {
  }

  public QoSError_codeHolder (CosNotification.QoSError_code initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.QoSError_codeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.QoSError_codeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.QoSError_codeHelper.type ();
  }

}
