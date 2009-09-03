package subnetworkConnection;

/**
* subnetworkConnection/SubnetworkConnection_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class SubnetworkConnection_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.SubnetworkConnection_T value = null;

  public SubnetworkConnection_THolder ()
  {
  }

  public SubnetworkConnection_THolder (subnetworkConnection.SubnetworkConnection_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.SubnetworkConnection_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.SubnetworkConnection_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.SubnetworkConnection_THelper.type ();
  }

}
