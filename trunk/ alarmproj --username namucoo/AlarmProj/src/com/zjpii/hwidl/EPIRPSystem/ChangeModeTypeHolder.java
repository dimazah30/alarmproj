package EPIRPSystem;

/**
* EPIRPSystem/ChangeModeTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/

public final class ChangeModeTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.ChangeModeType value = null;

  public ChangeModeTypeHolder ()
  {
  }

  public ChangeModeTypeHolder (EPIRPSystem.ChangeModeType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.ChangeModeTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.ChangeModeTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.ChangeModeTypeHelper.type ();
  }

}
