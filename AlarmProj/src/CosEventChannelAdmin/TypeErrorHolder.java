package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/TypeErrorHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
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
