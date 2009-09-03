package emsMgr;

/**
* emsMgr/EMS_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 emsMgr.idl
* 2009年9月2日 星期三 下午12时51分25秒 CST
*/

public final class EMS_THolder implements org.omg.CORBA.portable.Streamable
{
  public emsMgr.EMS_T value = null;

  public EMS_THolder ()
  {
  }

  public EMS_THolder (emsMgr.EMS_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = emsMgr.EMS_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    emsMgr.EMS_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return emsMgr.EMS_THelper.type ();
  }

}
