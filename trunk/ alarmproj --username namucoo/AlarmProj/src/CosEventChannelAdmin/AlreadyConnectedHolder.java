package CosEventChannelAdmin;

/**
* CosEventChannelAdmin/AlreadyConnectedHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/

public final class AlreadyConnectedHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventChannelAdmin.AlreadyConnected value = null;

  public AlreadyConnectedHolder ()
  {
  }

  public AlreadyConnectedHolder (CosEventChannelAdmin.AlreadyConnected initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventChannelAdmin.AlreadyConnectedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventChannelAdmin.AlreadyConnectedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventChannelAdmin.AlreadyConnectedHelper.type ();
  }

}
