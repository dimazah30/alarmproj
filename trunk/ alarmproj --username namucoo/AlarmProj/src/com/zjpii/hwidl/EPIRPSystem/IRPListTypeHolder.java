package EPIRPSystem;


/**
* EPIRPSystem/IRPListTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/


/*
   List of all IRPElement and their associated parameters.
  */
public final class IRPListTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.IRPElement value[] = null;

  public IRPListTypeHolder ()
  {
  }

  public IRPListTypeHolder (EPIRPSystem.IRPElement[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.IRPListTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.IRPListTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.IRPListTypeHelper.type ();
  }

}
