package mLSNPP;


/**
* mLSNPP/SNPList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**

   **/
public final class SNPList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNP_T value[] = null;

  public SNPList_THolder ()
  {
  }

  public SNPList_THolder (mLSNPP.SNP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPList_THelper.type ();
  }

}
