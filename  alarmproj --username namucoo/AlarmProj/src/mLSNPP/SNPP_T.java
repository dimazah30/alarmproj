package mLSNPP;


/**
* mLSNPP/SNPP_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class SNPP_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sNPPId = null;
  public mLSNPP.SNP_T sNPList[] = null;
  public String tNAName = null;
  public String groupTNAName = null;
  public String rAId = null;

  public SNPP_T ()
  {
  } // ctor

  public SNPP_T (String _sNPPId, mLSNPP.SNP_T[] _sNPList, String _tNAName, String _groupTNAName, String _rAId)
  {
    sNPPId = _sNPPId;
    sNPList = _sNPList;
    tNAName = _tNAName;
    groupTNAName = _groupTNAName;
    rAId = _rAId;
  } // ctor

} // class SNPP_T
