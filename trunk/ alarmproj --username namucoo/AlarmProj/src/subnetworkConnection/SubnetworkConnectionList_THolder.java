package subnetworkConnection;


/**
* subnetworkConnection/SubnetworkConnectionList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>Sequence of SubnetworkConnection_T.</p>
   * <br>
   **/
public final class SubnetworkConnectionList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.SubnetworkConnection_T value[] = null;

  public SubnetworkConnectionList_THolder ()
  {
  }

  public SubnetworkConnectionList_THolder (subnetworkConnection.SubnetworkConnection_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.SubnetworkConnectionList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.SubnetworkConnectionList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.SubnetworkConnectionList_THelper.type ();
  }

}
