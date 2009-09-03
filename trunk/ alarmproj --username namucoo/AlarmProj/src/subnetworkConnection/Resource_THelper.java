package subnetworkConnection;


/**
* subnetworkConnection/Resource_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>An inclusion/exclusion constraint for an SNC is defined as a list of.
   * resources. A resource is defined as an MLRA, ME, TL, CTP, PTP, FTP,
   * SNC, MLSNPPLink, MLSNPP. </p>
   */
abstract public class Resource_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/subnetworkConnection/Resource_T:1.0";

  public static void insert (org.omg.CORBA.Any a, globaldefs.NameAndStringValue_T[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static globaldefs.NameAndStringValue_T[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = globaldefs.NameAndStringValue_THelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NVSList_THelper.id (), "NVSList_T", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (globaldefs.NamingAttributes_THelper.id (), "NamingAttributes_T", __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (subnetworkConnection.Resource_THelper.id (), "Resource_T", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static globaldefs.NameAndStringValue_T[] read (org.omg.CORBA.portable.InputStream istream)
  {
    globaldefs.NameAndStringValue_T value[] = null;
    value = globaldefs.NVSList_THelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, globaldefs.NameAndStringValue_T[] value)
  {
    globaldefs.NVSList_THelper.write (ostream, value);
  }

}
