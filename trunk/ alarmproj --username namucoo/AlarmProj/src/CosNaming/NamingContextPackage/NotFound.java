package CosNaming.NamingContextPackage;


/**
* CosNaming/NamingContextPackage/NotFound.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class NotFound extends org.omg.CORBA.UserException
{
  public CosNaming.NamingContextPackage.NotFoundReason why = null;
  public CosNaming.NameComponent rest_of_name[] = null;

  public NotFound ()
  {
    super(NotFoundHelper.id());
  } // ctor

  public NotFound (CosNaming.NamingContextPackage.NotFoundReason _why, CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id());
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor


  public NotFound (String $reason, CosNaming.NamingContextPackage.NotFoundReason _why, CosNaming.NameComponent[] _rest_of_name)
  {
    super(NotFoundHelper.id() + "  " + $reason);
    why = _why;
    rest_of_name = _rest_of_name;
  } // ctor

} // class NotFound
