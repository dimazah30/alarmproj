package CosNaming;


/**
* CosNaming/BindingType.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public class BindingType implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static CosNaming.BindingType[] __array = new CosNaming.BindingType [__size];

  public static final int _nobject = 0;
  public static final CosNaming.BindingType nobject = new CosNaming.BindingType(_nobject);
  public static final int _ncontext = 1;
  public static final CosNaming.BindingType ncontext = new CosNaming.BindingType(_ncontext);

  public int value ()
  {
    return __value;
  }

  public static CosNaming.BindingType from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected BindingType (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class BindingType
