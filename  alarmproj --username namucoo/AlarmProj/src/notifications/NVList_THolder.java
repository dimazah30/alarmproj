package notifications;


/**
* notifications/NVList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 notifications.idl
* 2009年9月2日 星期三 下午03时28分24秒 CST
*/


/**
   * <p>A list of (name=string, value=any) tuples. The OMG standard 
   * NVList.  This is used for AttributeValueChange and StateChange 
   * notifications (see <a
   * href=../../../supportingDocumentation/SD1-26_OMGServicesUsage.pdf >SD1-26  
   * Guidelines for Using the OMG Notification and Telecom Log Service</a>).</p>
   **/
public final class NVList_THolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.NameAndAnyValue_T value[] = null;

  public NVList_THolder ()
  {
  }

  public NVList_THolder (notifications.NameAndAnyValue_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.NVList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.NVList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.NVList_THelper.type ();
  }

}
