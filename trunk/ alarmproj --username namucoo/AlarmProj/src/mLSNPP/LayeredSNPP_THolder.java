package mLSNPP;

/**
* mLSNPP/LayeredSNPP_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class LayeredSNPP_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.LayeredSNPP_T value = null;

  public LayeredSNPP_THolder ()
  {
  }

  public LayeredSNPP_THolder (mLSNPP.LayeredSNPP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.LayeredSNPP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.LayeredSNPP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.LayeredSNPP_THelper.type ();
  }

}
