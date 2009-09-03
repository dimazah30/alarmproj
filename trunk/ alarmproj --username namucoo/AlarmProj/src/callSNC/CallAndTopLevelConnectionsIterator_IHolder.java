package callSNC;

/**
* callSNC/CallAndTopLevelConnectionsIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class CallAndTopLevelConnectionsIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnectionsIterator_I value = null;

  public CallAndTopLevelConnectionsIterator_IHolder ()
  {
  }

  public CallAndTopLevelConnectionsIterator_IHolder (callSNC.CallAndTopLevelConnectionsIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsIterator_IHelper.type ();
  }

}
