package EPIRPSystem;


/**
* EPIRPSystem/ResultTypeHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

abstract public class ResultTypeHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/ResultType:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.ResultType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.ResultType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (EPIRPSystem.ResultTypeHelper.id (), "ResultType", new String[] { "OK", "Failure"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.ResultType read (org.omg.CORBA.portable.InputStream istream)
  {
    return EPIRPSystem.ResultType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.ResultType value)
  {
    ostream.write_long (value.value ());
  }

}
