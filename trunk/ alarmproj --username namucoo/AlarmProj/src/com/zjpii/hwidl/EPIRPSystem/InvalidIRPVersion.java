package EPIRPSystem;


/**
* EPIRPSystem/InvalidIRPVersion.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class InvalidIRPVersion extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidIRPVersion ()
  {
    super(InvalidIRPVersionHelper.id());
  } // ctor

  public InvalidIRPVersion (String _reason)
  {
    super(InvalidIRPVersionHelper.id());
    reason = _reason;
  } // ctor


  public InvalidIRPVersion (String $reason, String _reason)
  {
    super(InvalidIRPVersionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidIRPVersion
