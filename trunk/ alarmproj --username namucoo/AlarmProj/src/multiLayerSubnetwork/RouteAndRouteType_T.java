package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RouteAndRouteType_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
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
