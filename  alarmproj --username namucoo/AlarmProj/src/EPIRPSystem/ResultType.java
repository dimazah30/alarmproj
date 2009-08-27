package EPIRPSystem;


/**
* EPIRPSystem/ResultType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public class ResultType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static EPIRPSystem.ResultType[] __array = new EPIRPSystem.ResultType [__size];

  public static final int _OK = 0;
  public static final EPIRPSystem.ResultType OK = new EPIRPSystem.ResultType(_OK);
  public static final int _Failure = 1;
  public static final EPIRPSystem.ResultType Failure = new EPIRPSystem.ResultType(_Failure);

  public int value ()
  {
    return __value;
  }

  public static EPIRPSystem.ResultType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ResultType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ResultType
