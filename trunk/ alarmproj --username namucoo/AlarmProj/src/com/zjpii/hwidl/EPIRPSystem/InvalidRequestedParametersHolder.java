package EPIRPSystem;

/**
* EPIRPSystem/InvalidRequestedParametersHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class InvalidRequestedParametersHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.InvalidRequestedParameters value = null;

  public InvalidRequestedParametersHolder ()
  {
  }

  public InvalidRequestedParametersHolder (EPIRPSystem.InvalidRequestedParameters initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.InvalidRequestedParametersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.InvalidRequestedParametersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.InvalidRequestedParametersHelper.type ();
  }

}
