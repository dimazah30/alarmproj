package subnetworkConnection;


/**
* subnetworkConnection/TPDataList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>Sequence of TPData_T.</p>
   **/
public final class TPDataList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.TPData_T value[] = null;

  public TPDataList_THolder ()
  {
  }

  public TPDataList_THolder (subnetworkConnection.TPData_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.TPDataList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.TPDataList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.TPDataList_THelper.type ();
  }

}
