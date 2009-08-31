package EPIRPSystem;


/**
* EPIRPSystem/UnknownIRPReference.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class UnknownIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public UnknownIRPReference ()
  {
    super(UnknownIRPReferenceHelper.id());
  } // ctor

  public UnknownIRPReference (String _reason)
  {
    super(UnknownIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public UnknownIRPReference (String $reason, String _reason)
  {
    super(UnknownIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class UnknownIRPReference
