package mLSNPP;


/**
* mLSNPP/SNPTNAPair_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class SNPTNAPair_T implements org.omg.CORBA.portable.IDLEntity
{
  public String SNPId = null;
  public String tNAName = null;

  public SNPTNAPair_T ()
  {
  } // ctor

  public SNPTNAPair_T (String _SNPId, String _tNAName)
  {
    SNPId = _SNPId;
    tNAName = _tNAName;
  } // ctor

} // class SNPTNAPair_T
