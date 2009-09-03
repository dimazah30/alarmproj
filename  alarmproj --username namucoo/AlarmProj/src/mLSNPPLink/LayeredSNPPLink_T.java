package mLSNPPLink;


/**
* mLSNPPLink/LayeredSNPPLink_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

public final class LayeredSNPPLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public mLSNPPLink.SNPPLink_T sNPPLinkList[] = null;

  public LayeredSNPPLink_T ()
  {
  } // ctor

  public LayeredSNPPLink_T (short _layerRate, mLSNPPLink.SNPPLink_T[] _sNPPLinkList)
  {
    layerRate = _layerRate;
    sNPPLinkList = _sNPPLinkList;
  } // ctor

} // class LayeredSNPPLink_T
