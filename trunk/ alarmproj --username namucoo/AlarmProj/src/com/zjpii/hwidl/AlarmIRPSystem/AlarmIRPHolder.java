package AlarmIRPSystem;

/**
* AlarmIRPSystem/AlarmIRPHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPSystem.idl
* 2009��8��24�� ����һ ����09ʱ34��29�� CST
*/

public final class AlarmIRPHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPSystem.AlarmIRP value = null;

  public AlarmIRPHolder ()
  {
  }

  public AlarmIRPHolder (AlarmIRPSystem.AlarmIRP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPSystem.AlarmIRPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPSystem.AlarmIRPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPSystem.AlarmIRPHelper.type ();
  }

}
