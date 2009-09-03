package subnetworkConnection;


/**
* subnetworkConnection/SNCCreateDataList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>A sequence of data for the creation of a set of SNCs</p>
   **/
public final class SNCCreateDataList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.SNCCreateData_T value[] = null;

  public SNCCreateDataList_THolder ()
  {
  }

  public SNCCreateDataList_THolder (subnetworkConnection.SNCCreateData_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.SNCCreateDataList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.SNCCreateDataList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.SNCCreateDataList_THelper.type ();
  }

}
