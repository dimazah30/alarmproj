package notifications;


/**
* notifications/PerceivedSeverityList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>List of PerceivedSeverity_T values.</p>
   * 
   **/
public final class PerceivedSeverityList_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.PerceivedSeverity_T value[] = null;

  public PerceivedSeverityList_THolder ()
  {
  }

  public PerceivedSeverityList_THolder (notifications.PerceivedSeverity_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.PerceivedSeverityList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.PerceivedSeverityList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.PerceivedSeverityList_THelper.type ();
  }

}
