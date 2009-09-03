package callSNC;


/**
* callSNC/SNCAndRouteList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/** 
   * This structure represents a list of connections and their respective
   * routes</p>
   * Sequence of <SNCAndRoute_T>
   **/
public final class SNCAndRouteList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SNCAndRoute_T value[] = null;

  public SNCAndRouteList_THolder ()
  {
  }

  public SNCAndRouteList_THolder (callSNC.SNCAndRoute_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SNCAndRouteList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SNCAndRouteList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SNCAndRouteList_THelper.type ();
  }

}
