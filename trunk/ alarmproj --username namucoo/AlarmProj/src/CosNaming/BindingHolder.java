package CosNaming;

/**
* CosNaming/BindingHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class BindingHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.Binding value = null;

  public BindingHolder ()
  {
  }

  public BindingHolder (CosNaming.Binding initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.BindingHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.BindingHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.BindingHelper.type ();
  }

}
