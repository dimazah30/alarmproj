package CosNaming.NamingContextPackage;

/**
* CosNaming/NamingContextPackage/NotFoundHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class NotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextPackage.NotFound value = null;

  public NotFoundHolder ()
  {
  }

  public NotFoundHolder (CosNaming.NamingContextPackage.NotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextPackage.NotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextPackage.NotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextPackage.NotFoundHelper.type ();
  }

}
