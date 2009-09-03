package managedElement;


/**
* managedElement/ManagedElement_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/

public final class ManagedElement_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public String userLabel = null;
  public String nativeEMSName = null;
  public String owner = null;
  public String location = null;
  public String version = null;
  public String productName = null;
  public managedElement.CommunicationState_T communicationState = null;
  public boolean emsInSyncState = false;
  public short supportedRates[] = null;
  public globaldefs.NameAndStringValue_T additionalInfo[] = null;

  public ManagedElement_T ()
  {
  } // ctor

  public ManagedElement_T (globaldefs.NameAndStringValue_T[] _name, String _userLabel, String _nativeEMSName, String _owner, String _location, String _version, String _productName, managedElement.CommunicationState_T _communicationState, boolean _emsInSyncState, short[] _supportedRates, globaldefs.NameAndStringValue_T[] _additionalInfo)
  {
    name = _name;
    userLabel = _userLabel;
    nativeEMSName = _nativeEMSName;
    owner = _owner;
    location = _location;
    version = _version;
    productName = _productName;
    communicationState = _communicationState;
    emsInSyncState = _emsInSyncState;
    supportedRates = _supportedRates;
    additionalInfo = _additionalInfo;
  } // ctor

} // class ManagedElement_T
