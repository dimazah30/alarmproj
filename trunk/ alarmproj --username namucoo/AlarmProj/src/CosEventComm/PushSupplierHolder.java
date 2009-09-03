package CosEventComm;

/**
* CosEventComm/PushSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/


/**
    * Interface for a push supplier.
    */
public final class PushSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PushSupplier value = null;

  public PushSupplierHolder ()
  {
  }

  public PushSupplierHolder (CosEventComm.PushSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PushSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PushSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PushSupplierHelper.type ();
  }

}
