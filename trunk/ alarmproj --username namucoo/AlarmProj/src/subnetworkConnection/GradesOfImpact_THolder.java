package subnetworkConnection;

/**
* subnetworkConnection/GradesOfImpact_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Grades of maximum tolerable disruption to traffic as a result of the
   * operation that this parameter is describing. The following relates 
   * to design intent:<br>GOI_HITLESS,<br>
   * GOI_MINOR_IMPACT <= 50ms,<br>
   * GOI_MAJOR_IMPACT > 50ms.<br></p>
   **/
public final class GradesOfImpact_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.GradesOfImpact_T value = null;

  public GradesOfImpact_THolder ()
  {
  }

  public GradesOfImpact_THolder (subnetworkConnection.GradesOfImpact_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.GradesOfImpact_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.GradesOfImpact_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.GradesOfImpact_THelper.type ();
  }

}
