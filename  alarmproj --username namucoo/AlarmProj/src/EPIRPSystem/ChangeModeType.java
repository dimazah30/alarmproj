package EPIRPSystem;


/**
* EPIRPSystem/ChangeModeType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public class ChangeModeType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static EPIRPSystem.ChangeModeType[] __array = new EPIRPSystem.ChangeModeType [__size];

  public static final int _REGISTER = 0;
  public static final EPIRPSystem.ChangeModeType REGISTER = new EPIRPSystem.ChangeModeType(_REGISTER);
  public static final int _DEREGISTER = 1;
  public static final EPIRPSystem.ChangeModeType DEREGISTER = new EPIRPSystem.ChangeModeType(_DEREGISTER);
  public static final int _MODIFY = 2;
  public static final EPIRPSystem.ChangeModeType MODIFY = new EPIRPSystem.ChangeModeType(_MODIFY);

  public int value ()
  {
    return __value;
  }

  public static EPIRPSystem.ChangeModeType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ChangeModeType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ChangeModeType
