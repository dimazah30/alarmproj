package aSAP;

/**
* aSAP/ASAP_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

public final class ASAP_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.ASAP_T value = null;

  public ASAP_THolder ()
  {
  }

  public ASAP_THolder (aSAP.ASAP_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.ASAP_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.ASAP_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.ASAP_THelper.type ();
  }

}
