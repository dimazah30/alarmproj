package EPIRPSystem;


/**
* EPIRPSystem/ReleaseIRPReference.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class ReleaseIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public ReleaseIRPReference ()
  {
    super(ReleaseIRPReferenceHelper.id());
  } // ctor

  public ReleaseIRPReference (String _reason)
  {
    super(ReleaseIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public ReleaseIRPReference (String $reason, String _reason)
  {
    super(ReleaseIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class ReleaseIRPReference
