package callSNC;


/**
* callSNC/SNCAndRoute_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class SNCAndRoute_T implements org.omg.CORBA.portable.IDLEntity
{
  public subnetworkConnection.SubnetworkConnection_T connection = null;
  public subnetworkConnection.RouteDescriptor_T connectionRoutes[] = null;
  public mLSNPPLink.MultiLayerSNPPLink_T edgeMLSNPPLinks[] = null;
  public mLSNPPLink.MultiLayerSNPPLink_T internalMLSNPPLinks[] = null;
  public String routeType = null;

  public SNCAndRoute_T ()
  {
  } // ctor

  public SNCAndRoute_T (subnetworkConnection.SubnetworkConnection_T _connection, subnetworkConnection.RouteDescriptor_T[] _connectionRoutes, mLSNPPLink.MultiLayerSNPPLink_T[] _edgeMLSNPPLinks, mLSNPPLink.MultiLayerSNPPLink_T[] _internalMLSNPPLinks, String _routeType)
  {
    connection = _connection;
    connectionRoutes = _connectionRoutes;
    edgeMLSNPPLinks = _edgeMLSNPPLinks;
    internalMLSNPPLinks = _internalMLSNPPLinks;
    routeType = _routeType;
  } // ctor

} // class SNCAndRoute_T
