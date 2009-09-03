package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/MultiLayerSubnetworkMgr_IOperations.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/


/**
   * <p>The multiLayerSubnetworkMgr_I is used to gain access to subnetworks and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public interface MultiLayerSubnetworkMgr_IOperations  extends common.Common_IOperations
{

  /** 
     * <p>This allows an NMS to request a list of the ManagedElements that
     * are associated with a specified Subnetwork.</p>
     * <p>For examples on how ManagedElements are associated with 
     * MultiLayerSubnetworks see
     * <a href=../../../supportingDocumentation/SD1-18_layers.pdfSD1-18_SD1-18_layers.pdf >
     * SD1-18 layering</a>.</p>
     * In a Control Plane context this is retricted to the Bottom Level Routing Area known 
     * as a Routing Node (RN) and it returns the Managed Element that
     * support that Routing Node.
     * When the MLSN represents a MLRA at a different level, the operation
     * is rejected and an exception raised.
     * For more detail in MLSN and MLRA see 
     * <a href=../../../supportingDocumentation/SD1-18_layers.pdfSD1-18_SD1-18_layers.pdf >
     * SD1-18 layering</a> and
     * <a href=../../../supportingDocumentation/ SD1-45_ASONControlPlaneManagement-Primer.pdf> 
     * SD1-45_ASONControlPlaneManagement-Primer</a>.</p> 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork.
     * <br>unsigned long how_many: Maximum number of managed elements to return 
     * in the first batch.
     * <br>managedElement::ManagedElementList_T meList: First batch of managed 
     * elements.
     * <br>managedElement::ManagedElementIterator_I meIt: Iterator to retrieve 
     * the remaining managed elements.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference a 
     *  multiLayerSubnetwork object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references an object that 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS is unable to execute the request
     *  because the subnetName represents a MLRA which is not a Routing Node.
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is
     *  lost, or the EMS is unable to communicate with the Control Plane, the
     *  subnetwork represents a MLRA and communications is required to complete the request.<br> 
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getAllManagedElements (globaldefs.NameAndStringValue_T[] subnetName, int how_many, managedElement.ManagedElementList_THolder meList, managedElement.ManagedElementIterator_IHolder meIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllManagedElements(), but instead of returning the entire object
     * structures, this operation returns their names.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes subnetName: Name of the subnetwork.
     * <br>unsigned long how_many: Maximum number of managed element names to 
     * return in the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of managed 
     * element names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining managed element names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllManagedElements().
     **/
  void getAllManagedElementNames (globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /** UC_4
     * <p>This service returns a Subnetwork given a subnetwork name.</p>
     * <br>globaldefs::NamingAttributes subnetName: Name of the subnetwork to 
     * retrieve.
     * <br>MultiLayerSubnetwork_T subnetwork: Subnetwork structure returned.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference a 
     *  multiLayerSubnetwork object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references a 
     *  multiLayerSubnetwork object that does not exist or which is not available
     *  from Control Plane <br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is
     *  lost, or the EMS is unable to communicate with the Control Plane and the
     *  subnetwork represents a MLRA<br>
     * <br>
     **/
  void getMultiLayerSubnetwork (globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws globaldefs.ProcessingFailureException;

  /**
     * <p> 
     * This service returns a list of TopologicalLinks which exist inside the
     * Subnetwork whose name is passed as a parameter.  For singletons, no
     * topologicalLinks will be returned.  The EMS should report topological links
     * at the "lowest" layer (i.e. closest to physical) about which it has 
     * accurate knowledge. If the MLSN represents a MLRA in the control plane,
     * the operation is 
     * rejected and an exception is raised.</p> 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <p>For details on how topologicalLinks should be modelled see
     * <a href=../../../supportingDocumentation/SD1-18_layers.pdfSD1-18_SD1-18_layers.pdf >
     * SD1-18 layering</a>.</p>
     * 
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the 
     * Subnetwork.
     * <br>unsigned long how_many: Maximum number of topological links to 
     * return in the first batch.
     * <br>topologicalLink::TopologicalLinkList_T topoList: First batch of 
     * topological links.
     * <br>topologicalLink::TopologicalLinkIterator_I topoIt: Iterator to 
     * retrieve the remaining
     * topological links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference a 
     *  multiLayerSubnetwork object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references an object that 
     *  does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS is unable to execute the request
     * because the subnetName represents a MLRA in the control plane.
     * <br>
     **/
  void getAllTopologicalLinks (globaldefs.NameAndStringValue_T[] subnetName, int how_many, topologicalLink.TopologicalLinkList_THolder topoList, topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllTopologicalLinks, but instead of returning the entire object
     * structures, this operation returns their names. 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the 
     * Subnetwork.
     * <br>unsigned long how_many: Maximum number of topological link names
     * to return in the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of 
     * topological link names.
     * <br>globaldefs::NamingAttributesListIterator_I nameIt: Iterator to 
     * retrieve the remaining topological link names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     *  As for getAllTopologicalLinks().
     **/
  void getAllTopologicalLinkNames (globaldefs.NameAndStringValue_T[] subnetName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service returns a subnetwork topological link given its name.</p>
     * 
     * <br>globaldefs::NamingAttributes topoLinkName: Name of the subnetwork 
     *  topological link to retrieve.
     * <br>TopologicalLink_T topoLink: Subnetwork topological link returned.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when topoLinkName does not reference a 
     *  subnetwork topologicallink object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when topoLinkName references a subnetwork 
     *  topological link object that does not exist<br>
     * <br>
     **/
  void getTopologicalLink (globaldefs.NameAndStringValue_T[] topoLinkName, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This allows an NMS to request a list of the edge termination points 
     * (PTPs/FTPs) for the specified subnetwork, at one or more of the NMS-
     * specified layers, and that are capable of containing CTPs that can be 
     * connected at one or more of the NMS-specified
     * connection layer rates.  This operation considers the 
     * capability/flexibility of the TPs, not their current states. If the MLSN
     * represents a MLRA, the operation is rejected and an exception raised.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T tpLayerRateList: List of TP 
     * layer rates for which the edge points are to be fetched. An edge point 
     * must contain at least one of the layer rates specified to be reported.  If 
     * the list is empty then edge points of all rates are returned.
     * <br>transmissionParameters::LayerRateList_T connectionLayerRateList: List 
     * of connection layer rates for which the edge points are to be fetched. An 
     * edge point must support connections for at least one of the
     * layer rates specified to be reported.  If the list is empty then edge 
     * points for all connection rates are returned.
     * <br>unsigned long how_many: Maximum number of edge points to return in 
     * the first batch.
     * <br>terminationPoint::TerminationPointList tpList: First batch of edge 
     * points.
     * <br>terminationPoint::TerminationPointIterator_I tpIt: Iterator to 
     * retrieve the remaining edge points.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference a 
     *  multiLayerSubnetwork object,or tpLayerRateList or connectionLayerRateList 
     *  contain undefined values<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references an object that 
     *  does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS is unable to execute the request
     * because the subnetName represents a MLRA in the control plane.
     * <br>
     **/
  void getAllEdgePoints (globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllEdgePoints(), but instead of returning the entire object structures,
     * this operation returns their names.</p> 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T tpLayerRateList: List of TP 
     * layer rates for which the edge points are to be fetched. An edge point must 
     * contain at least one of the layer rates specified to be reported.  If the 
     * list is empty then edge points of all rates are returned.
     * <br>transmissionParameters::LayerRateList_T connectionLayerRateList: List 
     * of connection layer rates for which the edge points are to be fetched. An 
     * edge point must support connections for at least one of the
     * layer rates specified to be reported.  If the list is empty then edge 
     * points for all connection rates are returned.
     * <br>unsigned long how_many: Maximum number of edge points to return in 
     * the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of edge 
     * point names.
     * <br>globaldefs::NamingAttributesIterator_I tpIt: Iterator to retrieve the 
     * remaining edge point names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllEdgePoints().
     *
     **/
  void getAllEdgePointNames (globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns a list of PSR (UPSR or SNCP) associated termination 
     * points for the TP whose name is passed as a parameter.</p> 
     *
     * <p>To create an SNC between CTPs in a TOPO_OPEN_PSR for instance, the NMS 
     * needs to have two zEnd CTPs which are in the same SONET or SDH timeslot. 
     * The service allows the NMS to query the associated CTP of a given CTP, 
     * associated PTP given a PTP or associated FTP of a given FTP. 
     * The timeslot of the TPs will be the same in the
     * case of a TOPO_OPEN_PSR subnetwork, but the names of the
     * two TPs will be different.
     * This operation is symmetric on the associated TPs.
     * Given a working TP, the associated TP will be the protecting TP.</p>
     * <p>Note: The termination point name must be explicit (a generic endpoint 
     * specification may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming.</p>
     *
     * <p>When this service is invoked with a TP that is not an edge point, the 
     * returned TPs will be on the same Managed Element.</p>
     *    
     * <p>See terminationPoint::TPProtectionAssociation_T .</p>
     *
     * <br>globaldefs::NamingAttributes tpName: The name of the TP for which to 
     * retrieve associated TPs.
     * <br>terminationPoint::TerminationPointList_T tpList: The PSR associated 
     * TPs.  If there are no PSR associated TPs, then an empty list is returned.  
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tpName does not reference a CTP, FTP or 
     *  PTP.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references a CTP, FTP or PTP 
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * <br>
     **/
  void getAssociatedTP (globaldefs.NameAndStringValue_T[] tpName, terminationPoint.TerminationPointList_THolder tpList) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This method allows the NMS to query the TP pPool <--> TP/GTP 
     * associations.</p>
     *
     * <p>If a TPPool name is supplied, the method will return the names of all 
     * the TPs/GTPs that have been grouped to the supplied TPPool.</p>
     *
     * <p>If a TP/GTP name is supplied, the method will return the names of any 
     * associated TPPools. An empty list is
     * returned if no associated TP pools exist for the input TP/GTP, or if no 
     * TPs/GTPs have been grouped to the input TP pool.</p>
     * 
     * <p><b>Note 1.</b> Any termination point name must be explicit (a generic 
     * endpoint specification must not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming and for details on 
     * general TP/GTP and TP pool naming.</p>
     *
     * <p><b>Note 2.</b>  A TP/GTP can be a member of at most one TPPool.
     * A TP/GTP is associated to a TPPool (TP/GTP --> TPPool) by admission
     * as a member (TP/GTP is a member of TPPool).</p>
     *
     * <br>globaldefs::NamingAttributes tpName: The name of the TP pool or
     * TP or GTP for which to retrieve the association.
     * <br>unsigned long how_many: Maximum number of "contained" TP names,
     * GTP names or "associated" TP pool names to return in the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of 
     * "contained" TP names, GTP names or "associated" TP pool names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: 
     * Iterator to retrieve the remaining "contained" TP names, GTP names 
     * or "associated" TP pool names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tpName does not reference a TP, GTP or 
     *  TPPool object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references a TP/GTP to TP pool 
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getTPGroupingRelationships (globaldefs.NameAndStringValue_T[] tpName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This allows an NMS to request a list of the SNCs for the
     * specified Subnetwork at the specified
     * connectionRates. If the context is a MLRA, the operation is rejected and an
     * exception is raised.
     *
     * This operation also returns bundled SNCs, if any (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * List of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to be reported in the 
     * first batch.
     * <br>subnetworkConnection::SubnetworkConnectionList_T sncList: First batch 
     * of SNCs.
     * <br>subnetworkConnection::SNCIterator_I sncIt: Iterator to retrieve the
     * remaining SNCs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference an 
     *  multiLayerSubnetwork object or connectionRateList contains undefined 
     *  values<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references object which 
     *  does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the subnetName represents a MLRA.
     * <br>
     **/
  void getAllSubnetworkConnections (globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllSubnetworkConnections(), but instead of returning the entire object
     * structures, this operation returns their names. 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * List of rates of the SNC names to be reported.
     * If an empty list is specified, then all SNC names of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNC names to be reported in 
     * the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of SNC 
     * names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining SNC names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllSubnetworkConnections().</a>.
     **/
  void getAllSubnetworkConnectionNames (globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This allows an NMS to request a list of the SNCs using the
     * specified termination point at the specified connection rates. 
     * In case the addressed TP is actually included in more than one multi-layer subnetwork, 
     * then only SNCs that are in an MLSN that does not represent an MLRA are returned by this operation. 
     * For example if a request is made for VC4 and VC12 SNCs in  case 
     * where the VC4 layer is controlled by the Control Plane and the VC12 layer 
     * is controlled by a traditional NMS then only VC12 SNCs will be returned 
     * regardless of the presence of VC4 connectivity. </p>
     * <p>A snc is using the specified TP if any of its routes, intended and/or
     * backup, in any 
     * state, use this TP. A TP may be a PTP in which case a full list of SNCs 
     * using any of its contained CTPs is required. A TP may be:<ul>
     * <li> a CTP, in which case SNCs using that CTP or any of its contained 
     * CTPs are required. This includes SNCs in which any of the referenced 
     * CTPs participate that match the specified connection rate filter and 
     * bundled SNCs that are associated with any GTPs in which any of the 
     * referenced CTPs are grouped.</li> 
     * <li> an FTP, in which case a full list of SNCs using the 
     * FTP or any of its contained CTPs is required. This includes SNCs in which 
     * the FTP or any of the referenced CTPs participate that match the specified 
     * connection rate filter and bundled SNCs that are associated with any GTPs 
     * in which any of the referenced CTPs are grouped.</li>
     * <li> a GTP, in which case the bundled SNCs in which that GTP has a role are 
     * required. The layerRate is set to LR_Not_Applicable</li></ul></p>
     * <p>Both end CTPs/FTPs/GTPs and intermediate CTPs/FTPs/GTPs are considered. 
     * (see also <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC 
     * overview</a> for further details).</p>
     *
     * <p>All legs of a broadcast system can be retrieved using this operation 
     * where the source TP of the broadcast system is used as input to the 
     * operation.The output will be the list of individual SNCs that make up the 
     * broadcast system.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpName: Termination point for which
     * to report SNCs. The termination point name must be explicit (a generic 
     * endpoint specification may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming.
     *
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * The list of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to report in the first 
     * batch.
     * <br>subnetworkConnection::SubnetworkConnectionList_T sncList:  First 
     * batch of SNCs.An SNC is only reported if it respects both the tpName and 
     * connectionRateList filters.
     * <br>subnetworkConnection::SNCIterator_I sncIt: Iterator to retrieve the 
     * remaining SNCs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if tpName does not reference a 
     *  terminationPoint object or connectionRateList contains undefined 
     *  values<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references an object that does 
     *  not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is #
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     **/
  void getAllSubnetworkConnectionsWithTP (globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllSubnetworkConnectionsWithTP(), but
     * instead of returning the entire object structures, this operation returns 
     * their names.</p>
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpName: Termination point for which
     * to report SNCs. The termination point name must be explicit (a generic 
     * endpoint specification may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming.
     *
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * The list of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to report in the first 
     * batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of SNC 
     * names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining SNC names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllSubnetworkConnectionsWitTP().
     **/
  void getAllSubnetworkConnectionNamesWithTP (globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service returns the route for the SNC whose name is specified 
     * as a parameter. This operation also works for bundled SNCs. In the case of 
     * a bundled SNC, the EMS returns the route betweens GTPs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p> 
     * If the SNC represents a Connection in the Control Plane, the operation is
     * rejected and an exception is Raised. 
  
     *
     * <p>The route information, in the form of crossconnects, should identify the 
     * resources allocated to the SNC at the time of the request and the way in 
     * which these resources are used. For example, for a resilient SNC that is 
     * implemented in the subnetwork using subnetwork connection protection, all 
     * details of the route including normal and alternative paths should be 
     * provided. If the SNC is using some form of dynamic
     * rerouting then it is clearly acceptable that the route include only the 
     * single thread of crossconnections that is supporting the traffic (as there 
     * may be many alternative potential paths that could be selected).</p>
     *
     * <p>The NMS specifies if it wants to retrieve only resources in the layer of 
     * the SNC (the CCs that belong to the SNC), or higher order CCs also (the CCs 
     * of other SNCs that are used to carry the traffic of the queried SNC).  The 
     * ability to retrieve higher order CCs is optional.</p>
     *
     * <p>All cross-connections allocated to the SNC must be returned, even if 
     * they are not active in the managed elements.  This allows the NMS to query 
     * the route that will be used before activating an SNC.</p>
     *
     * <p>If the SNC has more alternative routes, then it retrieves the intended 
     * route if the SNC is pending or partial, otherwise it retrieves the active 
     * route. This because there can be more partial routes and no active route, 
     * in such case the intended route is replied, as it is not known which of the 
     * partial routes is the candidate for becoming the active route.</p>
     *
     * See <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for detail on additional information
     * for SNCs, cross connections and TPs.</p>
     * <br>globaldefs::NamingAttributes sncName: The name of the SNC.
     * <br>boolean includeHigherOrderCCs: Specifies whether the higher order CCs 
     * of other SNCs used to carry the queried SNC have to be included in addition 
     * to the CCs of the queried SNC.
     * <br>subnetworkConnection::Route_T route: The route of the SNC.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when sncName does not reference a 
     *  subnetworkConnection object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName references an SNC object that 
     *  does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the provided value for 
     *  includeHigherOrderCCs is "True" and EMS is not able to provide higher 
     *  order CCs in the reply. Raised if the sncName represents a
     *  Connection in the control plane<br>
     * <br>
     **/
  void getRoute (globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>Like getRoute(), 
     * this service returns the route, in terms of crossconnects, for the SNC 
     * whose name is specified as a parameter. This service also returns the list 
     * of topological links for that SNC that are used in the route.</p>
     * If the SNC represents a Connection in the Control Plane, the operation is
     * rejected and an exception is Raised.
     *
     * <p>All topological links that the traffic of the SNC travel across are 
     * returned including the links that connect to the terminating PTP and/or TP 
     * containing the termination TP.</p> 
     * 
     * <p>The route information, in the form of crossconnects, should identify the 
     * resources allocated to the SNC at the time of the request and the way in 
     * which these resources are used. For example, for a resilient SNC that is 
     * implemented in the subnetwork using subnetwork connection protection, all 
     * details of the route including normal and alternative paths should be 
     * provided. If the SNC is using some form of dynamic rerouting then it is 
     * clearly acceptable that the route include only the single thread of 
     * crossconnections that is supporting the traffic (as there may be many 
     * alternative potential paths that could be selected).</p> 
     * <p>The list of Topological links can be used in conjunction with the 
     * crossconnects to lay out the entire route through the subnetwork.</p> 
     * 
     * <p>Unlike getRoute(), 
     * this service always retrieves resources in all layers that support the 
     * route. This includes all crossconnects of the SNC (i.e. the crossconnects 
     * SNC) and all higher order crossconnects (i.e. the crossconnects of server 
     * SNCs that are used to carry the traffic of the queried SNC).  It also 
     * includes all topological links (at any layer) that any traffic of the SNC 
     * passes across. </p> 
     * 
     * <p>All crossconnects allocated to the SNC must be returned, even if 
     * they are not active in the managed elements.  This allows the NMS to query 
     * the route that will be used before activating the SNC.</p> 
     * <p>If the SNC has more alternative routes, then it retrieves the intended 
     * route if the SNC is pending or partial, otherwise it retrieves the active
     * route. This because there can be more partial routes and no active route, 
     * in such case the intended route is replied, as it is not known which of the 
     * partial routes is the candidate for becoming the active route.</p>
     *
     * <p>In the additionalInfo field of first CrossConnect_T (first XC is the one 
     * involving <b>A1</b> end point of the SNC) record of the replied sequence 
     * the following parameters may be present:<ul>
     * <li>name="RouteId"; value="id"</li>
     * <li>name="RouteIntended "; value="y" | "n" </li>
     * <li>name="RouteActualState"; value="inactive" | "partial" | "active" </li>
     * <li>name="RouteAdminState"; value="locked" | "unlocked"</li>
     * <li>name="RouteInUse";		value="y" | "n"</li>
     * <li>name="RouteExclusive";	value="y" | "n"</li></ul>
     * See <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for detail on additional information
     * for SNCs, cross connections and TPs.</p>
     * 
     * <br>globaldefs::NamingAttributes sncName: The name of the SNC. 
     * <br>subnetworkConnection::Route_T route: The route of the SNC. 
     * <br>topologicalLink::TopologicalLinkList_T topologicalLinkList: The list 
     * of the topological links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when sncName does not reference a 
     *  subnetworkConnection object
     * EXCPT_UNABLE_TO_COMPLY - Raised if the sncName represents a
     *  Connection in the control plane<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName references a 
     *  subnetworkConnection object that does not exist<br>
     * <br>
     **/
  void getRouteAndTopologicalLinks (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.Route_THolder route, topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws globaldefs.ProcessingFailureException;

  /** 
     * <p> This operation will return the SubnetworkConnection structure (which
     * may represent a connection in the Control Plane) for the SNC
     * whose name is supplied as a parameter. This operation
     * will provide a bundled SNC structure if the name provided is that 
     * of a bundled SNC (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p> 
     * <p>This operation also applies to an SNC which represents
     * a connection in the control plane. See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a>. 
     * <br> The EMS is only expected to reply with a SubnetworkConnection structure in the
     * case where the addressed SNC represents a top level connection, with an Originating
     * Point controlled by the EMS, as in all the other cases the EMS may not have access to such information 
  from Control Plane. </p>
     * <br>globaldefs::NamingAttributes_T sncName: The name of the SNC to 
     * retrieve.
     * <br>subnetworkConnection::SubnetworkConnection_T snc: The SNC structure 
     * retrieved.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
      *EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     * failure<br>
     * EXCPT_INVALID_INPUT - Raised when sncName does not reference a 
     *  subnetworkConnection object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName references an SNC object that 
     *  does not exist including the case where the referenced SNC is not in the scope of the Control Plane components accessed via the addressed EMS <br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * <br>
     **/
  void getSNC (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.SubnetworkConnection_THolder snc) throws globaldefs.ProcessingFailureException;

  /**
     * <p> This operation will return the SubnetworkConnection structures 
     * for the SNCs whose userLabel is supplied as a parameter. If the SNC
     * represents a Control Plane Connection, the operation is rejected and an
     * exception is raised. This operation will provide a bundled SNC structure
     * if the name provided is that of a bundled SNC (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p>
     *
     * <p>This operation does not use an iterator, since the number of SNCs
     * returned is expected to be usually 1.</p>
     *
     * <br>string userLabel: The userLabel of the SNCs to retrieve.
     * <br>subnetworkConnection::SubnetworkConnection_T sncList: The SNCs 
     * retrieved.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the userLabel is associated to an snc
     *  Name which represents a Connection in the control plane<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * <br>
     **/
  void getSNCsByUserLabel (String userLabel, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The NMS invokes the createSNC service to request the EMS to create an 
     * SNC given the parameters passed in the method. 
     * This operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p>
     * This operation only applies to SNCs which are not in the context of a
     * Control Plane. If the context is a MLSN of MLRA type,  the operation is 
     * rejected and an exception generated. 
     *
     * <p>Failure : This will throw an exception if it fails.  No SNC object 
     * will be created on the EMS.</p> 
     *
     * <p>Success : SNC is created in the EMS and the SNCState is set to the 
     * appropriate state in the parameter theSNC.  The parameter theSNC will 
     * contain the attributes of the created SNC.</p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a> and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <p>An SNC may be created between any TPs. At a "CM" end point (a G.805 CP) 
     * the span of the SNC starts with a fixed or flexible connection through the 
     * ME at the SNC layer, i.e. the connectable layer of the end point. At an 
     * "LC"end point the span of the SNC starts with a G.805 TCP with mapping mode 
     * set to TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING.</p>
     *
     * <p>This operation may be used to create subnetwork connections. There is 
     * some variety to the form that SNCs may take. Examples of these SNCs are 
     * provided in <a href=../../../supportingDocumentation/SD1-18_layers.pdfSD1-18_SD1-18_layers.pdf >
     * SD1-18 layering</a>. The 
     * following list shows the essence of variety of SNCs. An SNC may be one:<ul>
     * <li>in which CTPs are all cross-connected and their tpMappingMode is set
     * to TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING. In this case G.805
     * trails could be created by the NMS by using setTPData to terminate and map 
     * CTPs that are adjacent to the CTPat the end of subnetwork connections 
     * created by means of createSNC.</li>
     * <li>in which one or more end FTP/CTPs expose G.805 TCPs e.g. CTP type F
     * referenced in <a href=../../../supportingDocumentation/SD1-18_layers.pdfSD1-18_SD1-18_layers.pdf >SD1-18 layering</a>. 
     * If all ends of the SNC terminate on this type of TP then the SNC provides
     * the full route of a G.805 Trail.</li> 
     * <li>in which one or more end CTP offer the capability to terminate and 
     * map and the SNC reaches the end CTP via the PTP/FTP containing the CTP. 
     * In this case the SNC creation also sets the tpMappingMode to
     * TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING as well as creating the 
     * crossconnects. If all ends of the SNC terminate on this type of TP or 
     * any combination of this type of TP and TPs that expose G.805 TCPs (see 
     * above) then the SNC provides the full route of a G.805 Trail.</li>
     * <li>in which an end TP is a PTP (which is effectively permanently
     * "terminated and available for mapping". If all ends of the SNC terminate on 
     * this type of TP or any combination of this type of TP, CTPs offering the
     * capability to terminate and map and TPs that expose G.805 TCPs (see 
     * above) then the SNC provides the full route of a G.805 Trail.</li></ul></p>
     *
     * <p>CreateSNC allows for the creation of either point-to-point
     * connections or legs of point-to-multipoint connections.</p>
     *
     * <p>To add a leg to a broadcast system, the aEnd TP in SNCCreateData_T shall
     * be populated with the common source TP of the broadcast system.
     * Each leg of a broadcast system is a separate SNC and is managed 
     * individually, even though they may share cross-connects.
     * </p>
     *
     * <p>To create a broadcast system from a Point to Point SNC, the aEnd of the
     * Point to Point SNC is used as the aEnd TP in TPDataList_T.</p>
     *
     * <p>If an existing SNC respects all the conditions described in createData, 
     * then the EMS is allowed to return that existing SNC.  It is also allowed 
     * for the EMS to attempt to create a different SNC as explained below.  The 
     * rest of the description below applies to the cases where the EMS decides to 
     * create a new SNC.</p>
     *
     * <p>If the NMS specifies a routing constraint in the request, then the EMS 
     * must respect the specified constraint even if there are pending, partial, 
     * or active SNCs using the required parts of the route.</p>
     * 
     * <p>The SNC is created with its intended route, in locked state. By means of 
     * other operations it is possible to add (then remove) additional routes for 
     * restoration purposes. By means of additional info, it is possible to 
     * specify if the intended route is EXCLUSIVE or not; if EXCLUSIVE, then the 
     * EMS must find a route that does not conflict or share CCs or TPs with any 
     * other existing SNC route, in any administrative state. Once an EXCLUSIVE 
     * (intended) route has been created by EMS, any further creation operation 
     * which conflicts with the exclusive route shall be refused.</p>
     *
     * <p>The EMS tries to find a route for the request and if found
     * returns the SubnetworkConnection_T structure back to the NMS with the 
     * members set to the appropriate values.  The EMS should attempt to find a 
     * route that does not conflict or share CCs with any other existing SNC, 
     * before it resorts to creating a conflicting SNC or an SNC that shares 
     * CCs.</p>
     *
     * <p>If the TPs at the Aend and the Zend are already
     * in use by another SNC, the EMS may still create the SNC
     * or EXCPT_OBJECT_IN_USE or EXCPT_TIMESLOT_IN_USE may be thrown,
     * depending on its mode of operation.</p>
     *
     * <p>If there already exists
     * between the same termination points and with the same directionality and 
     * type, another SNC that is in the partial state, the EMS will still attempt 
     * to create the new SNC. If no constraint is specified, the EMS should   
     * attempt to find a different path. If constraints are specified, then the 
     * EMS attempts to create the SNC with an appropriate route.</p>
     *
     * <p>If a route cannot be found, the SNC is <b>not</b> created in the EMS 
     * and the EXCPT_UNABLE_TO_COMPLY exception 
     * is thrown (unless a more precise exception applies), indicating the 
     * reason.</p>
     *
     * <p>Depending on the SNC management mode of operation, it is acceptable for 
     * an EMS to not implement this service in which case 
     * the EXCPT_NOT_IMPLEMENTED exception is thrown.</p>
     * 
     * <p>VC SNCs are normally created over a VP network. Therefore, the VPI 
     * numbers of the VC SNCs specified with createData should match existing 
     * terminated and mapped VP CTPs. If a VPI number does not match an existing 
     * VP CTP, then the EMS may create the VP CTP as 'TERMINATED and MAPPED' if 
     * emsFreedomLevel allows it. 
     * Such a VP CTP is created with no traffic parameters. Note that such
     * automatic creation of resourceless terminated VP CTPs depends on the 
     * capability of the EMS and/or the ATM NE to support VC connections directly 
     * on ATM links (i.e., with no VP overlay network).</p>
     * 
     * <p>An NMS can request the EMS to create an ATM network routed SNC (VP or VC 
     * layer rates); the EMS will then manage the subnetwork connection as a soft 
     * PVC. The soft PVC may be completely or partially defined with regards to 
     * its source and destination TPs. The aEnd will, by definition, be the 
     * source of the Soft PVC (i.e., the originator of the call)
     * and the zEnd will be the destination (i.e., being called). In order
     * to allow the NMS to manage Soft PVCs that may have only their source 
     * TPs in the subnetwork, the ctpName parameter from TPDataList zEnd 
     * will be used to either specify the VPI and/or VCI value of the destination 
     * CTP (including EMS, managedElement, PTP/FTP and ATM_NI a.k.a., the full 
     * location in the physical ATM NE)or the address of the ATM interface on 
     * which the call will terminate and optionally the VPI/VCI values if they are 
     * specified/known by the NMS (but not the complete physical location of the 
     * VP or VC TP).<p>
     *
     * <p>Note that all SNC state transitions (including to/from PENDING and 
     * PARTIAL) are applicable to ATM VPCs and VCCs. However, the PARTIAL state 
     * should only apply to plain PVCs (intermediate CTPs of a Soft PVC are 
     * automatically created and deleted by the network elements and they do not 
     * usually notify the EMS).</p>
     *
     * <br>SNCCreateData_T createData: structure describing the subnetwork 
     * connection to be created.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the creation.
     * <br>SubnetworkConnection_T theSNC:
     * The newly created SNC.  It will have sncState and name set.  The EMS 
     * selects the SNC names so that they are not reused (within a reasonable time 
     * frame) for different SNCs.
     * <br>string errorReason: Specifies the creation error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactically 
     *  incorrect (e.g. field of createData is invalid). If an 
     *  NMS requests a bundled SNC service such that the GTP endpoints of the SNC 
     *  do not match, i.e., the GTPs do not have the same number of CTPs and in a 
     *  particular order with respect to their layerRates or are not of the same 
     *  layer rate, then the EMS shall raise EXCPT_INVALID_INPUT.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when fields of createData refer to an 
     *  object that does not exist<br>
     * EXCPT_PROTECTION_EFFORT_NOT_MET - Raised if the NMS requests an SNC
     *  with a static protection level and protection effort that cannot be met by 
     *  the EMS<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS is unable to find an appropriate
     *  route for the SNC or the context is a MLSN of MLRA type<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified (E.g. involving shutting down PTPs)<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_OBJECT_IN_USE - Raised if the intended route is in conflict with an 
     *  "exclusive"  route of another SNC.
     * <br>
     **/
  void createSNC (subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service is used to put an SNC into the ACTIVE state.
     * This operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the SNC represents a Control Plane Connection,
     * the operation is rejected and an exception is raised.</p>
     * 
     * <p><i>Success:</i> SNCState in the parameter theSNC is set to SNCS_ACTIVE.  
     * All cross-connects required for the SNC were activated successfully.
     * The errorReason parameter is set to an empty string.</p>
     *
     * <p><i>Failure:</i> No exception thrown, except in the cases listed below.
     * If the SNC or any of its network resources have changed as a result of this 
     * operation, then no exception can be
     * thrown so that theSNC can be passed back to the NMS.
     * The SNCState in resulting theSNC will be either SNCS_PARTIAL or 
     * SNCS_PENDING. The state will be SNCS_PARTIAL if not all
     * cross-connects on MEs have been successfully set up.  The state will be 
     * SNCS_PENDING if the EMS mode of operation prevents the activation of the 
     * SNC. The errorReason parameter is set accordingly.</p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a> and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <p> During activation of an SNC, the TPs of the SNC are configured, and the 
     * necessary cross-connects are established for the SNC and appropriate 
     * changes are made to tpMappingMode such that TPs that are not TP_NA have 
     * their tpMappingMode set appropriately for the SNC configuration. See also 
     * createSNC() for an explanation of tpMappingMode behaviour. An SNC can be 
     * activated while in any state. When activated that additional information
     * provided during the creation is also applied to the SNC in the network.</p>
     *
     * <p>In case of an ATM SNC (VP or VC), multiple termination points (VP 
     * CTP or VC CTP) can be created as a result of an activateSNC 
     * operation. These CTPs are all created/adjusted
     * in compliance with the egress and ingress traffic parameters provided in 
     * the tpsToModify structure. For example, a non terminated VP SNC created 
     * over 3 managed elements will result, upon activation, in the usage of 6 VP 
     * CTPs and 3 VP cross-connections.</p>
     *
     * <p>Note that the activateSNC operation can be called repeatedly and 
     * eventually should succeed (except in conflict
     * cases where the SNC remains in SNCS_PENDING or SNCS_PARTIAL).
     * Should the missing cross-connects be activated in the MEs via 
     * a craft interface, for example, prior to communications to those MEs
     * being re-established, the activateSNC command ultimately should 
     * succeed when communication to the MEs is re-established 
     * (even though all cross-connects already exist).</p>
     * 
     * <p>The EMS will apply the transmissionParams specified 
     * in the tpsToModify parameter (same behaviour as
     * managedElementManager::ManagedElementMgr_I::setTPData().
     * They may be applied before or after the creation of the CCs, as 
     * appropriate. Existing TP transmission parameters for which no changes
     * were requested in tpsToModify will be left unchanged.
     * However, the alarm reporting on the TPs and the containing TPs
     * may be turned on by the EMS as part of this request,
     * unless otherwise specified via the transmission parameter
     * "AlarmReporting".  A similar behaviour is also allowed for the serviceState 
     * parameter, which may be set to IN_SERVICE for the TPs and the 
     * containing TPs. See <a href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     * transmissionParameters</a>.
     * </p>
     * 
     * <p>If a given entry in the list of transmission parameters specified in
     * the TPData_T can not be successfully applied to the TP, for any reason, 
     * then the errorReason field is appended with an appropriate reason text.
     * Applying transmission parameters is best-effort (where not stated 
     * otherwise) and the resulting values of the transmission parameters are 
     * provided in the updated tpsToModify parameter. If the parameter is "not 
     * best effort" then the whole operation will be rejected and the appropriate 
     * exception thrown (see exceptions below).</p>
     *
     * <p>An already active SNC
     * can be activated again; the EMS is allowed to not send the 
     * commands to the ME a second time for the cross connect establishment 
     * however the commands may be sent for the transmission parameters.
     * While in SNCS_PARTIAL state, it is possible to activate an SNC again, this 
     * corresponds to a retry. </p>
     *
     * <p>This service is used to put an SNC into the ACTIVE state. More 
     * precisely, all the SNC routes, intended and backup, if any, are unlocked. 
     * The restoration process will take control of the unlocked routes and 
     * activate the proper one. The behavior of sncState is the same in case there 
     * is only one route or more routes of the SNC.</p>
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection to 
     * be deactivated.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed.
     * <br>EMSFreedomLevel_T emsFreedomLevel: The maximum level of freedom 
     * allowed to the EMS to perform the activation.<br>
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters to apply, 
     * updated to provide the resulting parameters.
     * <br>SubnetworkConnection theSNC: The subnetwork connection after the 
     * operation.
     * <br>string errorReason: Specifies the activation error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this service; 
     *  this is only allowed if the EMS does not support the PENDING state and if 
     *  the PARTIAL state is unreachable<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object or any field in 
     *  tpsToModify is invalid)<br>
     * EXCPT_OBJECT_IN_USE - Raised if the SNC can not be activated because of CC, 
     *  or TP conflicts or conflicts between the active route (with equal or 
     *  higher priority) of this and other SNCs or when CC creation would involve 
     *  a TP that has an existing fixed CC that does not match that required for 
     *  the SNC.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised if sncName or tpsToModify reference an 
     *  SNC/TP object that does not exist.<br>
     * EXCPT_TIMESLOT_IN_USE - (Obsolete - EXCPT_OBJECT_IN_USE should be used) 
     *  Raised if the SNC can not be activated because of timeslot conflicts with 
     *  other SNCs. <br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC is in PENDING state and is in 
     *  conflict with another ACTIVE or PARTIAL SNC. Raised when the EMS is unable 
     *  to execute the request because at least one of the parameters although 
     *  valid can not be set and that parameter is identified as "not best effort" 
     *  in the <a href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the
     *  <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the SNC cannot be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. Raised if the SNC name references a Connection in the Control
     *  Plane. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents any change to the SNC<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised where the SNC would involve a CTP that is
     *  not connectable due to the state of the server TP or in the case of 
     *  inverse multiplexing where the SNC would involve a CTP that is not 
     *  connectable due to the state of the client TP.
     *  (Obsolete usage - EXCPT_OBJECT_IN_USE should be used instead for the case 
     *  where an exception is raised if the SNC is in conflict
     *  with another active or partial SNC and can not be created.)<br>
     * <br>
     **/
  void activateSNC (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation provides a way to create and activate a
     * subnetwork connection in one command. As with the createSNC()
     * operation and the activateSNC()
     * operation, this operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the SNC represents a Control Plane Connection,
     * the operation is rejected and an exception is raised.</p>
     *
     * <p>It conceptually behaves like a call to createSNC followed by a call to 
     * activateSNC. Therefore, if the pending state is supported, it is possible 
     * for the SNC to be created but activation to be rejected, and the resulting 
     * SNC will be in pending state. If the pending state is not supported, then 
     * this is not possible and the SNC will not be created if activation is 
     * rejected. All success/failure conditions
     * that apply to the two base operations also apply to the combined
     * operation.</p>
     *   
     * <p>If the SNC or any of its network resources have changed as a result of 
     * this operation, then no exception can be thrown so that theSNC can be 
     * passed back to the NMS. Therefore, the exceptions that apply to activateSNC 
     * may not apply to the combined operation: if the creation was successful but 
     * the activation is rejected (only possible if the pending state is 
     * supported),no exception shall be thrown and the resulting SNC shall be 
     * provided in the out parameter theSNC.</p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a>
     * and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <br>SNCCreateData createData: structure describing the SNC to be created 
     * and activated.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the creation and activation.
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters to 
     * apply, updated to provide the resulting parameters. 
     * <br>SubnetworkConnection theSNC: the resulting SNC.  
     * It will have sncState and name set. The EMS selects the SNC names so that 
     * they are not reused (within a reasonable time frame) for different SNCs.
     * <br>string errorReason: Specifies the creation and/or activation error(s) 
     * if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. a field of createData is invalid or any field in 
     *  tpsToModify is invalid). If an NMS requests a bundled SNC 
     *  service such that the GTP endpoints of the SNC do not match, i.e., the 
     *  GTPs do not have the same number of CTPs and in a particular order with 
     *  respect to their layerRates or are not of the same layer rate, then the 
     *  EMS shall raise EXCPT_INVALID_INPUT.<br>. 
     * EXCPT_OBJECT_IN_USE - Raised if the SNC can not be created and activated 
     *  because of CC or TP conflicts or conflicts between the active route (with 
     *  equal or higher priority) of this and other SNCs or when CC creation would 
     *  involve a TP that has an existing fixed CC that does not match that 
     *  required for the SNC.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when fields of createData or tpsToModify 
     *  reference objects that do not exist.<br>
     * EXCPT_TIMESLOT_IN_USE - (Obsolete - EXCPT_OBJECT_IN_USE should be used)
     *  Raised if the SNC can not be created and activated 
     *  because of timeslot conflicts with other SNCs<br>
     * EXCPT_PROTECTION_EFFORT_NOT_MET - Raised if the NMS requests an SNC with a 
     *  static protection level and protection effort that cannot be met by the 
     *  EMS<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC represents a Connection in
     *  the Control Plane. Raised if the EMS is unable to find a route for 
     *  the SNC. Raised if the EMS can not meet the GradesOfImpact requested by
     *  the NMS. Raised when the EMS is unable to execute the request because at 
     *  least one of the parameters although valid can not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the
     *  <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the SNC cannot be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents creation of the SNC<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised where the SNC would involve a CTP that is
     *  not connectable due to the state of the server TP or in the case of 
     *  inverse multiplexing where the SNC would involve a CTP that is not 
     *  connectable due to the state of the client TP.
     *  (Obsolete usage - EXCPT_OBJECT_IN_USE should be used instead for the case 
     *  where an exception is raised if the SNC is in conflict
     *  with another active or partial SNC and can not be created.)<br>
     * <br>
     **/
  void createAndActivateSNC (subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>Deactivating an SNC implies deletion in the ME of all the non-shared 
     * cross-connects that belong to this SNC and makes appropriate changes to 
     * tpMappingMode such that TPs that are not TP_NA have their tpMappingMode
     * set to TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING as a result of this 
     * operation. See also createSNC(),
     * for an explanation of tpMappingMode behaviour.
     * The ports are left in the same state and are not put out of 
     * service.</p>
     *
     * <p>This operation applies to SNCs and bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the SNC represents a Control Plane Connection, the operation is
     * rejected and an exception raised.</p>
     *
     * <p>Failure - No exception thrown (except for cases described below).
     * If the SNC or any of its network resources have changed as a result of this 
     * operation, then no exception can be
     * thrown so that theSNC can be passed back to the NMS.
     * The SNCState will be either SNCS_PARTIAL 
     * if the command partially completed or SNCS_ACTIVE if no cross-connects were 
     * deleted.  The errorReason will be detailed accordingly.</p>
     *
     * <p>Success - SNC is deactivated in the EMS and the SNCState is 
     * set to SNCS_PENDING in the out parameter theSNC. The parameter theSNC will 
     * contain the attributes of the deactivated SNC. 
     * The errorReason parameter may be set to an empty string.</p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a> and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <p>The EMS will apply the transmissionParams specified 
     * in the tpsToModify parameter (same behaviour as
     * setTPData()).
     * They may be applied before or after the creation of the CCs, as 
     * appropriate. See <a href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     * transmissionParameters</a>.</p>
     * 
     * <p>If a given entry in the list of transmission parameters specified in
     * tpsToModify can not be successfully applied to the TP, for any reason, 
     * then the errorReason field is appended with an appropriate reason text.
     * Applying transmission parameters is best-effort (where not stated 
     * otherwise) and the resulting values of the transmission parameters
     * are provided in the updated tpsToModify parameter. If the parameter is "not 
     * best effort" then the whole operation will be rejected and the appropriate 
     * exception thrown (see exceptions below).</p>
     *
     * <p> Existing TP transmission parameters for which no changes
     * were requested in transmissionParams will be left unchanged. 
     * However, the alarm reporting on the TPs and the containing TPs
     * may be turned off by the EMS
     * as part of this request, unless otherwise specified via the transmission 
     * parameter "AlarmReporting".</p>
     * 
     * <p>An already deactivated SNC
     * can be deactivated again with success (the EMS is allowed to not send the
     * commands to the ME a second time however).
     * While in SNCS_PARTIAL state, it is possible to deactivate an 
     * SNC again, this corresponds to a retry.</p>
     *
     * <p>If the SNC has more alternative routes, then the operation locks all the 
     * SNC routes, intended and backup.</p>
     *
     * <p>In case of a VP or VC SNC, this operation implies deletion in the ME of
     * all the non-shared VP or VC CTPs and VP or VC cross-connections 
     * involved in the SNC.
     * Note that in the case of a VC SNC deactivation, only the VC CTP and VC
     * cross-connections are normally deleted. VP CTPs must be explicitly
     * deleted using deactivateSNC on the VP SNC, except when emsFreedomLevel 
     * allows it. In that case, the VP CTP can be 
     * deleted along with the VC SNC if the VP CTP no longer contains any VC 
     * CTPs.</p>
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection to 
     * be deactivated.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed. Indicates the amount of traffic disruption that the NMS user is 
     * willing to tolerate as a result of the deactivation request.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the deactivation.
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters to apply, 
     * updated to provide the resulting parameters.
     * <br>SubnetworkConnection_T theSNC: the deactivated subnetwork connection.
     * <br>string errorReason: Specifies the deactivation error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - - Raised when any input parameter is syntactical 
     *  incorrect <br> 
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or tpsToModify reference an 
     *  object that does not exist.<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC is fixed and can not be 
     *  deactivated or the SNCName references a Connection in the Control Plane.
     *  Raised when the EMS is unable to execute the request because 
     *  at least one of the parameters although valid can not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document (such that the TPs will be 
     *  left in an invalid state after the deactivate operation)<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents the deactivation of the SNC<br>
     * <br>
     **/
  void deactivateSNC (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     *<p>This service allows an NMS to request the deletion of a 
     * SubnetworkConnection on a specified subnetwork.
     * This operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the SNC represents a Control Plane Connection,
     * the operation is rejected and an exception is raised. </p>
     *
     * <p>To delete a leg from a broadcast system, the subnetworkConnection 
     * that represents the leg is used as input to the deleteSNC operation.</p>
     *
     * <p>The SNC must not be in the active or partial state.</p>
     *
     * <p> If the SNC has more alternative routes, then the operation deletes the 
     * SNC, its intended and all bkp route(s).</p>
     *
     * <p>Failure - An exception will be thrown if the operation fails.  The SNC 
     * object will not be deleted on the EMS.  The errorReason field of the 
     * exception will contain the reason for the failure.</p>
     *
     * <p>Success - The SNC object is deleted on the EMS.</p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a> and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection to 
     * be deleted.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the deletion.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object)<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName references an object that does 
     *  not exist<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised if the SNC is in the partial or active 
     *  state<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC represents a Connection in the
     *  Control Plane.
     * <br>
     **/
  void deleteSNC (globaldefs.NameAndStringValue_T[] sncName, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation provides a way to deactivate and then delete a 
     * subnetwork connection in one operation. As with the deactivateSNC(),
     * operation and the deleteSNC()
     * operation, this operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the SNC represents a Control Plane Connection, the operation is
     * rejected and an exception is raised.</p>
     *
     * <p>It conceptually behaves like a call to deactivateSNC followed by a call 
     * to deleteSNC. All success/failure conditions that apply to the two base 
     * operations also apply to the combined operation.  
     * If the SNC or any of its network resources have changed as a result of this 
     * operation, then no exception can be thrown so that theSNC can be passed 
     * back to the NMS. Therefore, the exceptions that apply to deleteSNC may not 
     * apply to the combined operation: if the deactivation changed the SNC but 
     * the deletion is rejected,no exception should be thrown and the resulting 
     * SNC should be provided in the out parameter theSNC.</p>
     *
     * <p>The parameter theSNC
     * will identify the SNC after the combined operation.
     * If the operation is entirely successful,
     * sncState will be SNCS_NONEXISTENT.
     * In that case, this object does not exist on the EMS and the NMS should only 
     * look at sncState.  This work around is so that the NMS can have a 
     * combined operation. </p>
     *
     * <p>For more details on how this service affects the state of an SNC see
     * <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management Modes 
     * of Operation</a> and
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a>.</p>
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection to 
     * be deactivated and deleted.
     * <br>GradesOfImpact_T tolerableImpact:
     * indicates the amount of traffic disruption that the NMS user is willing
     * to tolerate as a result of the deactivation and deletion request.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the deactivation and deletion.
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters to apply, 
     * updated to provide the resulting parameters.
     * <br>SubnetworkConnection theSNC: the deactivated and deleted subnetwork 
     * connection.
     * <br>string errorReason: Specifies the deactivation and/or deletion 
     * error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object or any field in 
     *  tpsToModify is invalid)<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or tpsToModify reference an 
     *  object that does not exist.<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC is fixed and can not be 
     *  deactivated or it represents a connection on the Control Plane. Raised
     *  when the EMS is unable to execute the request because at least one
     *  of the parameters although valid can not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document (such that the TPs will be 
     *  left in an invalid state after the deactivate operation)<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents the deactivation of the SNC<br>
     * <br>
     **/
  void deactivateAndDeleteSNC (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The NMS uses this operation to check if it is possible to
     * create and maybe activate an SNC as specified in the input parameters.
     * This operation also applies to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details). If the context is a MLSN of MLRA type, the operation 
     * is rejected and an exception is raised.</p>
     *
     * <p>The test should check for the existence of hardware that will support
     * the requested SNC.  If the considerResources parameter is false, the check
     * must be independent of the current specific resource usage in the 
     * subnetwork (as in createSNC).  If the
     * considerResources parameter is true, the check must consider the
     * current specific resource usage in the subnetwork (as in activateSNC);
     * in that case, the rules of the EMS' mode of operation apply to the check 
     * (see <a href=../../../supportingDocumentation/SD1-23_ModesOfOperation.pdf >SD1-23 SNC Management 
     * Modes of Operation</a>).</p>
     *
     * <br>SNCCreateData_T createData: data about the potential SNC.
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters  
     * that would be applied to the potential SNC.
     * <br>boolean considerResources: indicates whether or not resource 
     * allocation must be considered.
     * <br>boolean valid: indicates if this is a valid SNC.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service; 
     *  the EMS may not support this operation at all or may not support the
     *  specified value for considerResources<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_OBJECT_IN_USE - Raised if CC creation for the SNC would involve 
     *  a TP that has an existing fixed CC that does not match that required for 
     *  the SNC<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. a field of createData is invalid or any field in 
     *  tpsToModify is invalid). If an NMS requests a bundled SNC 
     *  service such that the GTP endpoints of the SNC do not match, i.e., the 
     *  GTPs do not have the same number of CTPs and in a particular order with 
     *  respect to their layerRates or are not of the same layer rate, then the 
     *  EMS shall raise EXCPT_INVALID_INPUT.<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents checking the validity of the SNC<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is
     *  not met<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS is unable to find a route for 
     *  the SNC. Raised if context is a MLSN of MLRA type. 
     * Raised when the EMS is unable to execute the request because at 
     *  least one of the parameters although valid could not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the
     *  <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the SNC could not be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_OBJECT_IN_USE - Raised if CC creation for the SNC would involve a TP 
     *  that has an existing fixed CC that does not match that required for the 
     *  SNC<br>
     * <br>
     **/
  void checkValidSNC (subnetworkConnection.SNCCreateData_T createData, subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service returns all TP Pools within a Subnetwork contained in an 
     * EMS. If the MLSN represents a Control Plane MLRA, the operation is
     * rejected and an exception raised. The TP Pool is a TP used to logically group TPs.
     * The TP Pool does not 
     * affect TP containment. TP containment remains from the Network Element 
     * view. Given a TP Pool, the NMS could then determine all the TPs that are 
     * associated with the TP Pool, for the purpose of logical partitioning or 
     * grouping.
     * See getTPGroupingRelationships().
     * 
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     * 
     * <br>globaldefs::NamingAttributes_T subnetworkName: Name of the subnetwork 
     * for which to retrieve TP pools.
     * <br>unsigned long how_many: Maximum number of TP pools to return in the 
     * first batch.
     * <br>terminationPoint::TerminationPointList tpList: First batch of TP 
     * pools.
     * <br>terminationPoint::TerminationPointIterator_I tpIt: Iterator to 
     * retrieve the remaining TP pools.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetworkName does not reference a 
     *  multiLayerSubnetwork object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetworkName references an object 
     *  that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the MLSN represents a MLRA in  the
     * Control Plane.
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getAllTPPools (globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, terminationPoint.TerminationPointList_THolder tpList, terminationPoint.TerminationPointIterator_IHolder tpIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllTPPools(), but instead of returning the entire object structures,
     * this operation returns their names. 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetworkName: Name of the 
     * subnetwork.
     * <br>unsigned long how_many: Maximum number of TP pool names to return in 
     * the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of TP pools.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining TP pools.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllTPPools()</a>.
     **/
  void getAllTPPoolNames (globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllSubnetworkConnections(),
     * but instead returns only fixed SNCs object structures. See
     * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 
     * Subnetwork Connection Types</a> for an explanation of fixed SNCs. If the
     * MLSN represents a MLRA, the operation is rejected and an exception is
     * raised.</p>
     *
     * <p>An SNC is identified as fixed using additional information. See
     * <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for detail on additional information
     * for SNCs, cross connections and TPs.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * List of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to be reported in the 
     * first batch.
     * <br>subnetworkConnection::SubnetworkConnectionList_T sncList: First batch 
     * of SNCs.
     * <br>subnetworkConnection::SNCIterator_I sncIt: Iterator to retrieve the
     * remaining SNCs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when subnetName does not reference an 
     *  multiLayerSubnetwork object or connectionRateList contains undefined 
     *  values<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when subnetName references object which 
     *  does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached <br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the MLSN represents a MLRA in  the
     * Control Plane.
     * <br>
     **/
  void getAllFixedSubnetworkConnections (globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllFixedSubnetworkConnections(), but
     * instead of returning the entire object structures, this operation returns 
     * their names. 
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork.
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * List of rates of the SNC names to be reported.
     * If an empty list is specified, then all SNC names of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNC names to be reported in 
     * the first batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of SNC 
     * names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining SNC names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllSubnetworkConnections().
     **/
  void getAllFixedSubnetworkConnectionNames (globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllSubnetworkConnectionsWithTP(),
     * but instead returns only fixed SNCs object structures. See
     * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 
     * Subnetwork Connection Types</a> for an explanation of fixed SNCs.</p>
     *
     * <p>An SNC is identified as fixed using additional information. See
     * <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     * Additional Information Usage</a> for detail on additional information
     * for SNCs, cross connections and TPs.</p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpName: Termination point for which
     * to report SNCs. The termination point name must be explicit (a generic 
     * endpoint specification may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming.
     *
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * The list of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to report in the first 
     * batch.
     * <br>subnetworkConnection::SubnetworkConnectionList_T sncList:  First 
     * batch of SNCs.An SNC is only reported if it respects both the tpName and 
     * connectionRateList filters.
     * <br>subnetworkConnection::SNCIterator_I sncIt: Iterator to retrieve the 
     * remaining SNCs.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if tpName does not reference a 
     *  terminationPoint object or connectionRateList contains undefined 
     *  values<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tpName references an object that does 
     *  not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     **/
  void getAllFixedSubnetworkConnectionsWithTP (globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList, subnetworkConnection.SNCIterator_IHolder sncIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllFixedSubnetworkConnectionsWithTP(), but
     * instead of returning the entire object structures, this operation returns 
     * their names. </p>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpName: Termination point for which
     * to report SNCs. The termination point name must be explicit (a generic 
     * endpoint specification may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on FTP naming.
     *
     * <br>transmissionParameters::LayerRateList_T connectionRateList:
     * The list of rates of the SNCs to be reported.
     * If an empty list is specified, then all SNCs of all rates are to be 
     * reported.
     * <br>unsigned long how_many: Maximum number of SNCs to report in the first 
     * batch.
     * <br>globaldefs::NamingAttributesList_T nameList: First batch of SNC 
     * names.
     * <br>globaldefs::NamingAttributesIterator_I nameIt: Iterator to retrieve 
     * the remaining SNC names.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * As for getAllFixedSubnetworkConnectionsWithTP().
     **/
  void getAllFixedSubnetworkConnectionNamesWithTP (globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p> The NMS invokes the createModifiedSNC to request the EMS to modify the 
     * addressed SNC route. If the EMS does not preserve the SNC name, then the 
     * method will create a new pending SNC from an existing pending or active 
     * SNC. It is similar to createSNC() (which provides details of creation 
     * behaviour) but the created SNC is made from data provided by an existing 
     * SNC and may replace the existing SNC.</p> 
     * If the sncName references a Control Plane connection, the operation is rejected.
     * <p>This operation does not apply to bundled SNCs (see 
     * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
     * for further details).</p>
     *
     * <br>globaldefs::NamingAttributes_T sncName: the name of the subnetwork 
     * connection to be modified.
     * <br>string routeId: The id of the route to be modifed. Empty string, 
     * indicates that the "intended" route is to be modified.
     * <br>subnetworkConnection::SNCModifyData_T SNCModifyData: structure 
     * describing the new/modified subnetwork connection. When the modify type is 
     * set to "rerouting", the EMS should use the routing constraints (if any) to 
     * reroute the SNC from end to end. When the modify type is set to 
     * "add_protection" (leg) or "remove_protection" (leg), the EMS should only 
     * try to modify the SNC by applying or removing the legs provided in the 
     * input parameters. When adding or removing a protection leg, the EMS should 
     * compute the differencing of cross connect on NE.
     * <br>subnetworkConnection::GradesOfImpact_T tolerableImpact: the maximum 
     * tolerable impact allowed.
     * <br>subnetworkConnection::ProtectionEffort_T tolerableImpactEffort:
     * qualifies the conditions under which an SNC modification may be performed 
     * is a qualification of the requirement that the tolerableImpact as 
     * specified, is met.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the creation.
     * <br>subnetworkConnection::TPDataList_T tpsToModify: a list of TPs and 
     * parameters to apply, updated to provide the resulting parameters.
     * <br>subnetworkConnection::SubnetworkConnection_T theSNC:
     * The modified SNC.  It will have sncState and name set.  The EMS 
     * selects the SNC names so that they are not reused (within a reasonable time  
     * frame) for different SNCs.
     * <br>string errorReason: Specifies the modification error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when a field of an input parameter is 
     *  invalid.<br>
     * EXCPT_OBJECT_IN_USE - Raised if the SNC can not be created because of CC or 
     *  TP conflicts with other SNCs (e.g. because of timeslot conflicts)<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when fields of input parameters (e.g. 
     *  SNCModifyData) refer to an object that does not exist<br>
     * EXCPT_PROTECTION_EFFORT_NOT_MET - Raised if the NMS requests an SNC
     *  with a static protection level and protection effort that cannot be met by 
     *  the EMS<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC cannot be created because it 
     *  cannot comply with any of the input parameter constraints for a reason 
     *  different than the ones above. Raised if the SNC name represents a
     *  connection in the control plane. If the EMS cannot determine the reason it 
     *  could not comply, it is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>.
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is 
     *  not met<br>
     * <br>
     **/
  void createModifiedSNC (globaldefs.NameAndStringValue_T[] sncName, String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p> The swapSNC method will deactivate an identified active SNC (state 
     * changes to pending) and activate an identified pending SNC. The pending SNC 
     * may have been created by using a createSNC() or a 
     * createModifiedSNC(). If any  of the SNCs represent a Control Plane Connection, an
     * exception is raised </p>
     * 
     * <br>globaldefs::NamingAttributes_T nameOfSNCtoBeDeactivated: the name of 
     * the subnetwork connection to be deactivated.
     * <br>globaldefs::NamingAttributes_T nameOfSNCtoBeActivated: the name of the 
     * subnetwork connection to be activated.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the activation.
     * <br>subnetworkConnection::TPDataList_T tpsToModify: a list of TPs and 
     * parameters to apply, updated to provide the resulting parameters.
     * <br>parameters to apply, subnetworkConnection::SNCState_T 
     * stateOfActivatedSNC: The state of the activated subnetwork connection after 
     * the operation.
     * <br>string errorReason: Specifies the modification error(s) if any.
     * 
     * <p>Note that no exception thrown, except in the cases listed below. If the 
     * SNC or any of its network resources have changed as a result of this 
     * operation,then no exception can be thrown so that the SNC can be passed 
     * back to the NMS.</p> 
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object, or any field in 
     *  tpsToModify is invalid)<br>
     * EXCPT_OBJECT_IN_USE - Raised if the SNC can not be activated because of CC 
     *  or TP conflicts (e.g. because of timeslot conflicts) or conflicts between 
     *  the active route (with equal or higher priority) of this and other SNCs or 
     *  when CC creation would involve a TP that has an existing fixed CC that 
     *  does not match that required for the SNC<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised if sncName or tpsToModify reference an 
     *  SNC/TP object that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if any of the SNCs represent a Connection
     *  in the Control Plane. Raised if the EMS is unable to find a route for 
     *  the SNC. Raised if the EMS can not meet the GradesOfImpact requested by
     *  the NMS. Raised when the EMS is unable to execute the request because at 
     *  least one of the parameters although valid can not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the
     *  <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the SNC cannot be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents any change to the SNC<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised where the SNC would involve a CTP that is
     *  not connectable due to the state of the server TP or in the case of 
     *  inverse multiplexing where the SNC would involve a CTP that is not 
     *  connectable due to the state of the client TP<br>
     * <br>
     **/
  void swapSNC (globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p> The NMS invokes the modifySNC to perform the combined function of 
     * createModifiedSNC() and swapSNC() in sequence. The signature of the 
     * operation is the same as that of createModifiedSNC().</p>
     * 
     * <p>This method will modify and activate the SNC on the network. If the EMS 
     * does not preserve the SNC name, then output SNC will have a different name 
     * than formerly addressed SNC, which is deactivated and deleted.</p>
     * <p> If the SNC name references a Control Plane Connection, the operation is rejected and
     * an exception raised.</p>
     * <br>globaldefs::NamingAttributes_T sncName: the name of the subnetwork 
     * connection to be modified.
     * <br>string routeId: The id of the route to be modifed. Empty string, 
     * indicates that the "intended" route is to be modified.
     * <br>subnetworkConnection::SNCModifyData_T SNCModifyData: structure 
     * describing the new/modified subnetwork connection.
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed.
     * <br>subnetworkConnection::ProtectionEffort_T tolerableImpactEffort:
     * qualifies the conditions under which an SNC modification may be performed 
     * is a qualification of the requirement that the tolerableImpact as  
     * specified, is met.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the creation.
     * <br>TPDataList_T tpsToModify: a list of TPs and parameters to apply, 
     * updated to provide the resulting parameters.
     * <br>SubnetworkConnection_T theSNC:
     * The modified SNC.  It will have sncState and name set.  The EMS 
     * selects the SNC names so that they are not reused (within a reasonable time 
     * frame) for different SNCs.
     * <br>string errorReason: Specifies the modification error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when a field of an input parameter is 
     *  invalid (e.g. sncName does not refer to an SNC object, or any field in 
     *  tpsToModify is invalid) <br>
     * EXCPT_OBJECT_IN_USE - Raised if the SNC can not be created or activated 
     *  because of CC or TP conflicts (e.g. because of timeslot conflicts) or 
     *  conflicts between the active route (with equal or higher priority) of this 
     *  and other SNCs or when CC creation would involve a TP that has an existing 
     *  fixed CC that does not match that required for the SNC<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when fields of input parameters (e.g. 
     *  SNCModifyData or tpsToModify) refer to an object that does not exist<br>
     * EXCPT_PROTECTION_EFFORT_NOT_MET - Raised if the NMS requests an SNC
     *  with a static protection level and protection effort that cannot be met by 
     *  the EMS<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in the SNC name references a Connection in
     * the control plane. Raised if the EMS is unable to find a route for 
     *  the SNC. Raised if the EMS can not meet the GradesOfImpact requested by
     *  the NMS. Raised when the EMS is unable to execute the request because at 
     *  least one of the parameters although valid can not be set and that 
     *  parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the
     *  <a href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the SNC cannot be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint is     *  not met<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents any change to the SNC<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised where the SNC would involve a CTP that is
     *  not connectable due to the state of the server TP or in the case of 
     *  inverse multiplexing where the SNC would involve a CTP that is not 
     *  connectable due to the state of the client TP<br>
     * <br>
     **/
  void modifySNC (globaldefs.NameAndStringValue_T[] sncName, String routeId, subnetworkConnection.SNCModifyData_T SNCModifyData, subnetworkConnection.GradesOfImpact_T tolerableImpact, subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns the requested route for the SNC whose name is 
     * specified as a parameter. If the input route is not specified (empty 
     * string), the operation replies all the routes of the SNC, intended and 
     * backup ones. The rest of the behavior is same as getRoute().
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection. 
     * <br>string routeId: The id of the route.
     * <br>boolean includeHigherOrderCCs: Specifies whether the higher order CCs 
     * of other SNCs used to carry the queried SNC route have to be included in 
     * addition to the CCs of the queried SNC route.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled
     * <br>subnetworkConnection::RouteList_T routeList: The route(s) of the 
     * SNC.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when a field of an input parameter is invalid 
     *  (e.g. sncName does not reference a subnetworkConnection object)<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName and/or the routeId reference 
     *  an object that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the provided value for 
     *  includeHigherOrderCCs is "True" and EMS is not able to provide higher 
     *  order CCs in the reply. Raised if the SNC represents a connection in the
     *  Control Plane<br>
     * <br>
     **/
  void getBackupRoutes (globaldefs.NameAndStringValue_T[] sncName, String routeId, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.RouteList_THolder routeList) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service is used to activate the input route and deactivate the 
     * current (or partial) route(s), if different from input route. The operation 
     * is rejected if performed on a pending SNC. The operation does not affect 
     * the administrativeState of any route. The restoration process may re-route 
     * again, e.g. in case of failures.</p>
     * If the SNC represents a Control Plane Connection, an exception is raised.
     *
     * <p><b>Success</b>: output parameter sncState is set to SNCS_ACTIVE. All 
     * cross-connects required for the given route were activated successfully, 
     * and if needed, all the cross-connects of former current (or partial) 
     * route(s) were deactivated successfully. The errorReason parameter is set to 
     * an empty string.</p>
     *
     * <p><b>Failure</b>: No exception thrown, except in the cases listed below. 
     * If the SNC or any of its network resources have changed as a result of this 
     * operation, then no exception can be thrown so that the sncState can be 
     * passed back to the NMS. The resulting SNCState will be either SNCS_PARTIAL 
     * or SNCS_ACTIVE.</p>
     *
     * <p>The sncState will be SNCS_PARTIAL if not all cross-connects (of given 
     * input route) on MEs have been successfully set up, and there is not an 
     * active route. Moreover one or more of the cross-connects to be removed may 
     * be still active, this leads to two (or more) routes in partial state.</p>
     *
     * <p>The sncState will be SNCS_ACTIVE if all cross-connects (of given input 
     * route) on MEs have been successfully set up, but one or more of the cross-
     * connects (of any of the other partial routes) to be removed are still 
     * active, this leads to one route in active state and another (or more) route 
     * in partial state. The errorReason parameter is set accordingly.</p>
     *
     * <p>Recovery scenarios: this operation can be performed again addressing<ul> 
     * <li>an already active route, in order to retry the deactivation of other 
     * route(s) in partial state</li>
     * <li> a partial route, in order to retry its activation (and retry, if 
     * needed, the deactivation of other partial routes as well).</li></ul></p>
     *
     * <p>The EMS will apply the transmissionParams specified in the tpsToModify 
     * parameter (same behaviour as setTPData). They may be applied before or 
     * after the creation of the CCs, as appropriate. Existing TP transmission 
     * parameters for which no changes were requested in tpsToModify will be left 
     * unchanged. However, the alarm reporting on the connected TPs and the 
     * containing TPs may be turned on by the EMS as part of this request, unless 
     * otherwise specified via the transmission parameter "AlarmReporting". A 
     * similar behaviour is also allowed for the serviceState parameter, which may 
     * be set to IN_SERVICE for the TPs. See 
     * <a href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     * transmissionParameters</a>.
     * </p>
     * 
     * <p>If a given entry in the list of transmission parameters specified in the 
     * TPData_T can not be successfully applied to the TP, for any reason, then 
     * the errorReason field is appended with an appropriate reason text. Applying 
     * transmission parameters is best-effort (where not stated 
     * otherwise) and the resulting values of the 
     * transmission parameters are provided in the updated tpsToModify 
     * parameter.</p>
     *
     * <p>An already active SNC route can be activated again; the EMS is allowed 
     * to not send the commands to the ME a second time for the cross connect 
     * establishment however the commands may be sent for the transmission 
     * parameters.</p>
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection.
     * <br>string routeId: The id of the route.
     * <br>subnetworkConnection::GradesOfImpact_T tolerableImpact: the maximum 
     * tolerable impact allowed. 
     * <br>EMSFreedomLevel_T emsFreedomLevel: The maximum level of freedom 
     * allowed to the EMS to perform the operation.
     * <br>subnetworkConnection::TPDataList_T tpsToModify: a list of TPs and 
     * parameters to apply, updated to provide the resulting parameters. 
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br>subnetworkConnection::SNCState_T sncState: The subnetwork connection 
     * state after the operation. 
     * <br>string errorReason: Specifies the activation error(s) if any. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object, 
     *  or any field in tpsToModify is invalid<br>
     * EXCPT_OBJECT_IN_USE - Raised if the route can not be activated because of 
     *  CC or TP conflicts with an active route of another SNC (with equal or 
     *  higher priority)<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised if sncName, routeId or tpsToModify 
     *  reference an SNC/route/TP object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents any change to the SNC<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised where the SNC would involve a CTP that is
     *  not connectable due to the state of the server TP or in the case of 
     *  inverse multiplexing where the SNC would involve a CTP that is not 
     *  connectable due to the state of the client TP<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the SNC Name references a Connection in
     *  the control plane. Raised if the EMS can not meet the GradesOfImpact 
     *  requested by the NMS. Raised when the EMS is unable to execute the request 
     *  because at least one of the parameters although valid can not be set and 
     *  that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-16_LayeredParameters.pdf >SD1-16 
     *  Layered Transmission Parameters</a> document or in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the route cannot be 
     *  activated because the EMS cannot comply for a reason different from the 
     *  ones above. If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * <br>
     **/
  void switchRoute (globaldefs.NameAndStringValue_T[] sncName, String routeId, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.TPDataList_THolder tpsToModify, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation creates a new route (e.g. for restoration purposes) and 
     * associates it to the given SNC. The route is created in locked state.</p>
     *
     * <p>A route belongs to only one SNC. However XCs/TPs can be shared by 
     * routes of different SNCs.</p>
     * 
     * <p>A route applies to XCs at the same layer of the SNC. The route id must 
     * be an unique identifier within the SNC name, with format up to EMS.</p>
     *
     * <p>It is possible to specify if the creating route is the INTENDED route or 
     * not; if intended, then the former intended route is updated to backup 
     * route. Only one intended route can be associated to a given SNC at a 
     * time.</p>
     *
     * <p>It is possible to specify if the creating route is EXCLUSIVE or not; if 
     * EXCLUSIVE, then the EMS must find a route that does not conflict or share 
     * CCs with any other existing SNC route, in any administrative state . Once 
     * an EXCLUSIVE route has been created by EMS, any further creation operation 
     * which conflicts with the exclusive route shall be refused.</p>
     * 
     * <p>A route implicitly inherits from its SNC the following attributes:<ul>
     * <li>the endpoints</li>
     * <li>owner</li>
     * <li>direction</li>
     * <li>rerouteAllowed</li>
     * <li>networkRouted</li>
     * <li>rate</li>
     * <li>the sncType</li>
     * <li>the staticProtectionLevel - so protectionEffort is considered 
     * EFFORT_SAME, i.e. if EMS can not create a route with same static protection 
     * level as the SNC, the operation is refused.</li></ul></p>
     * 
     * <p>If the SNC represents a Control Plane Connection, an exception is raised.</p>
     *
     * <br>globaldefs::NamingAttributes sncName: The name of the subnetwork 
     * connection.
     * <br>RouteCreateData_T createRoute: structure describing the route to be 
     * created. 
     * <br>GradesOfImpact_T tolerableImpact: the maximum tolerable impact 
     * allowed. 
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the creation. 
     * <br>RouteDescriptor_T theRoute: the created route.
     * <br>string errorReason: Specifies the creation error(s) if any. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC object, 
     *  or any field in createRoute is invalid<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or fields of createRoute refer 
     *  to an object that does not exist<br>
     * EXCPT_PROTECTION_EFFORT_NOT_MET - Raised if the NMS requests a route with a 
     *  static protection level (inherited from SNC) that cannot be met by the 
     *  EMS<br>
     * EXCPT_OBJECT_IN_USE - Raised if the route is in conflict with an 
     *  "exclusive" (even locked) route of another SNC<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents creation of the route<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if the EMS does not support 
     *  the routing constraints specified<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the sncName references a Connection in
     *  the control plane. Raised if the EMS can not meet the GradesOfImpact 
     *  requested by the NMS. Raised when the EMS is unable to execute the request 
     *  because at least one of the parameters although valid can not be set and 
     *  that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. If the EMS cannot determine the 
     *  reason it could not comply, it is also allowed to throw 
     *  EXCPT_UNABLE_TO_COMPLY<br>
     * <br>
     **/
  void addRoute (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteCreateData_T createRoute, subnetworkConnection.GradesOfImpact_T tolerableImpact, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service allows an NMS to request the deletion of a route of given 
     * SubnetworkConnection on a specified subnetwork.</p>
     *
     * <p>The addressed route must not be in the unlocked  state, and must not be 
     * the intended route.</p>
     * 
     * <p>Of course it is possible to delete a locked backup route which is "in 
     * use" by other SNC route, because this operation has no side effect on 
     * routes of any other SNCs, even if sharing XCs/TPs.</p>
     * 
     * <p>Failure - An exception will be thrown if the operation fails. The route 
     * will not be deleted on the EMS. The errorReason field of the exception will 
     * contain the reason for the failure.</p>
     * 
     * <p>Success - The route is deleted on the EMS.</p>
     *
     * <p>If the SNC represents a Control Plane Connection, an exception is raised.</p>.
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection.
     * <br>string routeId: The id of the route.
     * <br>EMSFreedomLevel_T emsFreedomLevel: the maximum level of freedom 
     * allowed to the EMS to perform the deletion. 
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when sncName does not refer to an SNC 
     *  object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or routeId reference an object 
     *  that does not exist<br>
     * EXCPT_NOT_IN_VALID_STATE - Raised if the route is in the unlocked state, or 
     *  if the route is the intended one<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents the deletion of the route<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the sncName references a Connection in
     *  the control plane. Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. If the EMS cannot determine the 
     *  reason it could not comply, it is also allowed to throw 
     *  EXCPT_UNABLE_TO_COMPLY<br>
     * <br>
     **/
  void removeRoute (globaldefs.NameAndStringValue_T[] sncName, String routeId, multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service allows an NMS to request to set the addressed route as 
     * intended route. The formerly intended route (if different from addressed) 
     * is no longer the intended one, in order to respect the rule that an SNC 
     * must have one intended route, and only one. The addressed route can be in 
     * any administrative / actual state.</p>
     *
     * <p>Failure - An exception will be thrown if the operation fails. The 
     * errorReason field of the exception will contain the reason for the 
     * failure.</p>
     * 
     * <p>Success - The addressed route is the intended one, and the formerly 
     * intended route is a backup one.</p>
     *
     * <p>If the SNC represents a Control Plane Connection, an exception is raised.</p>.
     *
     * <br>NamingAttributes_T sncName: the name of the subnetwork connection.
     * <br>string routeId: The id of the route.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement this 
     *  service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC 
     *  object).<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or routeId reference an object 
     *  that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the sncName references a Connection in
     *  the control plane. Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. If the EMS cannot determine the 
     *  reason it could not comply, it is also allowed to throw 
     *  EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     *  and this prevents to set the intended route
     * <br>
     **/
  void setIntendedRoute (globaldefs.NameAndStringValue_T[] sncName, String routeId, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException;

  /**
     * <p> This allows an NMS to specify a list of routes jointly with their 
     * provisioned administrative state. If all routes of a given SNC are 
     * successfully locked, then the SNC state transits to pending. If the SNC 
     * state was partial or pending, and at least one route is successfully 
     * unlocked, then the SNC state may transits to active. 
     *
     * <p>If the SNC represents a Control Plane Connection, an exception is raised.</p>.
     *
    *  
     * <br>globaldefs::NamingAttributes_T sncName: the name of the subnetwork connection.
     * <br>subnetworkConnection::RouteNameAndAdminStateList_T 
     * routeNameAndAdminStateList: the list of route IDs plus their administrative 
     * state.
     * <br>subnetworkConnection::SNCState_T sncState: The subnetwork connection 
     * state after the operation. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactical 
     *  incorrect (e.g. sncName does not refer to an SNC 
     *  object or references a Connection in the Control Plane<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName or at least one route Id 
     *  reference an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managed element is 
     *  lost<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the sncName references a Connection in
     *  the control plane.
     **/
  void setRoutesAdminState (globaldefs.NameAndStringValue_T[] sncName, subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, subnetworkConnection.SNCState_THolder sncState) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This service returns the intended route for the SNC whose name is 
     * specified as a parameter. The behavior is essentially the same as 
     * getRoute().</p>
     * If the sncName references a Connection in the Control Plane, the operation
     * is rejected and an exception raised.
     * <br>globaldefs::NamingAttributes_T sncName: the name of the subnetwork connection. 
     * <br>boolean includeHigherOrderCCs: Specifies whether the higher order CCs 
     * of other SNCs used to carry the queried SNC route have to be included in 
     * addition to the CCs of the queried SNC route.
     * <br>globaldefs::NVSList_T additionalInfo: to allow the communication of 
     * additional information which is not explicitly modelled
     * <br>subnetworkConnection::Route_T route: The route of the SNC.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if an EMS does not implement the specified 
     *  includeHigherOrderCCs value<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when sncName does not reference a 
     *  subnetworkConnection object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when sncName and/or the routeId reference 
     *  an object that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the sncName
     *  references a Connection in the Control Plane. 
     *  If the EMS cannot determine the reason it could not comply, it is also 
     *  allowed to throw EXCPT_UNABLE_TO_COMPLY<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is lost 
     * <br>
     **/
  void getIntendedRoute (globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, globaldefs.NVSList_THolder additionalInfo, subnetworkConnection.Route_THolder route) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The NMS uses this operation to request the creation of a new TP pool.  
     * To this end the NMS prescribes the Subnetwork the new TP pool shall be 
     * contained in and specifies the list of TPs or GTPs that shall comprise the 
     * TP pool (the list is placed in the containedMembers parameter).  All the 
     * specified TPs/GTPs shall be contained in MEs of the specified 
     * Subnetwork.</p>
     * If this operation is in the context of the MLRA, the operation is
     * rejected and an exception is raised
     *
     * <br>TPPoolCreateData_T newTPPoolCreateData: The read-create data
     * for the TPPool to be created.
     * <br>terminationPoint::TerminationPoint_T newTPPool: This output parameter
     * contains the newly created TPPool.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS does not support TP pools 
     * at all or does not support creation of TP pools by the NMS<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the userLabel uniqueness constraint 
     *  can not be met<br>
     * EXCPT_INVALID_INPUT - Raised if the TPPool creation data is not well 
     *  formed. <br>
     * EXCPT_OBJECT_IN_USE - Raised if a TP or GTP (to be included in the TPPool) 
     *  is being used, or is already contained in a GTP or another TPPool.<br>
     * EXCPT_CAPACITY_EXCEEDED - Raised when the service would result in resources 
     *  being created or activated beyond the capacity supported by the NE/EMS<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised when the EMS is unable to execute the 
     *  request because at least one of the parameters although valid can not be 
     *  set and that parameter is identified as "not best effort" in the <a 
     *  href=../../../supportingDocumentation/SD1-1_AdditionalInfoUsage.pdf >SD1-1 
     *  Additional Information Usage</a> document. Raised if the sncName
     *  references a Connection in the Control Plane. 
     * EXCPT_UNABLE_TO_COMPLY - Raised if the containingMLSN represents a MLRA.
     * <br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to some managed element is 
     *  lost and this prevents creating the TPPool<br>
     * <br>
     **/
  void createTPPool (multiLayerSubnetwork.TPPoolCreateData_T newTPPoolCreateData, terminationPoint.TerminationPoint_THolder newTPPool) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The delete TPPool operation is used to delete a TPPool.
     * This operation is idempotent.  If the service is called with the name 
     * of a non-existent TPPool, it will succeed.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpPoolName: The name of TPPool 
     * to be deleted
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support deletion of TPPools 
     *  via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when the input parameter is syntactical 
     *  incorrect<br>
     * EXCPT_OBJECT_IN_USE - Raised if one or more of the TPs or GTPs to be 
     *  removed are not idle<br>
     * <br>
     **/
  void deleteTPPool (globaldefs.NameAndStringValue_T[] tpPoolName) throws globaldefs.ProcessingFailureException;

  /**
     * <p>The modify TPPool operation is used to add TPs/GTPs to or delete
     * TPs/GTPs from a TPPool.  For a given request, the NMS can only add
     * TPs/GTPs or delete TPs/GTPs, not both.  When TPs/GTPs are to be added,
     * all the specified TPs/GTPs shall be contained in MEs of the TPPool's
     * Subnetwork.  It is not possible to add a TP/GTP that is part of 
     * another TPPool or GTP.  The operation is best-effort, i.e., the EMS
     * will add or delete as many of the identified TPs as possible.  
     * If the service is called with the name of a non-existent TPPool
     * or TP or GTP, it will fail.</p>
     *
     * <br>globaldefs::NamingAttributes_T tpPoolName: The name of the TPPool
     * to be modified
     * <br>globaldefs::NamingAttributesList_T containedMembers: The names of
     * the TPs or GTPs to be added or deleted
     * <br>string actionType: An indication of whether the listed TPs or GTPs
     * are to be added or deleted.  Two values are possible:  "add" or "delete".
     * <br>terminationPoint::TerminationPoint_T modifiedTPPool: The structure
     * for the modified TPPool
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS does not support modification of
     *  TPPools via this interface<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised in case one or more TPs or GTPs do not
     *  exist or do not belong to theTPPool's Subnetwork, and so the addressed
     *  TPPool object can not be modified<br>
     * EXCPT_INVALID_INPUT - Raised if TPPool modification data is not well 
     *  formed, i.e. the input parameters are syntactically incorrect<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tPPoolName references a TPPool object
     *  that does not exist<br>
     * EXCPT_OBJECT_IN_USE - Raised if one or more TPs or GTPs to be removed
     *  are not idle, or one or more TPs or GTPs to be added are contained
     *  in a GTP or another TP pool<br>
     * EXCPT_CAPACITY_EXCEEDED - Raised when the service would result in resources 
     *  being created or activated beyond the capacity supported by the NE/EMS<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to some managed element
     *  is lost and this prevents modifying the TPPool<br>
     * <br>
     **/
  void modifyTPPool (globaldefs.NameAndStringValue_T[] tPPoolName, globaldefs.NameAndStringValue_T[][] containedMembers, String actionType, terminationPoint.TerminationPoint_THolder modifiedTPPool) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns the TPPool structure for the given TPPool name,
     * and the additional attributes numberOfMembers, numberOfIdleMembers, and
     * descriptionOfUse.  The attribute containedMembers, i.e. the list of names
     * of contained TPs and GTPs, can be retrieved by means of the operation
     * getTPGroupingRelationships() with input tpPoolName.</p>
     *
     * <br>globaldefs::NamingAttributes_T tPPoolName: The name of the TPPool 
     * to retrieve.
     * <br>terminationPoint::TerminationPoint_T tPPool: 
     * The retrieved TPPool. The attributes ingressTrafficDescriptorName,
     * egressTrafficDescriptorName, connectionState, tpMappingMode, direction,
     * tpProtectionAssociation, and edgePoint will contain NULL values.
     * <br>unsigned long numberOfMembers: The total number of TPs or GTPs
     * currently contained in the TPPool.
     * <br>unsigned long numberOfIdleMembers: The number of contained TPs or
     * GTPs that are currently idle, i.e. can be used for the intended purpose.
     * <br>string descriptionOfUse: A description of the specific use of the
     * TP pool, in particular how its members are collected and administered.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised when EMS does not support TP pools at all 
     *  or does not support retrieval of TP pools by the NMS.<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when tPPoolName does not reference a 
     *  TPPool<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when tPPoolName references a TPPool object 
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the communication to some ME is lost and 
     *  this prevents retrieving the TPPool<br>
     * <br>
     **/
  void getTPPool (globaldefs.NameAndStringValue_T[] tPPoolName, terminationPoint.TerminationPoint_THolder tPPool, org.omg.CORBA.IntHolder numberOfMembers, org.omg.CORBA.IntHolder numberOfIdleMembers, org.omg.CORBA.StringHolder descriptionOfUse) throws globaldefs.ProcessingFailureException;

  /** 
     * The operation will reply the MLSNs (which represent MLRAs) including Routing
     * Nodes that are one level subordinate to the MLSN provided as an input.
     * This allows an NMS to request the Multi Layer Routing Areas or
     * Routing Nodes that are completely managed by the EMS (i.e. the EMS is allowed to read and provision all transport plane aspects, e.g. PTP, CTP).
     * If the operation is addressed to a non control plane  Multi Layer Subnetwork, the
     * operation is rejected and an exception is raised.
     * The containment hierarchy of MLSNs representing a MLRA is reflected only
     * by the result of this operation, as the containment hierarchy of MLSNs
     * is not reflected in the name of MLSN 2nd class object. The subordinate
     * MLSN(s) are replied, regardless the addressed MLSN is directly managed
     * or not by the EMS (the EMS does not manage the MLSN but it can access the
     * related control plane information). If the operation is addressed to 
     * a MLRA of Routing Node type, which is at the bottom of the routing
     * hierarchy, the result is an empty list.
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: Name of the subnetwork for
     * which to retrieve subordinate MLSNs.
     * <br>SubnetworkList_T subordinateMLSNsList: The subordinates MLSNs.
     * unsigned long how_many:
     * SubnetworkList_T subordinateMLSNsList:
     * SubnetworkIterator_I subnetIt):
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is
     *  syntactically incorrect or identifies an object of the wrong type or is
     *  out of range <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     * an object that does not exist<br>
     * EXCPT_UNABLE_TO_COMPLY -. Raised if the subnetName does not represent a 
     *  MLRA in the Control Plane.
     * EXCPT_NE_COMM_LOSS - The EMS is unable to communicate with the Control Plane
     * and communication is required to complete the request.<br>
     **/
  void getAllSubordinateMLSNs (globaldefs.NameAndStringValue_T[] subnetName, int how_many, multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation provides a way for the NMS to retrieve the identifiers 
     * of the subordinate Routing Areas, at the lower partitioning level 
     * (N-1 level) and which are known to be involved in the route of a
     * Connection at the level N.</p>
     *
     * <p>This operation allows the NMS to provide a filter input parameter to
     * retrieve the subordinate Routing Areas for only the actual route, or only the 
     * home/intended route, or both. This operation result is not recursive.</p>
     * <p>This operation has been designed to operate in a 3 level
     * hierarchy, i.e. where the top level MLRA contains subordinate MLRAs, and
     * such subordinate MLRAs contain Routing Nodes. This operation can
     * only be addressed to a top level routing area.</p> 
     *
     * Depending on the signalling used in the network, the EMS will indicate
     * whether the response is a "Full" description of the route or a "Sparse"
     * description: <ul>
     * <li>Full: The control plane component at the originating point of the
     * connection has a full view of all of the ids of the routing area one
     * level subordinate to the top level routing area involved in the connection.
     * In this case the NMS can simply interrogate the EMSs for each routing
     * area returned in any order to find out the detail routes of each routing
     * area.</li>
     * <li>Sparse: The control plane component at the originating point of the 
     * connection can only provide the id of the local routing area, the next
     * neighbour and the destination routing area (and can not provide the identifiers
     * of any other routing areas along the route).
     * For the "Sparse case" the NMS will follow the route (i.e., starting from
     * the originating routing area and progressing along the route to the subsequent
     * routing areas ) and use "getConnectionsAndRouteDetails()" to find out
     * the detail routes of each routing area.</li> </ul>
     * <br>
     * The output of this operation has the following characteristics:<ul>
     * <br>
     * <li>The MLRA List is empty if there is not MLRAs for the requested
     * intended or actual route or if the MLRA is a MLRNode</li> 
     * <li>There may be no Home/Intended route in the case where none was 
     * provisioned</li>
     * <li>There may be no Actual route where the connection is searching or the
     * actual route traverses a different MLRA to the Home/Intended route</li>
     * <li>For an SNCP connection, the replied Home/Intended route will always
     * include both main and spare legs of the SNCP protection, while the replied
     * actual route may return only one leg, if only such leg is currently active
     * in the network</li>
     * <li>The route is described in full across the MLRA regardless of sharing
     * of same Routing Node Connections among distinct routes of the same Call</li> </ul>
     * <br>
     * globaldefs::NamingAttributes_T <b>subnetName</b>: The name of the MLSN 
     * which represents the top level MLRA.<br>
     *
     * globaldefs::NamingAttributes_T <b>connection</b>: The Name of
     * the Top Level Connection for which to find the route.
     * <br>
     * <br>string <b>routeType</b>: An indication of the connection route type for
     * which to recover the subordinate MLRAs. One of three values are possible:
     * "Intended" or "Actual" or "Both". <br>
     *
     * RoutePerRouteType_T <b>routePerRouteType_T</b>: The list(s) of Routing Area ids at
     * the lower partitioning level which are known to be involved in the
     * route(s) of a specified connection.<br>
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect or identifies an object of the wrong type or
     *  is out of range (e.g. the specified connection is not in the scope of the named top level MLRA)<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS does not control the Originating 
     *  Point for the specified connection. Raised if the adressed MLSN does not
     *  represent a top level MLRA. Raised if the addressed MLSN is the top level MLRA 
     * but the network has only 2 levels of routing hierarchy. 
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does  not exist 
     * EXCPT_NOT_IN_VALID_STATE: Raised if the EMS is unable to comply because the
     *  Connection State is Searching.  
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is
     *  lost or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getAllSubordinateRAidsWithConnection (globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] connection, String routeType, multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This service returns a MLSNPPLink given its name.</p>
     * <br>globaldefs::NamingAttributes_T mLSNPPLinkName: The name of the MLSNPP
     * Link to retrieve.
     * <br>boolean sNPListRequested: It indicates whether SNPs details should be
     * included in the response or not.
     * <br>mLSNPPLink::MLSNPPLink_T theMLSNPPLink: the MLSNPP Link returned.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any of any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist (e.g. although it exists in the Control Plane 
     * it is not visible within the scope of this EMS).<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getMLSNPPLink (globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws globaldefs.ProcessingFailureException;

  /**   This operation shall reply all the MLSNPPLinks known to the EMS. 
     * For an explanation of the structure of the MLSNPPLink, 
     * see <a href=../../../supportingDocumentation/SD1-46_ASONControlPlaneManagement-Scenarios.pdf >
     * SD1-46_ASONControlPlaneManagement-Scenarios</a>
     * If a MLSN
     * which represents a MLRA, is introduced as an input parameter, the operation
     * retrieves only the MLSNPPLinks internal and external to the addressed MLSN 
     * (only MLSNPPLinks directly within the MLRA or directly at the edge of the MLRA are replied). 
     * If no MLSN is specified then all MLSNPPLinks available to the EMS are returned.
     * If the operation is addressed to a MLRA representing a Routing Node, 
     * only external MLSNPPLinks are replied.
     *
     * The MLSNPPLinks returned may include the information 
     * on the SNPs, according to input parameter choice.
     * Considering the external MLSNPPLinks:
     * <li>If the operation is addressed to the top level MLSN/RA, then it shall
     * reply all the MLSNPP Links to external devices (i.e. UNI or Dumb SNPP
     * Links - note that Dumb SNPP Links may coincide with Top Topological Links). </li>
     *
     * <li>If the operation is addressed to a MLSN/RA of level N, N being any level
     * subordinate of the top level (including the Routing Node) then it shall reply
     * all the MLSNPP Links to another MLSN/RA of same level N.</li>
     * Considering the internal MLSNPPLinks, only I-NNI are returned.  
     * Note that E-NNI
     * and I-NNI definitions are related to the hierarchy level considered,
     * following the partitioning concept. E.g. given a MLRA of level N, its edge
     * links have the E-NNI role with respect to level N. Same links have I-NNI
     * role with respect to level N-1 (superior), i.e. are internal links of
     * superior MLRA.
     * See <a href=../../../supportingDocumentation/SD1-46_ASONControlPlaneManagement-Scenarios.pdf >
     * SD1-46_ASONControlPlaneManagement-Scenarios</a>
     * </p>
  
  
     * The reply may be an empty
     * or a partial list depending upon the visibility that EMS has of the control plane: <br> <ul>
     * <li><b>Local & Complete:</b> The EMS completely manages the MLRA 
     * and the supporting transport plane resources (ME, TP etc) such that 
     * it can provide a complete view of the MLSNPPLinks and all associated transport plane data.</li>
     * <li><b>Local CP Only:</b> The EMS manages the MLRA but has no view of the supporting 
     * transport plane resources such that it can provide a complete view of the MLSNPPLinks 
     * but can not provide any associated transport plane data.</li>
     * <li> <b>Remote CP Transparent:</b> The EMS manages the MLRA at this level 
     * but may not have a view of the details of the subordinate MLRA levels 
     * and has no view of the supporting transport plane resources, 
     * such that it can provide a complete view of the MLSNPPLinks 
     * but not necessarily all of the SNPP aliases and can not provide 
     * any associated transport plane data.  </li>
     * <li> <b>Remote CP Limited:</b> The EMS partially manages the MLRA 
     * at this level and may not have a view of the details of the subordinate 
     * MLRA levels and has no view of the supporting transport plane resources, 
     * such that it can provide a view of some of the MLSNPPLinks and not necessarily 
     * all of the subordinate SNPPs for those MLSNPPLinks and can not provide 
     * any associated transport plane data.</li>
     * <li> <b>Remote CP Opaque:</b> The EMS is unable to provide any information 
     * related to MLSNPPLinks that are internal to the specified MLRA.</li> </ul>
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the MLSN which 
     * references a MLRA. This is an optional input parameter.<br>
     * boolean <b>sNPListRequested</b>: It indicates whether the SNPs details
     * should be included in the response or not.
     * <br>unsigned long how_many: Maximum number of MLSNPPLinks to report in the first 
     * batch.
     * <br>mLSNPPLink::MLSNPPLinkList_T mLSNPPLinkList: First batch of MLSNPPLinks.
     * <br>mLSNPP::MLSNPPLinkIterator_I mLSNPPLinkIt: Iterator to retrieve 
     * the remaining MLSNPP Links.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when any of Any input parameter is
     *  syntactically incorrect<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the adressed MLSN does not represent
     *  a MLRA.
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when any of the input parameters references
     *  an object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getAllMLSNPPLinks (globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllMLSNPPLinks, but instead of returning all the MLSNPP Links
     * this operation returns only the MLSNPPlinks internal to the addressed MLRA 
     * (clearly subnetName is a mandatory parameter). 
     * If the addressed MLRA is a Routing Node then the list will be empty.
     **/
  void getAllInternalMLSNPPLinks (globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation has exactly the same behaviour as 
     * getAllMLSNPPLinks, but instead of returning all the MLSNPP Links
     * this operation returns only the MLSNPPlinks external to the addressed MLRA, which
     * is a mandatory parameter.
     **/
  void getAllEdgeMLSNPPLinks (globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws globaldefs.ProcessingFailureException;

  /** <p>
     * This operation shall reply all the MLSNPPs known to the EMS. 
     * For an explanation of the structure of the MLSNPPLink
     * see <a href=../../../supportingDocumentation/SD1-46_ASONControlPlaneManagement-Scenarios.pdf >
     * SD1-46_ASONControlPlaneManagement-Scenarios</a>
     * If a MLSN
     * which represents a MLRA, is introduced as an input parameter, the operation 
     * retrieves only MLSNPPs of the addressed MLSN (only MLSNPPs directly within the MLRA are replied). 
     * If no MLSN is specified then all MLSNPPs available to the EMS are returned.</p>
  
     * <p>Note that the MLSNPP represents SNPPs that are pools
     * of SNPs that correspond to CTPs of G.805 TCP type while the
     * SNPPs that group SNPs that represent G.805 CPs are retrieved as a component
     * of the MLSNPPLink.</p>
     * The reply may be an empty
     * or a partial list depending upon the visibility that EMS has of the control plane: <br> <ul>
     * <li><b>Local & Complete:</b> The EMS completely manages the MLRA 
     * and the supporting transport plane resources (ME, TP etc) such that 
     * it can provide a complete view of the MLSNPPs and all associated transport plane data.</li>
     * <li><b>Local CP Only:</b> The EMS manages the MLRA but has no view 
     * of the supporting transport plane resources such that it can provide a complete view 
     * of the MLSNPPs but can not provide any associated transport plane data.</li>
     * <li> <b>Remote CP Transparent:</b> The EMS manages the MLRA at this level 
     * but may not have a view of the details of the subordinate MLRA levels 
     * and has no view of the supporting transport plane resources, 
     * such that it can provide a complete view of the MLSNPPs 
     * but not necessarily all of the SNPP aliases and can not provide 
     * any associated transport plane data.  </li>
     * <li> <b>Remote CP Limited:</b> The EMS partially manages the MLRA at this level 
     * and may not have a view of the details of the subordinate MLRA levels 
     * and has no view of the supporting transport plane resources, 
     * such that it can provide a view of some of the MLSNPPLinks 
     * and not necessarily all of the subordinate SNPP for those MLSNPPs 
     * and can not provide any associated transport plane data.</li>
     * <li> <b>Remote CP Opaque:</b> The EMS is unable to provide 
     * any information related to MLSNPPs for the specified MLRA.</li> </ul>
  
  
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >
     * SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the MLRA for 
     * which to retrieve the MLSNPPs. This is an optional input parameter to the
     * operation.
     * boolean <b>sNPListRequested</b>: It indicates whether the SNPs details
     * should be included in the response or not.
     * <br>unsigned long how_many: Maximum number of MLSNPPs to return in the 
     * first batch.
     * <br>mLSNPP::MLSNPPList_T mLSNPPList: First batch of MLSNPPs
     * <br>mLSNPP::MLSNPPIterator_I mLSNPPIt: Iterator to get the remaining
     * MLSNPPs
     * <br><b>Raises</b> globaldefs::ProcessingFailureException<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when the subnetName does not reference a 
     *  MLRA object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the subnetName references an object that 
     *  does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getAllMLSNPPs (globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, mLSNPP.MLSNPPList_THolder mLSNPPList, mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws globaldefs.ProcessingFailureException;

  /** 
     *<p>This operation provides a way for the NMS to retrieve all 
     * details of the Calls and associated Top Level Connections in the scope
     * of a specified MLSN which represents a top level MLRA.</p>
     * An EMS will only return the Calls and top level Connections that it
     * controls the Originating Point of. By implication this
     * informs the NMS which EMS controls each Call.</p>
     * Note that the reply can be an empty list, if there are no Calls
     * established from any of the points controlled by the EMS.
     *
     * <p>In order to allow the NMS to deal with a large number of objects,
     * this operation uses an iterator. See
     * <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
     * for information on how iterators are used in this interface.</p>
     *
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the MLSN which
     * represents the top level MLRA and contains the Calls to be retrieved.
     * 
     * <br>unsigned long how_many: Maximum number of CallAndTopLevelConnections
     * to report in the first batch.
     * <br>callSNC::CallAndTopLevelConnectionsList_T callAndTopLevelConnections:
     * First batch of CallAndTopLevelConnections_T.
     * <br>callSNC::CallAndTopLevelConnectionsIterator_I CallAndTopLevelConnectionsIt:
     * Iterator to retrieve the remaining CallAndConnections.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if the subnetName entered as an input
     *  is syntactically incorrect or identifies an object of the wrong type or
     *  is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the subnetName references an
     *  object that does not exist. <br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified MLSN is not a Top Level MLRA. 
     * Raised if the specified Top Level MLRA is not controlled by Control Plane. <br>
     * EXCPT_NE_COMM_LOSS - Raised when communications to managedElement is 
     *  lost or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     * <br>
     **/
  void getAllCallsAndTopLevelConnections (globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException;

  /**
     * This operation allows the NMS to retrieve the attributes of all the Calls, 
     * top level connections and subordinate SNCs associated with a subnetwork. 
     * This operation does not apply to control plane enhanced subnetworks, see 
     * <a href=../../../supportingDocumentation/SD1-44_ConnectionlessTechnologyManagement.pdf > 
     * SD1-44 Connectionless Technology Management </a> for further details 
     * on Call management in non-control plane networks. 
     *
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the subnetwork 
     * that contains the Calls. 
     * <br>unsigned long how_many: Maximum number of CallAndTopLevelConnectionsAndSNCsList_T
     * to report in the first batch.
     * <br>callSNC::CallAndTopLevelConnectionsAndSNCsList_T callAndTopLevelConnectionsAndSNCsList:
     * First batch of CallAndTopLevelConnectionsAndSNCsList_T.
     * <br>callSNC::CallAndTopLevelConnectionsAndSNCsIterator_I callAndTopLevelConnectionsAndSNCsIt:
     * Iterator to retrieve the remaining Call and Connections.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException 
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically incorrect 
     * or identifies an object of the wrong type or is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an object 
     * that does not exist. <br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified MLSN is an MLRA which is managed by Control Plane. <br> 
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with the NE 
     * and communication is required to complete the request. <br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>   
     **/
  void getAllCallsAndTopLevelConnectionsAndSNCs (globaldefs.NameAndStringValue_T[] subnetName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;

  /**  
     * <p>This operation has exactly the same behaviour as 
     * getAllCallsAndTopLevelConnections(), except that the request returns only Calls 
     * (and all Top Level Connections) that have at least one Top Level connection 
     * terminated on an SNP that corresponds to a TP contained in the specified ME.</p>
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the MLSN which
     * represents the top level MLRA and contain the calls to be retrieved
     * globaldefs::NamingAttributes_T <b>meName</b>: The name of the ME.<br>
     * <br>unsigned long how_many: Maximum number of CallAndTopLevelConnections
     * to report in the first batch.
     * <br>callSNC::CallAndTopLevelConnectionsList_T callAndTopLevelConnections:
     * First batch of CallAndTopLevelConnections_T.
     * <br>callSNC::CallAndTopLevelConnectionsIterator_I callAndTopLevelConnectionsIt:
     * Iterator to retrieve the remaining CallAndConnections.<br>
     * <b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect or identifies an object of the wrong type or is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified MLSN is not a Top Level
     *  MLRA. Raised if the specified Top Level MLRA is not controlled by Control Plane.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     **/
  void getAllCallsAndTopLevelConnectionsWithME (globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws globaldefs.ProcessingFailureException;

  /**  
     * <p>This operation has exactly the same behaviour as 
     * getAllCallsAndTopLevelConnectionsAndSNCs(), except that the request returns 
     * only Calls (and all Top Level Connections with their supporting SNCs) 
     * that have at least one Top Level connection terminated on the specified ME.</p>
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the subnetwork 
     * that contains the calls. 
     * globaldefs::NamingAttributes_T <b>meName</b>: The name of the ME.<br>
     * <br>unsigned long how_many: Maximum number of CallAndTopLevelConnectionsAndSNCsList
     * to report in the first batch.
     * <br>callSNC::CallAndTopLevelConnectionsAndSNCsList_T callAndTopLevelConnectionsAndSNCsList:
     * First batch of CallAndTopLevelConnectionsAndSNCsList_T.
     * <br>callSNC::CallAndTopLevelConnectionsAndSNCsIterator_I callAndTopLevelConnectionsAndSNCsIt:
     * Iterator to retrieve the remaining CallAndConnections.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException 
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically incorrect 
     * or identifies an object of the wrong type or is out of range
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an object 
     * that does not exist. 
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified MLSN is an MLRA. 
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with the NE 
     * and communication is required to complete the request.   
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     **/
  void getAllCallsAndTopLevelConnectionsAndSNCsWithME (globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] meName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllCallsAndTopLevelConnectionsAndSNCs(), except that the request returns 
     * only Calls (and all Top Level Connections with their supporting SNCs) 
     * that have at least one Top Level connection supported by the specified TP 
     * (either directly or via a TP contained in this TP).</p>
     * <br>globaldefs::NamingAttributes_T subnetName: The name of the subnetwork 
     * that contains the calls. 
     * globaldefs::NamingAttributes_T <b>tPName</b>: The name of the termination
     * point. This name must be explicit
     * (a generic endpoint specification may not be used in this case). 
     * See <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on TP naming.
     * <br>unsigned long how_many: Maximum number of CallAndTopLevelConnectionsAndSNCsList
     * to report in the first batch.
     * <br>
     * callSNC::CallAndTopLevelConnectionsAndSNCsList_T <b>callAndTopLevelConnectionsAndSNCsList</b>:
     * First batch of CallAndTopLevelConnectionsAndSNCsList_T.
     * callSNC::CallAndTopLevelConnectionsAndSNCsIterator_I <b>CallAndTopLevelConnectionsAndSNCsIt</b>:
     * Iterator to retrieve the remaining CallAndConnectionsList_T.
     * <b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect or identifies an object of the wrong type or is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified MLSN is an MLRA which is managed by Control Plane. 
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE and communications is required to complete the request.
     * EXCPT_TOO_MANY_OPEN_ITERATORS - Raised when maximum number of iterators 
     *  that the EMS can support has been reached<br>
     **/
  void getAllCallsAndTopLevelConnectionsAndSNCsWithTP (globaldefs.NameAndStringValue_T[] subnetName, globaldefs.NameAndStringValue_T[] tPName, int how_many, callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This allows an NMS to request for the ID of all Calls
     * supported by the specified TP Name.
     *
     * A call is considered as using the specified TP if any of its supporting connections 
     * use an SNP that corresponds to the specified TP or a TP contained in the specified TP.
     *
     * Note that this operation only returns calls ID and not other details as
     * it is only the ID that will be available to the control plane. 
     * In fact this operation applies only in control plane context. For example
     * if a PTP in the centre of the network is referenced, the control plane
     * will be aware of the ID of the calls  that pass through the resources of
     * that PTP that have been allocated to the control plane but will not be
     * aware of any other details for calls that originate outside the routing
     * area to which the resources from the PTP are allocated.
     * 
     * <br>globaldefs::NamingAttributes_T <b>tpName</b>: Termination point. The
     * termination point name must be explicit (a generic endpoint specification
     * may not be used in this case). See 
     * <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >
     * SD1-25  Object Naming</a> for
     * further detail on TP naming.<br>
     * <br>callSNC::CallIdList_T callIdList: The list of Call Ids retrieved. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if the TP name is syntactically incorrect
     *  or identifies an object of the wrong type or is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the TP name references an object
     *  that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     *  and communications is required to complete the request.<br>
     * 
     **/
  void getAllCallIdsWithTP (globaldefs.NameAndStringValue_T[] tPName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException;

  /**<p>This operation has exactly the same behaviour as getAllCallIdsWithTP,
     * but instead of using TP as an input, it specifies a SNPP or TNA Name.</p>
     *
     * <br>globaldefs::NameAndStringValue_T sNPPOrTNAName: It identifies 
     * the sNPP or TNA Name provided as an input.
     * See <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
     * Object Naming</a> for further detail on SNPP or TNA naming.
     * <br>callSNC::CallIdList_T callIdList: List of Call IDs. 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised any of the input parametersd is syntactically
     *  incorrect or identifies an object of the wrong type or is out of range<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getAllCallIdsWithSNPPOrTNAName (globaldefs.NameAndStringValue_T sNPPOrTNAName, callSNC.CallIdList_THolder callIdList) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllCallsAndTopLevelConnectionsAndSNCs(), except that the request returns 
     * only the named call (and all Top Level Connections with their supporting SNCs).</p>
     * globaldefs::NamingAttributes_T callName: The call name provided by the NMS.<br>
     * callSNC::CallAndTopLevelConnectionsAndSNCs_T callAndTopLevelConnectionsSNCs:
     * It provides the Call and the supporting top level connections and SNCs.<br>
  
     * <br><b>Raises</b> globaldefs::ProcessingFailureException 
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal failure
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically incorrect 
     * or identifies an object of the wrong type or is out of range
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an object 
     * that does not exist. 
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified Call is defined in a MLRA which is managed by Control Plane.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with the NE 
     * and communication is required to complete the request.<br>
     **/
  void getCallAndTopLevelConnectionsAndSNCs (globaldefs.NameAndStringValue_T[] callName, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation has exactly the same behaviour as 
     * getAllCallsAndTopLevelConnections(), except that the request returns only the call 
     * which is identified by callId or named by callName (and all Top Level Connections).</p>
     * globaldefs::NamingAttributes_T callName: The call name provided by the NMS.<br>
     * string <b>callId</b>: The identifier of the Call used by control plane.<br>
     * callSNC::CallAndTopLevelConnections_T callAndTopLevelConnections:
     * It provides the Call and the supporting top level connections.<br>
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised if Any input parameter is syntactically
     *  incorrect <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.
     * EXCPT_UNABLE_TO_COMPLY - Raised if the specified Call is not defined in a Top Level MLRA. 
     *  Raised if the specified Top Level MLRA is not controlled by Control Plane.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getCallAndTopLevelConnections (globaldefs.NameAndStringValue_T[] callName, String callId, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation provides a way to establish a point to point call with
     * zero or more top level connections.</p> 
     *
     * <p>At least one end point of the Call has to be within the EMS domain. The
     * other end points may be an "off-network" TP (i.e., addressed by a remote
     * address) or an SNP/SNPP/TNA outside the EMS domain.</p>
     *
     * <p> For more detail on the process of establishing a call in the Control
     * Plane, please see
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf> 
     * SD1-35_StateDiagrams</a> ,
     * <a href=../../../supportingDocumentation/SD1-45_ASONControlPlaneManagement-Primer.pdf > 
     * SD1-45_ASONControlPlaneManagement-Primer</a> 
     * and <a href=../../../supportingDocumentation/SD1-46_ASONControlPlaneManagement-Scenarios > 
     * SD1-46_ASONControlPlaneManagement-Scenarios</a>.</p>
     *
     * <p>If the NMS specifies routing constraints in
     * the request the connection routes shall match the constraints to the degree mandated
     * by the appropriate effort statement.</p> 
     *
     * <br> callSNC::CallCreateData_T callCreateData: Describes the call to be created.
     *
     * <br>subnetworkConnection::SNCCreateDataList_T connectionCreateData: Set of connections
     * requested to support the call.
     *
     * <br>string routeGroupsNumber: This parameter identifies the number of
     * requested Route Groups in case the Route Group names are not provided
     * with the Connection-related data. Value "0" means that the NMS doesn't
     * care about the number of Route Groups.
     * Value "NA" means that this parameter can be ignored.
     *
     * <br>subnetworkConnection::TPDataList_T tpsToModify: A list of TPs and 
     * parameters to apply, updated to provide the resulting parameters. 
     * If a given entry in the list of transmission parameters specified in the 
     * TPData_T can not be successfully applied to the TP, for any reason, then 
     * the errorReason field is appended with an appropriate reason text. Applying 
     * transmission parameters is best-effort and the resulting values of the 
     * transmission parameters are provided in the updated tpsToModify 
     * parameter.<br>
     *
     * <br>callSNC::CallAndTopLevelConnections_T callAndTopLevelConnections: 
     * Provides information on the call and list of connections that were created.
     *
     * <br>SubnetworkConnection::SNCCreateDataList_T connectionsNotCreated:
     * The list of connection requests provided as input that could not be
     * created. This response is only supplied in the case of the establishment 
     * of a non Control Plane call.
     *
     * subnetworkConnection::SubnetworkConnectionList_T partialSNCs:
     * The List of SNCs that were partially created during the operation. 
     * This response is only supplied in the case of the establishment of a non Control Plane call.
     * 
     * <br>string errorReason: Specifies the creation error(s) if any.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service <br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect or identifies an object of the wrong type or is out of range. 
     * Raised if the layer parameters are inconsistent, for
     *  example where two parameters at one TP conflict.
     * <br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.
     * EXCPT_UNABLE_TO_COMPLY -Raised if the EMS does not control the
     *  originating end of the call.
     *  Raised when the layer parameters are inconsistent, for example where
     *  two parameters at one TP conflict or where a parameter at one end of
     *  the Connection has  a value that is illegal with respect to a parameter
     *  value at the other end of the Connection.
     *  Raised when the Diversity requirements contradict each other (E.g. when
     *  the NMS provides a routeGroupsNumber and the additional info parameter routeGroupLabel 
     *  is provided in at least one Connection).
     *  <br>
     * EXCPT_OBJECT_IN_USE - Raised when any object identified in the request
     *  is currently in use.<br>
     * EXCPT_USERLABEL_IN_USE - Raised when the call or connection user label
     *  uniqueness constraint is not met.   
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS: The routing 
     *  constraints is not supported by EMS or network. <br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void establishCall (callSNC.CallCreateData_T callCreateData, subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, String routeGroupsNumber, subnetworkConnection.TPDataList_THolder tpsToModify, callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs, subnetworkConnection.SNCCreateDataList_THolder sNCsNotCreated, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws globaldefs.ProcessingFailureException;

  /**  
     * <p>This operation allows the NMS to modify the following attributes of a
     * Call in accordance with the NMS provided parameter list<ul>:
     * <li> - User label</li>
     * <li>- Owner</li>
     * <li>- Network access domain</li>
     * <li>- Additional information</li> </ul>
     * This operation is used to modify only the attributes of the Call, the
     * bandwidth is modified through other operations. This operation is best
     * effort except the change of the user label with user label uniqueness.</p>
     *
     * globaldefs::NamingAttributes_T <b>callName</b>:
     * <br>The name of the call to modify.<br>
     *
     * callSNC::CallModifyData_T <b>callModifyData</b>:
     * <br>Structure describing how the call should be modified.<br>
     *
     * callSNC::Call_T <b>modifiedCall</b>:
     * <br>The modified call.<br>
     *
     * <b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service <br>
     * EXCPT_INVALID_INPUT - Raised when any input parameter is syntactically 
     *  incorrect (e.g. field of callModifyData is invalid).<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when callName references an object that does 
     *  not exist<br>
     * EXCPT_USERLABEL_IN_USE - The user label uniqueness constraint is not met;
     *  the specified user label is currently being used.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * <br>
     **/
  void modifyCall (globaldefs.NameAndStringValue_T[] callName, callSNC.CallModifyData_T callModifyData, callSNC.Call_THolder modifiedCall) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation provides a way to release a call. </p>
     * <p>In the control plane case, it is assumed that the control plane
     * will remove the connections from the network, delete the connection
     * objects, remove the call, delete the call object and send appropriate
     * notifications to the NMS. See
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf > 
     * SD1-35_StateDiagrams</a>. </p>
     * <p>In the non Control Plane case the EMS will return the list of SNCs which could not be deleted.</p>
     *
     * globaldefs::NamingAttributes_T callName: The call to be released.   
     * <br>subnetworkConnection::TPDataList_T tpsToModify: A list of TPs and 
     * parameters to apply, updated to provide the resulting parameters. 
     * If a given entry in the list of transmission parameters specified in the 
     * TPData_T can not be successfully applied to the TP, for any reason, then 
     * the errorReason field is appended with an appropriate reason text. Applying 
     * transmission parameters is best-effort and the resulting values of the 
     * transmission parameters are provided in the updated tpsToModify 
     * parameter.<br>
     *
     * subnetworkConnection::SubnetworkConnectionList_T <b>remainingSNCs</b>:
     * Connections that could not be deleted.
     * <br>string errorReason: Specifies the error(s) if any.
     * 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure and the operation could not be performed<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect or identifies an object of the wrong type or is out of range.
     * Raised if the layer parameters are inconsistent, for
     *  example where two parameters at one TP conflict.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when callName/TPName references an object that does 
     *  not exist<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS can not remove the call. Based on
     *  service provider preferences, it may be raised when the EMS determines
     *  that the call is carrying traffic.<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     *  <br>
     **/
  void releaseCall (globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /** 
     * This operation allows the NMS to retrieve all of the attributes of 
     * a Call managed by an EMS given an NMS specified callName.
     * <br>globaldefs::NamingAttributes_T callName: The Name of the call to be retrieved
     * <br>callSNC::Call_T theCall: The retrieved Call<br> 
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when callName does not reference a  
     *  call object<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when callName references a call object
     *  that does not exist (E.g. when EMS does not control the originating end,
     *  the call information is not available at this EMS.<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void getCall (globaldefs.NameAndStringValue_T[] callName, callSNC.Call_THolder theCall) throws globaldefs.ProcessingFailureException;

  /**  
     * This operation provides a way to add one or more 
     * supporting connections to an existing call and set any necessary TP Data.
     * In a Control Plane environment it is assumed that the Control Plane will
     * either set up the entire top level Connection or will fail the entire top
     * level Connection; there is no partial top level Connection state. 
     * <p>In the non Control Plane case the EMS will return the list of SNCs in partial state. See
     * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf > 
     * SD1-35_StateDiagrams</a>. </p>
     * 
     * <p>If the NMS specifies routing constraints in
     * the request the connection routes shall match the constraints to the degree mandated
     * by the appropriate effort statement.</p> 
     * globaldefs::NamingAttributes_T callName: The call name for which to add
     * a set of connections.
     * subnetworkConnection::SNCCreateDataList_T connectionsToAdd: The 
     * list of connections to be added. 
     *  
     * <br>boolean <b>ConnectionRouteReArrangementAllowed</b>:
     * Indicates whether any existing connections of call can be rearranged in order
     * to meet the request.<br>
     * subnetworkConnection::TPDataList_T <b>tpsToModify</b>: The TPs to be modified. 
     * subnetworkConnection::SubnetworkConnectionList_T connectionList: The List
     * of Connections that were added.
     * SubnetworkConnectionList::SubnetworkConnectionList_T partialSNCs:
     * The list of SNCs added to the Call that are in partial state.
     * <br>string <b>errorReason</b>: Specifies the error(s) if any.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if the EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when at least one input parameter is 
     *  syntactically incorrect or identifies an object of the wrong type or
     *  is out of range. Raised if the layer parameters are inconsistent, for
     *  example where two parameters at one TP conflict.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.
     * EXCPT_UNABLE_TO_COMPLY - Raised if diversity
     *  or co-routing are requested but not all Connections to be added do
     *  specify a "Route Group Label". Raised if the layer parameters are
     *  inconsistent (E.g. two parameters at one TP conflict, a parameter at one
     *  end of the Connection has an illegal value with respect to a parameter
     *  value at the other end). If the EMS cannot determine the reason it could not comply, it 
     *  is also allowed to throw EXCPT_UNABLE_TO_COMPLY. <br>
     * EXCPT_OBJECT_IN_USE - Raised when any object identified in the request
     *  is currently in use.<br>
     * EXCPT_USER_LABEL_IN_USE - Raised when the NMS requested top level Connection user
     *  label uniqueness and the specified user label already exists in the EMS<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS - Raised if EMS/Control Plane can not
     *  support the routing constraints. Raised if the EMS/network can not
     *  determine the route without Connection rearrangement and
     *  ConnectionRouteReArrangement is not allowed.<br>
     * EXCPT_CAPACITY_EXCEDEED - Raised if the number of additional connections exceeds
     *  the maximum provisionable.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * 
     **/
  void addConnections (globaldefs.NameAndStringValue_T[] callName, subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder connectionList, subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /** 
     * <p>This operation provides a way to remove one or more connections  
     * from an existing call and to set any
     * necessary TP Data.</p>
     * As a consequent action, the control plane removes the connections from 
     * the network, delete the connection objects, and send appropriate 
     * notifications to the NMS.
     * In the non Control Plane case the EMS will return the list of SNCs which could not be deleted.
     *
     * globaldefs::NamingAttributes_T callName: The name of the call from which
     * the specified connections will be removed.<br>
     * globaldefs::NamingAttributesList_T connectionNamesList: The list
     * of Connections to be removed.</b>
     * TPDataList_T <b>tpsToModify</b>: The TPs to modify.
     * SubnetworkConnectionList::SubnetworkConnectionList_T sNCsNotDeleted:
     * The list of Top Level Connections that could not be removed.
     * <br>string errorReason: Specifies the error(s) if any.
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_INVALID_INPUT - Raised when at least one input parameter is 
     *  syntactically incorrect or identifies an object of the wrong type or
     *  is out of range. Raised if the layer parameters are inconsistent, for
     *  example where two parameters at one TP conflict.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does not exist.<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS can not respond to the request.
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     **/
  void removeConnections (globaldefs.NameAndStringValue_T[] callName, globaldefs.NameAndStringValue_T[][] connectionNamesList, subnetworkConnection.TPDataList_THolder tpsToModify, subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws globaldefs.ProcessingFailureException;

  /**
     * <p>This operation provides the NMS with the routes of the connections 
     * that support top level connections of the referenced Call. 
     * The request may be tailored by the following allowed input combinations.
     *  
     * In the case of a 2 level routing area hierarchy:
     * - CallID only: the EMS should return the top level connections 
     * supporting the call and their detailed routes. 
     * - CallID and sNPOrSNPPID: The EMS should return the routes 
     * for the connection(s) that originate from the referenced SNP or SNPP for the referenced call. 
     * If the SNP or SNPP is at the hierarchical level of a routing node, then the response is an empty list.
     *
     * In the case of a 3 level routing area hierarchy 
     * - CallID only: The EMS should return the routes for all connections 
     * that support any top level connection of the referenced call, 
     * for all MLRAs directly managed by the EMS. 
     * - CallID and mLRAName: The EMS should return the routes for all connections 
     * within the referenced MLRA that support any top level connection 
     * of the referenced call (there could be more than one top level connection for the same call 
     * passing through an MLRA). If the referenced MLRA is a routing node, 
     * then the response is an empty list. If the reference MLRA is the top level MLRA 
     * then the response will only include a list of all of the top level connections supporting the call. 
     * - CallID and sNPOrSNPPID: The EMS should return the routes for the connection(s) 
     * that originate from the referenced SNP or SNPP of the referenced call. 
     * If the SNP or SNPP is at the hierarchical level of a routing node, then the response is an empty list. 
     * If the SNP or SNPP is at the top level then the response will only include 
     * a list of all of the top level connections, that originate from the specified SNP(P), 
     * supporting the call. 
     *
     * In all cases the output is filtered appropriately by routeType. 
     * All Routing Node Connections for a particular route will be returned 
     * regardless of any sharing of the same Routing Node Connections 
     * among distinct routes of the same Call.
     *
     * Optionally the response may include the edge and internal MLSNPP Links.</p> 
     *
     * <p> Note: given an SNCP scheme, the replied home route will always include
     * both main and spare legs of the SNCP protection, while the replied actual
     * route may return only one leg, if only such leg is currently active in the
     * network. Once the CP routing succeeds to activate the spare leg, then both
     * legs are replied when actual route is asked.</p>
     *
     * string <b>callID</b>: <br>This attribute represents the control plane identifier of the
     * Call. 
     * globaldefs::NamingAttributes_T <b>mLRAName</b>: The name of the MLSN which
     * represents a MLRA<br>
     * string <b>sNPOrSNPPID</b>: 
     * The control plane identifier of the point selected for filtering purposes. 
     * <br>
     * boolean <b>mLSNPPLinkRequested</b>: Indicates whether the response should
     * include MLSNPPLink information.<br>
     *
     * callSNC::RouteType_T <b>routeType</b>: Indicates whether the response should
     * include Home/intended route, Actual/Current route or Both.<br>
     *
     * callSNC::SNCAndRouteList_T <b>connectionAndRouteList</b>: Provides the connection(s) 
     * and their route details where they are available.  The route details
     * are given in terms of Routing Node Connections.  
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised in case of non-specific EMS internal 
     *  failure<br>
     * EXCPT_NOT_IMPLEMENTED - Raised if EMS cannot support this service<br>
     * EXCPT_INVALID_INPUT - Raised if any input parameter is syntactically
     *  incorrect. Raised if the adressed MLSN does not
     *  represent a MLRA.<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if the EMS can not access the route information<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when the input parameter references an
     *  object that does  not exist (the referenced MLRA does not exist)<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * <br>
     **/
  void getConnectionsAndRouteDetails (String callID, globaldefs.NameAndStringValue_T[] mLRAName, String sNPOrSNPPID, boolean mLSNPPLinkRequested, String routeType, callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws globaldefs.ProcessingFailureException;

  /** 
     * This operation allows the NMS to request the EMS to modify diversity and co-routing
     * parameters of an existing Call and its supporting SNC/Connections. The diversity
     * and co-routing parameter set includes a route group label for each SNC/Connection.
     * If the request indicates that rerouting is allowed then one or more SNC(s)/Connection(s) 
     * may remain in "Searching"/"Partial" state.
     * If all diversity requirement parameters are set to "None" and routeGroupsNumber is "None", 
     * the EMS will remove all diversity and
     * co-routing requirements for the Call.
     *
     * globaldefs::NamingAttributes_T <b>callName</b>: The name of the call for
     * which to modify diversity<br>
     *
     * callSNC::Diversity_T <b>callDiversity</b>: The new diversity and corouting requirements for the call.<br>
     * RouteGroupInfoList_T <b>routeGroupInfoList</b>:
     * The list of Connections and for each the routeGroupLabel.
  *
     * boolean <b>connectionRouteReArrangementAllowed</b>:
     * Indicates whether connections may be rerouted in order
     * to meet the request.<br>
     *
     * string <b>routeGroupsNumber</b>: Indicates the number of route groups 
     * to be established for the connections of the call.<br>
     *
     * <br>callSNC::CallAndTopLevelConnections_T <b>callAndTopLevelConnections</b>: 
     * Provides the call and list of connections with their resulting parameters.
     *
     * <br><b>Raises</b> globaldefs::ProcessingFailureException <br>
     * EXCPT_INTERNAL_ERROR - Raised when the operation could not be performed and
     *  there is non-specific EMS internal failure<br>
     * EXCPT_NOT_IMPLEMENTED - The EMS does not support this service.<br>
     * EXCPT_UNABLE_TO_COMPLY - Raised if connectionRouteReArrangementAllowed is set to not allow rerouting
     *  and rerouting is required in order to satisfy the criteria.<br>
     * EXCPT_ENTITY_NOT_FOUND - Raised when a call or connection does not exist.<br>
     * EXCPT_INVALID_INPUT - The request contains an input parameter that is
     *  syntactically incorrect or identifies an object of the wrong type or is
     *  out of range.<br>
     * EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS: The EMS does not support routing 
     *  the constraints specified.<br>
     * EXCPT_NE_COMM_LOSS - Raised when the EMS is unable to communicate with
     *  the NE or the EMS is unable to communicate with any Control Plane component 
     * and communications is required to complete the request.<br>
     * <br>
    **/
  void modifyDiversityAndCorouting (globaldefs.NameAndStringValue_T[] callName, callSNC.Diversity_T callDiversity, callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, String routeGroupsNumber, globaldefs.NVSList_THolder additionalInfo, callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws globaldefs.ProcessingFailureException;
} // interface MultiLayerSubnetworkMgr_IOperations
