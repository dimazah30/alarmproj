package subnetworkConnection;

/**
* subnetworkConnection/TPData_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/

public final class TPData_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.TPData_T value = null;

  public TPData_THolder ()
  {
  }

  public TPData_THolder (subnetworkConnection.TPData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.TPData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.TPData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.TPData_THelper.type ();
  }

}
