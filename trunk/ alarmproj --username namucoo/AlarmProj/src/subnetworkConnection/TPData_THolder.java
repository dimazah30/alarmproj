package subnetworkConnection;

/**
* subnetworkConnection/TPData_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
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
