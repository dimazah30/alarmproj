package ManagedGenericIRPSystem;

/**
* ManagedGenericIRPSystem/InvalidParameterHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��34�� CST
*/


/*
   Exception thrown when an invalid parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class InvalidParameterHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPSystem.InvalidParameter value = null;

  public InvalidParameterHolder ()
  {
  }

  public InvalidParameterHolder (ManagedGenericIRPSystem.InvalidParameter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPSystem.InvalidParameterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPSystem.InvalidParameterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPSystem.InvalidParameterHelper.type ();
  }

}
