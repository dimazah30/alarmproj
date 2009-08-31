package EPIRPSystem;

/**
* EPIRPSystem/AttributeNameValueHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� EPIRPSystem.idl
* 2009��8��25�� ���ڶ� ����04ʱ07��42�� CST
*/


/*
  Define the parameters specified in
  the notifyEpInfoChanges notification.
  */
public final class AttributeNameValueHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.AttributeNameValue value = null;

  public AttributeNameValueHolder ()
  {
  }

  public AttributeNameValueHolder (EPIRPSystem.AttributeNameValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.AttributeNameValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.AttributeNameValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.AttributeNameValueHelper.type ();
  }

}
