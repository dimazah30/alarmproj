package CosNotification;


/**
* CosNotification/AdminPropertiesAdminOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/


// MaxSuppliers takes on a value of type long
public interface AdminPropertiesAdminOperations 
{
  CosNotification.Property[] get_admin ();
  void set_admin (CosNotification.Property[] admin) throws CosNotification.UnsupportedAdmin;
} // interface AdminPropertiesAdminOperations
