package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/VersionNumberSetHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��25�� ���ڶ� ����04ʱ08��25�� CST
*/

public final class VersionNumberSetHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public VersionNumberSetHolder ()
  {
  }

  public VersionNumberSetHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ManagedGenericIRPConstDefs.VersionNumberSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ManagedGenericIRPConstDefs.VersionNumberSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ManagedGenericIRPConstDefs.VersionNumberSetHelper.type ();
  }

}
