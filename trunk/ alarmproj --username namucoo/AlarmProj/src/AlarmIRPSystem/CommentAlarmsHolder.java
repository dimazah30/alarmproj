package AlarmIRPSystem;

/**
* AlarmIRPSystem/CommentAlarmsHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class CommentAlarmsHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.CommentAlarms value = null;

  public CommentAlarmsHolder ()
  {
  }

  public CommentAlarmsHolder (AlarmIRPSystem.CommentAlarms initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.CommentAlarmsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.CommentAlarmsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.CommentAlarmsHelper.type ();
  }

}
