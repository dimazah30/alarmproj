package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/OperationNotSupportedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��34�� CST
*/


/*
   Exception thrown when an unsupported optional method is called.
   */
public final class OperationNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.OperationNotSupported value = null;

  public OperationNotSupportedHolder ()
  {
  }

  public OperationNotSupportedHolder (ManagedGenericIRPSystem.OperationNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.OperationNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.OperationNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.OperationNotSupportedHelper.type ();
  }

}
