package notifications;

/**
* notifications/AlarmTypeQualifier_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>Used to distinguish TCA from alarm.</p> 
   **/
public final class AlarmTypeQualifier_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmTypeQualifier_T value = null;

  public AlarmTypeQualifier_THolder ()
  {
  }

  public AlarmTypeQualifier_THolder (notifications.AlarmTypeQualifier_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmTypeQualifier_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmTypeQualifier_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmTypeQualifier_THelper.type ();
  }

}
