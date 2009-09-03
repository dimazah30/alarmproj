package CosEventComm;

/**
* CosEventComm/PullSupplierHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/


/**
    * Interface for a pull supplier.
    */
public final class PullSupplierHolder implements org.omg.CORBA.portable.Streamable
{
  public CosEventComm.PullSupplier value = null;

  public PullSupplierHolder ()
  {
  }

  public PullSupplierHolder (CosEventComm.PullSupplier initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosEventComm.PullSupplierHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosEventComm.PullSupplierHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosEventComm.PullSupplierHelper.type ();
  }

}
