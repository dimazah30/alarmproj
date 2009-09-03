package CosNaming.NamingContextPackage;


/**
* CosNaming/NamingContextPackage/NotFoundReason.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public class NotFoundReason implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static CosNaming.NamingContextPackage.NotFoundReason[] __array = new CosNaming.NamingContextPackage.NotFoundReason [__size];

  public static final int _missing_node = 0;
  public static final CosNaming.NamingContextPackage.NotFoundReason missing_node = new CosNaming.NamingContextPackage.NotFoundReason(_missing_node);
  public static final int _not_context = 1;
  public static final CosNaming.NamingContextPackage.NotFoundReason not_context = new CosNaming.NamingContextPackage.NotFoundReason(_not_context);
  public static final int _not_object = 2;
  public static final CosNaming.NamingContextPackage.NotFoundReason not_object = new CosNaming.NamingContextPackage.NotFoundReason(_not_object);

  public int value ()
  {
    return __value;
  }

  public static CosNaming.NamingContextPackage.NotFoundReason from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected NotFoundReason (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class NotFoundReason
