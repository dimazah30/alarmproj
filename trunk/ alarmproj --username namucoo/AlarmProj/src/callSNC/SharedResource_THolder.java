package callSNC;

/**
* callSNC/SharedResource_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class SharedResource_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SharedResource_T value = null;

  public SharedResource_THolder ()
  {
  }

  public SharedResource_THolder (callSNC.SharedResource_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SharedResource_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SharedResource_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SharedResource_THelper.type ();
  }

}
