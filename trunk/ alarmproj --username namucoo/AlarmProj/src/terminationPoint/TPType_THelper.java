package terminationPoint;


/**
* terminationPoint/TPType_THelper.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>As the interface is coarse grained, TPs are modeled as pure data objects
   * and do not appear as first class CORBA objects at the 
   * interface between the NMS and EMS.</p>
   *
   * <p>The PTP or Physical Termination Point represents a single port of an
   * NE. The PTP is an aggregate of G.805 TCPs, G.805 Termination Functions 
   * and G.805 CPs etc at many layers. The PTP approach is used for performance 
   * and interface simplification.</p>
   *
   * <p>A CTP in this model may correspond directly to a single G.805 CP or may
   * represent an aggregate of G.805 TCPs, G.805 Termination Functions 
   * and G.805 CPs etc at many layers. A CTP may also include the G.805 
   * adaptation function of IM (Inverse Multiplexing) in the aggregation or may
   * include the fragment TCP of IM.  See
   * <a href=../../../supportingDocumentation/SD1-14_IMOverview.pdf >SD1-14 Inverse Multiplexing 
   * overview</a> for further information on inverse multiplexing usage and
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on CTP and FTP structure for IM. </p>
   *
   * <p>A CTP may be involved in SNCs on its server side to its aggregated TCP 
   * or to its aggregated CP depending upon its structure and relationship to 
   * the containing FTP/PTP (see 
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for more details).</p>
   *
   * <p>The FTP or Floating Termination Point represents a set of G.805 
   * termination functions and G.805 connection points that are not associated 
   * directly with a physical port of an NE. The FTP is an aggregate of G.805 
   * TCPs, G.805 Termination Functions and G.805 CPs etc at many layers.
   * The FTP always contains one or more client CTPs (same as a PTP). Unlike a 
   * PTP the FTP may contain server CTPs (strictly a CTP may also contain server 
   * CTPs). An FTP may also include the G.805 adaptation function of IM 
   * (inverse multiplexing) in the aggregation.  See
   * <a href=../../../supportingDocumentation/SD1-14_IMOverview.pdf >SD1-14  Inverse Multiplexing 
   * overview</a> for further information on inverse multiplexing usage and
   * <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on CTP and FTP structure for IM.</p>
   * 
   * <p>Like a CTP the FTP may be involved in an SNC on its server side 
   * (i.e. takes the role of a CTP). An FTP that is capable of being involved in 
   * an SNC on its server side does not contain server CTPs, an FTP that is not 
   * capable of being involved in an SNC on its server side must contain server 
   * CTPs. Like the PTP, the FTP is not contained in another 
   * TP and it effectively takes the role of a PTP from a containment 
   * perspective.</p>
   *
   * <p>The FTP is not represented in the TPType_T enum explicitly, but instead 
   * is identified as a TPT_PTP based upon its role in containment.  
   * This approach was taken in release 3.0 to maximise compatibility with 
   * release 2.0.</p>
   *
   * <p>A TPPool is a set of Termination Points (CTPs, PTPs or FTPs in any 
   * mix). This type has been initially introduced to support the concept of 
   * administrative partitioning of an ATM Network Interface (a VP TPPool is 
   * defined as a set of VP CTPs).</p>
   **/
abstract public class TPType_THelper
{
  private static String  _id = "IDL:mtnm.tmforum.org/terminationPoint/TPType_T:1.0";

  public static void insert (org.omg.CORBA.Any a, terminationPoint.TPType_T that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static terminationPoint.TPType_T extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (terminationPoint.TPType_THelper.id (), "TPType_T", new String[] { "TPT_PTP", "TPT_CTP", "TPT_TPPool"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static terminationPoint.TPType_T read (org.omg.CORBA.portable.InputStream istream)
  {
    return terminationPoint.TPType_T.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, terminationPoint.TPType_T value)
  {
    ostream.write_long (value.value ());
  }

}
