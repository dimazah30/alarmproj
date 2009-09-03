package subnetworkConnection;

/**
* subnetworkConnection/RouteNameAndAdminState_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
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
