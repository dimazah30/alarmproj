package subnetworkConnection;

/**
* subnetworkConnection/Reroute_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The Reroute_T type indicates if the EMS/Mes/Control Plane are allowed 
   * and/or required to reroute this SNC if there 
   * is a failure on this SNC, periodically to optimize the routes, of for any 
   * other reason. This can be done either using network routing protocols or
   * through centralized management..</p>
   *
   * <p>The RR_NO value means that the EMS/MEs/Control Plane are not allowed to
   * reroute the 
   * SNC. The RR_YES value means that the EMS/MEs are allowed to reroute the SNC 
   * and required to attempt to reroute it upon failure.
   * The RR_NA value is used when the NMS does not want to specify the exact EMS 
   * behaviour. In this case it is left up to the EMS/MEs/Control Plane to
   * decide whether rerouting will be provided. It is also used if the
   * EMS/Mes/Control Plane are allowed to 
   * reroute the SNC but not required to attempt to reroute it upon failure.</p>
   **/
public final class Reroute_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.Reroute_T value = null;

  public Reroute_THolder ()
  {
  }

  public Reroute_THolder (subnetworkConnection.Reroute_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.Reroute_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.Reroute_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.Reroute_THelper.type ();
  }

}
