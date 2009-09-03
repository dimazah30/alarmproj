package notifications;


/**
* notifications/NotifIDList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>List of notification IDs (field notificationId in the 
   * notifications).</p>
   **/
public final class NotifIDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public NotifIDList_THolder ()
  {
  }

  public NotifIDList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.NotifIDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.NotifIDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.NotifIDList_THelper.type ();
  }

}
