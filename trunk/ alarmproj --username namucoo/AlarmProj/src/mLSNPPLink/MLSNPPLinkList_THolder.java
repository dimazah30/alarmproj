package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>Sequence of MLSNPPLink_T.<p>
   **/
public final class MLSNPPLinkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.MultiLayerSNPPLink_T value[] = null;

  public MLSNPPLinkList_THolder ()
  {
  }

  public MLSNPPLinkList_THolder (mLSNPPLink.MultiLayerSNPPLink_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.MLSNPPLinkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.MLSNPPLinkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.MLSNPPLinkList_THelper.type ();
  }

}
