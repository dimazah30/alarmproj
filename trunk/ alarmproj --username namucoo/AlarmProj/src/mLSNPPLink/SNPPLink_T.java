package mLSNPPLink;


/**
* mLSNPPLink/SNPPLink_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class SNPPLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public String SNPPLinkId = null;
  public mLSNPP.SNPP_T aEnd = null;
  public mLSNPP.SNPP_T zEnd = null;

  public SNPPLink_T ()
  {
  } // ctor

  public SNPPLink_T (String _SNPPLinkId, mLSNPP.SNPP_T _aEnd, mLSNPP.SNPP_T _zEnd)
  {
    SNPPLinkId = _SNPPLinkId;
    aEnd = _aEnd;
    zEnd = _zEnd;
  } // ctor

} // class SNPPLink_T
