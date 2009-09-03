package callSNC;


/**
* callSNC/SharedResourceList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/


/**
   * A list of the resources being shared by a list of connections 
   **/
public final class SharedResourceList_THolder implements org.omg.CORBA.portable.Streamable
{
  public callSNC.SharedResource_T value[] = null;

  public SharedResourceList_THolder ()
  {
  }

  public SharedResourceList_THolder (callSNC.SharedResource_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = callSNC.SharedResourceList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    callSNC.SharedResourceList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return callSNC.SharedResourceList_THelper.type ();
  }

}
