package mLSNPPLink;


/**
* mLSNPPLink/_MLSNPPLinkMgr_IStub.java .
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
public class _MLSNPPLinkMgr_IStub extends org.omg.CORBA.portable.ObjectImpl implements mLSNPPLink.MLSNPPLinkMgr_I
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
  public void getAvailableCapacity (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAvailableCapacity", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
                transmissionParameters.LayerRate_THelper.write ($out, layerRate);
                $in = _invoke ($out);
                availableCapacity.value = mLSNPPLink.AvailableCapacity_THelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                getAvailableCapacity (mLSNPPLinkName, layerRate, availableCapacity        );
            } finally {
                _releaseReply ($in);
            }
  } // getAvailableCapacity


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
  public void assignSignallingController (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, String signallingControllerIdentifier) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("assignSignallingController", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
                $out.write_string (signallingControllerIdentifier);
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
                assignSignallingController (mLSNPPLinkName, signallingControllerIdentifier        );
            } finally {
                _releaseReply ($in);
            }
  } // assignSignallingController


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
  public void deassignSignallingController (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deassignSignallingController", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
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
                deassignSignallingController (mLSNPPLinkName        );
            } finally {
                _releaseReply ($in);
            }
  } // deassignSignallingController


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
  public void setSignallingProtocolAndParameters (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, String signallingProtocol, globaldefs.NameAndStringValue_T[] signallingParameters) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setSignallingProtocolAndParameters", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
                mLSNPPLink.SignallingProtocol_THelper.write ($out, signallingProtocol);
                globaldefs.NVSList_THelper.write ($out, signallingParameters);
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
                setSignallingProtocolAndParameters (mLSNPPLinkName, signallingProtocol, signallingParameters        );
            } finally {
                _releaseReply ($in);
            }
  } // setSignallingProtocolAndParameters


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
  public void setTNANameForMLSNPPLinkEnd (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, mLSNPP.SNPTNAData_T[] sNPTNADataList, mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, String aTNAName, String zTNAName, String aTNAGroupName, String zTNAGroupName, mLSNPPLink.MultiLayerSNPPLink_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("setTNANameForMLSNPPLinkEnd", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
                mLSNPP.SNPTNADataList_THelper.write ($out, sNPTNADataList);
                mLSNPP.SNPPTNAPairList_THelper.write ($out, sNPPTNAPairList);
                $out.write_string (aTNAName);
                $out.write_string (zTNAName);
                $out.write_string (aTNAGroupName);
                $out.write_string (zTNAGroupName);
                $in = _invoke ($out);
                mLSNPPLink.value = mLSNPPLink.MultiLayerSNPPLink_THelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                setTNANameForMLSNPPLinkEnd (mLSNPPLinkName, sNPTNADataList, sNPPTNAPairList, aTNAName, zTNAName, aTNAGroupName, zTNAGroupName, mLSNPPLink        );
            } finally {
                _releaseReply ($in);
            }
  } // setTNANameForMLSNPPLinkEnd


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
  public void modifySignallingProtocolParameters (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, globaldefs.NVSList_THolder signallingParameters) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modifySignallingProtocolParameters", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
                globaldefs.NVSList_THelper.write ($out, signallingParameters.value);
                $in = _invoke ($out);
                signallingParameters.value = globaldefs.NVSList_THelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modifySignallingProtocolParameters (mLSNPPLinkName, signallingParameters        );
            } finally {
                _releaseReply ($in);
            }
  } // modifySignallingProtocolParameters


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
  public void enableSignalling (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("enableSignalling", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
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
                enableSignalling (mLSNPPLinkName        );
            } finally {
                _releaseReply ($in);
            }
  } // enableSignalling


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
  public void disableSignalling (globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disableSignalling", true);
                globaldefs.NamingAttributes_THelper.write ($out, mLSNPPLinkName);
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
                disableSignalling (mLSNPPLinkName        );
            } finally {
                _releaseReply ($in);
            }
  } // disableSignalling


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
    "IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkMgr_I:1.0", 
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
} // class _MLSNPPLinkMgr_IStub
