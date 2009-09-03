package callSNC;


/**
* callSNC/CallAndTopLevelConnectionsList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/** 
   * This structure represents a list of calls and their supporting top level
   * connections.</p>
   * 
   **/
public final class CallAndTopLevelConnectionsList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallAndTopLevelConnections_T value[] = null;

  public CallAndTopLevelConnectionsList_THolder ()
  {
  }

  public CallAndTopLevelConnectionsList_THolder (callSNC.CallAndTopLevelConnections_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallAndTopLevelConnectionsList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallAndTopLevelConnectionsList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallAndTopLevelConnectionsList_THelper.type ();
  }

}
