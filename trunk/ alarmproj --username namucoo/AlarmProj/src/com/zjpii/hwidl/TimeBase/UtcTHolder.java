package TimeBase;

/**
* TimeBase/UtcTHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� TimeBase.idl
* 2009��8��24�� ����һ ����09ʱ36��53�� CST
*/

public final class UtcTHolder implements org.omg.CORBA.portable.Streamable
{
  public TimeBase.UtcT value = null;

  public UtcTHolder ()
  {
  }

  public UtcTHolder (TimeBase.UtcT initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TimeBase.UtcTHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TimeBase.UtcTHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TimeBase.UtcTHelper.type ();
  }

}
