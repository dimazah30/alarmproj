package CosNotification;


/**
* CosNotification/AdminPropertiesAdminHelper.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/


// MaxSuppliers takes on a value of type long
abstract public class AdminPropertiesAdminHelper
{
  private static String  _id = "IDL:omg.org/CosNotification/AdminPropertiesAdmin:1.0";

  public static void insert (org.omg.CORBA.Any a, CosNotification.AdminPropertiesAdmin that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CosNotification.AdminPropertiesAdmin extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CosNotification.AdminPropertiesAdminHelper.id (), "AdminPropertiesAdmin");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CosNotification.AdminPropertiesAdmin read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_AdminPropertiesAdminStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CosNotification.AdminPropertiesAdmin value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CosNotification.AdminPropertiesAdmin narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotification.AdminPropertiesAdmin)
      return (CosNotification.AdminPropertiesAdmin)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotification._AdminPropertiesAdminStub stub = new CosNotification._AdminPropertiesAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CosNotification.AdminPropertiesAdmin unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CosNotification.AdminPropertiesAdmin)
      return (CosNotification.AdminPropertiesAdmin)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CosNotification._AdminPropertiesAdminStub stub = new CosNotification._AdminPropertiesAdminStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
