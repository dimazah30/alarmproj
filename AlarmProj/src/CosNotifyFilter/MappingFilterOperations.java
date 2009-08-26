package CosNotifyFilter;


/**
* CosNotifyFilter/MappingFilterOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/


// Filter
public interface MappingFilterOperations 
{
  String constraint_grammar ();
  org.omg.CORBA.Any default_value ();
  CosNotifyFilter.MappingConstraintInfo[] add_mapping_constraints (CosNotifyFilter.MappingConstraintPair[] pair_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue;
  void modify_mapping_constraints (int[] del_list, CosNotifyFilter.MappingConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.InvalidValue, CosNotifyFilter.ConstraintNotFound;
  CosNotifyFilter.MappingConstraintInfo[] get_mapping_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound;
  CosNotifyFilter.MappingConstraintInfo[] get_all_mapping_constraints ();
  void remove_all_mapping_constraints ();
  void destroy ();
  boolean match (org.omg.CORBA.Any filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData;
  boolean match_structured (CosNotification.StructuredEvent filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData;
  boolean match_typed (CosNotification.Property[] filterable_data, org.omg.CORBA.AnyHolder result_to_set) throws CosNotifyFilter.UnsupportedFilterableData;
} // interface MappingFilterOperations
