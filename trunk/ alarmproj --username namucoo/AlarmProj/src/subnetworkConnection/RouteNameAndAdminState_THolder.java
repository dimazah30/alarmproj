package subnetworkConnection;

/**
* subnetworkConnection/RouteNameAndAdminState_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class RouteNameAndAdminState_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteNameAndAdminState_T value = null;

  public RouteNameAndAdminState_THolder ()
  {
  }

  public RouteNameAndAdminState_THolder (subnetworkConnection.RouteNameAndAdminState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteNameAndAdminState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteNameAndAdminState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteNameAndAdminState_THelper.type ();
  }

}
