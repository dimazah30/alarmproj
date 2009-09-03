package mLSNPP;


/**
* mLSNPP/SNPTNAData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class SNPTNAData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sNPPId = null;
  public short layerRate = (short)0;
  public String rAId = null;
  public mLSNPP.SNPTNAPair_T sNPTNAPairList[] = null;

  public SNPTNAData_T ()
  {
  } // ctor

  public SNPTNAData_T (String _sNPPId, short _layerRate, String _rAId, mLSNPP.SNPTNAPair_T[] _sNPTNAPairList)
  {
    sNPPId = _sNPPId;
    layerRate = _layerRate;
    rAId = _rAId;
    sNPTNAPairList = _sNPTNAPairList;
  } // ctor

} // class SNPTNAData_T
