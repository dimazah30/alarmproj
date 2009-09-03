package subnetworkConnection;


/**
* subnetworkConnection/TPData_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
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
