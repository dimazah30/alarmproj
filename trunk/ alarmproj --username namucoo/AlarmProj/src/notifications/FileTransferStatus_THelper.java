package notifications;


/**
* notifications/FileTransferStatus_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * </p>Describe transfer status type.  This is used for file transfer 
   * protocol notifications (see <a
   * href=../../../supportingDocumentation/SD1-26_OMGServicesUsage.pdf >SD1-26  
   * Guidelines for Using the OMG Notification and Telecom Log Service</a>).</p>
   **/
abstract public class FileTransferStatus_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/notifications/FileTransferStatus_T:1.0";

  public static void insert (org.omg.CORBA.Any a, notifications.FileTransferStatus_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static notifications.FileTransferStatus_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (notifications.FileTransferStatus_THelper.id (), "FileTransferStatus_T", new String[] { "FT_IN_PROGRESS", "FT_FAILED", "FT_COMPLETED"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static notifications.FileTransferStatus_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return notifications.FileTransferStatus_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, notifications.FileTransferStatus_T value)
  {
    ostream.write_long (value.value ());
  }

}
