package CosNotifyFilter;


/**
* CosNotifyFilter/FilterFactoryOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/


// MappingFilter
public interface FilterFactoryOperations 
{
  CosNotifyFilter.Filter create_filter (String constraint_grammar) throws CosNotifyFilter.InvalidGrammar;
  CosNotifyFilter.MappingFilter create_mapping_filter (String constraint_grammar, org.omg.CORBA.Any default_value) throws CosNotifyFilter.InvalidGrammar;
} // interface FilterFactoryOperations
