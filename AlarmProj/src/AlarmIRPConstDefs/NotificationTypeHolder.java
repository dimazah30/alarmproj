package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/NotificationTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the notification types defined by this
   Alarm IRP version.
   */
public final class NotificationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.NotificationType value = null;

  public NotificationTypeHolder ()
  {
  }

  public NotificationTypeHolder (AlarmIRPConstDefs.NotificationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.NotificationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.NotificationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.NotificationTypeHelper.type ();
  }

}
