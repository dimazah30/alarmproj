package multiLayerSubnetwork;

/**
* multiLayerSubnetwork/Topology_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * <p> Topology_T is used to describe the subnetwork configuration. The EMS 
   * shall be capable of providing a SubNetwork Connection through any physical 
   * termination point of any managed element that belongs to the Subnetwork.

*
   * The following values are supported:<br>
   * <br>
   * TOPO_SINGLETON, which is used for a single NE (of any type. E.g. a Multi
   *   Layer Routing Node) that is managed 
   *   independently of its Topological Link connectivity to other NEs. It may 
   *   for example be a member of a ring that is managed by a number of EMSes. 
   *   It is acceptable for an EMS to represent all NEs as being in Singleton 
   *   subnetworks regardless of the actual network configuration. 
   *   A singleton subnetwork does not contain internal topological links.<br> 
   * TOPO_CHAIN, which is used to cover the case where two or more NEs
   *   are managed by the same EMS and are connected by Topological Links in
   *   a chain.<br>
   * TOPO_PSR, which is used to cover the case where two or more NEs
   *   are managed by the same EMS and are connected by Topological Links in
   *   a ring that is capable of supporting subnetwork connection 
   *   protection.<br>
   * TOPO_OPEN_PSR, which is used to cover the case where two or more NEs
   *   of a PS ring (but not the entire ring) are managed by the same EMS.<br>
   * TOPO_SPRING, which is used to cover the case where two or more NEs
   *   are managed by the same EMS and are connected by Topological Links in
   *   a complete ring that supports Shared Line Protection.<br>
   * TOPO_OPEN_SPRING, which is used to cover cases where two or more NEs of an 
   *   SP ring (but not the entire ring) are managed by one EMS.<br>
   * TOPO_MESH, which is used to cover an arbitrary set of two or more NEs
   *   not covered by any other type. 
   **/
public final class Topology_THolder implements org.omg.CORBA.portable.Streamable
{
  public multiLayerSubnetwork.Topology_T value = null;

  public Topology_THolder ()
  {
  }

  public Topology_THolder (multiLayerSubnetwork.Topology_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.Topology_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.Topology_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.Topology_THelper.type ();
  }

}
