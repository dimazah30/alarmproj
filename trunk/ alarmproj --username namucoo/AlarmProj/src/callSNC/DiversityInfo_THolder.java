package callSNC;

/**
* callSNC/DiversityInfo_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class DiversityInfo_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.DiversityInfo_T value = null;

  public DiversityInfo_THolder ()
  {
  }

  public DiversityInfo_THolder (callSNC.DiversityInfo_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.DiversityInfo_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.DiversityInfo_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.DiversityInfo_THelper.type ();
  }

}
