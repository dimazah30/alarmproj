package terminationPoint;


/**
* terminationPoint/GTPlist_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� terminationPoint.idl
* 2009��9��2�� ������ ����03ʱ27��55�� CST
*/


/**
   * <p>Sequence of GTP_T.</p>
   **/
public final class GTPlist_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.GTP_T value[] = null;

  public GTPlist_THolder ()
  {
  }

  public GTPlist_THolder (terminationPoint.GTP_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.GTPlist_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.GTPlist_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.GTPlist_THelper.type ();
  }

}
