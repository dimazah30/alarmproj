package mLSNPPLink;


/**
* mLSNPPLink/SNPPLink_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

public final class SNPPLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public String SNPPLinkId = null;
  public mLSNPP.SNPP_T aEnd = null;
  public mLSNPP.SNPP_T zEnd = null;

  public SNPPLink_T ()
  {
  } // ctor

  public SNPPLink_T (String _SNPPLinkId, mLSNPP.SNPP_T _aEnd, mLSNPP.SNPP_T _zEnd)
  {
    SNPPLinkId = _SNPPLinkId;
    aEnd = _aEnd;
    zEnd = _zEnd;
  } // ctor

} // class SNPPLink_T
