package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AttributeChangeSetTypeHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class AttributeChangeSetTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AttributeValueChangeType value[] = null;

  public AttributeChangeSetTypeHolder ()
  {
  }

  public AttributeChangeSetTypeHolder (AlarmIRPConstDefs.AttributeValueChangeType[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AttributeChangeSetTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AttributeChangeSetTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AttributeChangeSetTypeHelper.type ();
  }

}
