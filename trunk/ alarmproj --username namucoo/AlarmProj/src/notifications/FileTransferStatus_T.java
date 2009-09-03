package notifications;


/**
* notifications/FileTransferStatus_T.java .
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
public class FileTransferStatus_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 3;
  private static notifications.FileTransferStatus_T[] __array = new notifications.FileTransferStatus_T [__size];

  public static final int _FT_IN_PROGRESS = 0;
  public static final notifications.FileTransferStatus_T FT_IN_PROGRESS = new notifications.FileTransferStatus_T(_FT_IN_PROGRESS);
  public static final int _FT_FAILED = 1;
  public static final notifications.FileTransferStatus_T FT_FAILED = new notifications.FileTransferStatus_T(_FT_FAILED);
  public static final int _FT_COMPLETED = 2;
  public static final notifications.FileTransferStatus_T FT_COMPLETED = new notifications.FileTransferStatus_T(_FT_COMPLETED);

  public int value ()
  {
    return __value;
  }

  public static notifications.FileTransferStatus_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected FileTransferStatus_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class FileTransferStatus_T
