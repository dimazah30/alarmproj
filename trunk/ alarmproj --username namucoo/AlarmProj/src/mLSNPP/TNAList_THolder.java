package mLSNPP;


/**
* mLSNPP/TNAList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   **/
public final class TNAList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public TNAList_THolder ()
  {
  }

  public TNAList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.TNAList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.TNAList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.TNAList_THelper.type ();
  }

}
