package EPIRPSystem;

/**
* EPIRPSystem/GetEPIRPNotificationProfileHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class GetEPIRPNotificationProfileHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.GetEPIRPNotificationProfile value = null;

  public GetEPIRPNotificationProfileHolder ()
  {
  }

  public GetEPIRPNotificationProfileHolder (EPIRPSystem.GetEPIRPNotificationProfile initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.GetEPIRPNotificationProfileHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.GetEPIRPNotificationProfileHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.GetEPIRPNotificationProfileHelper.type ();
  }

}
