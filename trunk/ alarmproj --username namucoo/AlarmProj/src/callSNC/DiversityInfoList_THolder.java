package callSNC;


/**
* callSNC/DiversityInfoList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/**
   * A list of the diversity types and their associated shared resources
   **/
public final class DiversityInfoList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.DiversityInfo_T value[] = null;

  public DiversityInfoList_THolder ()
  {
  }

  public DiversityInfoList_THolder (callSNC.DiversityInfo_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.DiversityInfoList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.DiversityInfoList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.DiversityInfoList_THelper.type ();
  }

}
