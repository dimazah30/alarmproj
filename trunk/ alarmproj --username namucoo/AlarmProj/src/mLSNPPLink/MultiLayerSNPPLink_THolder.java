package mLSNPPLink;

/**
* mLSNPPLink/MultiLayerSNPPLink_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class MultiLayerSNPPLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.MultiLayerSNPPLink_T value = null;

  public MultiLayerSNPPLink_THolder ()
  {
  }

  public MultiLayerSNPPLink_THolder (mLSNPPLink.MultiLayerSNPPLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.MultiLayerSNPPLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.MultiLayerSNPPLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.MultiLayerSNPPLink_THelper.type ();
  }

}
