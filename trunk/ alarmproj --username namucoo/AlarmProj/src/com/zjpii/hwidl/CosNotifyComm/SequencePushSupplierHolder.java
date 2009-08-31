package CosNotifyComm;

/**
* CosNotifyComm/SequencePushSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// SequencePullSupplier
public final class SequencePushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePushSupplier value = null;

  public SequencePushSupplierHolder ()
  {
  }

  public SequencePushSupplierHolder (CosNotifyComm.SequencePushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePushSupplierHelper.type ();
  }

}
