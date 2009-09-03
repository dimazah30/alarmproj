package subnetworkConnection;


/**
* subnetworkConnection/CrossConnectList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Arbitrary sequence of cross-connects.</p>
   **/
public final class CrossConnectList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.CrossConnect_T value[] = null;

  public CrossConnectList_THolder ()
  {
  }

  public CrossConnectList_THolder (subnetworkConnection.CrossConnect_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.CrossConnectList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.CrossConnectList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.CrossConnectList_THelper.type ();
  }

}
