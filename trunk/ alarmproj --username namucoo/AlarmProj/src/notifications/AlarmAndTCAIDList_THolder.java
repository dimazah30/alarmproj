package notifications;


/**
* notifications/AlarmAndTCAIDList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>Sequence of identifiers for alarms and TCAs. </p>
   **/
public final class AlarmAndTCAIDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AlarmOrTCAIdentifier_T value[] = null;

  public AlarmAndTCAIDList_THolder ()
  {
  }

  public AlarmAndTCAIDList_THolder (notifications.AlarmOrTCAIdentifier_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AlarmAndTCAIDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AlarmAndTCAIDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AlarmAndTCAIDList_THelper.type ();
  }

}
