package notifications;


/**
* notifications/ProbableCauseList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>Set of probable causes.  
   * See <a href=../../../supportingDocumentation/SD1-33_ProbableCauses.pdf >SD1-33 Specification
   * of probableCause strings</a> for a description of the probable cause 
   * strings available with this release of the interface.</p>
   **/
public final class ProbableCauseList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ProbableCauseList_THolder ()
  {
  }

  public ProbableCauseList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.ProbableCauseList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.ProbableCauseList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.ProbableCauseList_THelper.type ();
  }

}
