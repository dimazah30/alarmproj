package notifications;

/**
* notifications/AcknowledgeIndication_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>AcknowledgeIndication_T describes the event acknowledge state.</p> 
   * <br>AI_EVENT_ACKNOWLEDGED - provided in case of manual or auto 
   * acknowledgement<br>
   * <br>AI_EVENT_UNACKNOWLEDGED - provided if the event has not been 
   * acknowledged but the EMS supports acknowledgement for this event
   * or in the case that the alarm has been previously acknowledged and
   * then unacknowledged<br>
   * <br>AI_NA provided in case the EMS does not support acknowledgement for 
   * this event or does not support acknowledgement at all<br>
   **/
public final class AcknowledgeIndication_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.AcknowledgeIndication_T value = null;

  public AcknowledgeIndication_THolder ()
  {
  }

  public AcknowledgeIndication_THolder (notifications.AcknowledgeIndication_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.AcknowledgeIndication_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.AcknowledgeIndication_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.AcknowledgeIndication_THelper.type ();
  }

}
