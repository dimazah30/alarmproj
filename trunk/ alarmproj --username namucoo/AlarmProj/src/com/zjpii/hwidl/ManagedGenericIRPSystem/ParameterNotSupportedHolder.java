package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/ParameterNotSupportedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��17�� CST
*/


/*
   Exception thrown when an unsupported optional parameter
   is passed with information.
   The parameter shall be the actual unsupported parameter name.
   */
public final class ParameterNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.ParameterNotSupported value = null;

  public ParameterNotSupportedHolder ()
  {
  }

  public ParameterNotSupportedHolder (ManagedGenericIRPSystem.ParameterNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.ParameterNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.ParameterNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.ParameterNotSupportedHelper.type ();
  }

}
