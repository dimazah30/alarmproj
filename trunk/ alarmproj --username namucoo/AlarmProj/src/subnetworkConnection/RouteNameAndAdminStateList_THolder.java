package subnetworkConnection;


/**
* subnetworkConnection/RouteNameAndAdminStateList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>Arbitrary sequence of RouteNameAndAdminState.</p>
   **/
public final class RouteNameAndAdminStateList_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.RouteNameAndAdminState_T value[] = null;

  public RouteNameAndAdminStateList_THolder ()
  {
  }

  public RouteNameAndAdminStateList_THolder (subnetworkConnection.RouteNameAndAdminState_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.RouteNameAndAdminStateList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.RouteNameAndAdminStateList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.RouteNameAndAdminStateList_THelper.type ();
  }

}
