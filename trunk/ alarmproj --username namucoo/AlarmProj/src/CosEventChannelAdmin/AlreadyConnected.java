package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/AlreadyConnected.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/

public final class AlreadyConnected extends org.omg.CORBA.UserException
{

  public AlreadyConnected ()
  {
    super(AlreadyConnectedHelper.id());
  } // ctor


  public AlreadyConnected (String $reason)
  {
    super(AlreadyConnectedHelper.id() + "  " + $reason);
  } // ctor

} // class AlreadyConnected
