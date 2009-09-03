package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkMgr_IPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>The mLSNPPLinkMgr_I is used to gain access to MLSNPP Links and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public abstract class MLSNPPLinkMgr_IPOA extends org.omg.PortableServer.Servant
 implements mLSNPPLink.MLSNPPLinkMgr_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getAvailableCapacity", new java.lang.Integer (0));
    _methods.put ("assignSignallingController", new java.lang.Integer (1));
    _methods.put ("deassignSignallingController", new java.lang.Integer (2));
    _methods.put ("setSignallingProtocolAndParameters", new java.lang.Integer (3));
    _methods.put ("setTNANameForMLSNPPLinkEnd", new java.lang.Integer (4));
    _methods.put ("modifySignallingProtocolParameters", new java.lang.Integer (5));
    _methods.put ("enableSignalling", new java.lang.Integer (6));
    _methods.put ("disableSignalling", new java.lang.Integer (7));
    _methods.put ("setNativeEMSName", new java.lang.Integer (8));
    _methods.put ("setUserLabel", new java.lang.Integer (9));
    _methods.put ("setOwner", new java.lang.Integer (10));
    _methods.put ("getCapabilities", new java.lang.Integer (11));
    _methods.put ("setAdditionalInfo", new java.lang.Integer (12));
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
     * <p>This service returns a MLSNPPLink capacity in terms of a count of
     * connections available on a per layer basis. If a layer rate is not
     * specified then the EMS returns the available capacity for each rate that
     * is supported by the entity.</p>
     *
     * <br>globaldefs::NamingAttributes_T <b>mLSNPPLinkName</b>: The name of the MLSNPP
     * Link for which to retrieve the available capacity.
     * <br>transmissionParameters::LayerRate_T <b>layerRate</b>: The layer 
     * rates for which to retrieve the MLSNPP Link capacity.
     * <br>mLSNPPLink::AvailableCapacity_T <b>availableCapacity</b>: The capacity
     * which is available in the link.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * UNABLE_TO_COMPLY - Raised if the layer rate specified is not supported
     *  by the MLSNPP Link.<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when mLSNPPLinkName does not reference a 
     *  mLSNPP object or any of the input parameters is not valid<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when mLSNPPLinkName references a MLSNPPLink
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request.<br>
     *
     **/
       case 0:  // mLSNPPLink/MLSNPPLinkMgr_I/getAvailableCapacity
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           short layerRate = transmissionParameters.LayerRate_THelper.read (in);
           mLSNPPLink.AvailableCapacity_THolder availableCapacity = new mLSNPPLink.AvailableCapacity_THolder ();
           this.getAvailableCapacity (mLSNPPLinkName, layerRate, availableCapacity);
           out = $rh.createReply();
           mLSNPPLink.AvailableCapacity_THelper.write (out, availableCapacity.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows the NMS requests the EMS to assign a MLSNPP
     * Link to a signaling controller. For this operation to be successful, 
     * the link must not be associated with a Signalling Controller. 
     * Hence the Signalling Controller Identifier in the MLSNPP Link must be an empty string 
     * at the beginning of the operation. In case the link is already 
     * associated to a signalling controller, the link needs to be disabled
     * and then de-associated to the signalling controller.</p>
     *
     * <br>NamingAttributes_T mLSNPPLinkName: the name of the 
     * MLSNPPLink to be assigned to the signaling controller.
     * <br>string signallingControllerID:
     * The Identifier of the SignalingController for which the MLSNPPLink 
     * to be assigned.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - The entire request is not supported by the EMS<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. MLSNPPLinkName does not refer to an MLSNPPLink
     *  object), or identifies an object of the wrong type or is out of range.
     *  <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when MLSNPPLinkName
     *  references an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when: The EMS is unable to communicate with the
     * Control Plane and/or the Signaling Controller and communication is required
     * to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - The EMS rejects the request based on its own 
     *  criteria: <ul>
     *  <li>The specified Signaling Controller is not known to the EMS/Control Plane.</li>
     * <li>The specified MLSNPP Link is not a UNI.</li>
     *  <li>the MLSNPP Link is already associated with a signalling controller</li>
     * <br>
     **/
       case 1:  // mLSNPPLink/MLSNPPLinkMgr_I/assignSignallingController
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           String signallingControllerIdentifier = in.read_string ();
           this.assignSignallingController (mLSNPPLinkName, signallingControllerIdentifier);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows the NMS requests the EMS to deassign a MLSNPP  
     * Link from a signaling controller.</p>
     * As a consequence of this operation the signalling controller identifier    * in the MLSNPP Link is set to an empty string.
     * 
     * <br>globaldefs::NamingAttributes_T MLSNPPLinkName: 
     * Name of the MLSNPP Link to be deassigned from the Signalling Controller.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (i.e. MLSNPPLinkName does not refer to an MLSNPPLink
     *  object)
     *  <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when MLSNPPLinkName references an
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - The EMS rejects the request based on its own
     *  criteria. E.g. the signaling on the MLSNPPLink is enabled.</li>
     * <br>
     **/
       case 2:  // mLSNPPLink/MLSNPPLinkMgr_I/deassignSignallingController
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.deassignSignallingController (mLSNPPLinkName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * This operation allows the NMS requests the EMS to select the signaling 
     * protocol and parameters to be used by the signaling interface associated 
     * with a specific MLSNPP Link.
     *
     * <br>globaldefs::NamingAttributes_T MLSNPPLinkName:
     * Name of the MLSNPP Link for which the signalling protocol and
     * parameters apply.
     * <br>SignallingProtocol_T signallingProtocol: The signalling protocol.
     * <br>globaldefs::NVSList_T signallingParameters: List of signalling 
     * controller parameters to be set.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect; e.g. MLSNPPLinkName does not refer to a MLSNPPLink object,
     *  or any field in signalingControllerParameters is invalid <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when MLSNPPLinkName 
     *  references an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     * Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - The EMS rejects the request based on its own 
     *  criteria which may include: <ul>
     *  <li>No signaling controller is associated with MLSNPP Link.</li>
     *  <li>The specified protocol or parameter is not supported.</li>
     *  <li>The MLSNPP is not a UNI. </li>
     *  <li>The signalling is enabled. <li></ul>
     * <br> 
     **/
       case 3:  // mLSNPPLink/MLSNPPLinkMgr_I/setSignallingProtocolAndParameters
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           String signallingProtocol = mLSNPPLink.SignallingProtocol_THelper.read (in);
           globaldefs.NameAndStringValue_T signallingParameters[] = globaldefs.NVSList_THelper.read (in);
           this.setSignallingProtocolAndParameters (mLSNPPLinkName, signallingProtocol, signallingParameters);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows the NMS requests the EMS to assign a TNA Name(s) 
     * to one or more components of a specified MLSNPPLink. This operation also allows the unsetting of TNANames by providing an empty
     * value in the TNA Names. The TNA Names assigned by this operation will
     * overwrite existing TNA Names.</p>
     * <br>globaldefs::NamingAttributes_T <b>mLSNPPLinkName</b>: The name of the MLSNPPLink.
     * <br>mLSNPP::SNPTNAList_T sNPTNAList: The List of SNP Ids and the
     * corresponding TNA Names to be set. 
     *
     * <br>mLSNPP::SNPPTNAPairList_T sNPPTNAPairList: The List of SNPP Ids and the corresponding
     * TNA Names. 
     * <br>string <b>aTNAName</b>: The TNAName to be assigned to the a-end of the MLSNPPLink.
     * <br>string <b>zTNAName</b>: The TNAName to be assigned to the z-end of the MLSNPPLink.
     * <br>string <b>aTNAGroupName</b>: The TNAGroupName to be assigned to the a-end of the MLSNPPLink.
     * <br>string <b>zTNAGroupName</b>: The TNAGroupName to be assigned to the z-end of the MLSNPPLink.
     * <br> MLSNPPLink_T <b>mLSNPPLink</b>: The MLSNPPLink with TNAs set.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. mLSNPPLinkName does not refer to an MLSNPPLink object,
     *  or TNA is not valid).<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when mLSNPPLinkName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     **/
       case 4:  // mLSNPPLink/MLSNPPLinkMgr_I/setTNANameForMLSNPPLinkEnd
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           mLSNPP.SNPTNAData_T sNPTNADataList[] = mLSNPP.SNPTNADataList_THelper.read (in);
           mLSNPP.SNPPTNAPair_T sNPPTNAPairList[] = mLSNPP.SNPPTNAPairList_THelper.read (in);
           String aTNAName = in.read_string ();
           String zTNAName = in.read_string ();
           String aTNAGroupName = in.read_string ();
           String zTNAGroupName = in.read_string ();
           mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink = new mLSNPPLink.MultiLayerSNPPLink_THolder ();
           this.setTNANameForMLSNPPLinkEnd (mLSNPPLinkName, sNPTNADataList, sNPPTNAPairList, aTNAName, zTNAName, aTNAGroupName, zTNAGroupName, mLSNPPLink);
           out = $rh.createReply();
           mLSNPPLink.MultiLayerSNPPLink_THelper.write (out, mLSNPPLink.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**  
     * <p>This operation allows the NMS requests the EMS to modify the 
     * signaling parameters to be used on the signaling interface
     * associated with a specific MLSNPP Link. This operation can be 
     * done when signalling is enabled or disabled. </p>
     * 
     * <br>globaldefs::NamingAttributes_T MLSNPPLinkName:
     * Name of the MLSNPP Link for which the signalling protocol are being 
     * modified.
     * <br globaldefs::NVSList_T signallingParameters:
     * List of signalling controller parameters to be modified.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service or the
     *  request with the specified input parameters is not supported.<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect; e.g. MLSNPPLinkName does not refer to a MLSNPPLink object,
     *  or any field in signalingControllerParameters is invalid <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when MLSNPPLinkName references an 
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     * Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - The EMS rejects the request based on its own 
     *  criteria: <ul>
     *  <li> A Signaling Controller is not assigned to the MLSNPP Link.</li>
     *  <li>The assigned Signaling Controller does not accept provisioning the
     *  specific protocol or parameters </li>
     *  <li>The MLSNPP is not a UNI. </li></ul> 
     **/
       case 5:  // mLSNPPLink/MLSNPPLinkMgr_I/modifySignallingProtocolParameters
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           globaldefs.NVSList_THolder signallingParameters = new globaldefs.NVSList_THolder ();
           signallingParameters.value = globaldefs.NVSList_THelper.read (in);
           this.modifySignallingProtocolParameters (mLSNPPLinkName, signallingParameters);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, signallingParameters.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows the NMS to request the EMS to enable 
     * signalling associated with a specific MLSNPP Link.</p> 
     *
     * <br>globaldefs::NamingAttributes_T MLSNPPLinkName: Name of
     * the MLSNPP Link for which to enable the signalling.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service.<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect or identifies an object of the wrong type or is out
     *  of range.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the MLSNPPLinkName 
     *  references an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     * Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when<ul>
     *  <li>- A Signaling Controller is not assigned to the MLSNPP Link</li>
     *  <li>- The specified MLSNPP Link is not a UNI</li>
     *  <li>- The signaling protocol has not been specified</li></ul>
     * <br>
     **/
       case 6:  // mLSNPPLink/MLSNPPLinkMgr_I/enableSignalling
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.enableSignalling (mLSNPPLinkName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows the NMS to request the EMS to disable the
     * signaling for a specific MLSNPP Link.</p>
     * 
     * <br>globaldefs::NamingAttributes_T MLSNPPLinkName: 
     * Name of the MLSNPP Link for which to disable the signalling.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service.<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect or identifies an object of the wrong type or is out of range <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when MLSNPPLinkName references an 
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     * Plane and communication is required to complete the request<br>
     * EXCPT_UNABLE_TO_COMPLY - The EMS rejects the request based on its own 
     *  criteria:<ul> 
     *	<li>- A Signaling Controller is not assigned to the MLSNPP Link</li>
     *  <li>- The specified MLSNPP Link is not a UNI</li>
     *  <li>- The signaling is not enabled</li>
     * <br>
     **/
       case 7:  // mLSNPPLink/MLSNPPLinkMgr_I/disableSignalling
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.disableSignalling (mLSNPPLinkName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 8:  // common/Common_I/setNativeEMSName
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String nativeEMSName = in.read_string ();
           this.setNativeEMSName (objectName, nativeEMSName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 9:  // common/Common_I/setUserLabel
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String userLabel = in.read_string ();
           boolean enforceUniqueness = in.read_boolean ();
           this.setUserLabel (objectName, userLabel, enforceUniqueness);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 10:  // common/Common_I/setOwner
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           String owner = in.read_string ();
           this.setOwner (objectName, owner);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This service retrieves the capabilities of the manager.
     * All non-specified capabilities are assumed to be unsupported.</p>
     *
     * <br> CapabilityList_T capabilities
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure.
     * <br>
     **/
       case 11:  // common/Common_I/getCapabilities
       {
         try {
           common.CapabilityList_THolder capabilities = new common.CapabilityList_THolder ();
           this.getCapabilities (capabilities);
           out = $rh.createReply();
           common.CapabilityList_THelper.write (out, capabilities.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


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
       case 12:  // common/Common_I/setAdditionalInfo
       {
         try {
           globaldefs.NameAndStringValue_T objectName[] = globaldefs.NamingAttributes_THelper.read (in);
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           additionalInfo.value = globaldefs.NVSList_THelper.read (in);
           this.setAdditionalInfo (objectName, additionalInfo);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
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
    "IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkMgr_I:1.0", 
    "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public MLSNPPLinkMgr_I _this() 
  {
    return MLSNPPLinkMgr_IHelper.narrow(
    super._this_object());
  }

  public MLSNPPLinkMgr_I _this(org.omg.CORBA.ORB orb) 
  {
    return MLSNPPLinkMgr_IHelper.narrow(
    super._this_object(orb));
  }


} // class MLSNPPLinkMgr_IPOA
