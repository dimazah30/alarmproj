package emsMgr;


/**
* emsMgr/EMSMgr_I.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� emsMgr.idl
* 2009��9��2�� ������ ����12ʱ51��25�� CST
*/


/**
   * <p>The EMSMgr_I is used to gain access to operations
   * which deal with the EMS itself.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in managerInterface when 
   * the managerName "EMS" is used.</p>
   **/
public interface EMSMgr_I extends EMSMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface EMSMgr_I
