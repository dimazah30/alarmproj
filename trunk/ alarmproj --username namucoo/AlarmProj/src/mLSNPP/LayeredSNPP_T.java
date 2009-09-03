package mLSNPP;


/**
* mLSNPP/LayeredSNPP_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class LayeredSNPP_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public mLSNPP.SNPP_T SNPPList[] = null;

  public LayeredSNPP_T ()
  {
  } // ctor

  public LayeredSNPP_T (short _layerRate, mLSNPP.SNPP_T[] _SNPPList)
  {
    layerRate = _layerRate;
    SNPPList = _SNPPList;
  } // ctor

} // class LayeredSNPP_T
