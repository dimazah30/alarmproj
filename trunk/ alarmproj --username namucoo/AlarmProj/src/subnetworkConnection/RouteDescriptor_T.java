package subnetworkConnection;


/**
* subnetworkConnection/RouteDescriptor_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class RouteDescriptor_T implements org.omg.CORBA.portable.IDLEntity
{
  public String id = null;
  public String intended = null;
  public String actualState = null;
  public String administrativeState = null;
  public String inUseBy = null;
  public String exclusive = null;
  public subnetworkConnection.CrossConnect_T routeXCs[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public RouteDescriptor_T ()
  {
  } // ctor

  public RouteDescriptor_T (String _id, String _intended, String _actualState, String _administrativeState, String _inUseBy, String _exclusive, subnetworkConnection.CrossConnect_T[] _routeXCs, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    id = _id;
    intended = _intended;
    actualState = _actualState;
    administrativeState = _administrativeState;
    inUseBy = _inUseBy;
    exclusive = _exclusive;
    routeXCs = _routeXCs;
    additionalInfo = _additionalInfo;
  } // ctor

} // class RouteDescriptor_T
