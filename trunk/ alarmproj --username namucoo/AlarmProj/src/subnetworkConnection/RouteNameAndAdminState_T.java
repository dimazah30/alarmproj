package subnetworkConnection;


/**
* subnetworkConnection/RouteNameAndAdminState_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class RouteNameAndAdminState_T implements org.omg.CORBA.portable.IDLEntity
{
  public String id = null;
  public String administrativeState = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public RouteNameAndAdminState_T ()
  {
  } // ctor

  public RouteNameAndAdminState_T (String _id, String _administrativeState, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    id = _id;
    administrativeState = _administrativeState;
    additionalInfo = _additionalInfo;
  } // ctor

} // class RouteNameAndAdminState_T
