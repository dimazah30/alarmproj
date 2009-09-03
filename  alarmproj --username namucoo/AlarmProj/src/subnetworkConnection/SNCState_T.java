package subnetworkConnection;


/**
* subnetworkConnection/SNCState_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The SNCState enum is used to represent the various states that
   * an SNC may take.</p>
   *
   * <p>The following states may be supported by the EMS, depending on the SNC
   * management mode of operation used by the EMS.
   * If the Connection is used in a Control Plane environment, the SNC State is fixed to active. 
   * See <a href=../../../supportingDocumentation/SD1-23_modesOfOperation.pdf >SD1-23 SNC Management 
   * Modes Of Operation</a> for details.<br>
   * <ul>
   * <li> SNCS_PENDING: the SNC has been created by an NMS and has not been
   *   activated by any NMS; or the SNC has been successfully deactivated by an 
   *   NMS. That state has no relationship with the network state of the cross-
   *   connects of the SNC.
   *   It is allowable for an EMS to not support the SNCS_PENDING state and to 
   *   reject any operation that attempts to put an SNC into SNCS_PENDING 
   *   state.</li>
   * <li> SNCS_ACTIVE: the SNC is not in pending state, a route has been 
   *   assigned to the SNC and all cross-connects for the SNC are active in the 
   *   network. This is the only SNC State valid for an Connection in the Control Plane environment.</li>
   * <li> SNCS_PARTIAL: the SNC is not in pending state, and either a route has 
   *   not been assigned to the SNC, or not all of the
   *   cross-connects of the SNC are active in the network.  This may or may not
   *   include activated SNCs for which there are currently no active cross-
   *   connects in the network, depending on the SNC management mode of 
   *   operation. It is possible that, in some EMSes, this state be 
   *   unreachable.</li>
   * <li> SNCS_NONEXISTENT: this is not an SNC state per se, as it applies to 
   *   "non-existent SNCs".  It is used in the interface to report SNCs that 
   *   have been deleted.
   * </li></ul></p>
   *
   * <p>See 
   * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf >
   * SD1-35_StateDiagrams </a> for details on valid transitions.</p>
   * If the SNC represents a Connection in the Control Plane, this attribute
   * is set to "SNCS_ACTIVE".
   * <br>
 **/
public class SNCState_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static subnetworkConnection.SNCState_T[] __array = new subnetworkConnection.SNCState_T [__size];

  public static final int _SNCS_NONEXISTENT = 0;
  public static final subnetworkConnection.SNCState_T SNCS_NONEXISTENT = new subnetworkConnection.SNCState_T(_SNCS_NONEXISTENT);
  public static final int _SNCS_PENDING = 1;
  public static final subnetworkConnection.SNCState_T SNCS_PENDING = new subnetworkConnection.SNCState_T(_SNCS_PENDING);
  public static final int _SNCS_ACTIVE = 2;
  public static final subnetworkConnection.SNCState_T SNCS_ACTIVE = new subnetworkConnection.SNCState_T(_SNCS_ACTIVE);
  public static final int _SNCS_PARTIAL = 3;
  public static final subnetworkConnection.SNCState_T SNCS_PARTIAL = new subnetworkConnection.SNCState_T(_SNCS_PARTIAL);

  public int value ()
  {
    return __value;
  }

  public static subnetworkConnection.SNCState_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected SNCState_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class SNCState_T
