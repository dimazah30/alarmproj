package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/MultiLayerSubnetworkMgr_IHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p>The multiLayerSubnetworkMgr_I is used to gain access to subnetworks and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public final class MultiLayerSubnetworkMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.MultiLayerSubnetworkMgr_I value = null;

  public MultiLayerSubnetworkMgr_IHolder ()
  {
  }

  public MultiLayerSubnetworkMgr_IHolder (multiLayerSubnetwork.MultiLayerSubnetworkMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper.type ();
  }

}
