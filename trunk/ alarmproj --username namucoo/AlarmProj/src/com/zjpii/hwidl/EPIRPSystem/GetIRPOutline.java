package EPIRPSystem;


/**
* EPIRPSystem/GetIRPOutline.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetIRPOutline extends org.omg.CORBA.UserException
{
  public String reason = null;

  public GetIRPOutline ()
  {
    super(GetIRPOutlineHelper.id());
  } // ctor

  public GetIRPOutline (String _reason)
  {
    super(GetIRPOutlineHelper.id());
    reason = _reason;
  } // ctor


  public GetIRPOutline (String $reason, String _reason)
  {
    super(GetIRPOutlineHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class GetIRPOutline
