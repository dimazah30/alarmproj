package subnetworkConnection;

/**
* subnetworkConnection/RouteCreateData_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class RouteCreateData_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteCreateData_T value = null;

  public RouteCreateData_THolder ()
  {
  }

  public RouteCreateData_THolder (subnetworkConnection.RouteCreateData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteCreateData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteCreateData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteCreateData_THelper.type ();
  }

}
