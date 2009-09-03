package callSNC;


/**
* callSNC/CallState_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/**
   * The call state has dependency upon the state of the associated connections.
   * This dependency is related to call type and policy. The state values are:<ul> 
   * <li> "IN_PROGRESS": The supporting Connections are currently being created.
   * May not be valid for non Control Plane calls.</li>
   * <li> "ESTABLISHED_IN_SERVICE": All the supporting Connections have been
   * created successfully.</li>
   * <li> "ESTABLISHED_IN_SERVICE_SEARCHING": A Call has been modified through
   * the addition of Connections and not all new Connections have been successfully
   * created. 
   * May not be valid for non Control Plane calls.</li> 
   * <li> "ESTABLISHED_OUT_OF_SERVICE" All Connections have failed and
   * they are not being restored. </li>
   * <li> "ESTABLISHED_OUT_OF_SERVICE_SEARCHING" All Connections have failed
   * and they are currently being restored. 
   * May not be valid for non Control Plane calls.</li>
   * <li> "ESTABLISHED_IN_SERVICE_DEGRADED"</li> The number of failed connections
   * has reached or exceeded the degraded threshold AND the severely degraded
   * threshold has not been reached or exceeded.
   * <li> "ESTABLISHED_IN_SERVICE_SEVERELY_DEGRADED" The number of failed supporting
   * Connections has reached or exceeded the severely degraded threshold
   * (in case of LCAS support)</li>.
   * <li> "ESTABLISHED_IN_SERVICE_DEGRADED_SEARCHING " At least one supporting
   * Connection has failed (in the case of LCAS support) AND the severely
   * degraded threshold has not been reached or exceeded. 
   * The failed Connections are being restored.
   * May not be valid for non Control Plane calls.</li>.
   * <li> "ESTABLISHED_IN_SERVICE_SEVERELY_DEGRADED_SEARCHING" The number of
   * failed supporting Connections has reached or exceeded the severely degraded
   * threshold (in case of LCAS support). 
   * The failed Connections are being restored.
   * May not be valid for non Control Plane calls.</li></ul>

   * <p>See 
   * <a href=../../../supportingDocumentation/SD1-35_StateDiagrams.pdf >SD1-35_StateDiagrams</a> for details on valid transitions. 
   **/
abstract public class CallState_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/callSNC/CallState_T:1.0";

  public static void insert (org.omg.CORBA.Any a, String that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static String extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_string_tc (0);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (callSNC.CallState_THelper.id (), "CallState_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static String read (org.omg.CORBA.portable.InputStream istream)
  {
    String value = null;
    value = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, String value)
  {
    ostream.write_string (value);
  }

}
