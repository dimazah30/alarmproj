package CosNotifyComm;

/**
* CosNotifyComm/StructuredPushSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPullSupplier
public final class StructuredPushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.StructuredPushSupplier value = null;

  public StructuredPushSupplierHolder ()
  {
  }

  public StructuredPushSupplierHolder (CosNotifyComm.StructuredPushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.StructuredPushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.StructuredPushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.StructuredPushSupplierHelper.type ();
  }

}
