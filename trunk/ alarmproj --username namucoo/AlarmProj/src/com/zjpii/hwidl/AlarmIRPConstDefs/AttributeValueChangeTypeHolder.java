package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AttributeValueChangeTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AttributeValueChangeTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AttributeValueChangeType value = null;

  public AttributeValueChangeTypeHolder ()
  {
  }

  public AttributeValueChangeTypeHolder (AlarmIRPConstDefs.AttributeValueChangeType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AttributeValueChangeTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AttributeValueChangeTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AttributeValueChangeTypeHelper.type ();
  }

}
