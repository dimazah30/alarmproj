package mLSNPP;


/**
* mLSNPP/TNAList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/


/**
   **/
public final class TNAList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public TNAList_THolder ()
  {
  }

  public TNAList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.TNAList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.TNAList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.TNAList_THelper.type ();
  }

}
