package callSNC;

/**
* callSNC/Diversity_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class Diversity_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.Diversity_T value = null;

  public Diversity_THolder ()
  {
  }

  public Diversity_THolder (callSNC.Diversity_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.Diversity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.Diversity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.Diversity_THelper.type ();
  }

}
