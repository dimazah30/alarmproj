package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/StringTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��25�� CST
*/

public final class StringTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.StringTypeOpt value = null;

  public StringTypeOptHolder ()
  {
  }

  public StringTypeOptHolder (ManagedGenericIRPConstDefs.StringTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.StringTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.StringTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.StringTypeOptHelper.type ();
  }

}
