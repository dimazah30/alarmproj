package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/AckState.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/


/*
   This block identifies the acknowledgement state of a reported alarm.
   */
public interface AckState extends AckStateOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
  public static final short ACKNOWLEDGED = (short)(1);
  public static final short UNACKNOWLEDGED = (short)(2);
} // interface AckState
