package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/LongTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class LongTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.LongTypeOpt value = null;

  public LongTypeOptHolder ()
  {
  }

  public LongTypeOptHolder (ManagedGenericIRPConstDefs.LongTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.LongTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.LongTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.LongTypeOptHelper.type ();
  }

}
