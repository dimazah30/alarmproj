package mLSNPP;


/**
* mLSNPP/LayeredSNPP_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class LayeredSNPP_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public mLSNPP.SNPP_T SNPPList[] = null;

  public LayeredSNPP_T ()
  {
  } // ctor

  public LayeredSNPP_T (short _layerRate, mLSNPP.SNPP_T[] _SNPPList)
  {
    layerRate = _layerRate;
    SNPPList = _SNPPList;
  } // ctor

} // class LayeredSNPP_T
