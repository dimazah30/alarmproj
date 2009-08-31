package TimeBase;

/**
* TimeBase/UtcTHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 TimeBase.idl
* 2009年8月24日 星期一 上午09时36分53秒 CST
*/

public final class UtcTHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeBase.UtcT value = null;

  public UtcTHolder ()
  {
  }

  public UtcTHolder (TimeBase.UtcT initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeBase.UtcTHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeBase.UtcTHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeBase.UtcTHelper.type ();
  }

}
