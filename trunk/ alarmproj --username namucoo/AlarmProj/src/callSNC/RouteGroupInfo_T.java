package callSNC;


/**
* callSNC/RouteGroupInfo_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
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
