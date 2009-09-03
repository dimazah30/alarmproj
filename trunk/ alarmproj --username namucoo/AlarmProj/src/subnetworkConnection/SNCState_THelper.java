package subnetworkConnection;


/**
* subnetworkConnection/SNCState_THelper.java .
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
abstract public class SNCState_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/SNCState_T:1.0";

  public static void insert (org.omg.CORBA.Any a, subnetworkConnection.SNCState_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static subnetworkConnection.SNCState_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (subnetworkConnection.SNCState_THelper.id (), "SNCState_T", new String[] { "SNCS_NONEXISTENT", "SNCS_PENDING", "SNCS_ACTIVE", "SNCS_PARTIAL"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static subnetworkConnection.SNCState_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return subnetworkConnection.SNCState_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, subnetworkConnection.SNCState_T value)
  {
    ostream.write_long (value.value ());
  }

}
