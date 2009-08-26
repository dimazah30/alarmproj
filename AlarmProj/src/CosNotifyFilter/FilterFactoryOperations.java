package CosNotifyFilter;


/**
* CosNotifyFilter/FilterFactoryOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/


// MappingFilter
public interface FilterFactoryOperations 
{
  CosNotifyFilter.Filter create_filter (String constraint_grammar) throws CosNotifyFilter.InvalidGrammar;
  CosNotifyFilter.MappingFilter create_mapping_filter (String constraint_grammar, org.omg.CORBA.Any default_value) throws CosNotifyFilter.InvalidGrammar;
} // interface FilterFactoryOperations
