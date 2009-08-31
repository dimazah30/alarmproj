package EPIRPSystem;


/**
* EPIRPSystem/EPIRPOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
  */
public interface EPIRPOperations 
{

  /**
       * The IRPManager uses this operation to request the EPIRP to
       * return the outline information of the supported IRPs. The EPIRP
       * shall return the outline information of all the IRPs supported by the
       * IRPAgent that contains the EPIRP. The EPIRP may
       * additionally return the outline information of all the IRPs supported
       * by other IRPAgents.
       */
  EPIRPSystem.ResultType get_IRP_outline (String iRPVersion, EPIRPSystem.SupportedIRPListTypeHolder supportedIRPList) throws EPIRPSystem.GetIRPOutline, EPIRPSystem.InvalidIRPVersion;

  /**
  
           * The IRPManager uses this operation to request the EPIRP to return
  * the stringified IOR of the IRP identified by systemDn and irpId.
       */
  EPIRPSystem.ResultType get_IRP_reference (String managerIdentifier, String systemDn, String irpId, org.omg.CORBA.StringHolder iRPReference) throws EPIRPSystem.GetIRPReference, EPIRPSystem.InvalidRequestedParameters;

  /**
       * The IRPManager uses this operation to request the IRPAgent to
       * release a specific IRP reference. Whether the IRP reference
       * is really released or not in the IRPAgent is outside the
       * scope of this document.
       */
  EPIRPSystem.ResultType release_IRP_reference (String managerIdentifier, String iRPReference) throws EPIRPSystem.ReleaseIRPReference, EPIRPSystem.UnknownIRPReference;

  /**
        * Return the list of all supported EPIRP versions.
        */
  String[] get_EP_IRP_versions () throws EPIRPSystem.GetEPIRPVersions;

  /**
        * Return the list of all supported operations and their supported
        * parameters for a specific EPIRP version.
        */
  ManagedGenericIRPConstDefs.Method[] get_EP_IRP_operations_profile (String iRPVersion) throws EPIRPSystem.GetEPIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;

  /**
        * Return the list of all supported notifications and their supported
        * parameters for a specific EPIRP version.
        */
  ManagedGenericIRPConstDefs.Method[] get_EP_IRP_notification_profile (String iRPVersion) throws EPIRPSystem.GetEPIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter;
} // interface EPIRPOperations
