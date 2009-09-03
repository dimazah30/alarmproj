package terminationPoint;


/**
* terminationPoint/TerminationPoint_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/

public final class TerminationPoint_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public globaldefs.NameAndStringValue_T ingressTrafficDescriptorName[] = null;
  public globaldefs.NameAndStringValue_T egressTrafficDescriptorName[] = null;
  public terminationPoint.TPType_T type = null;
  public terminationPoint.TPConnectionState_T connectionState = null;
  public terminationPoint.TerminationMode_T tpMappingMode = null;
  public terminationPoint.Directionality_T direction = null;
  public transmissionParameters.LayeredParameters_T transmissionParams[] = null;
  public terminationPoint.TPProtectionAssociation_T tpProtectionAssociation = null;
  public boolean edgePoint = false;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public TerminationPoint_T ()
  {
  } // ctor

  public TerminationPoint_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, globaldefs.NameAndStringValue_T[] _ingressTrafficDescriptorName, globaldefs.NameAndStringValue_T[] _egressTrafficDescriptorName, terminationPoint.TPType_T _type, terminationPoint.TPConnectionState_T _connectionState, terminationPoint.TerminationMode_T _tpMappingMode, terminationPoint.Directionality_T _direction, transmissionParameters.LayeredParameters_T[] _transmissionParams, terminationPoint.TPProtectionAssociation_T _tpProtectionAssociation, boolean _edgePoint, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    ingressTrafficDescriptorName = _ingressTrafficDescriptorName;
    egressTrafficDescriptorName = _egressTrafficDescriptorName;
    type = _type;
    connectionState = _connectionState;
    tpMappingMode = _tpMappingMode;
    direction = _direction;
    transmissionParams = _transmissionParams;
    tpProtectionAssociation = _tpProtectionAssociation;
    edgePoint = _edgePoint;
    additionalInfo = _additionalInfo;
  } // ctor

} // class TerminationPoint_T
