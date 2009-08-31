package EPIRPSystem;


/**
* EPIRPSystem/EPIRPPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
  */
public abstract class EPIRPPOA extends org.omg.PortableServer.Servant
 implements EPIRPSystem.EPIRPOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("get_IRP_outline", new java.lang.Integer (0));
    _methods.put ("get_IRP_reference", new java.lang.Integer (1));
    _methods.put ("release_IRP_reference", new java.lang.Integer (2));
    _methods.put ("get_EP_IRP_versions", new java.lang.Integer (3));
    _methods.put ("get_EP_IRP_operations_profile", new java.lang.Integer (4));
    _methods.put ("get_EP_IRP_notification_profile", new java.lang.Integer (5));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
       * The IRPManager uses this operation to request the EPIRP to
       * return the outline information of the supported IRPs. The EPIRP
       * shall return the outline information of all the IRPs supported by the
       * IRPAgent that contains the EPIRP. The EPIRP may
       * additionally return the outline information of all the IRPs supported
       * by other IRPAgents.
       */
       case 0:  // EPIRPSystem/EPIRP/get_IRP_outline
       {
         try {
           String iRPVersion = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           EPIRPSystem.SupportedIRPListTypeHolder supportedIRPList = new EPIRPSystem.SupportedIRPListTypeHolder ();
           EPIRPSystem.ResultType $result = null;
           $result = this.get_IRP_outline (iRPVersion, supportedIRPList);
           out = $rh.createReply();
           EPIRPSystem.ResultTypeHelper.write (out, $result);
           EPIRPSystem.SupportedIRPListTypeHelper.write (out, supportedIRPList.value);
         } catch (EPIRPSystem.GetIRPOutline $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.GetIRPOutlineHelper.write (out, $ex);
         } catch (EPIRPSystem.InvalidIRPVersion $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.InvalidIRPVersionHelper.write (out, $ex);
         }
         break;
       }


  /**
  
           * The IRPManager uses this operation to request the EPIRP to return
  * the stringified IOR of the IRP identified by systemDn and irpId.
       */
       case 1:  // EPIRPSystem/EPIRP/get_IRP_reference
       {
         try {
           String managerIdentifier = EPIRPSystem.ManagerIdentifierTypeHelper.read (in);
           String systemDn = EPIRPSystem.SystemDNTypeHelper.read (in);
           String irpId = EPIRPSystem.IRPIdTypeHelper.read (in);
           org.omg.CORBA.StringHolder iRPReference = new org.omg.CORBA.StringHolder ();
           EPIRPSystem.ResultType $result = null;
           $result = this.get_IRP_reference (managerIdentifier, systemDn, irpId, iRPReference);
           out = $rh.createReply();
           EPIRPSystem.ResultTypeHelper.write (out, $result);
           out.write_string (iRPReference.value);
         } catch (EPIRPSystem.GetIRPReference $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.GetIRPReferenceHelper.write (out, $ex);
         } catch (EPIRPSystem.InvalidRequestedParameters $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.InvalidRequestedParametersHelper.write (out, $ex);
         }
         break;
       }


  /**
       * The IRPManager uses this operation to request the IRPAgent to
       * release a specific IRP reference. Whether the IRP reference
       * is really released or not in the IRPAgent is outside the
       * scope of this document.
       */
       case 2:  // EPIRPSystem/EPIRP/release_IRP_reference
       {
         try {
           String managerIdentifier = EPIRPSystem.ManagerIdentifierTypeHelper.read (in);
           String iRPReference = in.read_string ();
           EPIRPSystem.ResultType $result = null;
           $result = this.release_IRP_reference (managerIdentifier, iRPReference);
           out = $rh.createReply();
           EPIRPSystem.ResultTypeHelper.write (out, $result);
         } catch (EPIRPSystem.ReleaseIRPReference $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.ReleaseIRPReferenceHelper.write (out, $ex);
         } catch (EPIRPSystem.UnknownIRPReference $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.UnknownIRPReferenceHelper.write (out, $ex);
         }
         break;
       }


  /**
        * Return the list of all supported EPIRP versions.
        */
       case 3:  // EPIRPSystem/EPIRP/get_EP_IRP_versions
       {
         try {
           String $result[] = null;
           $result = this.get_EP_IRP_versions ();
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (out, $result);
         } catch (EPIRPSystem.GetEPIRPVersions $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.GetEPIRPVersionsHelper.write (out, $ex);
         }
         break;
       }


  /**
        * Return the list of all supported operations and their supported
        * parameters for a specific EPIRP version.
        */
       case 4:  // EPIRPSystem/EPIRP/get_EP_IRP_operations_profile
       {
         try {
           String iRPVersion = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_EP_IRP_operations_profile (iRPVersion);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (EPIRPSystem.GetEPIRPOperationsProfile $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.GetEPIRPOperationsProfileHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }


  /**
        * Return the list of all supported notifications and their supported
        * parameters for a specific EPIRP version.
        */
       case 5:  // EPIRPSystem/EPIRP/get_EP_IRP_notification_profile
       {
         try {
           String iRPVersion = ManagedGenericIRPConstDefs.VersionNumberHelper.read (in);
           ManagedGenericIRPConstDefs.Method $result[] = null;
           $result = this.get_EP_IRP_notification_profile (iRPVersion);
           out = $rh.createReply();
           ManagedGenericIRPConstDefs.MethodListHelper.write (out, $result);
         } catch (EPIRPSystem.GetEPIRPNotificationProfile $ex) {
           out = $rh.createExceptionReply ();
           EPIRPSystem.GetEPIRPNotificationProfileHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.OperationNotSupported $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.OperationNotSupportedHelper.write (out, $ex);
         } catch (ManagedGenericIRPSystem.InvalidParameter $ex) {
           out = $rh.createExceptionReply ();
           ManagedGenericIRPSystem.InvalidParameterHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/EPIRPSystem/EPIRP:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EPIRP _this() 
  {
    return EPIRPHelper.narrow(
    super._this_object());
  }

  public EPIRP _this(org.omg.CORBA.ORB orb) 
  {
    return EPIRPHelper.narrow(
    super._this_object(orb));
  }


} // class EPIRPPOA
