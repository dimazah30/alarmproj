package CosNotifyFilter;


/**
* CosNotifyFilter/UnsupportedFilterableData.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class UnsupportedFilterableData extends org.omg.CORBA.UserException
{

  public UnsupportedFilterableData ()
  {
    super(UnsupportedFilterableDataHelper.id());
  } // ctor


  public UnsupportedFilterableData (String $reason)
  {
    super(UnsupportedFilterableDataHelper.id() + "  " + $reason);
  } // ctor

} // class UnsupportedFilterableData
