package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/**
   * <p>Sequence of MLSNPPLink_T.<p>
   **/
public final class MLSNPPLinkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.MultiLayerSNPPLink_T value[] = null;

  public MLSNPPLinkList_THolder ()
  {
  }

  public MLSNPPLinkList_THolder (mLSNPPLink.MultiLayerSNPPLink_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.MLSNPPLinkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.MLSNPPLinkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.MLSNPPLinkList_THelper.type ();
  }

}
