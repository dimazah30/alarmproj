package callSNC;

/**
* callSNC/CallAndTopLevelConnections_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallAndTopLevelConnections_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnections_T value = null;

  public CallAndTopLevelConnections_THolder ()
  {
  }

  public CallAndTopLevelConnections_THolder (callSNC.CallAndTopLevelConnections_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnections_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnections_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnections_THelper.type ();
  }

}
