package CosNotifyComm;

/**
* CosNotifyComm/StructuredPushSupplierHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPullSupplier
public final class StructuredPushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPushSupplier value = null;

  public StructuredPushSupplierHolder ()
  {
  }

  public StructuredPushSupplierHolder (CosNotifyComm.StructuredPushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPushSupplierHelper.type ();
  }

}
