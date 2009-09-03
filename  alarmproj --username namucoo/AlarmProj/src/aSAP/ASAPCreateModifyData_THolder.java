package aSAP;

/**
* aSAP/ASAPCreateModifyData_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/

public final class ASAPCreateModifyData_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.ASAPCreateModifyData_T value = null;

  public ASAPCreateModifyData_THolder ()
  {
  }

  public ASAPCreateModifyData_THolder (aSAP.ASAPCreateModifyData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.ASAPCreateModifyData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.ASAPCreateModifyData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.ASAPCreateModifyData_THelper.type ();
  }

}
