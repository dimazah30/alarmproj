package mLSNPP;

/**
* mLSNPP/SNPTNAPair_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class SNPTNAPair_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPTNAPair_T value = null;

  public SNPTNAPair_THolder ()
  {
  }

  public SNPTNAPair_THolder (mLSNPP.SNPTNAPair_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPTNAPair_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPTNAPair_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPTNAPair_THelper.type ();
  }

}
