package mLSNPP;


/**
* mLSNPP/SNPPTNAPairList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   **/
public final class SNPPTNAPairList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPPTNAPair_T value[] = null;

  public SNPPTNAPairList_THolder ()
  {
  }

  public SNPPTNAPairList_THolder (mLSNPP.SNPPTNAPair_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPPTNAPairList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPPTNAPairList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPPTNAPairList_THelper.type ();
  }

}
