package CosNaming;


/**
* CosNaming/NamingContextExtHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContextExt Interface provides the extensions to the 
 * NamingContext Interface as proposed by the Interoperable
 * Naming Service Extension.
 */
abstract public class NamingContextExtHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContextExt:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.NamingContextExt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.NamingContextExt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNaming.NamingContextExtHelper.id (), "NamingContextExt");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNaming.NamingContextExt read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NamingContextExtStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.NamingContextExt value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNaming.NamingContextExt narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNaming.NamingContextExt)
      return (CosNaming.NamingContextExt)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNaming._NamingContextExtStub stub = new CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNaming.NamingContextExt unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNaming.NamingContextExt)
      return (CosNaming.NamingContextExt)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNaming._NamingContextExtStub stub = new CosNaming._NamingContextExtStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
