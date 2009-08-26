package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeSetTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AttributeSetTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AttributeValueType value[] = null;

  public AttributeSetTypeHolder ()
  {
  }

  public AttributeSetTypeHolder (AlarmIRPConstDefs.AttributeValueType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AttributeSetTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AttributeSetTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AttributeSetTypeHelper.type ();
  }

}
