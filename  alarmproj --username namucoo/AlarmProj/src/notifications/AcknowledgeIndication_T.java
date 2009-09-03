package notifications;


/**
* notifications/AcknowledgeIndication_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
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
public class AcknowledgeIndication_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static notifications.AcknowledgeIndication_T[] __array = new notifications.AcknowledgeIndication_T [__size];

  public static final int _AI_EVENT_ACKNOWLEDGED = 0;
  public static final notifications.AcknowledgeIndication_T AI_EVENT_ACKNOWLEDGED = new notifications.AcknowledgeIndication_T(_AI_EVENT_ACKNOWLEDGED);
  public static final int _AI_EVENT_UNACKNOWLEDGED = 1;
  public static final notifications.AcknowledgeIndication_T AI_EVENT_UNACKNOWLEDGED = new notifications.AcknowledgeIndication_T(_AI_EVENT_UNACKNOWLEDGED);
  public static final int _AI_NA = 2;
  public static final notifications.AcknowledgeIndication_T AI_NA = new notifications.AcknowledgeIndication_T(_AI_NA);

  public int value ()
  {
    return __value;
  }

  public static notifications.AcknowledgeIndication_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected AcknowledgeIndication_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class AcknowledgeIndication_T
