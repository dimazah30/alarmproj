package common;


/**
* common/Common_IHelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 common.idl
* 2009年9月2日 星期三 下午12时53分06秒 CST
*/


/**
   * <p>The interface Common_I is a set of services and utilities 
   * that is inherited by every manager interface.<p>
   **/
abstract public class Common_IHelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/common/Common_I:1.0";

  public static void insert (org.omg.CORBA.Any a, common.Common_I that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static common.Common_I extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (common.Common_IHelper.id (), "Common_I");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static common.Common_I read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_Common_IStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, common.Common_I value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static common.Common_I narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof common.Common_I)
      return (common.Common_I)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      common._Common_IStub stub = new common._Common_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static common.Common_I unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof common.Common_I)
      return (common.Common_I)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      common._Common_IStub stub = new common._Common_IStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
