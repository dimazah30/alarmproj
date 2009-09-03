package multiLayerSubnetwork;


/**
* multiLayerSubnetwork/RAIDList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 multiLayerSubnetwork.idl
* 2009年9月2日 星期三 下午03时26分24秒 CST
*/


/**
   * The list of Routing Area IDs.
   **/
public final class RAIDList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public RAIDList_THolder ()
  {
  }

  public RAIDList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = multiLayerSubnetwork.RAIDList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    multiLayerSubnetwork.RAIDList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return multiLayerSubnetwork.RAIDList_THelper.type ();
  }

}
