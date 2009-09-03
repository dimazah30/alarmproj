package common;


/**
* common/Common_IOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 common.idl
* 2009年9月2日 星期三 下午12时53分06秒 CST
*/


/**
   * <p>The interface Common_I is a set of services and utilities 
   * that is inherited by every manager interface.<p>
   **/
public interface Common_IOperations 
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
  void setNativeEMSName (globaldefs.NameAndStringValue_T[] objectName, String nativeEMSName) throws globaldefs.ProcessingFailureException;

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
  void setUserLabel (globaldefs.NameAndStringValue_T[] objectName, String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException;

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
  void setOwner (globaldefs.NameAndStringValue_T[] objectName, String owner) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service retrieves the capabilities of the manager.
     * All non-specified capabilities are assumed to be unsupported.</p>
     *
     * <br> CapabilityList_T capabilities
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure.
     * <br>
     **/
  void getCapabilities (common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException;

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
  void setAdditionalInfo (globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;
} // interface Common_IOperations
