package managedElement;


/**
* managedElement/CommunicationState_THelper.java .
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
abstract public class CommunicationState_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/managedElement/CommunicationState_T:1.0";

  public static void insert (org.omg.CORBA.Any a, managedElement.CommunicationState_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static managedElement.CommunicationState_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (managedElement.CommunicationState_THelper.id (), "CommunicationState_T", new String[] { "CS_AVAILABLE", "CS_UNAVAILABLE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static managedElement.CommunicationState_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return managedElement.CommunicationState_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, managedElement.CommunicationState_T value)
  {
    ostream.write_long (value.value ());
  }

}
