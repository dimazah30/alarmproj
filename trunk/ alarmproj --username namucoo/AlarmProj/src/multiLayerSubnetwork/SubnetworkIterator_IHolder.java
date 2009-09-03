package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/SubnetworkIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class SubnetworkIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.SubnetworkIterator_I value = null;

  public SubnetworkIterator_IHolder ()
  {
  }

  public SubnetworkIterator_IHolder (multiLayerSubnetwork.SubnetworkIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.SubnetworkIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.SubnetworkIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.SubnetworkIterator_IHelper.type ();
  }

}
