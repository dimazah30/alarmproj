package topologicalLink;

/**
* topologicalLink/TopologicalLinkIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� topologicalLink.idl
* 2009��9��2�� ������ ����03ʱ27��49�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class TopologicalLinkIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public topologicalLink.TopologicalLinkIterator_I value = null;

  public TopologicalLinkIterator_IHolder ()
  {
  }

  public TopologicalLinkIterator_IHolder (topologicalLink.TopologicalLinkIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = topologicalLink.TopologicalLinkIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    topologicalLink.TopologicalLinkIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return topologicalLink.TopologicalLinkIterator_IHelper.type ();
  }

}
