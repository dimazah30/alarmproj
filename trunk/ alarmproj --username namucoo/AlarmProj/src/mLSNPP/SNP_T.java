package mLSNPP;


/**
* mLSNPP/SNP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
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
