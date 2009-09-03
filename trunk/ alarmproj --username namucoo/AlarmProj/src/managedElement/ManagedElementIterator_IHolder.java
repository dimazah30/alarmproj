package managedElement;

/**
* managedElement/ManagedElementIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class ManagedElementIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public managedElement.ManagedElementIterator_I value = null;

  public ManagedElementIterator_IHolder ()
  {
  }

  public ManagedElementIterator_IHolder (managedElement.ManagedElementIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = managedElement.ManagedElementIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    managedElement.ManagedElementIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return managedElement.ManagedElementIterator_IHelper.type ();
  }

}
