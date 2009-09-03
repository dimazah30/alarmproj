package globaldefs;


/**
* globaldefs/NVSList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
*/


/**
   * <p>A list of (name=string, value=string) tuples</p>
   * <p>For example, the transmission parameters of a TerminationPoint
   * and the additional info parameters of any managed object use this
   * structure. A standardized naming scheme is adopted between the
   * NMS and the EMS to identify the name and the value field.</p>
   **/
public final class NVSList_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.NameAndStringValue_T value[] = null;

  public NVSList_THolder ()
  {
  }

  public NVSList_THolder (globaldefs.NameAndStringValue_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.NVSList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.NVSList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.NVSList_THelper.type ();
  }

}
