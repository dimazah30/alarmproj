package subnetworkConnection;


/**
* subnetworkConnection/ResourceList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>Set of Resources_T, used as an inclusion/exclusion constraint for SNC 
   * creation.</p>
   *
   * <p>There is no mandatory order for the resources listed.</p>
   */
public final class ResourceList_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value[][] = null;

  public ResourceList_THolder ()
  {
  }

  public ResourceList_THolder (globaldefs.NameAndStringValue_T[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.ResourceList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.ResourceList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.ResourceList_THelper.type ();
  }

}
