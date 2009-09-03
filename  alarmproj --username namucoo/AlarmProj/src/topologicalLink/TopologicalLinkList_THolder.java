package topologicalLink;


/**
* topologicalLink/TopologicalLinkList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 topologicalLink.idl
* 2009年9月2日 星期三 下午03时27分49秒 CST
*/


/**
   * <p>Sequence of TopologicalLink_T.<p>
   **/
public final class TopologicalLinkList_THolder implements org.omg.CORBA.portable.Streamable
{
  public topologicalLink.TopologicalLink_T value[] = null;

  public TopologicalLinkList_THolder ()
  {
  }

  public TopologicalLinkList_THolder (topologicalLink.TopologicalLink_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = topologicalLink.TopologicalLinkList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    topologicalLink.TopologicalLinkList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return topologicalLink.TopologicalLinkList_THelper.type ();
  }

}
