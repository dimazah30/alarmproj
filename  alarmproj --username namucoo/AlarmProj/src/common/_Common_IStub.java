package common;


/**
* common/_Common_IStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 common.idl
* 2009年9月2日 星期三 下午12时53分05秒 CST
*/


/**
   * <p>The interface Common_I is a set of services and utilities 
   * that is inherited by every manager interface.<p>
   **/
public class _Common_IStub extends org.omg.CORBA.portable.ObjectImpl implements common.Common_I
{


  /**
     * <p>The nativeEMSName is owned by the EMS.  It represents how an EMS user 
     * addresses an object on the EMS GUI.  The EMS may or may not support 
     * changing this value.</p>
     *
     * <p>When an object is created by the EMS, the EMS selects the nativeEMSName 
     * for the object.</p>
     *
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for  
     * the object. If the EMS supports setting of nativeEMSNames, the 
     * nativeEMSName should be set to the same value as the userLabel.  If the EMS 
     * does not support setting of nativeEMSNames, or if the nativeEMSName has 
     * constraints that the userLabel does not satisfy, the EMS selects the 
     * nativeEMSName for the object.</p>
     *
     * <p>After an object has been created, the nativeEMSName may be changed by 
     * the NMS, if the EMS supports this functionality, using the setNativeEMSName 
     * operation.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string nativeEMSName
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the nativeEMSName can not be set for 
     *  the specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost
     * <br>
     **/
  public void setNativeEMSName (globaldefs.NameAndStringValue_T[] objectName, String nativeEMSName) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setNativeEMSName", true);
                globaldefs.NamingAttributes_THelper.write ($out, objectName);
                $out.write_string (nativeEMSName);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setNativeEMSName (objectName, nativeEMSName        );
            } finally {
                _releaseReply ($in);
            }
  } // setNativeEMSName


  /**
     * <p>The userLabel is owned by the NMSes.  It is a string assigned by an NMS 
     * to an object. The difference between the userLabel and the NamingAttributes 
     * name is that the userLabel is an attribute of the objects that 
     * may be "set" by the NMS through well defined interfaces (setUserLabel).</p>
     *
     * <p>When an object is created by an NMS, the NMS specifies the userLabel for 
     * the object.</p>
     *
     * <p>When an object is created by the EMS, the EMS sets the userLabel to the 
     * nativeEMSName.</p>
     *
     * <p>Once an object is created, the userLabel may only be changed by an NMS 
     * through the setUserLabel operation.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName: Name of the object for 
     *  which to change the userLabel.
     * <br> string userLabel: New user label to assign to the object
     * <br> boolean enforceUniqueness: Specifies whether or not userLabel should 
     * be checked for uniqueness amongst objects of the same class within the EMS.  
     * If true, then the operation will fail if userLabel is already in use.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references object which 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the userLabel can not be set for the 
     *  specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * <br>
     **/
  public void setUserLabel (globaldefs.NameAndStringValue_T[] objectName, String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setUserLabel", true);
                globaldefs.NamingAttributes_THelper.write ($out, objectName);
                $out.write_string (userLabel);
                $out.write_boolean (enforceUniqueness);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setUserLabel (objectName, userLabel, enforceUniqueness        );
            } finally {
                _releaseReply ($in);
            }
  } // setUserLabel


  /** 
     * <p>This service sets the owner attribute of the specified object.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName
     * <br> string owner
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - If EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     *  that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the owner can not be set for the 
     *  specified object<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * <br>
     **/
  public void setOwner (globaldefs.NameAndStringValue_T[] objectName, String owner) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setOwner", true);
                globaldefs.NamingAttributes_THelper.write ($out, objectName);
                $out.write_string (owner);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setOwner (objectName, owner        );
            } finally {
                _releaseReply ($in);
            }
  } // setOwner


  /** 
     * <p>This service retrieves the capabilities of the manager.
     * All non-specified capabilities are assumed to be unsupported.</p>
     *
     * <br> CapabilityList_T capabilities
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure.
     * <br>
     **/
  public void getCapabilities (common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCapabilities", true);
                $in = _invoke ($out);
                capabilities.value = common.CapabilityList_THelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getCapabilities (capabilities        );
            } finally {
                _releaseReply ($in);
            }
  } // getCapabilities


  /**
     * <p>This service sets the additional info attribute
     * of the object identified by objectName. This operation should be used
     * to set both vendor specific attributes as well as the attributes that
     * are formally defined in this interface specification. See <a 
     * href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for further details.</p>
     *
     * <p>As an input only the list of parameters to be changed, removed, or
     * added shall be provided.  If an entry is to be removed, "-" shall
     * be specified as a value.  If a parameter is specified that is currently
     * not part of the additionalInfo attribute of the specified object
     * that parameter is added by the EMS with the specified value.
     * The EMS may reject removal and addition requests, however.</p>
     *
     * <p> The operation is best effort (except where specified otherwise for a 
     * particular parameter).  The output specifies the
     * values which were actually set.</p>
     *
     * <br> globaldefs::NamingAttributes_T objectName: the managed object
     * whose additional info parameters are intended to get modified
     *
     * <br> globaldefs::NVSList_T additionalInfo: list of parameters
     * to be changed, added, or removed (input), updated to provide the
     * actually changed or added parameters (output)
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal
     *  failure (see errorReason attribute of ProcessingFailureException())<br>
     * EXCPT_INVALID_INPUT - Raised when objectName is incorrectly formed,
     *  raised when an input parameter is syntactical incorrect and raised when a 
     *  parameter is identified as only "settable" using a "specific operation" in 
     *  the <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when objectName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the communication to the managed
     *  element containing or hosting objectName is lost<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable 
     *  to execute the request because at least one of the parameters although 
     *  valid can not be set and that parameter is identified as "not best effort" 
     *  in the <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document)<br>
     * <br>
     **/
  public void setAdditionalInfo (globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setAdditionalInfo", true);
                globaldefs.NamingAttributes_THelper.write ($out, objectName);
                globaldefs.NVSList_THelper.write ($out, additionalInfo.value);
                $in = _invoke ($out);
                additionalInfo.value = globaldefs.NVSList_THelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setAdditionalInfo (objectName, additionalInfo        );
            } finally {
                _releaseReply ($in);
            }
  } // setAdditionalInfo

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

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
} // class _Common_IStub
