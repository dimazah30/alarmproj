package mLSNPPLink;


/**
* mLSNPPLink/SNPPLinkList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/** 
   * The List of SNPPLink_T. It is a list of the SNPP Links across the levels of routing hierarchy. This shall always include the details for the SNPP Links in the relevant layer directly represented by the MLSNPPLink and may also include details for the subordinate SNPP Links if the information is available to the EMS. The routing level is identified via the Routing Area IDs of end SNPPs.
   **/
public final class SNPPLinkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.SNPPLink_T value[] = null;

  public SNPPLinkList_THolder ()
  {
  }

  public SNPPLinkList_THolder (mLSNPPLink.SNPPLink_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.SNPPLinkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.SNPPLinkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.SNPPLinkList_THelper.type ();
  }

}
