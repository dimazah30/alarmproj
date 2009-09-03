package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkMgr_I.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/**
   * <p>The mLSNPPLinkMgr_I is used to gain access to MLSNPP Links and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public interface MLSNPPLinkMgr_I extends MLSNPPLinkMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface MLSNPPLinkMgr_I
