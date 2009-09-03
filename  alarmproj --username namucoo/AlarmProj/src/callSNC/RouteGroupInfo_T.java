package callSNC;


/**
* callSNC/RouteGroupInfo_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/

public final class RouteGroupInfo_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T sNCname[] = null;
  public String routeGroupLabel = null;

  public RouteGroupInfo_T ()
  {
  } // ctor

  public RouteGroupInfo_T (globaldefs.NameAndStringValue_T[] _sNCname, String _routeGroupLabel)
  {
    sNCname = _sNCname;
    routeGroupLabel = _routeGroupLabel;
  } // ctor

} // class RouteGroupInfo_T
