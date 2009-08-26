package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AttributeNameValueHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies attributes which are included as part of the Alarm IRP
   These attribute values should not clash with those defined for the attributes
   of notification header (see IDL of Notification IRP).
   */
public final class AttributeNameValueHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AttributeNameValue value = null;

  public AttributeNameValueHolder ()
  {
  }

  public AttributeNameValueHolder (AlarmIRPConstDefs.AttributeNameValue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AttributeNameValueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AttributeNameValueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AttributeNameValueHelper.type ();
  }

}
