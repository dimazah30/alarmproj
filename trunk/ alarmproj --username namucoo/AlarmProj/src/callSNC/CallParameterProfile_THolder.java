package callSNC;

/**
* callSNC/CallParameterProfile_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallParameterProfile_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallParameterProfile_T value = null;

  public CallParameterProfile_THolder ()
  {
  }

  public CallParameterProfile_THolder (callSNC.CallParameterProfile_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallParameterProfile_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallParameterProfile_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallParameterProfile_THelper.type ();
  }

}
