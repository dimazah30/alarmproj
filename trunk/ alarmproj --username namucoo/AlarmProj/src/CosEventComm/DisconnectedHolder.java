package CosEventComm;

/**
* CosEventComm/DisconnectedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/

public final class DisconnectedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.Disconnected value = null;

  public DisconnectedHolder ()
  {
  }

  public DisconnectedHolder (CosEventComm.Disconnected initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.DisconnectedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.DisconnectedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.DisconnectedHelper.type ();
  }

}
