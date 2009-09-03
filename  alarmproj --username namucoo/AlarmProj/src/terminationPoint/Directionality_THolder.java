package terminationPoint;

/**
* terminationPoint/Directionality_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>Direction for a TerminationPoint:</p>
   * <br>D_NA = used when the directionality specification is not 
   * necessary.<br>
   * D_BIDIRECTIONAL = source and sink (transmit and receive).<br>
   * D_SOURCE = source (transmit).<br>
   * D_SINK = sink (receive).<br> 
   * <br>
   *
   * <p>The directionality of PTPs is defined from an external point of view,
   * while the directionality of CTPs is defined from an internal point of view.
   * Consequently, sink PTPs generate source CTPs, and sink CTPs form source 
   * PTPs.
   * Refer to <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a> and
   * to <a href=../../../supportingDocumentation/SD1-18_layers.pdf >
   * SD1-18 Functional Modelling Concepts</a>.</p>
   * for further information on termination point and connection directionality.</p>
   *
   * <p>Note that ATM termination points (LR_ATM_NI, LR_ATM_VP and LR_ATM_VC) 
   * are always bi-directional even though the traffic may be asymmetric (and 
   * eventually null in one of the two directions).</p>
   **/
public final class Directionality_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.Directionality_T value = null;

  public Directionality_THolder ()
  {
  }

  public Directionality_THolder (terminationPoint.Directionality_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.Directionality_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.Directionality_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.Directionality_THelper.type ();
  }

}
