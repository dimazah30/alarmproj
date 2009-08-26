package CosNotifyComm;

/**
* CosNotifyComm/InvalidEventTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/

public final class InvalidEventTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.InvalidEventType value = null;

  public InvalidEventTypeHolder ()
  {
  }

  public InvalidEventTypeHolder (CosNotifyComm.InvalidEventType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.InvalidEventTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.InvalidEventTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.InvalidEventTypeHelper.type ();
  }

}
