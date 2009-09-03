package terminationPoint;

/**
* terminationPoint/TPType_THolder.java .
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
public final class TPType_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TPType_T value = null;

  public TPType_THolder ()
  {
  }

  public TPType_THolder (terminationPoint.TPType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TPType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TPType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TPType_THelper.type ();
  }

}
