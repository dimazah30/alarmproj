package CosNotifyComm;

/**
* CosNotifyComm/SequencePullSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// SequencePullConsumer
public final class SequencePullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyComm.SequencePullSupplier value = null;

  public SequencePullSupplierHolder ()
  {
  }

  public SequencePullSupplierHolder (CosNotifyComm.SequencePullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyComm.SequencePullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyComm.SequencePullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyComm.SequencePullSupplierHelper.type ();
  }

}
