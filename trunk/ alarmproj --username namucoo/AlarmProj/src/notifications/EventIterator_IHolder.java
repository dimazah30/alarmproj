package notifications;

/**
* notifications/EventIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� notifications.idl
* 2009��9��2�� ������ ����03ʱ28��24�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class EventIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public notifications.EventIterator_I value = null;

  public EventIterator_IHolder ()
  {
  }

  public EventIterator_IHolder (notifications.EventIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = notifications.EventIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    notifications.EventIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return notifications.EventIterator_IHelper.type ();
  }

}
