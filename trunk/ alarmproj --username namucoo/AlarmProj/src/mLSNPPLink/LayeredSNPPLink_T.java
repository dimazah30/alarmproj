package mLSNPPLink;


/**
* mLSNPPLink/LayeredSNPPLink_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class LayeredSNPPLink_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public mLSNPPLink.SNPPLink_T sNPPLinkList[] = null;

  public LayeredSNPPLink_T ()
  {
  } // ctor

  public LayeredSNPPLink_T (short _layerRate, mLSNPPLink.SNPPLink_T[] _sNPPLinkList)
  {
    layerRate = _layerRate;
    sNPPLinkList = _sNPPLinkList;
  } // ctor

} // class LayeredSNPPLink_T
