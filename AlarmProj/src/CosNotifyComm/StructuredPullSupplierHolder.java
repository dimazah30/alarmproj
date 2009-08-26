package CosNotifyComm;

/**
* CosNotifyComm/StructuredPullSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPullConsumer
public final class StructuredPullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPullSupplier value = null;

  public StructuredPullSupplierHolder ()
  {
  }

  public StructuredPullSupplierHolder (CosNotifyComm.StructuredPullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPullSupplierHelper.type ();
  }

}
