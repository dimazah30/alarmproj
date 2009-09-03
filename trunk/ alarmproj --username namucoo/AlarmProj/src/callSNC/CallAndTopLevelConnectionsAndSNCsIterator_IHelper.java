package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

abstract public class CallAndTopLevelConnectionsAndSNCsIterator_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/CallAndTopLevelConnectionsAndSNCsIterator_I:1.0";

  public static void insert (org.omg.CORBA.Any a, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.id (), "CallAndTopLevelConnectionsAndSNCsIterator_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CallAndTopLevelConnectionsAndSNCsIterator_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)
      return (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub stub = new callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)
      return (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub stub = new callSNC._CallAndTopLevelConnectionsAndSNCsIterator_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
