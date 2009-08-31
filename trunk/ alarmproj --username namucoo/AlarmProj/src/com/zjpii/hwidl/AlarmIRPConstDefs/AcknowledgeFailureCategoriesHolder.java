package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AcknowledgeFailureCategoriesHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   It indicates the reason for an alarm acknowledgement to have failed:
     - The specified Alarm Information is absent from the Alarm List
     - The Perceived Severity to be acknowledged has changed and/or is different
       within the Alarm List
     - The acknowledgement failed for some other reason
   */
public final class AcknowledgeFailureCategoriesHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.AcknowledgeFailureCategories value = null;

  public AcknowledgeFailureCategoriesHolder ()
  {
  }

  public AcknowledgeFailureCategoriesHolder (AlarmIRPConstDefs.AcknowledgeFailureCategories initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.AcknowledgeFailureCategoriesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.AcknowledgeFailureCategoriesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.AcknowledgeFailureCategoriesHelper.type ();
  }

}
