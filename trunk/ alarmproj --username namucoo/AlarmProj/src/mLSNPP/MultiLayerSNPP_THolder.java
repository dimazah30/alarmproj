package mLSNPP;

/**
* mLSNPP/MultiLayerSNPP_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class MultiLayerSNPP_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.MultiLayerSNPP_T value = null;

  public MultiLayerSNPP_THolder ()
  {
  }

  public MultiLayerSNPP_THolder (mLSNPP.MultiLayerSNPP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.MultiLayerSNPP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.MultiLayerSNPP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.MultiLayerSNPP_THelper.type ();
  }

}
