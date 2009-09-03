package callSNC;


/**
* callSNC/RouteGroupInfoList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/** <p>
   * This structure provides a list of SNCs/Connections and associated
   * route group labels. </p>
   * 
   **/
public final class RouteGroupInfoList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.RouteGroupInfo_T value[] = null;

  public RouteGroupInfoList_THolder ()
  {
  }

  public RouteGroupInfoList_THolder (callSNC.RouteGroupInfo_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.RouteGroupInfoList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.RouteGroupInfoList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.RouteGroupInfoList_THelper.type ();
  }

}
