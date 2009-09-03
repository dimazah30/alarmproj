package subnetworkConnection;


/**
* subnetworkConnection/TPData_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class TPData_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T tpName[] = null;
  public terminationPoint.TerminationMode_T tpMappingMode = null;
  public transmissionParameters.LayeredParameters_T transmissionParams[] = null;
  public globaldefs.NameAndStringValue_T ingressTrafficDescriptorName[] = null;
  public globaldefs.NameAndStringValue_T egressTrafficDescriptorName[] = null;

  public TPData_T ()
  {
  } // ctor

  public TPData_T (globaldefs.NameAndStringValue_T[] _tpName, terminationPoint.TerminationMode_T _tpMappingMode, transmissionParameters.LayeredParameters_T[] _transmissionParams, globaldefs.NameAndStringValue_T[] _ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] _egressTrafficDescriptorName)
  {
    tpName = _tpName;
    tpMappingMode = _tpMappingMode;
    transmissionParams = _transmissionParams;
    ingressTrafficDescriptorName = _ingressTrafficDescriptorName;
    egressTrafficDescriptorName = _egressTrafficDescriptorName;
  } // ctor

} // class TPData_T
