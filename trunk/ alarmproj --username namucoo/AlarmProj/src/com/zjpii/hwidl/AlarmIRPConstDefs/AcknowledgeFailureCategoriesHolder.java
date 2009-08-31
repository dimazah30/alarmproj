package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/AcknowledgeFailureCategoriesHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
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
