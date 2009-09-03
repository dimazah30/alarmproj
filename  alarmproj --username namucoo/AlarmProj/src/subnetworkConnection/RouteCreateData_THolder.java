package subnetworkConnection;

/**
* subnetworkConnection/RouteCreateData_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
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
