package terminationPoint;


/**
* terminationPoint/TerminationPointList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� terminationPoint.idl
* 2009��9��2�� ������ ����03ʱ27��55�� CST
*/


/**
   * <p>Sequence of TerminationPoint_T.</p>
   **/
public final class TerminationPointList_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.TerminationPoint_T value[] = null;

  public TerminationPointList_THolder ()
  {
  }

  public TerminationPointList_THolder (terminationPoint.TerminationPoint_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.TerminationPointList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.TerminationPointList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.TerminationPointList_THelper.type ();
  }

}
