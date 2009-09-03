package emsMgr;


/**
* emsMgr/EMSMgr_I.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 emsMgr.idl
* 2009年9月2日 星期三 下午12时51分25秒 CST
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
