package callSNC;

/**
* callSNC/RouteGroupInfo_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class RouteGroupInfo_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.RouteGroupInfo_T value = null;

  public RouteGroupInfo_THolder ()
  {
  }

  public RouteGroupInfo_THolder (callSNC.RouteGroupInfo_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.RouteGroupInfo_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.RouteGroupInfo_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.RouteGroupInfo_THelper.type ();
  }

}
