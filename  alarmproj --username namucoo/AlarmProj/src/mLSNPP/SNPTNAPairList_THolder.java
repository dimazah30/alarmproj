package mLSNPP;


/**
* mLSNPP/SNPTNAPairList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/


/**
   **/
public final class SNPTNAPairList_THolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.SNPTNAPair_T value[] = null;

  public SNPTNAPairList_THolder ()
  {
  }

  public SNPTNAPairList_THolder (mLSNPP.SNPTNAPair_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.SNPTNAPairList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.SNPTNAPairList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.SNPTNAPairList_THelper.type ();
  }

}
