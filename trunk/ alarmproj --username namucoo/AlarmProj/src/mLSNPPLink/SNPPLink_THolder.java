package mLSNPPLink;

/**
* mLSNPPLink/SNPPLink_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class SNPPLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.SNPPLink_T value = null;

  public SNPPLink_THolder ()
  {
  }

  public SNPPLink_THolder (mLSNPPLink.SNPPLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.SNPPLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.SNPPLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.SNPPLink_THelper.type ();
  }

}
