package TimeBase;

/**
* TimeBase/IntervalTHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� TimeBase.idl
* 2009��8��24�� ����һ ����09ʱ36��53�� CST
*/

public final class IntervalTHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeBase.IntervalT value = null;

  public IntervalTHolder ()
  {
  }

  public IntervalTHolder (TimeBase.IntervalT initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeBase.IntervalTHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeBase.IntervalTHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeBase.IntervalTHelper.type ();
  }

}
