package callSNC;

/**
* callSNC/CallAndTopLevelConnectionsAndSNCsIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallAndTopLevelConnectionsAndSNCsIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I value = null;

  public CallAndTopLevelConnectionsAndSNCsIterator_IHolder ()
  {
  }

  public CallAndTopLevelConnectionsAndSNCsIterator_IHolder (callSNC.CallAndTopLevelConnectionsAndSNCsIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.type ();
  }

}
