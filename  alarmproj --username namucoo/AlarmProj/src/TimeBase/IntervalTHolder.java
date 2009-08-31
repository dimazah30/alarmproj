package TimeBase;

/**
* TimeBase/IntervalTHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 TimeBase.idl
* 2009年8月24日 星期一 上午09时36分53秒 CST
*/

public final class IntervalTHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeBase.IntervalT value = null;

  public IntervalTHolder ()
  {
  }

  public IntervalTHolder (TimeBase.IntervalT initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeBase.IntervalTHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeBase.IntervalTHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeBase.IntervalTHelper.type ();
  }

}
