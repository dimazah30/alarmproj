package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/TPPoolCreateData_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/

public final class TPPoolCreateData_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.TPPoolCreateData_T value = null;

  public TPPoolCreateData_THolder ()
  {
  }

  public TPPoolCreateData_THolder (multiLayerSubnetwork.TPPoolCreateData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.TPPoolCreateData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.TPPoolCreateData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.TPPoolCreateData_THelper.type ();
  }

}
