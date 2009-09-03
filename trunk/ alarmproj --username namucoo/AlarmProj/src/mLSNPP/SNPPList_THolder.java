package mLSNPP;


/**
* mLSNPP/SNPPList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
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
