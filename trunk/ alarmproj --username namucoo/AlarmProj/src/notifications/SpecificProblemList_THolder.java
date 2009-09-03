package notifications;


/**
* notifications/SpecificProblemList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p> The optional "X.733::SpecificProblems" parameter uses that type.</p>
   *
   * <p>When present in an alarm notification,
   * it identifies further refinements to the probable cause of the alarm.
   * This is consistent with the ITU-T X.733 definition. </p>
   **/
public final class SpecificProblemList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public SpecificProblemList_THolder ()
  {
  }

  public SpecificProblemList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.SpecificProblemList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.SpecificProblemList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.SpecificProblemList_THelper.type ();
  }

}
