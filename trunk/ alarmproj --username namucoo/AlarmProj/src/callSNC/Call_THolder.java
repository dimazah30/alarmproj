package callSNC;

/**
* callSNC/Call_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class Call_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.Call_T value = null;

  public Call_THolder ()
  {
  }

  public Call_THolder (callSNC.Call_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.Call_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.Call_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.Call_THelper.type ();
  }

}
