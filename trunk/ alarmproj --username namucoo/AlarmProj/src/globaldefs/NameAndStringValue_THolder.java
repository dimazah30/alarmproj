package globaldefs;

/**
* globaldefs/NameAndStringValue_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
*/

public final class NameAndStringValue_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value = null;

  public NameAndStringValue_THolder ()
  {
  }

  public NameAndStringValue_THolder (globaldefs.NameAndStringValue_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NameAndStringValue_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NameAndStringValue_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NameAndStringValue_THelper.type ();
  }

}
