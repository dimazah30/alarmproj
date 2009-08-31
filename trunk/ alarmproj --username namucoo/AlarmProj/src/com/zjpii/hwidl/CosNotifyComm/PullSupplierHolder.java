package CosNotifyComm;

/**
* CosNotifyComm/PullSupplierHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// PullConsumer
public final class PullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.PullSupplier value = null;

  public PullSupplierHolder ()
  {
  }

  public PullSupplierHolder (CosNotifyComm.PullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.PullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.PullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.PullSupplierHelper.type ();
  }

}
