package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/UnsignedShortTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class UnsignedShortTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.UnsignedShortTypeOpt value = null;

  public UnsignedShortTypeOptHolder ()
  {
  }

  public UnsignedShortTypeOptHolder (ManagedGenericIRPConstDefs.UnsignedShortTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.UnsignedShortTypeOptHelper.type ();
  }

}
