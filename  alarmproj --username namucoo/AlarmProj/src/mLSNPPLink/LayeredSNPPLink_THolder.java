package mLSNPPLink;

/**
* mLSNPPLink/LayeredSNPPLink_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

public final class LayeredSNPPLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.LayeredSNPPLink_T value = null;

  public LayeredSNPPLink_THolder ()
  {
  }

  public LayeredSNPPLink_THolder (mLSNPPLink.LayeredSNPPLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.LayeredSNPPLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.LayeredSNPPLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.LayeredSNPPLink_THelper.type ();
  }

}
