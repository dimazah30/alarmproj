package ManagedGenericIRPConstDefs;

/**
* ManagedGenericIRPConstDefs/SignalHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class SignalHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Signal value = null;

  public SignalHolder ()
  {
  }

  public SignalHolder (ManagedGenericIRPConstDefs.Signal initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.SignalHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.SignalHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.SignalHelper.type ();
  }

}
