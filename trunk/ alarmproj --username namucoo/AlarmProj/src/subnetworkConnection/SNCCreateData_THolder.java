package subnetworkConnection;

/**
* subnetworkConnection/SNCCreateData_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/

public final class SNCCreateData_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.SNCCreateData_T value = null;

  public SNCCreateData_THolder ()
  {
  }

  public SNCCreateData_THolder (subnetworkConnection.SNCCreateData_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.SNCCreateData_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.SNCCreateData_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.SNCCreateData_THelper.type ();
  }

}
