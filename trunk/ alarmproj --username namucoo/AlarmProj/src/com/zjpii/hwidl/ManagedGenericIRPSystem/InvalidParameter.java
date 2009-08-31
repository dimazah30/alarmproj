package ManagedGenericIRPSystem;


/**
* ManagedGenericIRPSystem/InvalidParameter.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��17�� CST
*/


/*
   Exception thrown when an invalid parameter value is passed.
   The parameter shall be the actual parameter name.
   */
public final class InvalidParameter extends org.omg.CORBA.UserException
{
  public String parameter = null;

  public InvalidParameter ()
  {
    super(InvalidParameterHelper.id());
  } // ctor

  public InvalidParameter (String _parameter)
  {
    super(InvalidParameterHelper.id());
    parameter = _parameter;
  } // ctor


  public InvalidParameter (String $reason, String _parameter)
  {
    super(InvalidParameterHelper.id() + "  " + $reason);
    parameter = _parameter;
  } // ctor

} // class InvalidParameter
