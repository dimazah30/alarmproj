package mLSNPP;


/**
* mLSNPP/LayeredSNPPList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
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
