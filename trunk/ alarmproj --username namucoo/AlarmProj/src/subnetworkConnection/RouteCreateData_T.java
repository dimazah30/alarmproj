package subnetworkConnection;


/**
* subnetworkConnection/RouteCreateData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class RouteCreateData_T implements org.omg.CORBA.portable.IDLEntity
{
  public String intended = null;
  public String exclusive = null;
  public subnetworkConnection.CrossConnect_T ccInclusions[] = null;
  public globaldefs.NameAndStringValue_T neTpInclusions[][] = null;
  public boolean fullRoute = false;
  public globaldefs.NameAndStringValue_T neTpSncExclusions[][] = null;
  public globaldefs.NameAndStringValue_T additionalCreationInfo[] = null;

  public RouteCreateData_T ()
  {
  } // ctor

  public RouteCreateData_T (String _intended, String _exclusive, subnetworkConnection.CrossConnect_T[] _ccInclusions, globaldefs.NameAndStringValue_T[][] _neTpInclusions, boolean _fullRoute, globaldefs.NameAndStringValue_T[][] _neTpSncExclusions, globaldefs.NameAndStringValue_T[] _additionalCreationInfo)
  {
    intended = _intended;
    exclusive = _exclusive;
    ccInclusions = _ccInclusions;
    neTpInclusions = _neTpInclusions;
    fullRoute = _fullRoute;
    neTpSncExclusions = _neTpSncExclusions;
    additionalCreationInfo = _additionalCreationInfo;
  } // ctor

} // class RouteCreateData_T
