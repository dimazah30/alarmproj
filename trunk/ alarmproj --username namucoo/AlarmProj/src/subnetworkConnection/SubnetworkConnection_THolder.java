package subnetworkConnection;

/**
* subnetworkConnection/SubnetworkConnection_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
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
