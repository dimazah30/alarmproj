package callSNC;

/**
* callSNC/SNCAndRoute_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class SNCAndRoute_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SNCAndRoute_T value = null;

  public SNCAndRoute_THolder ()
  {
  }

  public SNCAndRoute_THolder (callSNC.SNCAndRoute_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SNCAndRoute_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SNCAndRoute_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SNCAndRoute_THelper.type ();
  }

}
