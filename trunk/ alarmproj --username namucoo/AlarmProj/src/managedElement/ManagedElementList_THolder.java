package managedElement;


/**
* managedElement/ManagedElementList_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/


/**
   * <p>Sequence of ManagedElement_T.</p>
   **/
public final class ManagedElementList_THolder implements org.omg.CORBA.portable.Streamable
{
  public managedElement.ManagedElement_T value[] = null;

  public ManagedElementList_THolder ()
  {
  }

  public ManagedElementList_THolder (managedElement.ManagedElement_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = managedElement.ManagedElementList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    managedElement.ManagedElementList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return managedElement.ManagedElementList_THelper.type ();
  }

}
