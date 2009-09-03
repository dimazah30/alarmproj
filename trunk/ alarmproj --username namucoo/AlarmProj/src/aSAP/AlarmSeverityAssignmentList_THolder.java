package aSAP;


/**
* aSAP/AlarmSeverityAssignmentList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
*/


/**
   * <p>An alarm severity assignment list provides a listing of all abnormal 
   * conditions that may exist in instances of an object class. 
   * Each element of this sequence specifies the probable cause (plus 
   * optionally the probableCauseQualifier and / or the nativeProbableCause) and 
   * the three severities to be assigned.</p>
   **/
public final class AlarmSeverityAssignmentList_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.AlarmSeverityAssignment_T value[] = null;

  public AlarmSeverityAssignmentList_THolder ()
  {
  }

  public AlarmSeverityAssignmentList_THolder (aSAP.AlarmSeverityAssignment_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.AlarmSeverityAssignmentList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.AlarmSeverityAssignmentList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.AlarmSeverityAssignmentList_THelper.type ();
  }

}
