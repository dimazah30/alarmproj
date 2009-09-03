package mLSNPP;


/**
* mLSNPP/SNP_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class SNP_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sNPId = null;
  public globaldefs.NameAndStringValue_T tPName[] = null;
  public String tNAName = null;

  public SNP_T ()
  {
  } // ctor

  public SNP_T (String _sNPId, globaldefs.NameAndStringValue_T[] _tPName, String _tNAName)
  {
    sNPId = _sNPId;
    tPName = _tPName;
    tNAName = _tNAName;
  } // ctor

} // class SNP_T
