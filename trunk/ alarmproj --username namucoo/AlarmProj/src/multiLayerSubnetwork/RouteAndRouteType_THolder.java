package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/RouteAndRouteType_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� multiLayerSubnetwork.idl
* 2009��9��2�� ������ ����03ʱ26��24�� CST
*/

public final class RouteAndRouteType_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.RouteAndRouteType_T value = null;

  public RouteAndRouteType_THolder ()
  {
  }

  public RouteAndRouteType_THolder (multiLayerSubnetwork.RouteAndRouteType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.RouteAndRouteType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.RouteAndRouteType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.RouteAndRouteType_THelper.type ();
  }

}
