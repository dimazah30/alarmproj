package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/ParameterListHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class ParameterListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ParameterListHolder ()
  {
  }

  public ParameterListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.ParameterListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.ParameterListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.ParameterListHelper.type ();
  }

}
