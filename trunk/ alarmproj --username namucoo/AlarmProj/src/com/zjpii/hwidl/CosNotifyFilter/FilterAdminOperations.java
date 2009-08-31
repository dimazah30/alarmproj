package CosNotifyFilter;


/**
* CosNotifyFilter/FilterAdminOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public interface FilterAdminOperations 
{
  int add_filter (CosNotifyFilter.Filter new_filter);
  void remove_filter (int filter) throws CosNotifyFilter.FilterNotFound;
  CosNotifyFilter.Filter get_filter (int filter) throws CosNotifyFilter.FilterNotFound;
  int[] get_all_filters ();
  void remove_all_filters ();
} // interface FilterAdminOperations
