package callSNC;


/**
* callSNC/ConnectionsAndSupportingSNCsList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/** 
   * This structure represents a list of connections and their supporting
   * Subnetwork connections.</p>
   * Sequence of <ConnectionAndSupportingSNCs_T> 
   **/
public final class ConnectionsAndSupportingSNCsList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.ConnectionAndSupportingSNCs_T value[] = null;

  public ConnectionsAndSupportingSNCsList_THolder ()
  {
  }

  public ConnectionsAndSupportingSNCsList_THolder (callSNC.ConnectionAndSupportingSNCs_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.ConnectionsAndSupportingSNCsList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.ConnectionsAndSupportingSNCsList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.ConnectionsAndSupportingSNCsList_THelper.type ();
  }

}
