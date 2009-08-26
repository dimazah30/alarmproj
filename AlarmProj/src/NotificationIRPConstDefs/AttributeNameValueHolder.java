package NotificationIRPConstDefs;

/**
* NotificationIRPConstDefs/AttributeNameValueHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/


/*
   Define the parameters (in the notification header) specified in
   the Notification IRP: IS.
   */
public final class AttributeNameValueHolder implements org.omg.CORBA.portable.Streamable
{
  public NotificationIRPConstDefs.AttributeNameValue value = null;

  public AttributeNameValueHolder ()
  {
  }

  public AttributeNameValueHolder (NotificationIRPConstDefs.AttributeNameValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.AttributeNameValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.AttributeNameValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.AttributeNameValueHelper.type ();
  }

}
