package EPIRPSystem;

/**
* EPIRPSystem/ResultTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class ResultTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.ResultType value = null;

  public ResultTypeHolder ()
  {
  }

  public ResultTypeHolder (EPIRPSystem.ResultType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.ResultTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.ResultTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.ResultTypeHelper.type ();
  }

}
