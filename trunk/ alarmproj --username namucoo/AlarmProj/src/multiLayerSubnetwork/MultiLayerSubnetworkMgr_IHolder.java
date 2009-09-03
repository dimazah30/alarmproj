package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/MultiLayerSubnetworkMgr_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
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
