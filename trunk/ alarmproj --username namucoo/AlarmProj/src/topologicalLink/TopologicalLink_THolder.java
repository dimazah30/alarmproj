package topologicalLink;

/**
* topologicalLink/TopologicalLink_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� topologicalLink.idl
* 2009��9��2�� ������ ����03ʱ27��49�� CST
*/

public final class TopologicalLink_THolder implements org.omg.CORBA.portable.Streamable
{
  public topologicalLink.TopologicalLink_T value = null;

  public TopologicalLink_THolder ()
  {
  }

  public TopologicalLink_THolder (topologicalLink.TopologicalLink_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = topologicalLink.TopologicalLink_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    topologicalLink.TopologicalLink_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return topologicalLink.TopologicalLink_THelper.type ();
  }

}
