package globaldefs;

/**
* globaldefs/ConnectionDirection_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p>Direction of a subnetwork connection, cross-connects, or topological 
   * link:
   * <br>UNI: UNIdirectional, i.e. source TP to sink TP. 
   * Note: creation of unidirectional connections is supported even when 
   * CTPs/FTPs are modelled as bidirectional.<br>
   * <br>CD_BI: BIdirectional, i.e. bidirectional TP to bidirectional TP, 
   * a.k.a. two-way.<br>
   * For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.
   * </p>
   **/
public final class ConnectionDirection_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.ConnectionDirection_T value = null;

  public ConnectionDirection_THolder ()
  {
  }

  public ConnectionDirection_THolder (globaldefs.ConnectionDirection_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.ConnectionDirection_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.ConnectionDirection_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.ConnectionDirection_THelper.type ();
  }

}
