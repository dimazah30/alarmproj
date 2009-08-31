package AlarmIRPSystem;


/**
* AlarmIRPSystem/AlarmInformationIteratorHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPSystem.idl
* 2009年8月24日 星期一 上午09时34分29秒 CST
*/


/*
   The AlarmInformationIterator is used to iterate through a snapshot of
   Alarm Informations taken from the Alarm List when IRPManager invokes
   get_alarm_list. IRPManager uses it to pace the return of Alarm
   Informations.
   IRPAgent controls the life-cycle of the iterator. However, a destroy
   operation is provided to handle the case where IRPManager wants to stop
   the iteration procedure before reaching the last iteration.
   */
abstract public class AlarmInformationIteratorHelper
{
  private static String  _id = "IDL:3gppsa5.org/AlarmIRPSystem/AlarmInformationIterator:1.0";

  public static void insert (org.omg.CORBA.Any a, AlarmIRPSystem.AlarmInformationIterator that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static AlarmIRPSystem.AlarmInformationIterator extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (AlarmIRPSystem.AlarmInformationIteratorHelper.id (), "AlarmInformationIterator");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static AlarmIRPSystem.AlarmInformationIterator read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AlarmInformationIteratorStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, AlarmIRPSystem.AlarmInformationIterator value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static AlarmIRPSystem.AlarmInformationIterator narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPSystem.AlarmInformationIterator)
      return (AlarmIRPSystem.AlarmInformationIterator)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPSystem._AlarmInformationIteratorStub stub = new AlarmIRPSystem._AlarmInformationIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static AlarmIRPSystem.AlarmInformationIterator unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof AlarmIRPSystem.AlarmInformationIterator)
      return (AlarmIRPSystem.AlarmInformationIterator)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      AlarmIRPSystem._AlarmInformationIteratorStub stub = new AlarmIRPSystem._AlarmInformationIteratorStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
