package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/TypeError.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public final class TypeError extends org.omg.CORBA.UserException
{

  public TypeError ()
  {
    super(TypeErrorHelper.id());
  } // ctor


  public TypeError (String $reason)
  {
    super(TypeErrorHelper.id() + "  " + $reason);
  } // ctor

} // class TypeError
