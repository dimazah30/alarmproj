package CosNotifyFilter;


/**
* CosNotifyFilter/CallbackNotFound.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class CallbackNotFound extends org.omg.CORBA.UserException
{

  public CallbackNotFound ()
  {
    super(CallbackNotFoundHelper.id());
  } // ctor


  public CallbackNotFound (String $reason)
  {
    super(CallbackNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class CallbackNotFound
