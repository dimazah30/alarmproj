package notifications;

/**
* notifications/AlarmOrTCAIdentifier_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/

public final class AlarmOrTCAIdentifier_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmOrTCAIdentifier_T value = null;

  public AlarmOrTCAIdentifier_THolder ()
  {
  }

  public AlarmOrTCAIdentifier_THolder (notifications.AlarmOrTCAIdentifier_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmOrTCAIdentifier_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmOrTCAIdentifier_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmOrTCAIdentifier_THelper.type ();
  }

}
