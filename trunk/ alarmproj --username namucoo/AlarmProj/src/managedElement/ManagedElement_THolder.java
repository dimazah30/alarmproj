package managedElement;

/**
* managedElement/ManagedElement_THolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� managedElement.idl
* 2009��9��2�� ������ ����03ʱ27��41�� CST
*/

public final class ManagedElement_THolder implements org.omg.CORBA.portable.Streamable
{
  public managedElement.ManagedElement_T value = null;

  public ManagedElement_THolder ()
  {
  }

  public ManagedElement_THolder (managedElement.ManagedElement_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = managedElement.ManagedElement_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    managedElement.ManagedElement_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return managedElement.ManagedElement_THelper.type ();
  }

}
