package notifications;

/**
* notifications/ServiceAffecting_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>ServiceAffecting_T describes the impact of a fault on monitored 
   * entities</p>
   * <br>SA_UNKNOWN: The EMS cannot determine if the condition 
   *  affects service or not.<br>
   * <br>SA_SERVICE_AFFECTING: The EMS determines that the condition affects 
   * service.<br>
   * <br>SA_NON_SERVICE_AFFECTING: The EMS determines that the condition does 
   *  not affect service.<br>
   **/
public final class ServiceAffecting_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.ServiceAffecting_T value = null;

  public ServiceAffecting_THolder ()
  {
  }

  public ServiceAffecting_THolder (notifications.ServiceAffecting_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.ServiceAffecting_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.ServiceAffecting_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.ServiceAffecting_THelper.type ();
  }

}
