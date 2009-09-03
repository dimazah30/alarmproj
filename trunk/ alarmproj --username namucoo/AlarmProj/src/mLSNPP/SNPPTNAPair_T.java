package mLSNPP;


/**
* mLSNPP/SNPPTNAPair_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class SNPPTNAPair_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sNPPId = null;
  public short layerRate = (short)0;
  public String rAId = null;
  public String tNAName = null;
  public String groupTNAName = null;

  public SNPPTNAPair_T ()
  {
  } // ctor

  public SNPPTNAPair_T (String _sNPPId, short _layerRate, String _rAId, String _tNAName, String _groupTNAName)
  {
    sNPPId = _sNPPId;
    layerRate = _layerRate;
    rAId = _rAId;
    tNAName = _tNAName;
    groupTNAName = _groupTNAName;
  } // ctor

} // class SNPPTNAPair_T
