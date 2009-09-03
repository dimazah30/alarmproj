package CosEventComm;

/**
* CosEventComm/PullSupplierHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventComm.idl
* 2009年9月2日 星期三 下午02时45分10秒 CST
*/


/**
    * Interface for a pull supplier.
    */
public final class PullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PullSupplier value = null;

  public PullSupplierHolder ()
  {
  }

  public PullSupplierHolder (CosEventComm.PullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PullSupplierHelper.type ();
  }

}
