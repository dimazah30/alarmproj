package common;


/**
* common/Capability_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 common.idl
* 2009年9月2日 星期三 下午12时53分05秒 CST
*/


/**
   * <p>A Capability_T value is used to identify a functionality supported by 
   * the EMS across the NML-EML interface. It is a name value pair, in which  
   * the name represents the feature/capability name and the value represents 
   * the support or non-support of the specified feature/capability.</p>
   * 
   * <p>The EMS capabilities for this Release include individual IDL
   * operation support.  The feature/capability name part is used to identify an 
   * IDL operation using the following convention: 
   * "<i>module_name</i>::<i>interface_name</i>::<i>operation_name</i>".</p>
   *
   * <p>There are a number of other specifiable capabilities in addition to the 
   * operation oriented capabilities:<ul>
   * <li>"Supports_CC_sharing" - defined for MultiLayerSubnetworkMgr_I indicates 
   * the EMS' SNC management mode of operation.  See
   * <a href=../../../supportingDocumentation/SD1-23_modesOfOperation.pdf >SD1-23 SNC Management Modes 
   * of Operation</a> for details.</li>
   * <li>"Supports_pending" - defined for MultiLayerSubnetworkMgr_I indicates 
   * the EMS' SNC management mode of operation.  See
   * <a href=../../../supportingDocumentation/SD1-23_modesOfOperation.pdf >SD1-23 SNC Management Modes 
   * of Operation</a> for details.</li>
   * <li>"Supports_adjacent_termination_inclusion" - defined for 
   * MultiLayerSubnetworkMgr_I indicates that the EMS 
   * allows extension of SNCs to all G.805 TCP of CTPs, PTPs and FTPs. See 
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >SD1-18 Functional Modelling Concepts</a> for details.</li>
   * </ul>
   * </p>
   *
   * <p>The currently defined values are as follows: <br>
   * <ul>
   * <li> "Supported": The specified feature/capability is fully or partially 
   *  supported across the NML-EML interface; an operation may be partially 
   *  supported if not all values of the parameters are supported.</li>
   * <li> "Unsupported": The specified feature/capability is not supported at 
   *  all across the NML-EML interface.</li>
   * </ul></p>
   *
   * <p> For Connectionless networks, the "Connectivity_Awareness" capability 
   * is added. Two values are defined: <br>
   * <ul>
   * <li> "connectivity aware" indicates that the EMS has some capability 
   * to detect the connectivity between the MFDs within an FD;<br>
   * <ul>
   * <li>  "connectivity-unaware" indicates that the EMS has no capability 
   * at all to detect connectivity between the MFDs within an FD.</li>
   * </ul></p>
   *
   * <p> Other capabilities may be added with the approval of the Specification 
   * Authority, or through bilateral agreements. </p>
   **/
abstract public class Capability_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/common/Capability_T:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.NameAndStringValue_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.NameAndStringValue_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = globaldefs.NameAndStringValue_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (common.Capability_THelper.id (), "Capability_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static globaldefs.NameAndStringValue_T read (org.omg.CORBA.portable.InputStream istream)
  {
    globaldefs.NameAndStringValue_T value = null;
    value = globaldefs.NameAndStringValue_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.NameAndStringValue_T value)
  {
    globaldefs.NameAndStringValue_THelper.write (ostream, value);
  }

}
