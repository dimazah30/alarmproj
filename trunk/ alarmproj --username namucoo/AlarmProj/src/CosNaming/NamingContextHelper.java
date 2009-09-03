package CosNaming;


/**
* CosNaming/NamingContextHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContext interface provides operations which support the following:
 * <ul>
 * <li> binding objects
 * <li> name resolution
 * <li> unbinding
 * <li> creating naming contexts
 * <li> deleting contexts
 * <li> listing a naming context
 * </ul>
 */
abstract public class NamingContextHelper
{
  private static String  _id = "IDL:omg.org/CosNaming/NamingContext:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNaming.NamingContext that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNaming.NamingContext extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNaming.NamingContextHelper.id (), "NamingContext");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNaming.NamingContext read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_NamingContextStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNaming.NamingContext value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNaming.NamingContext narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNaming.NamingContext)
      return (CosNaming.NamingContext)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNaming._NamingContextStub stub = new CosNaming._NamingContextStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNaming.NamingContext unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNaming.NamingContext)
      return (CosNaming.NamingContext)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNaming._NamingContextStub stub = new CosNaming._NamingContextStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
