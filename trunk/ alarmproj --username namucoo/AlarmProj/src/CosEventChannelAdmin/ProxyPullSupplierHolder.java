package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/ProxyPullSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public final class ProxyPullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.ProxyPullSupplier value = null;

  public ProxyPullSupplierHolder ()
  {
  }

  public ProxyPullSupplierHolder (CosEventChannelAdmin.ProxyPullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.ProxyPullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.ProxyPullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.ProxyPullSupplierHelper.type ();
  }

}
