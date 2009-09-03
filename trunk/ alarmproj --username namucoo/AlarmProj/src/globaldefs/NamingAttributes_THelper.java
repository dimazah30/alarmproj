package globaldefs;


/**
* globaldefs/NamingAttributes_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>The NamingAttributes_T structure is used as a naming scheme between the
   * NMS and EMS interface. 
   * NamingAttributes_T is used to define identifiers for managed entities that 
   * are not instantiated as first class CORBA objects and thus do not have 
   * object identifiers (IORs). 
   * The NamingAttributes represent "the hierarchical name structure" of  
   * a second class non-CORBA object.
   * The structure of the name is hierarchical and reflects the containment
   * relationship between objects in a simple way.</p>
   *
   * <p>See <a href=../../../supportingDocumentation/SD1-25_objectNaming.pdf >SD1-25 
   * Object Naming</a> for further detail.</p>
   **/
abstract public class NamingAttributes_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/globaldefs/NamingAttributes_T:1.0";

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
