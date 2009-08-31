package CosNotification;


/**
* CosNotification/UnsupportedAdmin.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class UnsupportedAdmin extends org.omg.CORBA.UserException
{
  public CosNotification.PropertyError admin_err[] = null;

  public UnsupportedAdmin ()
  {
    super(UnsupportedAdminHelper.id());
  } // ctor

  public UnsupportedAdmin (CosNotification.PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id());
    admin_err = _admin_err;
  } // ctor


  public UnsupportedAdmin (String $reason, CosNotification.PropertyError[] _admin_err)
  {
    super(UnsupportedAdminHelper.id() + "  " + $reason);
    admin_err = _admin_err;
  } // ctor

} // class UnsupportedAdmin
