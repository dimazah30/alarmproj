package mLSNPP;


/**
* mLSNPP/MLSNPPMgr_IPOA.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPP.idl
* 2009��9��2�� ������ ����03ʱ25��55�� CST
*/


/**
   * <p>The mLSNPPMgr_I is used to gain access to MLSNPP and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public abstract class MLSNPPMgr_IPOA extends org.omg.PortableServer.Servant
 implements mLSNPP.MLSNPPMgr_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getMLSNPP", new java.lang.Integer (0));
    _methods.put ("setTNANameForMLSNPP", new java.lang.Integer (1));
    _methods.put ("setNativeEMSName", new java.lang.Integer (2));
    _methods.put ("setUserLabel", new java.lang.Integer (3));
    _methods.put ("setOwner", new java.lang.Integer (4));
    _methods.put ("getCapabilities", new java.lang.Integer (5));
    _methods.put ("setAdditionalInfo", new java.lang.Integer (6));
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

  /** <p>This service returns an MLSNPP given its name.</p>
     *
     * <br>globaldefs::NamingAttributes_T mLSNPPName: The name of the MLSNPP
     * to retrieve.
     * <br>MLSNPP_T theMLSNPP: The MLSNPP returned.
     *
    * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     **/
       case 0:  // mLSNPP/MLSNPPMgr_I/getMLSNPP
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPName[] = globaldefs.NamingAttributes_THelper.read (in);
           mLSNPP.MultiLayerSNPP_THolder theMLSNPP = new mLSNPP.MultiLayerSNPP_THolder ();
           this.getMLSNPP (mLSNPPName, theMLSNPP);
           out = $rh.createReply();
           mLSNPP.MultiLayerSNPP_THelper.write (out, theMLSNPP.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows the NMS requests the EMS to assign a TNA Name(s) 
     * to one or more components of a specified MLSNPP. 
     * This operation also allows the unsetting of TNANames by providing an empty
     * value in the TNA Names. The TNA Names assigned by this operation will
     * overwrite existing TNA Names.</p>
     * <br>globaldefs::NamingAttributes_T <b>mLSNPPName</b>: The name of the MLSNPP.
     * <br>mLSNPP::SNPTNAList_T sNPTNAList: The List of SNP Ids and the
     * corresponding TNA Names to be set. 
     *
     * <br>mLSNPP::SNPPTNAPairList_T <b>sNPPTNAPairList</b>: The List of SNPP Ids and the corresponding
     * TNA Names. 
     * <br>string <b>tNAName</b>: The TNAName to be assigned to the MLSNPP.
     * <br>string <b>tNAGroupName</b>: The TNAGroupName to be assigned to the MLSNPP.
     * <br> MLSNPP_T <b>mLSNPP</b>: The MLSNPP with TNAs set.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. mLSNPPName does not refer to an MLSNPP object,
     *  or TNA is not valid).<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when mLSNPPName references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control
     *  Plane and communication is required to complete the request<br>
     **/
       case 1:  // mLSNPP/MLSNPPMgr_I/setTNANameForMLSNPP
       {
         try {
           globaldefs.NameAndStringValue_T mLSNPPName[] = globaldefs.NamingAttributes_THelper.read (in);
           mLSNPP.SNPTNAData_T sNPTNADataList[] = mLSNPP.SNPTNADataList_THelper.read (in);
           mLSNPP.SNPPTNAPair_T sNPPTNAPairList[] = mLSNPP.SNPPTNAPairList_THelper.read (in);
           String tNAName = in.read_string ();
           String tNAGroupName = in.read_string ();
           mLSNPP.MultiLayerSNPP_THolder mLSNPP = new mLSNPP.MultiLayerSNPP_THolder ();
           this.setTNANameForMLSNPP (mLSNPPName, sNPTNADataList, sNPPTNAPairList, tNAName, tNAGroupName, mLSNPP);
           out = $rh.createReply();
           mLSNPP.MultiLayerSNPP_THelper.write (out, mLSNPP.value);
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
       case 2:  // common/Common_I/setNativeEMSName
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
       case 3:  // common/Common_I/setUserLabel
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
       case 4:  // common/Common_I/setOwner
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
       case 5:  // common/Common_I/getCapabilities
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
       case 6:  // common/Common_I/setAdditionalInfo
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
    "IDL:mtnm.tmforum.org/mLSNPP/MLSNPPMgr_I:1.0", 
    "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public MLSNPPMgr_I _this() 
  {
    return MLSNPPMgr_IHelper.narrow(
    super._this_object());
  }

  public MLSNPPMgr_I _this(org.omg.CORBA.ORB orb) 
  {
    return MLSNPPMgr_IHelper.narrow(
    super._this_object(orb));
  }


} // class MLSNPPMgr_IPOA
