package mLSNPP;


/**
* mLSNPP/SNPTNADataList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   **/
public final class SNPTNADataList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPTNAData_T value[] = null;

  public SNPTNADataList_THolder ()
  {
  }

  public SNPTNADataList_THolder (mLSNPP.SNPTNAData_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPTNADataList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPTNADataList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPTNADataList_THelper.type ();
  }

}
