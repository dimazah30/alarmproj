package CosNaming.NamingContextPackage;

/**
* CosNaming/NamingContextPackage/CannotProceedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class CannotProceedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextPackage.CannotProceed value = null;

  public CannotProceedHolder ()
  {
  }

  public CannotProceedHolder (CosNaming.NamingContextPackage.CannotProceed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextPackage.CannotProceedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextPackage.CannotProceedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextPackage.CannotProceedHelper.type ();
  }

}
