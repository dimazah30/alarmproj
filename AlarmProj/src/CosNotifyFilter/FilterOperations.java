package CosNotifyFilter;


/**
* CosNotifyFilter/FilterOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public interface FilterOperations 
{
  String constraint_grammar ();
  CosNotifyFilter.ConstraintInfo[] add_constraints (CosNotifyFilter.ConstraintExp[] constraint_list) throws CosNotifyFilter.InvalidConstraint;
  void modify_constraints (int[] del_list, CosNotifyFilter.ConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.ConstraintNotFound;
  CosNotifyFilter.ConstraintInfo[] get_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound;
  CosNotifyFilter.ConstraintInfo[] get_all_constraints ();
  void remove_all_constraints ();
  void destroy ();
  boolean match (org.omg.CORBA.Any filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;
  boolean match_structured (CosNotification.StructuredEvent filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;
  boolean match_typed (CosNotification.Property[] filterable_data) throws CosNotifyFilter.UnsupportedFilterableData;
  int attach_callback (CosNotifyComm.NotifySubscribe callback);
  void detach_callback (int callback) throws CosNotifyFilter.CallbackNotFound;
  int[] get_callbacks ();
} // interface FilterOperations
