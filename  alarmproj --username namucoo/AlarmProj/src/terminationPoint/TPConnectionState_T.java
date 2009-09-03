package terminationPoint;


/**
* terminationPoint/TPConnectionState_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>A CTP/FTP may be involved in zero, one, or many connections. The value
   * TPConnectionState indicates the degree to which a CTP/FTP is used.
   * The values TPCS_SOURCE_CONNECTED and TPCS_SINK_CONNECTED reflect the 
   * presence of a one way connection. The value TPCS_BI_CONNECTED means
   * that the TP is both sink and source connected.</p>
   *
   * <p>When this attribution is used in conjunction with a GTP, it indicates 
   * the TPConnectionState of the contained CTPs. All CTPs within a GTP shall 
   * have the same TPConnectionState. (see 
   * <a href=../../../supportingDocumentation/SD1-3_BundledSNC.pdf >SD1-3 Bundled SNC overview</a>
   * for further information on GTP usage). </p>
   *
   * <p>If an EMS cannot report whether the source of the TP is connected
   * or the sink is connected, TPCS_BI_CONNECTED may be reported by that
   * EMS.</p>
   *
   * <p>The value TPCS_NA is used for PTPs and TPPools.</p>
   **/
public class TPConnectionState_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 5;
  private static terminationPoint.TPConnectionState_T[] __array = new terminationPoint.TPConnectionState_T [__size];

  public static final int _TPCS_NA = 0;
  public static final terminationPoint.TPConnectionState_T TPCS_NA = new terminationPoint.TPConnectionState_T(_TPCS_NA);
  public static final int _TPCS_SOURCE_CONNECTED = 1;
  public static final terminationPoint.TPConnectionState_T TPCS_SOURCE_CONNECTED = new terminationPoint.TPConnectionState_T(_TPCS_SOURCE_CONNECTED);
  public static final int _TPCS_SINK_CONNECTED = 2;
  public static final terminationPoint.TPConnectionState_T TPCS_SINK_CONNECTED = new terminationPoint.TPConnectionState_T(_TPCS_SINK_CONNECTED);
  public static final int _TPCS_BI_CONNECTED = 3;
  public static final terminationPoint.TPConnectionState_T TPCS_BI_CONNECTED = new terminationPoint.TPConnectionState_T(_TPCS_BI_CONNECTED);
  public static final int _TPCS_NOT_CONNECTED = 4;
  public static final terminationPoint.TPConnectionState_T TPCS_NOT_CONNECTED = new terminationPoint.TPConnectionState_T(_TPCS_NOT_CONNECTED);

  public int value ()
  {
    return __value;
  }

  public static terminationPoint.TPConnectionState_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected TPConnectionState_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class TPConnectionState_T
