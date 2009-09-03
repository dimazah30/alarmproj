package mLSNPP;


/**
* mLSNPP/SNPPList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   * The List of SNPP_T. It is a list of the SNPPs across the levels of routing hierarchy. This shall always include the details for the SNPPs in the relevant layer directly represented by the MLSNPP and may also include details for the subordinate SNPPs if the information is available to the EMS. The routing level is identified via the Routing Area IDs.
   **/
public final class SNPPList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPP_T value[] = null;

  public SNPPList_THolder ()
  {
  }

  public SNPPList_THolder (mLSNPP.SNPP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPPList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPPList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPPList_THelper.type ();
  }

}
