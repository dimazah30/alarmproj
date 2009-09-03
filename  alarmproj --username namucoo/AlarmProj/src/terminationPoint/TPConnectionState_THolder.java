package terminationPoint;

/**
* terminationPoint/TPConnectionState_THolder.java .
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
public final class TPConnectionState_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TPConnectionState_T value = null;

  public TPConnectionState_THolder ()
  {
  }

  public TPConnectionState_THolder (terminationPoint.TPConnectionState_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TPConnectionState_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TPConnectionState_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TPConnectionState_THelper.type ();
  }

}
