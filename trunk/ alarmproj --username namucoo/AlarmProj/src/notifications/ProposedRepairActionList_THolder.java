package notifications;


/**
* notifications/ProposedRepairActionList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p> The optional "X.733::ProposedRepairActions" parameter uses this 
   * type.</p>
   *
   * <p>When present in an alarm notification, it
   * indicates if the cause is known and the system being managed 
   * can suggest one or more solutions (such as switch in standby equipment, 
   * retry, replace media).
   * This is consistent with the ITU-T X.733 definition. </p>
   **/
public final class ProposedRepairActionList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ProposedRepairActionList_THolder ()
  {
  }

  public ProposedRepairActionList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.ProposedRepairActionList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.ProposedRepairActionList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.ProposedRepairActionList_THelper.type ();
  }

}
