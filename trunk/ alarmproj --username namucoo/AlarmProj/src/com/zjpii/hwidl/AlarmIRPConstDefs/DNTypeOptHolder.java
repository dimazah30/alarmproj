package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/DNTypeOptHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class DNTypeOptHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.DNTypeOpt value = null;

  public DNTypeOptHolder ()
  {
  }

  public DNTypeOptHolder (AlarmIRPConstDefs.DNTypeOpt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.DNTypeOptHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.DNTypeOptHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.DNTypeOptHelper.type ();
  }

}
