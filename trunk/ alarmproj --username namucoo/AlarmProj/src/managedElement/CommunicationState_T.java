package managedElement;


/**
* managedElement/CommunicationState_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 managedElement.idl
* 2009年9月2日 星期三 下午03时27分41秒 CST
*/


/** 
   * <p>This state reflects a communication state between the EMS and its 
   * ManagedElement.</p>
   * <p>The NMS user will have to go to the EMS to determine the
   * exact reasons as to why the ManagedElement is unavailable.</p>
   **/
public class CommunicationState_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static managedElement.CommunicationState_T[] __array = new managedElement.CommunicationState_T [__size];

  public static final int _CS_AVAILABLE = 0;
  public static final managedElement.CommunicationState_T CS_AVAILABLE = new managedElement.CommunicationState_T(_CS_AVAILABLE);
  public static final int _CS_UNAVAILABLE = 1;
  public static final managedElement.CommunicationState_T CS_UNAVAILABLE = new managedElement.CommunicationState_T(_CS_UNAVAILABLE);

  public int value ()
  {
    return __value;
  }

  public static managedElement.CommunicationState_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected CommunicationState_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class CommunicationState_T
