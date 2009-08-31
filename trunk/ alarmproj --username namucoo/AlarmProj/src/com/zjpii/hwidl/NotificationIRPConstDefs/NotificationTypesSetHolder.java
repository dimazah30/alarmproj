package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/NotificationTypesSetHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� NotificationIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��11�� CST
*/


/*
   This sequence identifies all notification types of all notification
   categories identified by NotificationCategorySet.  The number of elements
   in this sequence shall be identical to that of NotificationCategorySet.
   */
public final class NotificationTypesSetHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[][] = null;

  public NotificationTypesSetHolder ()
  {
  }

  public NotificationTypesSetHolder (String[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotificationIRPConstDefs.NotificationTypesSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotificationIRPConstDefs.NotificationTypesSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotificationIRPConstDefs.NotificationTypesSetHelper.type ();
  }

}
