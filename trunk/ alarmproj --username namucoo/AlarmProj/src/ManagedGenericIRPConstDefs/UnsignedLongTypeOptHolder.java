package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/UnsignedLongTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��25�� CST
*/

public final class UnsignedLongTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.UnsignedLongTypeOpt value = null;

  public UnsignedLongTypeOptHolder ()
  {
  }

  public UnsignedLongTypeOptHolder (ManagedGenericIRPConstDefs.UnsignedLongTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.UnsignedLongTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.UnsignedLongTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.UnsignedLongTypeOptHelper.type ();
  }

}
