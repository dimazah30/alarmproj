package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/ValueNotSupportedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��17�� CST
*/


/*
   Exception thrown when a valid but unsupported parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class ValueNotSupportedHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.ValueNotSupported value = null;

  public ValueNotSupportedHolder ()
  {
  }

  public ValueNotSupportedHolder (ManagedGenericIRPSystem.ValueNotSupported initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.ValueNotSupportedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.ValueNotSupportedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.ValueNotSupportedHelper.type ();
  }

}
