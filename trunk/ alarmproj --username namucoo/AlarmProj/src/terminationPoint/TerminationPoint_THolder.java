package terminationPoint;

/**
* terminationPoint/TerminationPoint_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� terminationPoint.idl
* 2009��9��2�� ������ ����03ʱ27��55�� CST
*/

public final class TerminationPoint_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TerminationPoint_T value = null;

  public TerminationPoint_THolder ()
  {
  }

  public TerminationPoint_THolder (terminationPoint.TerminationPoint_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TerminationPoint_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TerminationPoint_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TerminationPoint_THelper.type ();
  }

}
