package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/CorrelatedNotificationSetTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   Correlated Notification sets are sets of Correlated Notification
   structures.
   */
public final class CorrelatedNotificationSetTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.CorelatedNotification value[] = null;

  public CorrelatedNotificationSetTypeHolder ()
  {
  }

  public CorrelatedNotificationSetTypeHolder (AlarmIRPConstDefs.CorelatedNotification[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.CorrelatedNotificationSetTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.CorrelatedNotificationSetTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.CorrelatedNotificationSetTypeHelper.type ();
  }

}
