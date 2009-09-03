package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RoutePerRouteType_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>The short sequence of routes, one per type (e.g. Intended and Current)</p>
   **/
public final class RoutePerRouteType_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.RouteAndRouteType_T value[] = null;

  public RoutePerRouteType_THolder ()
  {
  }

  public RoutePerRouteType_THolder (multiLayerSubnetwork.RouteAndRouteType_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.RoutePerRouteType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.RoutePerRouteType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.RoutePerRouteType_THelper.type ();
  }

}
