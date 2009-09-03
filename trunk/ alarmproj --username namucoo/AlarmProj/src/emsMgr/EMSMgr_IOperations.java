package emsMgr;


/**
* emsMgr/EMSMgr_IOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� emsMgr.idl
* 2009��9��2�� ������ ����12ʱ51��25�� CST
*/


/**
   * <p>The EMSMgr_I is used to gain access to operations
   * which deal with the EMS itself.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in managerInterface when 
   * the managerName "EMS" is used.</p>
   **/
public interface EMSMgr_IOperations  extends common.Common_IOperations
{

  /**
     * <p>This allows an NMS to request the EMS information.</p>
     * 
     * <br>EMS_T emsInfo : The EMS information.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     * failure<br>
     **/
  void getEMS (emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException;

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
  void getAllMLRAs (int how_many, multiLayerSubnetwork.SubnetworkList_THolder mLRAList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException;

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
  void getAllTopLevelSubnetworks (int how_many, multiLayerSubnetwork.SubnetworkList_THolder sList, multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws globaldefs.ProcessingFailureException;

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
  void getAllTopLevelSubnetworkNames (int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPLinks (boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPLinksWithTP (globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPLinksWithMLSNs (globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPLinksWithTNAs (String[] tNAList, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPs (boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPsWithTP (globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException;

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
  void getAllMLSNPPsWithTNA (String[] tNAList, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException;

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
  void getAllTopLevelTopologicalLinks (int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;

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
  void getAllTopLevelTopologicalLinkNames (int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

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
  void getTopLevelTopologicalLink (globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;

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
  void getAllEMSAndMEActiveAlarms (String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;

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
  void getAllEMSSystemActiveAlarms (notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;

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
  void createTopologicalLink (topologicalLink.TLCreateData_T newTLCreateData, topologicalLink.TopologicalLink_THolder newTopologicalLink) throws globaldefs.ProcessingFailureException;

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
  void deleteTopologicalLink (globaldefs.NameAndStringValue_T[] topoLinkName) throws globaldefs.ProcessingFailureException;

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
  void acknowledgeAlarms (notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws globaldefs.ProcessingFailureException;

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
  void unacknowledgeAlarms (notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws globaldefs.ProcessingFailureException;

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
  void getAllEMSAndMEUnacknowledgedActiveAlarms (String[] excludeProbCauseList, notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;

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
  void getAllEMSSystemUnacknowledgedActiveAlarms (notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, notifications.EventList_THolder eventList, notifications.EventIterator_IHolder eventIt) throws globaldefs.ProcessingFailureException;

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
  void createASAP (aSAP.ASAPCreateModifyData_T newASAPCreateData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

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
  void deleteASAP (globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

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
  void assignASAP (globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

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
  void deassignASAP (globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

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
  void modifyASAP (globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAPCreateModifyData_T aSAPModifyData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

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
  void getAllASAPs (int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException;

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
  void getAllASAPNames (int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

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
  void getASAP (globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAP_THolder anASAP) throws globaldefs.ProcessingFailureException;

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
  void getASAPbyResource (globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException;

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
  void getASAPAssociatedResourceNames (globaldefs.NameAndStringValue_T[] aSAPName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;
} // interface EMSMgr_IOperations
