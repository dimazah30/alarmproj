package mLSNPPLink;

/**
* mLSNPPLink/LayeredSNPPLink_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class LayeredSNPPLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.LayeredSNPPLink_T value = null;

  public LayeredSNPPLink_THolder ()
  {
  }

  public LayeredSNPPLink_THolder (mLSNPPLink.LayeredSNPPLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.LayeredSNPPLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.LayeredSNPPLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.LayeredSNPPLink_THelper.type ();
  }

}
