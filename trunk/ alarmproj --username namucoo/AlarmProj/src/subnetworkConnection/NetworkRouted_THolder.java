package subnetworkConnection;

/**
* subnetworkConnection/NetworkRouted_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� subnetworkConnection.idl
* 2009��9��2�� ������ ����03ʱ28��43�� CST
*/


/**
   * <p>Network routed, indicates if the route must be or is computed and
   * implemented at the network level. NR_YES indicates that the
   * route must be / is computed at the network. NR_NO indicates that the route 
   * must not be / is not computed at the network. NR_NA indicates that the 
   * route can be computed anywhere.</p>
   * 
   * <p>If rerouting is allowed, this attribute will indicate who last rerouted 
   * the SNC, the network (NR_YES) or the EMS (NR_NO).</p>
   **/
public final class NetworkRouted_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.NetworkRouted_T value = null;

  public NetworkRouted_THolder ()
  {
  }

  public NetworkRouted_THolder (subnetworkConnection.NetworkRouted_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.NetworkRouted_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.NetworkRouted_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.NetworkRouted_THelper.type ();
  }

}
