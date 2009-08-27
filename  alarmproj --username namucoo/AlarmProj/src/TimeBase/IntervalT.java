package TimeBase;


/**
* TimeBase/IntervalT.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 TimeBase.idl
* 2009年8月24日 星期一 上午09时36分53秒 CST
*/

public final class IntervalT implements org.omg.CORBA.portable.IDLEntity
{
  public long lower_bound = (long)0;
  public long upper_bound = (long)0;

  public IntervalT ()
  {
  } // ctor

  public IntervalT (long _lower_bound, long _upper_bound)
  {
    lower_bound = _lower_bound;
    upper_bound = _upper_bound;
  } // ctor

} // class IntervalT
