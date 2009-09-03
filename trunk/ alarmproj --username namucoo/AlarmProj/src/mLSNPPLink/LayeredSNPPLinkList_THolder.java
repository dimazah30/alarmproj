package mLSNPPLink;


/**
* mLSNPPLink/LayeredSNPPLinkList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/** 
   * The List of LayeredSNPPLink_T. It is a list of the SNPP Links at a particular layer. A given layerRate value can appear only once in this list.
   **/
public final class LayeredSNPPLinkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.LayeredSNPPLink_T value[] = null;

  public LayeredSNPPLinkList_THolder ()
  {
  }

  public LayeredSNPPLinkList_THolder (mLSNPPLink.LayeredSNPPLink_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.LayeredSNPPLinkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.LayeredSNPPLinkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.LayeredSNPPLinkList_THelper.type ();
  }

}
