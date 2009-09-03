package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/Topology_T.java .
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
public class Topology_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 7;
  private static multiLayerSubnetwork.Topology_T[] __array = new multiLayerSubnetwork.Topology_T [__size];

  public static final int _TOPO_SINGLETON = 0;
  public static final multiLayerSubnetwork.Topology_T TOPO_SINGLETON = new multiLayerSubnetwork.Topology_T(_TOPO_SINGLETON);
  public static final int _TOPO_CHAIN = 1;
  public static final multiLayerSubnetwork.Topology_T TOPO_CHAIN = new multiLayerSubnetwork.Topology_T(_TOPO_CHAIN);
  public static final int _TOPO_PSR = 2;
  public static final multiLayerSubnetwork.Topology_T TOPO_PSR = new multiLayerSubnetwork.Topology_T(_TOPO_PSR);
  public static final int _TOPO_OPEN_PSR = 3;
  public static final multiLayerSubnetwork.Topology_T TOPO_OPEN_PSR = new multiLayerSubnetwork.Topology_T(_TOPO_OPEN_PSR);
  public static final int _TOPO_SPRING = 4;
  public static final multiLayerSubnetwork.Topology_T TOPO_SPRING = new multiLayerSubnetwork.Topology_T(_TOPO_SPRING);
  public static final int _TOPO_OPEN_SPRING = 5;
  public static final multiLayerSubnetwork.Topology_T TOPO_OPEN_SPRING = new multiLayerSubnetwork.Topology_T(_TOPO_OPEN_SPRING);
  public static final int _TOPO_MESH = 6;
  public static final multiLayerSubnetwork.Topology_T TOPO_MESH = new multiLayerSubnetwork.Topology_T(_TOPO_MESH);

  public int value ()
  {
    return __value;
  }

  public static multiLayerSubnetwork.Topology_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected Topology_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class Topology_T
