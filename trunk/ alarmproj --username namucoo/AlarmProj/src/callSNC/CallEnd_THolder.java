package callSNC;

/**
* callSNC/CallEnd_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallEnd_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallEnd_T value = null;

  public CallEnd_THolder ()
  {
  }

  public CallEnd_THolder (callSNC.CallEnd_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallEnd_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallEnd_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallEnd_THelper.type ();
  }

}
