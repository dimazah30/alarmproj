package CosNotification;


/**
* CosNotification/QoSAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/


// MaxEventsPerConsumer takes on a value of type long
public interface QoSAdminOperations 
{
  CosNotification.Property[] get_qos ();
  void set_qos (CosNotification.Property[] qos) throws CosNotification.UnsupportedQoS;
  void validate_qos (CosNotification.Property[] required_qos, CosNotification.NamedPropertyRangeSeqHolder available_qos) throws CosNotification.UnsupportedQoS;
} // interface QoSAdminOperations
