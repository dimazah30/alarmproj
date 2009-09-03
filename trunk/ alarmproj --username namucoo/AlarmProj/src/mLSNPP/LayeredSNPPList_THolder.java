package mLSNPP;


/**
* mLSNPP/LayeredSNPPList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/** 
   * The List of LayeredSNPP_T. It is a list of the SNPPs at all layers. 
   * A given layerRate value can appear only once in this list.
   * 
   **/
public final class LayeredSNPPList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.LayeredSNPP_T value[] = null;

  public LayeredSNPPList_THolder ()
  {
  }

  public LayeredSNPPList_THolder (mLSNPP.LayeredSNPP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.LayeredSNPPList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.LayeredSNPPList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.LayeredSNPPList_THelper.type ();
  }

}
