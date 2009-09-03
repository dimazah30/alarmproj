package mLSNPP;


/**
* mLSNPP/SNPP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
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
