package callSNC;


/**
* callSNC/SharedResourceList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
*/


/**
   * A list of the resources being shared by a list of connections 
   **/
public final class SharedResourceList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SharedResource_T value[] = null;

  public SharedResourceList_THolder ()
  {
  }

  public SharedResourceList_THolder (callSNC.SharedResource_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SharedResourceList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SharedResourceList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SharedResourceList_THelper.type ();
  }

}
