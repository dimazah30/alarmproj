package notifications;

/**
* notifications/FileTransferStatus_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * </p>Describe transfer status type.  This is used for file transfer 
   * protocol notifications (see <a
   * href=../../../supportingDocumentation/SD1-26_OMGServicesUsage.pdf >SD1-26  
   * Guidelines for Using the OMG Notification and Telecom Log Service</a>).</p>
   **/
public final class FileTransferStatus_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.FileTransferStatus_T value = null;

  public FileTransferStatus_THolder ()
  {
  }

  public FileTransferStatus_THolder (notifications.FileTransferStatus_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.FileTransferStatus_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.FileTransferStatus_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.FileTransferStatus_THelper.type ();
  }

}
