package subnetworkConnection;


/**
* subnetworkConnection/RouteNameAndAdminState_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
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
