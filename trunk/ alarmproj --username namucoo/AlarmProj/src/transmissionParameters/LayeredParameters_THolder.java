package transmissionParameters;

/**
* transmissionParameters/LayeredParameters_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� transmissionParameters.idl
* 2009��9��2�� ������ ����03ʱ27��34�� CST
*/

public final class LayeredParameters_THolder implements org.omg.CORBA.portable.Streamable
{
  public transmissionParameters.LayeredParameters_T value = null;

  public LayeredParameters_THolder ()
  {
  }

  public LayeredParameters_THolder (transmissionParameters.LayeredParameters_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = transmissionParameters.LayeredParameters_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    transmissionParameters.LayeredParameters_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return transmissionParameters.LayeredParameters_THelper.type ();
  }

}
