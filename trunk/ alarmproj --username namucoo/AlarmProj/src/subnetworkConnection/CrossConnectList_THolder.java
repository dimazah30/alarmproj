package subnetworkConnection;


/**
* subnetworkConnection/CrossConnectList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>Arbitrary sequence of cross-connects.</p>
   **/
public final class CrossConnectList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.CrossConnect_T value[] = null;

  public CrossConnectList_THolder ()
  {
  }

  public CrossConnectList_THolder (subnetworkConnection.CrossConnect_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.CrossConnectList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.CrossConnectList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.CrossConnectList_THelper.type ();
  }

}
