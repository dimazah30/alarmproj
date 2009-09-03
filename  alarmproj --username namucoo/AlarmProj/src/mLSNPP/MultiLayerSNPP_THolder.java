package mLSNPP;

/**
* mLSNPP/MultiLayerSNPP_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class MultiLayerSNPP_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.MultiLayerSNPP_T value = null;

  public MultiLayerSNPP_THolder ()
  {
  }

  public MultiLayerSNPP_THolder (mLSNPP.MultiLayerSNPP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.MultiLayerSNPP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.MultiLayerSNPP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.MultiLayerSNPP_THelper.type ();
  }

}
