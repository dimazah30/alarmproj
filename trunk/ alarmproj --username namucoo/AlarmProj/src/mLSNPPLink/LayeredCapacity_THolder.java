package mLSNPPLink;

/**
* mLSNPPLink/LayeredCapacity_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/

public final class LayeredCapacity_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.LayeredCapacity_T value = null;

  public LayeredCapacity_THolder ()
  {
  }

  public LayeredCapacity_THolder (mLSNPPLink.LayeredCapacity_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.LayeredCapacity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.LayeredCapacity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.LayeredCapacity_THelper.type ();
  }

}
