package subnetworkConnection;

/**
* subnetworkConnection/StaticProtectionLevel_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The static protection level is a statement of the internal resiliency of 
   * the SNC (internal to the subnetwork). The more resilient an SNC is, the 
   * more bandwidth it will consume.<br>
   * The protection level does not have any bearing on the externally visible
   * shape and traffic flows of the SNC (in non-failure cases).<br>
   * For a detailed description of the use of this attribute, see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
public final class StaticProtectionLevel_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.StaticProtectionLevel_T value = null;

  public StaticProtectionLevel_THolder ()
  {
  }

  public StaticProtectionLevel_THolder (subnetworkConnection.StaticProtectionLevel_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.StaticProtectionLevel_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.StaticProtectionLevel_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.StaticProtectionLevel_THelper.type ();
  }

}
