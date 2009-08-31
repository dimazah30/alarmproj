package CosNotifyComm;

/**
* CosNotifyComm/StructuredPullSupplierHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPullConsumer
public final class StructuredPullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPullSupplier value = null;

  public StructuredPullSupplierHolder ()
  {
  }

  public StructuredPullSupplierHolder (CosNotifyComm.StructuredPullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPullSupplierHelper.type ();
  }

}
