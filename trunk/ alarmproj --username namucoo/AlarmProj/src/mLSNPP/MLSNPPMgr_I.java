package mLSNPP;


/**
* mLSNPP/MLSNPPMgr_I.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   * <p>The mLSNPPMgr_I is used to gain access to MLSNPP and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public interface MLSNPPMgr_I extends MLSNPPMgr_IOperations, common.Common_I, org.omg.CORBA.portable.IDLEntity 
{
} // interface MLSNPPMgr_I
