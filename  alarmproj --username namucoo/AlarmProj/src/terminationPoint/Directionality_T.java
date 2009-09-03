package terminationPoint;


/**
* terminationPoint/Directionality_T.java .
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
public class Directionality_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static terminationPoint.Directionality_T[] __array = new terminationPoint.Directionality_T [__size];

  public static final int _D_NA = 0;
  public static final terminationPoint.Directionality_T D_NA = new terminationPoint.Directionality_T(_D_NA);
  public static final int _D_BIDIRECTIONAL = 1;
  public static final terminationPoint.Directionality_T D_BIDIRECTIONAL = new terminationPoint.Directionality_T(_D_BIDIRECTIONAL);
  public static final int _D_SOURCE = 2;
  public static final terminationPoint.Directionality_T D_SOURCE = new terminationPoint.Directionality_T(_D_SOURCE);
  public static final int _D_SINK = 3;
  public static final terminationPoint.Directionality_T D_SINK = new terminationPoint.Directionality_T(_D_SINK);

  public int value ()
  {
    return __value;
  }

  public static terminationPoint.Directionality_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Directionality_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Directionality_T
