package CosNotification;

/**
* CosNotification/QoSError_codeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class QoSError_codeHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.QoSError_code value = null;

  public QoSError_codeHolder ()
  {
  }

  public QoSError_codeHolder (CosNotification.QoSError_code initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.QoSError_codeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.QoSError_codeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.QoSError_codeHelper.type ();
  }

}
