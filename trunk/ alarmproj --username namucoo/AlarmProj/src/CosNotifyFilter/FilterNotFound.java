package CosNotifyFilter;


/**
* CosNotifyFilter/FilterNotFound.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class FilterNotFound extends org.omg.CORBA.UserException
{

  public FilterNotFound ()
  {
    super(FilterNotFoundHelper.id());
  } // ctor


  public FilterNotFound (String $reason)
  {
    super(FilterNotFoundHelper.id() + "  " + $reason);
  } // ctor

} // class FilterNotFound
