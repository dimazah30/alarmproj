package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/MethodHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class MethodHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Method value = null;

  public MethodHolder ()
  {
  }

  public MethodHolder (ManagedGenericIRPConstDefs.Method initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.MethodHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.MethodHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.MethodHelper.type ();
  }

}
