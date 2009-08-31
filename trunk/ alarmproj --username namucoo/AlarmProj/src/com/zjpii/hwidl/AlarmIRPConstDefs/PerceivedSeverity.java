package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/PerceivedSeverity.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the levels of severity.
   */
public interface PerceivedSeverity extends PerceivedSeverityOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final short INDETERMINATE = (short)(1);
  public static final short CRITICAL = (short)(2);
  public static final short MAJOR = (short)(3);
  public static final short MINOR = (short)(4);
  public static final short WARNING = (short)(5);
  public static final short CLEARED = (short)(6);
} // interface PerceivedSeverity
