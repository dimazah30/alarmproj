package CosNotifyFilter;


/**
* CosNotifyFilter/FilterAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public interface FilterAdminOperations 
{
  int add_filter (CosNotifyFilter.Filter new_filter);
  void remove_filter (int filter) throws CosNotifyFilter.FilterNotFound;
  CosNotifyFilter.Filter get_filter (int filter) throws CosNotifyFilter.FilterNotFound;
  int[] get_all_filters ();
  void remove_all_filters ();
} // interface FilterAdminOperations
