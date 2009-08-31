package EPIRPSystem;


/**
* EPIRPSystem/GetIRPReference.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetIRPReference extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetIRPReference ()
  {
    super(GetIRPReferenceHelper.id());
  } // ctor

  public GetIRPReference (String _reason)
  {
    super(GetIRPReferenceHelper.id());
    reason = _reason;
  } // ctor


  public GetIRPReference (String $reason, String _reason)
  {
    super(GetIRPReferenceHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetIRPReference
