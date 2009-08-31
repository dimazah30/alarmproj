package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AckStateHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
public final class AckStateHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AckState value = null;

  public AckStateHolder ()
  {
  }

  public AckStateHolder (AlarmIRPConstDefs.AckState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AckStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AckStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AckStateHelper.type ();
  }

}
