package subnetworkConnection;

/**
* subnetworkConnection/SNCType_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The SNC Type describes the connection based on the signal 
   * flows. The only types applicable to a Control Plane Connection are
   * ST_SIMPLE,ST_ADD_DROP_A and ST_ADD_DROP_Z.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   *
   * <p>In case of an ATM SNC (VP or VC), ST_SIMPLE is used to specify a 'plain'
   * (hard or regular) PVC.</p>
   **/
public final class SNCType_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.SNCType_T value = null;

  public SNCType_THolder ()
  {
  }

  public SNCType_THolder (subnetworkConnection.SNCType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.SNCType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.SNCType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.SNCType_THelper.type ();
  }

}
