package callSNC;

/**
* callSNC/CallModifyData_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallModifyData_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.CallModifyData_T value = null;

  public CallModifyData_THolder ()
  {
  }

  public CallModifyData_THolder (callSNC.CallModifyData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallModifyData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallModifyData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallModifyData_THelper.type ();
  }

}
