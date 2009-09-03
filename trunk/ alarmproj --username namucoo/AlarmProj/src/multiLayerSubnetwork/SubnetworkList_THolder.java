package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/SubnetworkList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>Sequence of MultiLayerSubnetwork_T objects.</p>
   **/
public final class SubnetworkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.MultiLayerSubnetwork_T value[] = null;

  public SubnetworkList_THolder ()
  {
  }

  public SubnetworkList_THolder (multiLayerSubnetwork.MultiLayerSubnetwork_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.SubnetworkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.SubnetworkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.SubnetworkList_THelper.type ();
  }

}
