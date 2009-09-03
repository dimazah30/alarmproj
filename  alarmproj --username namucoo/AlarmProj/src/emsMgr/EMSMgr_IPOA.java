package emsMgr;


/**
* emsMgr/EMSMgr_IPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 emsMgr.idl
* 2009年9月2日 星期三 下午12时51分25秒 CST
*/


/**
   * <p>The EMSMgr_I is used to gain access to operations
   * which deal with the EMS itself.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in managerInterface when 
   * the managerName "EMS" is used.</p>
   **/
public abstract class EMSMgr_IPOA extends org.omg.PortableServer.Servant
 implements emsMgr.EMSMgr_IOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getEMS", new java.lang.Integer (0));
    _methods.put ("getAllMLRAs", new java.lang.Integer (1));
    _methods.put ("getAllTopLevelSubnetworks", new java.lang.Integer (2));
    _methods.put ("getAllTopLevelSubnetworkNames", new java.lang.Integer (3));
    _methods.put ("getAllMLSNPPLinks", new java.lang.Integer (4));
    _methods.put ("getAllMLSNPPLinksWithTP", new java.lang.Integer (5));
    _methods.put ("getAllMLSNPPLinksWithMLSNs", new java.lang.Integer (6));
    _methods.put ("getAllMLSNPPLinksWithTNAs", new java.lang.Integer (7));
    _methods.put ("getAllMLSNPPs", new java.lang.Integer (8));
    _methods.put ("getAllMLSNPPsWithTP", new java.lang.Integer (9));
    _methods.put ("getAllMLSNPPsWithTNA", new java.lang.Integer (10));
    _methods.put ("getAllTopLevelTopologicalLinks", new java.lang.Integer (11));
    _methods.put ("getAllTopLevelTopologicalLinkNames", new java.lang.Integer (12));
    _methods.put ("getTopLevelTopologicalLink", new java.lang.Integer (13));
    _methods.put ("getAllEMSAndMEActiveAlarms", new java.lang.Integer (14));
    _methods.put ("getAllEMSSystemActiveAlarms", new java.lang.Integer (15));
    _methods.put ("createTopologicalLink", new java.lang.Integer (16));
    _methods.put ("deleteTopologicalLink", new java.lang.Integer (17));
    _methods.put ("acknowledgeAlarms", new java.lang.Integer (18));
    _methods.put ("unacknowledgeAlarms", new java.lang.Integer (19));
    _methods.put ("getAllEMSAndMEUnacknowledgedActiveAlarms", new java.lang.Integer (20));
    _methods.put ("getAllEMSSystemUnacknowledgedActiveAlarms", new java.lang.Integer (21));
    _methods.put ("createASAP", new java.lang.Integer (22));
    _methods.put ("deleteASAP", new java.lang.Integer (23));
    _methods.put ("assignASAP", new java.lang.Integer (24));
    _methods.put ("deassignASAP", new java.lang.Integer (25));
    _methods.put ("modifyASAP", new java.lang.Integer (26));
    _methods.put ("getAllASAPs", new java.lang.Integer (27));
    _methods.put ("getAllASAPNames", new java.lang.Integer (28));
    _methods.put ("getASAP", new java.lang.Integer (29));
    _methods.put ("getASAPbyResource", new java.lang.Integer (30));
    _methods.put ("getASAPAssociatedResourceNames", new java.lang.Integer (31));
    _methods.put ("setNativeEMSName", new java.lang.Integer (32));
    _methods.put ("setUserLabel", new java.lang.Integer (33));
    _methods.put ("setOwner", new java.lang.Integer (34));
    _methods.put ("getCapabilities", new java.lang.Integer (35));
    _methods.put ("setAdditionalInfo", new java.lang.Integer (36));
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
     * <p>This allows an NMS to request the EMS information.</p>
     * 
     * <br>EMS_T emsInfo : The EMS information.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     * failure<br>
     **/
       case 0:  // emsMgr/EMSMgr_I/getEMS
       {
         try {
           emsMgr.EMS_THolder emsInfo = new emsMgr.EMS_THolder ();
           this.getEMS (emsInfo);
           out = $rh.createReply();
           emsMgr.EMS_THelper.write (out, emsInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This allows an NMS to request all MLRAs (including Routing Nodes).
     * </p>
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of MLRAs to return in the first batch.
     * <br>multiLayerSubnetwork::SubnetworkList_T mLRAList: First batch of 
     * MLRAs.
     * <br>multiLayerSubnetwork::SubnetworkIterator_I sIt: Iterator to retrieve 
     * the remaining subnetworks.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
     * <br>
     **/
       case 1:  // emsMgr/EMSMgr_I/getAllMLRAs
       {
         try {
           int how_many = in.read_ulong ();
           multiLayerSubnetwork.SubnetworkList_THolder mLRAList = new multiLayerSubnetwork.SubnetworkList_THolder ();
           multiLayerSubnetwork.SubnetworkIterator_IHolder sIt = new multiLayerSubnetwork.SubnetworkIterator_IHolder ();
           this.getAllMLRAs (how_many, mLRAList, sIt);
           out = $rh.createReply();
           multiLayerSubnetwork.SubnetworkList_THelper.write (out, mLRAList.value);
           multiLayerSubnetwork.SubnetworkIterator_IHelper.write (out, sIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This allows an NMS to request all of the Subnetworks that
     * are under the control of this EMS including the top level MLRA.
     * </p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of subnetworks to return in 
     * the first batch.
     * <br>multiLayerSubnetwork::SubnetworkList_T sList: First batch of 
     * subnetworks.
     * <br>multiLayerSubnetwork::SubnetworkIterator_I sIt: Iterator to retrieve 
     * the remaining subnetworks.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
  
     * <br>
     **/
       case 2:  // emsMgr/EMSMgr_I/getAllTopLevelSubnetworks
       {
         try {
           int how_many = in.read_ulong ();
           multiLayerSubnetwork.SubnetworkList_THolder sList = new multiLayerSubnetwork.SubnetworkList_THolder ();
           multiLayerSubnetwork.SubnetworkIterator_IHolder sIt = new multiLayerSubnetwork.SubnetworkIterator_IHolder ();
           this.getAllTopLevelSubnetworks (how_many, sList, sIt);
           out = $rh.createReply();
           multiLayerSubnetwork.SubnetworkList_THelper.write (out, sList.value);
           multiLayerSubnetwork.SubnetworkIterator_IHelper.write (out, sIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllTopLevelSubnetworks(),
     * but instead of returning the entire object structures, this operation 
     * returns their names.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of subnetwork names to return 
     * in the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of 
     * subnetwork names.
     * <br>globaldefs::NamingAttributesListIterator_I nameIt: Iterator to 
     * retrieve the remaining subnetwork names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllTopLevelSubnetworks().
     **/
       case 3:  // emsMgr/EMSMgr_I/getAllTopLevelSubnetworkNames
       {
         try {
           int how_many = in.read_ulong ();
           globaldefs.NamingAttributesList_THolder nameList = new globaldefs.NamingAttributesList_THolder ();
           globaldefs.NamingAttributesIterator_IHolder nameIt = new globaldefs.NamingAttributesIterator_IHolder ();
           this.getAllTopLevelSubnetworkNames (how_many, nameList, nameIt);
           out = $rh.createReply();
           globaldefs.NamingAttributesList_THelper.write (out, nameList.value);
           globaldefs.NamingAttributesIterator_IHelper.write (out, nameIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
  
     * <p>This operation provides the NMS with all the
     * MLSNPPLinks known to the EMS.</p>
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>boolean sNPListRequested: Indicates if the list of SNPs must be included
     * in the return. 
     * <br>unsigned long how_many: Maximum number of MLSNPPLinks to report in the first 
     * batch.
     * <br>mLSNPPLink::MLSNPPLinkList_T <b>mLSNPPLinkList</b>: First batch of 
     * MLSNPPs Links.
     * <br>mLSNPP::MLSNPPLinkIterator_I mLSNPPLinkIt: Iterator to retrieve 
     * the remaining MLSNPP Links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
  
     **/
       case 4:  // emsMgr/EMSMgr_I/getAllMLSNPPLinks
       {
         try {
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList = new mLSNPPLink.MLSNPPLinkList_THolder ();
           mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt = new mLSNPPLink.MLSNPPLinkIterator_IHolder ();
           this.getAllMLSNPPLinks (sNPListRequested, how_many, mLSNPPLinkList, mLSNPPLinkIt);
           out = $rh.createReply();
           mLSNPPLink.MLSNPPLinkList_THelper.write (out, mLSNPPLinkList.value);
           mLSNPPLink.MLSNPPLinkIterator_IHelper.write (out, mLSNPPLinkIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows an NMS to request a list of the MLSNPP Links that
     * are totally or partially supported by the specified TP (PTP/CTP/FTP).</p>
     * <p>The Links returned may contain the list of SNPs which end the link based on
     * request for them.</p> 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a> 
     * for information on how iterators are used in this interface.</p>
     *
     * globaldefs::NamingAttributes_T <b>tPName</b>:
     * The TP name for which to retrieve the MLSNPP Links.
     * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPP Links to return
     * in the first batch.
     * <br>mLSNPPLink::MLSNPPLinkList_T <b>mLSNPPLinkList</b>: First batch of 
     * MLSNPPs Links.
     * <br>mLSNPPLink::MLSNPPLinkIterator_I <b>mLSNPPLinkIt</b>: Iterator to
     * get the remaining MLSNPP Links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tpName does not reference a 
     *  TP object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references a TP 
     * object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
     **/
       case 5:  // emsMgr/EMSMgr_I/getAllMLSNPPLinksWithTP
       {
         try {
           globaldefs.NameAndStringValue_T tPName[] = globaldefs.NamingAttributes_THelper.read (in);
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList = new mLSNPPLink.MLSNPPLinkList_THolder ();
           mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt = new mLSNPPLink.MLSNPPLinkIterator_IHolder ();
           this.getAllMLSNPPLinksWithTP (tPName, sNPListRequested, how_many, mLSNPPLinkList, mLSNPPLinkIt);
           out = $rh.createReply();
           mLSNPPLink.MLSNPPLinkList_THelper.write (out, mLSNPPLinkList.value);
           mLSNPPLink.MLSNPPLinkIterator_IHelper.write (out, mLSNPPLinkIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     
     * <p>This operation returns all the MLSNPP Links that interconnect a pair of 
     * specified MLRAs. The MLRAs
     * specified must belong to the same hierarchical level.</p>
     * 
     
     * 
     * If the EMS does not directly manage one of the addressed MLRA (The EMS does
     * not manage the MLRA but it can access the related control plane information),
     * then the operation may reply an empty or partial list of MLSNPP Links.
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::SubnetworkList_T <b>mLRANames</b>: The MLRAs that terminate the 
     * links to be retrieved. The list must include two and only two entries.
     
  * <br>boolean sNPListRequested: Indicates if the list of SNPs must be included
    * in the return. 
      * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPP Links to
     * return in the first batch.
     * <br>mLSNPPLink::MLSNPPLinkList_T <b>mLSNPPLinkList</b>: First batch of 
     * MLSNPPs Links.
     * <br>mLSNPPLink::MLSNPPLinkIterator_I <b>mLSNPPLinkIt</b>: Iterator to
     * get the remaining MLSNPP Links.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if any of the adressed MLSN does not represent
     *  a MLRA<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
  
     **/
       case 6:  // emsMgr/EMSMgr_I/getAllMLSNPPLinksWithMLSNs
       {
         try {
           globaldefs.NameAndStringValue_T mLRANames[][] = globaldefs.NamingAttributesList_THelper.read (in);
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList = new mLSNPPLink.MLSNPPLinkList_THolder ();
           mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt = new mLSNPPLink.MLSNPPLinkIterator_IHolder ();
           this.getAllMLSNPPLinksWithMLSNs (mLRANames, sNPListRequested, how_many, mLSNPPLinkList, mLSNPPLinkIt);
           out = $rh.createReply();
           mLSNPPLink.MLSNPPLinkList_THelper.write (out, mLSNPPLinkList.value);
           mLSNPPLink.MLSNPPLinkIterator_IHelper.write (out, mLSNPPLinkIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /** 
     * <p>This operation allows an NMS to request a list of the MLSNPPLinks for
     * the specified TNA Identifiers (possibly including TNALogicalPortID and TNAIndex).</p>.
     * If the EMS does not directly manage one or more of the addressed TNAs (the EMS does
     * not manage the MLRA where the TNA is, but it can access the related control plane information),
     * then the operation may reply an empty or partial list of MLSNPP Links.
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a> 
     * for information on how iterators are used in this interface.</p>
     *
     * <br>mLSNPP::TNAList_T <b>tNAList</b>: The list of TNA Identifiers 
     * of the MLSNPP Links to retrieve
     *
     * <br>boolean <b>sNPListRequested</b>: Indicates if the list of SNPs must be included
     * in the return. 
     *
     * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPP Links to return in the 
     * first batch. 
     *
     * <br>mLSNPPLink::MLSNPPLinkList_T <b>mLSNPPLinkList</b>: First batch of
     * MLSNPPs Links.
     *
     * <br>mLSNPPLink::MLSNPPLinkIterator_I <b>mLSNPPLinkIt</b>: Iterator to
     * get the remaining MLSNPP Links.   
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br> 
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
     **/
       case 7:  // emsMgr/EMSMgr_I/getAllMLSNPPLinksWithTNAs
       {
         try {
           String tNAList[] = mLSNPP.TNAList_THelper.read (in);
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList = new mLSNPPLink.MLSNPPLinkList_THolder ();
           mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt = new mLSNPPLink.MLSNPPLinkIterator_IHolder ();
           this.getAllMLSNPPLinksWithTNAs (tNAList, sNPListRequested, how_many, mLSNPPLinkList, mLSNPPLinkIt);
           out = $rh.createReply();
           mLSNPPLink.MLSNPPLinkList_THelper.write (out, mLSNPPLinkList.value);
           mLSNPPLink.MLSNPPLinkIterator_IHelper.write (out, mLSNPPLinkIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
  
     * This operation shall reply all the MLSNPPs known to the EMS.
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>boolean <b>sNPListRequested</b>: Indicates if the list of SNPs must be included
     * in the return. 
     * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPP to report in the first 
     * batch.   
     * <br>mLSNPP::MLSNPPList_T <b>mLSNPPList</b>: First batch of 
     * MLSNPPs. 
     * <br>mLSNPP::MLSNPPIterator_I mLSNPPIt: Iterator to retrieve 
     * the remaining MLSNPP.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.
     * <br>
     **/
       case 8:  // emsMgr/EMSMgr_I/getAllMLSNPPs
       {
         try {
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPP.MLSNPPList_THolder mLSNPPList = new mLSNPP.MLSNPPList_THolder ();
           mLSNPP.MLSNPPIterator_IHolder mLSNPPIt = new mLSNPP.MLSNPPIterator_IHolder ();
           this.getAllMLSNPPs (sNPListRequested, how_many, mLSNPPList, mLSNPPIt);
           out = $rh.createReply();
           mLSNPP.MLSNPPList_THelper.write (out, mLSNPPList.value);
           mLSNPP.MLSNPPIterator_IHelper.write (out, mLSNPPIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows an NMS to request a list of the MLSNPPs associated
     * with the specified TP (PTP/CTP/FTP).</p>
     * <p>The SNPPs returned may contain the list of SNPs based on
     * the request for them.</p>    
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a> 
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T <b>tPName</b>:
     * The TP name for which to retrieve the MLSNPP(s).
     *
     * <br>boolean <b>sNPListRequested</b>: Indicates if the list of SNPs must be included
     * in the return. 
     * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPPs to return
     * in the first batch.
     * <br>mLSNPP::mLSNPPList_T <b>mLSNPPList</b>: First batch of 
     * MLSNPPs.
     * <br>mLSNPP::MLSNPPIterator_I <b>mLSNPPIt</b>: Iterator to
     * get the remaining MLSNPP.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tpName does not reference a 
     *  TP object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references a TP 
     * object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
     **/
       case 9:  // emsMgr/EMSMgr_I/getAllMLSNPPsWithTP
       {
         try {
           globaldefs.NameAndStringValue_T tPName[] = globaldefs.NamingAttributes_THelper.read (in);
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPP.MLSNPPList_THolder mLSNPPList = new mLSNPP.MLSNPPList_THolder ();
           mLSNPP.MLSNPPIterator_IHolder mLSNPPIt = new mLSNPP.MLSNPPIterator_IHolder ();
           this.getAllMLSNPPsWithTP (tPName, sNPListRequested, how_many, mLSNPPList, mLSNPPIt);
           out = $rh.createReply();
           mLSNPP.MLSNPPList_THelper.write (out, mLSNPPList.value);
           mLSNPP.MLSNPPIterator_IHelper.write (out, mLSNPPIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows an NMS to request a list of the MLSNPPs for
     * the specified TNA Identifiers (possibly including TNALogicalPortID and TNAIndex).</p>.
     * If the EMS does not directly manage one or more of the addressed TNAs (the EMS does
     * not manage the MLRA where the TNA is, but it can access the related control plane information),
     * then the operation may reply an empty or partial list of MLSNPPs.
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a> 
    * for information on how iterators are used in this interface.</p>
    *
    * <br>mLSNPP::TNAList_T <b>tNAList</b>: The list of TNA Names of the MLSNPPs to retrieve
    * <br>boolean sNPListRequested: Indicates if the list of SNPs must be included
    * in the return. 
    * <br>unsigned long <b>how_many</b>: Maximum number of MLSNPPs to return in the 
    * first batch.
    * <br>mLSNPP::mLSNPPList_T <b>mLSNPPList</b>: First batch of 
    * MLSNPPs.
    * <br>mLSNPP::MLSNPPIterator_I <b>mLSNPPIt</b>: Iterator to
    * get the remaining MLSNPPs.
    * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
    * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
    * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
    *  failure<br>
    * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
    * and communication is required to complete the request.<br>
    **/
       case 10:  // emsMgr/EMSMgr_I/getAllMLSNPPsWithTNA
       {
         try {
           String tNAList[] = mLSNPP.TNAList_THelper.read (in);
           boolean sNPListRequested = in.read_boolean ();
           int how_many = in.read_ulong ();
           mLSNPP.MLSNPPList_THolder mLSNPPList = new mLSNPP.MLSNPPList_THolder ();
           mLSNPP.MLSNPPIterator_IHolder mLSNPPIt = new mLSNPP.MLSNPPIterator_IHolder ();
           this.getAllMLSNPPsWithTNA (tNAList, sNPListRequested, how_many, mLSNPPList, mLSNPPIt);
           out = $rh.createReply();
           mLSNPP.MLSNPPList_THelper.write (out, mLSNPPList.value);
           mLSNPP.MLSNPPIterator_IHelper.write (out, mLSNPPIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all of the Topological Links that
     * exist between multiLayerSubnetworks, under the control of this EMS.</p>
     * <p>For details on how topological links should be modelled, see
     * <a href=supportingDocumentation/SD1-18_layers.pdf >SD1-18 layering</a>.</p>
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long <b>how_many</b>: Maximum number of topological links
     * to return in the first batch.
     * <br>topologicalLink::TopologicalLinkList_T <b>topoList</b>: First batch of 
     * topological links.
     * <br>topologicalLink::TopologicalLinkIterator_I <b>topoIt</b>: Iterator to 
     * retrieve the remaining topological links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 11:  // emsMgr/EMSMgr_I/getAllTopLevelTopologicalLinks
       {
         try {
           int how_many = in.read_ulong ();
           topologicalLink.TopologicalLinkList_THolder topoList = new topologicalLink.TopologicalLinkList_THolder ();
           topologicalLink.TopologicalLinkIterator_IHolder topoIt = new topologicalLink.TopologicalLinkIterator_IHolder ();
           this.getAllTopLevelTopologicalLinks (how_many, topoList, topoIt);
           out = $rh.createReply();
           topologicalLink.TopologicalLinkList_THelper.write (out, topoList.value);
           topologicalLink.TopologicalLinkIterator_IHelper.write (out, topoIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllTopLevelTopologicalLinks, but instead of returning the entire object 
     * structures, this operation returns their names.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of topological link names
     * to return in the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of 
     * topological link names.
     * <br>globaldefs::NamingAttributesListIterator_I nameIt: Iterator to 
     * retrieve the remaining topological link names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllTopLevelTopologicalLinks().
     **/
       case 12:  // emsMgr/EMSMgr_I/getAllTopLevelTopologicalLinkNames
       {
         try {
           int how_many = in.read_ulong ();
           globaldefs.NamingAttributesList_THolder nameList = new globaldefs.NamingAttributesList_THolder ();
           globaldefs.NamingAttributesIterator_IHolder nameIt = new globaldefs.NamingAttributesIterator_IHolder ();
           this.getAllTopLevelTopologicalLinkNames (how_many, nameList, nameIt);
           out = $rh.createReply();
           globaldefs.NamingAttributesList_THelper.write (out, nameList.value);
           globaldefs.NamingAttributesIterator_IHelper.write (out, nameIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This service returns a top level topological link given its name.</p>
     * 
     * <br>globaldefs::NamingAttributes topoLinkName: Name of the top level 
     *  topological link to retrieve.
     * <br>TopologicalLink_T topoLink: Top level topological link returned.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when topoLinkName does not reference a top 
     *  level topological link object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when topoLinkName references a top level 
     *  topological link object that does not exist<br>
     * <br>
     **/
       case 13:  // emsMgr/EMSMgr_I/getTopLevelTopologicalLink
       {
         try {
           globaldefs.NameAndStringValue_T topoLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           topologicalLink.TopologicalLink_THolder topoLink = new topologicalLink.TopologicalLink_THolder ();
           this.getTopLevelTopologicalLink (topoLinkName, topoLink);
           out = $rh.createReply();
           topologicalLink.TopologicalLink_THelper.write (out, topoLink.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all of the active alarms and TCAs that
     * are under the control of this EMS (both those raised by
     * the NEs and those raised by the EMS itself). Some alarms may be
     * filtered out (excluded) by specifying their probable causes or severities.
     * </p>
     * 
     * <p>The result of this operation is independent of the filtering set up by 
     * the NMS for the notification service. Alarms which ASAP assigned severity 
     * is "AS_NONALARMED" should not be reported by this operation. </p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>notifications::ProbableCauseList_T excludeProbCauseList: The list of 
     * probable causes to exclude (for which events should not be reported).
     * <br>notifications::PerceivedSeverityList_T excludeSeverityList: List of 
     * severities to exclude from the output event list.
     * <br>unsigned long how_many: Maximum number of alarms and TCAs to report 
     * in the first batch.
     * <br>notifications::EventList_T eventList: First batch of alarms and 
     * TCAs.
     * <br>notifications::EventIterator_I eventIt: Iterator to retrieve the 
     * remaining alarms and TCAs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 14:  // emsMgr/EMSMgr_I/getAllEMSAndMEActiveAlarms
       {
         try {
           String excludeProbCauseList[] = notifications.ProbableCauseList_THelper.read (in);
           notifications.PerceivedSeverity_T excludeSeverityList[] = notifications.PerceivedSeverityList_THelper.read (in);
           int how_many = in.read_ulong ();
           notifications.EventList_THolder eventList = new notifications.EventList_THolder ();
           notifications.EventIterator_IHolder eventIt = new notifications.EventIterator_IHolder ();
           this.getAllEMSAndMEActiveAlarms (excludeProbCauseList, excludeSeverityList, how_many, eventList, eventIt);
           out = $rh.createReply();
           notifications.EventList_THelper.write (out, eventList.value);
           notifications.EventIterator_IHelper.write (out, eventIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all of the active alarms and TCAs 
     * for the EMS itself.  Some alarms may be
     * filtered out (excluded) by specifying their severities.</p>
     * 
     * <p>The result of this operation is independent of the filtering set up by 
     * the NMS for the notification service. Alarms which ASAP assigned severity 
     * is "AS_NONALARMED" should not be reported by this operation.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>notifications::PerceivedSeverityList_T excludeSeverityList: List of 
     * severities to exclude from the output event list.
     * <br>unsigned long how_many: Maximum number of alarms and TCAs to report 
     * in the first batch.
     * <br>notifications::EventList_T eventList: First batch of alarms and 
     * TCAs.
     * <br>notifications::EventIterator_I eventIt: Iterator to retrieve the 
     * remaining alarms and TCAs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 15:  // emsMgr/EMSMgr_I/getAllEMSSystemActiveAlarms
       {
         try {
           notifications.PerceivedSeverity_T excludeSeverityList[] = notifications.PerceivedSeverityList_THelper.read (in);
           int how_many = in.read_ulong ();
           notifications.EventList_THolder eventList = new notifications.EventList_THolder ();
           notifications.EventIterator_IHolder eventIt = new notifications.EventIterator_IHolder ();
           this.getAllEMSSystemActiveAlarms (excludeSeverityList, how_many, eventList, eventIt);
           out = $rh.createReply();
           notifications.EventList_THelper.write (out, eventList.value);
           notifications.EventIterator_IHelper.write (out, eventIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation can be used to create top-level topological links as well 
     * as intra-MLSN topological links.</p>
     * <p>The behaviour of this operation should be the same as if an EMS user 
     * were to attempt to create a topological link (or equivalent operation) at 
     * the EMS user interface.  Therefore, the specific conditions under which the 
     * creation is rejected are left to the EMS implementation.</p>
     * <br>topologicalLink::TLCreateData_T newTLCreateData: Structure describing
     * the topological link to be created.
     * <br>topologicalLink::TopologicalLink_T newTopologicalLink: Structure
     * describing the newly created topological link reflecting the input data.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when a field of createData is invalid.<br>
     * EXCPT_OBJECT_IN_USE - Raised when the TL creation is rejected due to an 
     *  aEndTP/zEndTP conflict<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised if the aEndTP or zEndTP do not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid could not be 
     *  set and that parameter is identified as "not best effort" in the 
     *  <a href=../../../supportingDocumentation/SD1-1_additionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the creation is not 
     *  possible because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is
     *  not met<br>
     * <br>
     **/
       case 16:  // emsMgr/EMSMgr_I/createTopologicalLink
       {
         try {
           topologicalLink.TLCreateData_T newTLCreateData = topologicalLink.TLCreateData_THelper.read (in);
           topologicalLink.TopologicalLink_THolder newTopologicalLink = new topologicalLink.TopologicalLink_THolder ();
           this.createTopologicalLink (newTLCreateData, newTopologicalLink);
           out = $rh.createReply();
           topologicalLink.TopologicalLink_THelper.write (out, newTopologicalLink.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation can be used to delete top-level topological links as well 
     * as intra-MLSN topological links.</p>
     * <p>The behaviour of this operation should be the same as if an EMS user 
     * were to attempt to delete a topological link (or equivalent operation) at 
     * the EMS user interface.  Therefore, the specific conditions under which the 
     * deletion is rejected are left to the EMS implementation.</p>
     * <p>It is at the discretion of the EMS to delete topological links created 
     * by the NMS, as the owner of the topological link is the EMS, not 
     * the NMS.</p>
     * <br>globaldefs::NamingAttributes_T topoLinkName: The name of the 
     * topological link to be deleted.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when topoLinkName does not reference a 
     *  topological link object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised if the topological link does not exist.<br>
     * EXCPT_UNABLE_TO_COMPLY when the deletion is rejected for EMS 
     *  specific reasons. <br>
     * <br>
     **/
       case 17:  // emsMgr/EMSMgr_I/deleteTopologicalLink
       {
         try {
           globaldefs.NameAndStringValue_T topoLinkName[] = globaldefs.NamingAttributes_THelper.read (in);
           this.deleteTopologicalLink (topoLinkName);
           out = $rh.createReply();
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows an NMS to acknowledge a list of active alarms and 
     * TCAs that are under the control of the EMS (both those raised by the NEs 
     * and those raised by the EMS itself). This operation is best effort.</p>
     * <br>AlarmAndTCAIDList_T acknowledgeIDList: The list of alarms to 
     * acknowledge. 
     * <br>globaldefs::NVSList_T additionalInfo:  Suggested values in additional 
     * info:
     * <ul><li> username: when the username is passed the EMS will mark the alarm 
     * or TCA as being attended by the user indicated if supported by the
     * EMS.</li>
     * <li>notepad: some textual information supplied by the attending user (e.g., 
     * to inform other users)</li></ul>
     * <br>notifications::AcknowledgeIDList_T failedAcknowledgeIDList: The list 
     * of alarms for which the acknowledge action failed.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INVALID_INPUT - Raised if the acknowledgeIDList or additionalInfo
     *  contains invalid data<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY -Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the
     *  <a href=../../../supportingDocumentation/SD1-1_additionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. If the EMS cannot determine the 
     *  reason it could not comply, it is also allowed to throw 
     *  EXCPT_UNABLE_TO_COMPLY<br>
     **/
       case 18:  // emsMgr/EMSMgr_I/acknowledgeAlarms
       {
         try {
           notifications.AlarmOrTCAIdentifier_T acknowledgeIDList[] = notifications.AlarmAndTCAIDList_THelper.read (in);
           globaldefs.NameAndStringValue_T additionalInfo[] = globaldefs.NVSList_THelper.read (in);
           notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList = new notifications.AlarmAndTCAIDList_THolder ();
           this.acknowledgeAlarms (acknowledgeIDList, additionalInfo, failedAcknowledgeIDList);
           out = $rh.createReply();
           notifications.AlarmAndTCAIDList_THelper.write (out, failedAcknowledgeIDList.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation allows an NMS to unacknowledge a list of active alarms 
     * and TCAs that are under the control of the EMS (both those raised by the 
     * NEs and those raised by the EMS itself). This operation is best effort.</p>
     * <br>AlarmAndTCAIDList_T unacknowledgeIDList: The list of alarms 
     * to uncknowledge. 
     * <br>globaldefs::NVSList_T additionalInfo:  Suggested values in additional 
     * info (whether the EMS preserves the information captured when the alarm was 
     * acknowledged in addition to the information recorded when it is 
     * unacknowledged is up to the implementers of the EMS):
     * <ul><li> username: when the username is passed the EMS will mark the alarm 
     * or TCA as being attended by the user indicated if supported by the
     * EMS.</li>
     * <li>notepad: some textual information supplied by the attending user (e.g., 
     * to inform other users)</li></ul>
     * <br>AcknowledgeIDList_T failedunAcknowledgeIDList: The list of alarms for 
     * which the acknowledge action failed.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INVALID_INPUT - Raised if the unacknowledgeIDList or additionalInfo
     *  contains invalid data<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY -Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the
     *  <a href=../../../supportingDocumentation/SD1-1_additionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. If the EMS cannot determine the 
     *  reason it could not comply, it is also allowed to throw 
     *  EXCPT_UNABLE_TO_COMPLY<br>
     **/
       case 19:  // emsMgr/EMSMgr_I/unacknowledgeAlarms
       {
         try {
           notifications.AlarmOrTCAIdentifier_T unacknowledgeIDList[] = notifications.AlarmAndTCAIDList_THelper.read (in);
           globaldefs.NameAndStringValue_T additionalInfo[] = globaldefs.NVSList_THelper.read (in);
           notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList = new notifications.AlarmAndTCAIDList_THolder ();
           this.unacknowledgeAlarms (unacknowledgeIDList, additionalInfo, failedunAcknowledgeIDList);
           out = $rh.createReply();
           notifications.AlarmAndTCAIDList_THelper.write (out, failedunAcknowledgeIDList.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all of the unacknowledged active alarms 
     * and TCAs that are under the control of this EMS (both those raised by
     * the NEs and those raised by the EMS itself). Some alarms may be
     * filtered out (excluded) by specifying their probable causes or severities.
     * </p>
     * 
     * <p>The result of this operation is independent of the filtering set up by 
     * the NMS for the notification service. Alarms which ASAP assigned severity 
     * is "AS_NONALARMED" should not be reported by this operation. </p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>notifications::ProbableCauseList_T excludeProbCauseList: The list of 
     * probable causes to exclude (for which events should not be reported).
     * <br>notifications::PerceivedSeverityList_T excludeSeverityList: List of 
     * severities to exclude from the output event list.
     * <br>unsigned long how_many: Maximum number of alarms and TCAs to report 
     * in the first batch.
     * <br>notifications::EventList_T eventList: First batch of alarms and 
     * TCAs.
     * <br>notifications::EventIterator_I eventIt: Iterator to retrieve the 
     * remaining alarms and TCAs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 20:  // emsMgr/EMSMgr_I/getAllEMSAndMEUnacknowledgedActiveAlarms
       {
         try {
           String excludeProbCauseList[] = notifications.ProbableCauseList_THelper.read (in);
           notifications.PerceivedSeverity_T excludeSeverityList[] = notifications.PerceivedSeverityList_THelper.read (in);
           int how_many = in.read_ulong ();
           notifications.EventList_THolder eventList = new notifications.EventList_THolder ();
           notifications.EventIterator_IHolder eventIt = new notifications.EventIterator_IHolder ();
           this.getAllEMSAndMEUnacknowledgedActiveAlarms (excludeProbCauseList, excludeSeverityList, how_many, eventList, eventIt);
           out = $rh.createReply();
           notifications.EventList_THelper.write (out, eventList.value);
           notifications.EventIterator_IHelper.write (out, eventIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all of the active alarms and TCAs 
     * for the EMS itself that are not acknowledged.  Some alarms may be
     * filtered out (excluded) by specifying their severities.</p>
     * 
     * <p>The result of this operation is independent of the filtering set up by 
     * the NMS for the notification service. Alarms which ASAP assigned severity 
     * is "AS_NONALARMED" should not be reported by this operation. </p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>notifications::PerceivedSeverityList_T excludeSeverityList: List of 
     * severities to exclude from the output event list.
     * <br>unsigned long how_many: Maximum number of alarms and TCAs to report 
     * in the first batch.
     * <br>notifications::EventList_T eventList: First batch of alarms and 
     * TCAs.
     * <br>notifications::EventIterator_I eventIt: Iterator to retrieve the 
     * remaining alarms and TCAs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 21:  // emsMgr/EMSMgr_I/getAllEMSSystemUnacknowledgedActiveAlarms
       {
         try {
           notifications.PerceivedSeverity_T excludeSeverityList[] = notifications.PerceivedSeverityList_THelper.read (in);
           int how_many = in.read_ulong ();
           notifications.EventList_THolder eventList = new notifications.EventList_THolder ();
           notifications.EventIterator_IHolder eventIt = new notifications.EventIterator_IHolder ();
           this.getAllEMSSystemUnacknowledgedActiveAlarms (excludeSeverityList, how_many, eventList, eventIt);
           out = $rh.createReply();
           notifications.EventList_THelper.write (out, eventList.value);
           notifications.EventIterator_IHelper.write (out, eventIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This operation creates a new ASAP object, named by the EMS, with the 
     * values described by the input parameters. The operation fails if the 
     * maximum number of ASAPs for EMS has been reached.</p>
     * <br>aSAP::ASAPCreateModifyData_T newASAPCreateData: information about the 
     * ASAP to be created.
     * <br>aSAP::ASAP_T newASAP: result of the creation.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support creation of ASAPs 
     *  via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if input parameters contains invalid data<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_CAPACITY_EXCEEDED - Raised in case the maximum number of ASAP 
     *  instances has been reached<br>
     * <br>
     **/
       case 22:  // emsMgr/EMSMgr_I/createASAP
       {
         try {
           aSAP.ASAPCreateModifyData_T newASAPCreateData = aSAP.ASAPCreateModifyData_THelper.read (in);
           aSAP.ASAP_THolder newASAP = new aSAP.ASAP_THolder ();
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           this.createASAP (newASAPCreateData, newASAP, additionalInfo);
           out = $rh.createReply();
           aSAP.ASAP_THelper.write (out, newASAP.value);
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This operation deletes the addressed ASAP. The operation fails if at 
     * least one resource is pointing to this ASAP. Moreover the EMS could refuse 
     * this operation, in case the addressed ASAP is <b>fixed</b>.</p>
     * <br>globaldefs::NamingAttributes_T aSAPName: the name of the ASAP object 
     * to be deleted.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support deletion of ASAPs 
     *  via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when aSAPName does not refer to an ASAP 
     *  object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when aSAPName references an object that 
     *  does not exist<br>
     * EXCPT_OBJECT_IN_USE - Raised if at least one resource is pointing to this 
     *  ASAP object<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case this ASAP object is fixed<br>
     * <br>
     **/
       case 23:  // emsMgr/EMSMgr_I/deleteASAP
       {
         try {
           globaldefs.NameAndStringValue_T aSAPName[] = globaldefs.NamingAttributes_THelper.read (in);
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           additionalInfo.value = globaldefs.NVSList_THelper.read (in);
           this.deleteASAP (aSAPName, additionalInfo);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation assigns the addressed ASAP to the addressed resource, 
     * i.e. the aSAPpointer is updated accordingly. The formerly referenced ASAP, 
     * if any, is deassigned. For TPs, it is necessary to indicate also the layer 
     * rate the ASAP will apply.</p>
     *    * <p>This operation causes an alarm re-evaluation of the already detected 
     * defects according to the following rules.</p>
     *
     * <p>If alarms are reportable:<ul>
     * <li>if the severity changes from any of critical, major, minor, warning, to 
     * not alarmed, then an alarm notification with <i>cleared</i> is sent and the 
     * alarm is no longer available for any alarm retrieval operation.</li>
     * <li>if the severity changes from not alarmed to any of critical, major, 
     * minor, warning, then an alarm notification with the new 
     * <i>perceivedSeverity</i> is sent (with the current EMS/NE time) and the 
     * alarm is available for any alarm retrieval operation.</li>
     * <li>if the severity changes from any of critical, major, minor, warning, to 
     * any of critical, major, minor, warning, then the alarm re-evaluation 
     * process is not performed.</li></p>
     *
     * <p>Note that an alarm is reportable by ME/EMS:<ul> 
     * <li> when for PTP, CTP, FTP AlarmReporting = "on"</li>
     * <li> when for SNC, TopologicalLink, Equipment, EquipmentHolder, GTP 
     * alarmReportingIndicator = true</li>
     * <li> always for all other objects which do not have any alarm reporting 
     * attribute</li></ul></p>.
     *
     * <p>Note that the clear notification is not send in case of transient 
     * events.</p> 
     *
     * <p>If the addressed resource originates alarms from within the ME, then 
     * this operation could imply the "activation" of the ASAP instance and 
     * functionality over the proper ME. E.g. the EMS will download the ASAP to a 
     * given ME only once the ASAP is assigned for the first time to a resource of 
     * that ME.</p>
     *
     * <p>Note that some 2nd class objects have the ASAP pointer stored in their 
     * additional info, nevertheless is not allowed to assign ASAP via 
     * setAdditionalInfo operation.</p>
     *
     * <br>globaldefs::NamingAttributes_T aSAPName: the name of the ASAP object 
     * to be assigned.
     * <br>transmissionParameters::LayerRate_T layerRate: the TP layer rate the 
     * ASAP object is assigned to. If the resource is not a TP, then the layerRate 
     * value shall be LR_Not_Applicable.
     * <br>globaldefs::NamingAttributes_T resourceName: the name of the resource 
     * to assign the ASAP to.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support assignment of ASAPs 
     *  via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when aSAPName does not refer to an ASAP 
     *  object, or layerRate is invalid for the addressed resource, i.e. it is not 
     *  an encapsulated layerRate<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when aSAPName or resourceName reference an 
     *  object that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case currently assigned ASAP object 
     *  cannot be deassigned, or resourceName refers to object not supporting ASAP 
     *  pointer feature<br>
     * <br>
     **/
       case 24:  // emsMgr/EMSMgr_I/assignASAP
       {
         try {
           globaldefs.NameAndStringValue_T aSAPName[] = globaldefs.NamingAttributes_THelper.read (in);
           globaldefs.NameAndStringValue_T resourceName[] = globaldefs.NamingAttributes_THelper.read (in);
           short layerRate = transmissionParameters.LayerRate_THelper.read (in);
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           additionalInfo.value = globaldefs.NVSList_THelper.read (in);
           this.assignASAP (aSAPName, resourceName, layerRate, additionalInfo);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation deassigns the ASAP from the addressed resource, i.e. the 
     * aSAPpointer is updated to empty string. For TPs, it is necessary to 
     * indicate also the layer rate, in order to identify the ASAP to be 
     * deassigned.</p>
     *
     * <p>This operation causes an alarm re-evaluation of the already detected 
     * defects according to same rules as ASAP assignment, considering as "newly 
     * assigned ASAP" the default alarm severity assignment.</p>
     *
     * <p>If the addressed resource originates alarms from within the ME, then 
     * this operation could imply the "deactivation" of the ASAP instance and 
     * functionality over the proper ME. E.g. the EMS will remove the ASAP from a 
     * given ME only when the ASAP is no longer assigned to any resource of that 
     * ME.</p>
     *
     * <p>Note that some 2nd class objects have the ASAP pointer stored in their 
     * additional info, nevertheless is not allowed to deassign ASAP via 
     * setAdditionalInfo operation.</p>
     *
     * <br>globaldefs::NamingAttributes_T resourceName: the name of the resource 
     * to deassign the ASAP from.
     * <br>transmissionParameters::LayerRate_T layerRate: the TP layer rate is 
     * necessary to identify the ASAP instance to be deassigned. If the resource 
     * is not a TP, then the layerRate value shall be LR_Not_Applicable.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support deassignment of 
     *  ASAPs via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when resourceName is an invalid reference, or 
     *  layerRate is invalid for the addressed resource, i.e. it is not an 
     *  encapsulated layerRate<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when resourceName references an object that 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case currently assigned ASAP object 
     *  cannot be deassigned, or resourceName refers to object not supporting ASAP 
     *  pointer feature<br>
     * <br>
     **/
       case 25:  // emsMgr/EMSMgr_I/deassignASAP
       {
         try {
           globaldefs.NameAndStringValue_T resourceName[] = globaldefs.NamingAttributes_THelper.read (in);
           short layerRate = transmissionParameters.LayerRate_THelper.read (in);
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           additionalInfo.value = globaldefs.NVSList_THelper.read (in);
           this.deassignASAP (resourceName, layerRate, additionalInfo);
           out = $rh.createReply();
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation modifies the addressed ASAP according to the input 
     * parameters. This operation does not modify any current ASAP assignment. The 
     * specified alarmSeverityAssignmentList will completely replace the current 
     * one. EMS could refuse this operation in case the addressed ASAP is 
     * fixed.</p>
     *
     * <p>The modification of the ASAP does not trigger any alarm re-evaluation of 
     * the already detected defects. This because such re-evaluation process may 
     * involve a big number of managed resources across the network.</p>
     *
     * <p>If the addressed resource originates alarms from within the ME, then 
     * this operation could imply the modification of the ASAP instance and 
     * functionality over the proper ME.</p>
     *
     * <br>globaldefs::NamingAttributes_T aSAPName: the name of the ASAP object 
     * to be modified. 
     * <br>aSAP::ASAPCreateModifyData_T aSAPModifyData: the data to be 
     * modified.
     * <br>aSAP::ASAP_T newASAP: result of the modification.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support ASAP modification 
     *  via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when aSAPName does not refer to an ASAP 
     *  object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when aSAPName reference an object that does 
     *  not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case addressed ASAP object cannot be 
     *  modified<br>
     * <br>
     **/
       case 26:  // emsMgr/EMSMgr_I/modifyASAP
       {
         try {
           globaldefs.NameAndStringValue_T aSAPName[] = globaldefs.NamingAttributes_THelper.read (in);
           aSAP.ASAPCreateModifyData_T aSAPModifyData = aSAP.ASAPCreateModifyData_THelper.read (in);
           aSAP.ASAP_THolder newASAP = new aSAP.ASAP_THolder ();
           globaldefs.NVSList_THolder additionalInfo = new globaldefs.NVSList_THolder ();
           this.modifyASAP (aSAPName, aSAPModifyData, newASAP, additionalInfo);
           out = $rh.createReply();
           aSAP.ASAP_THelper.write (out, newASAP.value);
           globaldefs.NVSList_THelper.write (out, additionalInfo.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This allows an NMS to request all the ASAPs of this EMS.
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of ASAPs to return in the 
     * first batch. 
     * <br>aSAP::ASAPList_T aSAPList: First batch of ASAPs. 
     * <br>aSAP::ASAPIterator_I asapIt: Iterator to retrieve the remaining 
     * ASAPs. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 27:  // emsMgr/EMSMgr_I/getAllASAPs
       {
         try {
           int how_many = in.read_ulong ();
           aSAP.ASAPList_THolder aSAPList = new aSAP.ASAPList_THolder ();
           aSAP.ASAPIterator_IHolder asapIt = new aSAP.ASAPIterator_IHolder ();
           this.getAllASAPs (how_many, aSAPList, asapIt);
           out = $rh.createReply();
           aSAP.ASAPList_THelper.write (out, aSAPList.value);
           aSAP.ASAPIterator_IHelper.write (out, asapIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This operation has exactly the same behaviour as getAllASAPs, but 
     * instead of returning the entire object structures, this operation returns 
     * their names. </p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>unsigned long how_many: Maximum number of ASAP names to return in the 
     * first batch. 
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of ASAP 
     * names. 
     * <br>globaldefs::NamingAttributesListIterator_I nameIt: Iterator to 
     * retrieve the remaining ASAP names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br> 
     * As for getAllASAPs().
     **/
       case 28:  // emsMgr/EMSMgr_I/getAllASAPNames
       {
         try {
           int how_many = in.read_ulong ();
           globaldefs.NamingAttributesList_THolder nameList = new globaldefs.NamingAttributesList_THolder ();
           globaldefs.NamingAttributesIterator_IHolder nameIt = new globaldefs.NamingAttributesIterator_IHolder ();
           this.getAllASAPNames (how_many, nameList, nameIt);
           out = $rh.createReply();
           globaldefs.NamingAttributesList_THelper.write (out, nameList.value);
           globaldefs.NamingAttributesIterator_IHelper.write (out, nameIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This service returns an ASAP instance given its name.</p>
     *
     * <br>globaldefs::NamingAttributes aSAPName: Name of the ASAP to retrieve. 
     * <br>aSAP::ASAP_T anASAP: ASAP returned. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when aSAPName does not reference an ASAP  
     *  object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when aSAPName references an ASAP object 
     *  that does not exist<br>
     * <br>
     **/
       case 29:  // emsMgr/EMSMgr_I/getASAP
       {
         try {
           globaldefs.NameAndStringValue_T aSAPName[] = globaldefs.NamingAttributes_THelper.read (in);
           aSAP.ASAP_THolder anASAP = new aSAP.ASAP_THolder ();
           this.getASAP (aSAPName, anASAP);
           out = $rh.createReply();
           aSAP.ASAP_THelper.write (out, anASAP.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p>This operation retrieves the ASAP(s) which are assigned to the addressed 
     * resource. The ASAP list can have zero or more elements, as all resources 
     * but TPs can refer to at most one ASAP. TPs can refer to more ASAPs, at most 
     * as many as the number of encapsulated layer rates.</p>   
     *
     * <br>globaldefs::NamingAttributes_T resourceName: the name of the 
     * resource.
     * <br>transmissionParameters::LayerRateList_T layerRateList: List of TP 
     * layer rates which assigned ASAPs are to be retrieved. If an empty list is 
     * specified, then all ASAPs assigned to the addressed resource will be 
     * replied. The list shall also be empty if the addressed resource is not a 
     * TP.
     * <br>unsigned long how_many: Maximum number of ASAPs to return in the 
     * first batch. 
     * <br>aSAP::ASAPList_T aSAPList: First batch of the ASAP(s) assigned to the 
     * addressed resource.
     * <br>aSAP::ASAPIterator_I asapIt: Iterator to retrieve the remaining ASAPs
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support this operation<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when layerRateList is invalid for the 
     *  addressed resource, i.e. it is not an encapsulated layerRate<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when resourceName references an object that 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case resourceName refers to object not 
     *  supporting ASAP pointer feature<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 30:  // emsMgr/EMSMgr_I/getASAPbyResource
       {
         try {
           globaldefs.NameAndStringValue_T resourceName[] = globaldefs.NamingAttributes_THelper.read (in);
           short layerRateList[] = transmissionParameters.LayerRateList_THelper.read (in);
           int how_many = in.read_ulong ();
           aSAP.ASAPList_THolder aSAPList = new aSAP.ASAPList_THolder ();
           aSAP.ASAPIterator_IHolder asapIt = new aSAP.ASAPIterator_IHolder ();
           this.getASAPbyResource (resourceName, layerRateList, how_many, aSAPList, asapIt);
           out = $rh.createReply();
           aSAP.ASAPList_THelper.write (out, aSAPList.value);
           aSAP.ASAPIterator_IHelper.write (out, asapIt.value);
         } catch (globaldefs.ProcessingFailureException $ex) {
           out = $rh.createExceptionReply ();
           globaldefs.ProcessingFailureExceptionHelper.write (out, $ex);
         }
         break;
       }


  /**
     * <p> This operation retrieves all the resource names (could be TPs, SNCs, 
     * etc.) which point to the addressed ASAP instance. </p>
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>globaldefs::NamingAttributes aSAPName: Name of the ASAP.
     * <br>unsigned long how_many: Maximum number of resource names to return in 
     * the first batch. 
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of resource 
     * names. 
     * <br>globaldefs::NamingAttributesListIterator_I nameIt: Iterator to 
     * retrieve the remaining resource names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when aSAPName does not reference an ASAP 
     *  object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when aSAPName references an ASAP object 
     *  that does not exist<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
       case 31:  // emsMgr/EMSMgr_I/getASAPAssociatedResourceNames
       {
         try {
           globaldefs.NameAndStringValue_T aSAPName[] = globaldefs.NamingAttributes_THelper.read (in);
           int how_many = in.read_ulong ();
           globaldefs.NamingAttributesList_THolder nameList = new globaldefs.NamingAttributesList_THolder ();
           globaldefs.NamingAttributesIterator_IHolder nameIt = new globaldefs.NamingAttributesIterator_IHolder ();
           this.getASAPAssociatedResourceNames (aSAPName, how_many, nameList, nameIt);
           out = $rh.createReply();
           globaldefs.NamingAttributesList_THelper.write (out, nameList.value);
           globaldefs.NamingAttributesIterator_IHelper.write (out, nameIt.value);
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
       case 32:  // common/Common_I/setNativeEMSName
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
       case 33:  // common/Common_I/setUserLabel
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
       case 34:  // common/Common_I/setOwner
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
       case 35:  // common/Common_I/getCapabilities
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
       case 36:  // common/Common_I/setAdditionalInfo
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
    "IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0", 
    "IDL:mtnm.tmforum.org/common/Common_I:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EMSMgr_I _this() 
  {
    return EMSMgr_IHelper.narrow(
    super._this_object());
  }

  public EMSMgr_I _this(org.omg.CORBA.ORB orb) 
  {
    return EMSMgr_IHelper.narrow(
    super._this_object(orb));
  }


} // class EMSMgr_IPOA
