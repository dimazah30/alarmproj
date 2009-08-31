package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/ValueNotSupported.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��17�� CST
*/


/*
   Exception thrown when a valid but unsupported parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class ValueNotSupported extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public ValueNotSupported ()
  {
    super(ValueNotSupportedHelper.id());
  } // ctor

  public ValueNotSupported (String _parameter)
  {
    super(ValueNotSupportedHelper.id());
    parameter = _parameter;
  } // ctor


  public ValueNotSupported (String $reason, String _parameter)
  {
    super(ValueNotSupportedHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class ValueNotSupported
