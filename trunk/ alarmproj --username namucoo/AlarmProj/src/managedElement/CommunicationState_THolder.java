package managedElement;

/**
* managedElement/CommunicationState_THolder.java .
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
public final class CommunicationState_THolder implements org.omg.CORBA.portable.Streamable
{
  public managedElement.CommunicationState_T value = null;

  public CommunicationState_THolder ()
  {
  }

  public CommunicationState_THolder (managedElement.CommunicationState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = managedElement.CommunicationState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    managedElement.CommunicationState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return managedElement.CommunicationState_THelper.type ();
  }

}
