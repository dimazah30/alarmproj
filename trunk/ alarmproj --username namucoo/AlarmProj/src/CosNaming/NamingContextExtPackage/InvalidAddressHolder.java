package CosNaming.NamingContextExtPackage;

/**
* CosNaming/NamingContextExtPackage/InvalidAddressHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class InvalidAddressHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNaming.NamingContextExtPackage.InvalidAddress value = null;

  public InvalidAddressHolder ()
  {
  }

  public InvalidAddressHolder (CosNaming.NamingContextExtPackage.InvalidAddress initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNaming.NamingContextExtPackage.InvalidAddressHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNaming.NamingContextExtPackage.InvalidAddressHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNaming.NamingContextExtPackage.InvalidAddressHelper.type ();
  }

}
