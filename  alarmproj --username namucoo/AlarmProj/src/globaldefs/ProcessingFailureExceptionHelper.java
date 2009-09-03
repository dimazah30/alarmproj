package globaldefs;


/**
* globaldefs/ProcessingFailureExceptionHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/

abstract public class ProcessingFailureExceptionHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.ProcessingFailureException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.ProcessingFailureException extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = globaldefs.ExceptionType_THelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "exceptionType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "errorReason",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (globaldefs.ProcessingFailureExceptionHelper.id (), "ProcessingFailureException", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static globaldefs.ProcessingFailureException read (org.omg.CORBA.portable.InputStream istream)
  {
    globaldefs.ProcessingFailureException value = new globaldefs.ProcessingFailureException ();
    // read and discard the repository ID
    istream.read_string ();
    value.exceptionType = globaldefs.ExceptionType_THelper.read (istream);
    value.errorReason = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.ProcessingFailureException value)
  {
    // write the repository ID
    ostream.write_string (id ());
    globaldefs.ExceptionType_THelper.write (ostream, value.exceptionType);
    ostream.write_string (value.errorReason);
  }

}
