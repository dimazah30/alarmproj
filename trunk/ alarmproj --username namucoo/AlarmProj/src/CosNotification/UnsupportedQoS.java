package CosNotification;


/**
* CosNotification/UnsupportedQoS.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class UnsupportedQoS extends org.omg.CORBA.UserException
{
  public CosNotification.PropertyError qos_err[] = null;

  public UnsupportedQoS ()
  {
    super(UnsupportedQoSHelper.id());
  } // ctor

  public UnsupportedQoS (CosNotification.PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id());
    qos_err = _qos_err;
  } // ctor


  public UnsupportedQoS (String $reason, CosNotification.PropertyError[] _qos_err)
  {
    super(UnsupportedQoSHelper.id() + "  " + $reason);
    qos_err = _qos_err;
  } // ctor

} // class UnsupportedQoS
