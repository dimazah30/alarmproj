package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/CorelatedNotificationHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class CorelatedNotificationHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.CorelatedNotification value = null;

  public CorelatedNotificationHolder ()
  {
  }

  public CorelatedNotificationHolder (AlarmIRPConstDefs.CorelatedNotification initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.CorelatedNotificationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.CorelatedNotificationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.CorelatedNotificationHelper.type ();
  }

}
