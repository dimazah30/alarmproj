package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/ParameterNotSupported.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��34�� CST
*/


/*
   Exception thrown when an unsupported optional parameter
   is passed with information.
   The parameter shall be the actual unsupported parameter name.
   */
public final class ParameterNotSupported extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public ParameterNotSupported ()
  {
    super(ParameterNotSupportedHelper.id());
  } // ctor

  public ParameterNotSupported (String _parameter)
  {
    super(ParameterNotSupportedHelper.id());
    parameter = _parameter;
  } // ctor


  public ParameterNotSupported (String $reason, String _parameter)
  {
    super(ParameterNotSupportedHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class ParameterNotSupported
