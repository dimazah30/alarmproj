package mLSNPP;


/**
* mLSNPP/SNPTNAPair_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
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
