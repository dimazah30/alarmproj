package terminationPoint;

/**
* terminationPoint/TerminationMode_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>TerminationMode has the following values: </p>
   * <br>TM_TERMINATED_AND_AVAILABLE_FOR_MAPPING:<ul>
   * <li>CTP: The CTP can be mapped and currently is (i.e., it has contained 
   * actual CTPs). This indicates that the G.805 CPs adapted from the 
   * corresponding G.805 Termination Function within the CTP aggregate are 
   * available to provide client layer capacity (e.g. STS1 terminated and mapped 
   * to VT1.5 i.e. channelized). In this state the TCP will be sourcing and 
   * sinking traffic. This is only a valid value for CTPs that support client 
   * adaptation.</li>
   * <li>FTP: The FTP can be mapped on the server side and currently is (i.e., 
   * it has contained actual CTPs on the server side). This indicates that the 
   * FTP supports IM (Inverse Multiplexing) and the server side contained CTPs 
   * (if any) are available for connection as the FTP is actively assembling the 
   * fragments of the IM. This value is not valid for an FTP that does not 
   * support IM. (see <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a> </p>
   * for more details).</li>
   * <li>PTP: This value is not valid for a PTP.</li></ul><br> 
   * TM_NEITHER_TERMINATED_NOR_AVAILABLE_FOR_MAPPING:<ul>
   * <li>CTP: The CTP can be mapped but currently is not (i.e., it does have 
   * contained potential CTPs, but currently has no contained actual CTPs). 
   * This indicates that the G.805 CP aggregated in the 
   * CTP is not connected to a TCP (that would be aggregated in the same 
   * CTP) and therefore the CTP is available for SNC/crossconnect 
   * connectivity (e.g. STS1 not terminated and not mapped to VT1.5i.e. not 
   * channelized).</li>
   * <li>FTP: The FTP can be mapped on the server side but currently is not 
   * (i.e., it does have contained potential CTPs on the server side, but 
   * currently has no contained actual CTPs on the server side). This indicates 
   * that the FTP supports IM (Inverse Multiplexing) but the IM function is 
   * not active and the TCP within the FTP is available for external 
   * SNC/crossconnect connectivity.</li>
   * <li>PTP: This value is not valid for a PTP.</li></ul><br>
   * TM_NA:<ul>
   * <li>CTP: The CTP can not be mapped (i.e., it has no contained potential 
   * CTPs). This indicates that an SNC/crossconnect can be used to connect the 
   * G.805 TCP of the CTP to the connection point of another CTP/FTP. This 
   * only applies to CTPs that connect on their server side and are related to 
   * the containing PTP/FTP on their client side.</li>
   * <li>FTP: The FTP can not be mapped on the server side (i.e., it has no 
   * contained potential CTPs on the server side). This indicates that an 
   * SNC/crossconnect can be used to connect the G.805 TCP of the FTP to the 
   * connection point of another CTP/FTP. This only applies to FTPs that connect 
   * on their server side and do not support IM (Inverse Multiplexing).</li>
   * <li>PTP: This is the only legal value for a PTP</li></ul><br>
   * <br>
   *
   * <p>For more discussion on terminationMode see
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   *
   * <p>For ATM SNCs, the Terminated and Mapped parameter of a VP or VC CTP is 
   * used to model a VPC or a VCC terminating within the Managed Element (i.e.
   * internal VP or VC Trails). Such a terminated ATM connection is used as a
   * trail acting as a server for upper layer protocols (e.g., VCCs in case of a 
   * VPC TP,Frame Relay in case of a VCC TP). In the two switching layer ATM 
   * model, the VP layer acts as the infrastructure on which VC Connections 
   * (either PVC, SPVC or SVC) are routed and switched. This capability allows 
   * the operator to build a logical partitioning (VP overlay) of the physical 
   * ATM network by configuring VPCs (or VP "tunnels") which are terminated 
   * inside the subnetwork. Such overlay VP network allows operators to 
   * aggregate and segregate VCs according to their traffic management policy. 
   * In addition, the use of an intra-subnetwork VPC may provide for enhanced 
   * protection of the VC traffic by using 1+1 VP protection (VP protection is 
   * not supported in this release of the EMS-NMS interface). In order to be 
   * able to make routing decisions at VC level (e.g., explicit route 
   * constraint), the NMS needs to know the VP topology available from the ATM 
   * network.</p>
   *
   * <p>Note that requesting the operator to explicitly set up an overlay VP 
   * network as a pre-requisite for passing any VC traffic may be cumbersome and 
   * in some case results in a sub-optimal use of the ATM links. For that 
   * reason, most ATM NEs provide for an alternative which allows for each ATM 
   * NE to act as a VC switch without having to explicitly configure VPs (i.e., 
   * each ATM link acts as an internal VP link between two adjacent nodes).</p>
   **/
public final class TerminationMode_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TerminationMode_T value = null;

  public TerminationMode_THolder ()
  {
  }

  public TerminationMode_THolder (terminationPoint.TerminationMode_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TerminationMode_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TerminationMode_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TerminationMode_THelper.type ();
  }

}
