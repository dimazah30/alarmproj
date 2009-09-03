package subnetworkConnection;


/**
* subnetworkConnection/Route_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>A route for an SNC is defined as a partially ordered list of cross-
   * connects.</p>
   *
   * <p>This structure can deal with any arbitrarily complex protection paths
   * made up from connection types described in
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   * 
   * <p>The cross-connects are listed from the NE 
   * on which the SNC starts (first entry) to the NE on which the SNC ends
   * (last entry). There is no mandatory order in
   * the cross-connects listed in between the first one and the last one.</p>
   **/
public final class Route_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.CrossConnect_T value[] = null;

  public Route_THolder ()
  {
  }

  public Route_THolder (subnetworkConnection.CrossConnect_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.Route_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.Route_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.Route_THelper.type ();
  }

}
