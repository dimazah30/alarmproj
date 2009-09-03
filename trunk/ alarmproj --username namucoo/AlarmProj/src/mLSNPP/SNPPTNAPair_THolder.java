package mLSNPP;

/**
* mLSNPP/SNPPTNAPair_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/

public final class SNPPTNAPair_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPPTNAPair_T value = null;

  public SNPPTNAPair_THolder ()
  {
  }

  public SNPPTNAPair_THolder (mLSNPP.SNPPTNAPair_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPPTNAPair_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPPTNAPair_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPPTNAPair_THelper.type ();
  }

}
