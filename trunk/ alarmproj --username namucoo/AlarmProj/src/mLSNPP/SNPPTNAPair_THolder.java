package mLSNPP;

/**
* mLSNPP/SNPPTNAPair_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/

public final class SNPPTNAPair_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPPTNAPair_T value = null;

  public SNPPTNAPair_THolder ()
  {
  }

  public SNPPTNAPair_THolder (mLSNPP.SNPPTNAPair_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPPTNAPair_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPPTNAPair_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPPTNAPair_THelper.type ();
  }

}
