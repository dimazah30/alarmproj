package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/TypeErrorHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年8月26日 星期三 上午10时45分20秒 CST
*/

public final class TypeErrorHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.TypeError value = null;

  public TypeErrorHolder ()
  {
  }

  public TypeErrorHolder (CosEventChannelAdmin.TypeError initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.TypeErrorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.TypeErrorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.TypeErrorHelper.type ();
  }

}
