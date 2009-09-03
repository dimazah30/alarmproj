package mLSNPP;


/**
* mLSNPP/SNPTNAData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
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
