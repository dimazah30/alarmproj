package mLSNPPLink;


/**
* mLSNPPLink/MLSNPPLinkMgr_IOperations.java .
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
public interface MLSNPPLinkMgr_IOperations  extends common.Common_IOperations
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
  void getAvailableCapacity (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws globaldefs.ProcessingFailureException;

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
  void assignSignallingController (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, String signallingControllerIdentifier) throws globaldefs.ProcessingFailureException;

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
  void deassignSignallingController (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;

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
  void setSignallingProtocolAndParameters (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, String signallingProtocol, globaldefs.NameAndStringValue_T[] signallingParameters) throws globaldefs.ProcessingFailureException;

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
  void setTNANameForMLSNPPLinkEnd (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, String aTNAName, String zTNAName, String aTNAGroupName, String zTNAGroupName, mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException;

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
  void modifySignallingProtocolParameters (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, globaldefs.NVSList_THolder signallingParameters) throws globaldefs.ProcessingFailureException;

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
  void enableSignalling (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;

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
  void disableSignalling (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException;
} // interface MLSNPPLinkMgr_IOperations
