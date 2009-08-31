package EPIRPSystem;


/**
* EPIRPSystem/_EPIRPStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/


/*
  */
public class _EPIRPStub extends org.omg.CORBA.portable.ObjectImpl implements EPIRPSystem.EPIRP
{


  /**
       * The IRPManager uses this operation to request the EPIRP to
       * return the outline information of the supported IRPs. The EPIRP
       * shall return the outline information of all the IRPs supported by the
       * IRPAgent that contains the EPIRP. The EPIRP may
       * additionally return the outline information of all the IRPs supported
       * by other IRPAgents.
       */
  public EPIRPSystem.ResultType get_IRP_outline (String iRPVersion, EPIRPSystem.SupportedIRPListTypeHolder supportedIRPList) throws EPIRPSystem.GetIRPOutline, EPIRPSystem.InvalidIRPVersion
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_IRP_outline", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, iRPVersion);
                $in = _invoke ($out);
                EPIRPSystem.ResultType $result = EPIRPSystem.ResultTypeHelper.read ($in);
                supportedIRPList.value = EPIRPSystem.SupportedIRPListTypeHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/GetIRPOutline:1.0"))
                    throw EPIRPSystem.GetIRPOutlineHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/InvalidIRPVersion:1.0"))
                    throw EPIRPSystem.InvalidIRPVersionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_IRP_outline (iRPVersion, supportedIRPList        );
            } finally {
                _releaseReply ($in);
            }
  } // get_IRP_outline


  /**
  
           * The IRPManager uses this operation to request the EPIRP to return
  * the stringified IOR of the IRP identified by systemDn and irpId.
       */
  public EPIRPSystem.ResultType get_IRP_reference (String managerIdentifier, String systemDn, String irpId, org.omg.CORBA.StringHolder iRPReference) throws EPIRPSystem.GetIRPReference, EPIRPSystem.InvalidRequestedParameters
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_IRP_reference", true);
                EPIRPSystem.ManagerIdentifierTypeHelper.write ($out, managerIdentifier);
                EPIRPSystem.SystemDNTypeHelper.write ($out, systemDn);
                EPIRPSystem.IRPIdTypeHelper.write ($out, irpId);
                $in = _invoke ($out);
                EPIRPSystem.ResultType $result = EPIRPSystem.ResultTypeHelper.read ($in);
                iRPReference.value = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/GetIRPReference:1.0"))
                    throw EPIRPSystem.GetIRPReferenceHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/InvalidRequestedParameters:1.0"))
                    throw EPIRPSystem.InvalidRequestedParametersHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_IRP_reference (managerIdentifier, systemDn, irpId, iRPReference        );
            } finally {
                _releaseReply ($in);
            }
  } // get_IRP_reference


  /**
       * The IRPManager uses this operation to request the IRPAgent to
       * release a specific IRP reference. Whether the IRP reference
       * is really released or not in the IRPAgent is outside the
       * scope of this document.
       */
  public EPIRPSystem.ResultType release_IRP_reference (String managerIdentifier, String iRPReference) throws EPIRPSystem.ReleaseIRPReference, EPIRPSystem.UnknownIRPReference
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("release_IRP_reference", true);
                EPIRPSystem.ManagerIdentifierTypeHelper.write ($out, managerIdentifier);
                $out.write_string (iRPReference);
                $in = _invoke ($out);
                EPIRPSystem.ResultType $result = EPIRPSystem.ResultTypeHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/ReleaseIRPReference:1.0"))
                    throw EPIRPSystem.ReleaseIRPReferenceHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/UnknownIRPReference:1.0"))
                    throw EPIRPSystem.UnknownIRPReferenceHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return release_IRP_reference (managerIdentifier, iRPReference        );
            } finally {
                _releaseReply ($in);
            }
  } // release_IRP_reference


  /**
        * Return the list of all supported EPIRP versions.
        */
  public String[] get_EP_IRP_versions () throws EPIRPSystem.GetEPIRPVersions
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_EP_IRP_versions", true);
                $in = _invoke ($out);
                String $result[] = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/GetEPIRPVersions:1.0"))
                    throw EPIRPSystem.GetEPIRPVersionsHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_EP_IRP_versions (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_EP_IRP_versions


  /**
        * Return the list of all supported operations and their supported
        * parameters for a specific EPIRP version.
        */
  public ManagedGenericIRPConstDefs.Method[] get_EP_IRP_operations_profile (String iRPVersion) throws EPIRPSystem.GetEPIRPOperationsProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_EP_IRP_operations_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, iRPVersion);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/GetEPIRPOperationsProfile:1.0"))
                    throw EPIRPSystem.GetEPIRPOperationsProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_EP_IRP_operations_profile (iRPVersion        );
            } finally {
                _releaseReply ($in);
            }
  } // get_EP_IRP_operations_profile


  /**
        * Return the list of all supported notifications and their supported
        * parameters for a specific EPIRP version.
        */
  public ManagedGenericIRPConstDefs.Method[] get_EP_IRP_notification_profile (String iRPVersion) throws EPIRPSystem.GetEPIRPNotificationProfile, ManagedGenericIRPSystem.OperationNotSupported, ManagedGenericIRPSystem.InvalidParameter
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_EP_IRP_notification_profile", true);
                ManagedGenericIRPConstDefs.VersionNumberHelper.write ($out, iRPVersion);
                $in = _invoke ($out);
                ManagedGenericIRPConstDefs.Method $result[] = ManagedGenericIRPConstDefs.MethodListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:3gppsa5.org/EPIRPSystem/GetEPIRPNotificationProfile:1.0"))
                    throw EPIRPSystem.GetEPIRPNotificationProfileHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/OperationNotSupported:1.0"))
                    throw ManagedGenericIRPSystem.OperationNotSupportedHelper.read ($in);
                else if (_id.equals ("IDL:3gppsa5.org/ManagedGenericIRPSystem/InvalidParameter:1.0"))
                    throw ManagedGenericIRPSystem.InvalidParameterHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_EP_IRP_notification_profile (iRPVersion        );
            } finally {
                _releaseReply ($in);
            }
  } // get_EP_IRP_notification_profile

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/EPIRPSystem/EPIRP:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _EPIRPStub
