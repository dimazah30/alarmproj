package EPIRPSystem;


/**
* EPIRPSystem/EPIRPHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
  */
abstract public class EPIRPHelper
{
  private static String  _id = "IDL:3gppsa5.org/EPIRPSystem/EPIRP:1.0";

  public static void insert (org.omg.CORBA.Any a, EPIRPSystem.EPIRP that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static EPIRPSystem.EPIRP extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (EPIRPSystem.EPIRPHelper.id (), "EPIRP");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static EPIRPSystem.EPIRP read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EPIRPStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, EPIRPSystem.EPIRP value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static EPIRPSystem.EPIRP narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EPIRPSystem.EPIRP)
      return (EPIRPSystem.EPIRP)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      EPIRPSystem._EPIRPStub stub = new EPIRPSystem._EPIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static EPIRPSystem.EPIRP unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof EPIRPSystem.EPIRP)
      return (EPIRPSystem.EPIRP)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      EPIRPSystem._EPIRPStub stub = new EPIRPSystem._EPIRPStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
