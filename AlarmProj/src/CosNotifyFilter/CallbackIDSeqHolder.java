package CosNotifyFilter;


/**
* CosNotifyFilter/CallbackIDSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class CallbackIDSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[] = null;

  public CallbackIDSeqHolder ()
  {
  }

  public CallbackIDSeqHolder (int[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.CallbackIDSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.CallbackIDSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.CallbackIDSeqHelper.type ();
  }

}
