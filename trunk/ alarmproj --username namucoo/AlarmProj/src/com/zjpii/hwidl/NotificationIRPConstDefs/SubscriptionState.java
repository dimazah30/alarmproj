package NotificationIRPConstDefs;


/**
* NotificationIRPConstDefs/SubscriptionState.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 NotificationIRPConstDefs.idl
* 2009年8月25日 星期二 下午04时08分11秒 CST
*/


/*
   This indicates if the subscription is Active (not suspended), Suspended,
   or Invalid.
   */
public class SubscriptionState implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static NotificationIRPConstDefs.SubscriptionState[] __array = new NotificationIRPConstDefs.SubscriptionState [__size];

  public static final int _Active = 0;
  public static final NotificationIRPConstDefs.SubscriptionState Active = new NotificationIRPConstDefs.SubscriptionState(_Active);
  public static final int _Suspended = 1;
  public static final NotificationIRPConstDefs.SubscriptionState Suspended = new NotificationIRPConstDefs.SubscriptionState(_Suspended);
  public static final int _Invalid = 2;
  public static final NotificationIRPConstDefs.SubscriptionState Invalid = new NotificationIRPConstDefs.SubscriptionState(_Invalid);

  public int value ()
  {
    return __value;
  }

  public static NotificationIRPConstDefs.SubscriptionState from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected SubscriptionState (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class SubscriptionState
