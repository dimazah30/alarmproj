package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/NotifIdSetTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class NotifIdSetTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public NotifIdSetTypeHolder ()
  {
  }

  public NotifIdSetTypeHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.NotifIdSetTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.NotifIdSetTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.NotifIdSetTypeHelper.type ();
  }

}
