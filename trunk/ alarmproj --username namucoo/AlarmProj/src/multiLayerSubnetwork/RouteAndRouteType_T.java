package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RouteAndRouteType_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

public final class RouteAndRouteType_T implements org.omg.CORBA.portable.IDLEntity
{
  public String rAIDList[] = null;
  public String routeType = null;
  public String RouteDescription = null;

  public RouteAndRouteType_T ()
  {
  } // ctor

  public RouteAndRouteType_T (String[] _rAIDList, String _routeType, String _RouteDescription)
  {
    rAIDList = _rAIDList;
    routeType = _routeType;
    RouteDescription = _RouteDescription;
  } // ctor

} // class RouteAndRouteType_T
