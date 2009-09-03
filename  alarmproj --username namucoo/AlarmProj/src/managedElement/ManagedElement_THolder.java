package managedElement;

/**
* managedElement/ManagedElement_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 managedElement.idl
* 2009年9月2日 星期三 下午03时27分41秒 CST
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
