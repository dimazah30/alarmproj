package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/MultiLayerSubnetwork_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/

public final class MultiLayerSubnetwork_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.MultiLayerSubnetwork_T value = null;

  public MultiLayerSubnetwork_THolder ()
  {
  }

  public MultiLayerSubnetwork_THolder (multiLayerSubnetwork.MultiLayerSubnetwork_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type ();
  }

}
