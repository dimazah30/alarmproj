package aSAP;

/**
* aSAP/AlarmSeverityAssignment_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
*/

public final class AlarmSeverityAssignment_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.AlarmSeverityAssignment_T value = null;

  public AlarmSeverityAssignment_THolder ()
  {
  }

  public AlarmSeverityAssignment_THolder (aSAP.AlarmSeverityAssignment_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.AlarmSeverityAssignment_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.AlarmSeverityAssignment_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.AlarmSeverityAssignment_THelper.type ();
  }

}
