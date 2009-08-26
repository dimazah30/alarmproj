package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/TrendIndicationTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates if some observed condition is getting better, worse,
   or not changing.
   */
public final class TrendIndicationTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.TrendIndicationType value = null;

  public TrendIndicationTypeHolder ()
  {
  }

  public TrendIndicationTypeHolder (AlarmIRPConstDefs.TrendIndicationType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.TrendIndicationTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.TrendIndicationTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.TrendIndicationTypeHelper.type ();
  }

}
