package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/MethodListHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/


/*
   List of all methods and their associated parameters.
   */
public final class MethodListHolder implements org.omg.CORBA.portable.Streamable
{
  public ManagedGenericIRPConstDefs.Method value[] = null;

  public MethodListHolder ()
  {
  }

  public MethodListHolder (ManagedGenericIRPConstDefs.Method[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.MethodListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.MethodListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.MethodListHelper.type ();
  }

}
