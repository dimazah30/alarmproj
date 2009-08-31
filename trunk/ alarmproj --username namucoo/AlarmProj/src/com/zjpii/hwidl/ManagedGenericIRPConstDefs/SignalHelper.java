package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/SignalHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

abstract public class SignalHelper
{
  private static String  _id = "IDL:3gppsa5.org/ManagedGenericIRPConstDefs/Signal:1.0";

  public static void insert (org.omg.CORBA.Any a, ManagedGenericIRPConstDefs.Signal that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ManagedGenericIRPConstDefs.Signal extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (ManagedGenericIRPConstDefs.SignalHelper.id (), "Signal", new String[] { "OK", "Failure", "PartialFailure"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ManagedGenericIRPConstDefs.Signal read (org.omg.CORBA.portable.InputStream istream)
  {
    return ManagedGenericIRPConstDefs.Signal.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ManagedGenericIRPConstDefs.Signal value)
  {
    ostream.write_long (value.value ());
  }

}
