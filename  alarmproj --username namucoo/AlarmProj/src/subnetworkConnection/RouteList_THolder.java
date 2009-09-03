package subnetworkConnection;


/**
* subnetworkConnection/RouteList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Arbitrary sequence of routes.</p>
   **/
public final class RouteList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteDescriptor_T value[] = null;

  public RouteList_THolder ()
  {
  }

  public RouteList_THolder (subnetworkConnection.RouteDescriptor_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteList_THelper.type ();
  }

}
