package CosNotification;


/**
* CosNotification/QoSError_code.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotification.idl
* 2009年8月24日 星期一 上午09时33分34秒 CST
*/

public class QoSError_code implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 7;
  private static CosNotification.QoSError_code[] __array = new CosNotification.QoSError_code [__size];

  public static final int _UNSUPPORTED_PROPERTY = 0;
  public static final CosNotification.QoSError_code UNSUPPORTED_PROPERTY = new CosNotification.QoSError_code(_UNSUPPORTED_PROPERTY);
  public static final int _UNAVAILABLE_PROPERTY = 1;
  public static final CosNotification.QoSError_code UNAVAILABLE_PROPERTY = new CosNotification.QoSError_code(_UNAVAILABLE_PROPERTY);
  public static final int _UNSUPPORTED_VALUE = 2;
  public static final CosNotification.QoSError_code UNSUPPORTED_VALUE = new CosNotification.QoSError_code(_UNSUPPORTED_VALUE);
  public static final int _UNAVAILABLE_VALUE = 3;
  public static final CosNotification.QoSError_code UNAVAILABLE_VALUE = new CosNotification.QoSError_code(_UNAVAILABLE_VALUE);
  public static final int _BAD_PROPERTY = 4;
  public static final CosNotification.QoSError_code BAD_PROPERTY = new CosNotification.QoSError_code(_BAD_PROPERTY);
  public static final int _BAD_TYPE = 5;
  public static final CosNotification.QoSError_code BAD_TYPE = new CosNotification.QoSError_code(_BAD_TYPE);
  public static final int _BAD_VALUE = 6;
  public static final CosNotification.QoSError_code BAD_VALUE = new CosNotification.QoSError_code(_BAD_VALUE);

  public int value ()
  {
    return __value;
  }

  public static CosNotification.QoSError_code from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected QoSError_code (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class QoSError_code
