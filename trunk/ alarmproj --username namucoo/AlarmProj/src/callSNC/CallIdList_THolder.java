package callSNC;


/**
* callSNC/CallIdList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/** 
   * <p>Sequence of CallId_T. </p>
   **/
public final class CallIdList_THolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public CallIdList_THolder ()
  {
  }

  public CallIdList_THolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.CallIdList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.CallIdList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.CallIdList_THelper.type ();
  }

}
