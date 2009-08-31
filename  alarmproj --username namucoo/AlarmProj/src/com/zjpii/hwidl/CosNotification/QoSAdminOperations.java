package CosNotification;


/**
* CosNotification/QoSAdminOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/


// MaxEventsPerConsumer takes on a value of type long
public interface QoSAdminOperations 
{
  CosNotification.Property[] get_qos ();
  void set_qos (CosNotification.Property[] qos) throws CosNotification.UnsupportedQoS;
  void validate_qos (CosNotification.Property[] required_qos, CosNotification.NamedPropertyRangeSeqHolder available_qos) throws CosNotification.UnsupportedQoS;
} // interface QoSAdminOperations
