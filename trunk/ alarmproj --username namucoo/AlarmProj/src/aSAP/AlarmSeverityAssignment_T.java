package aSAP;


/**
* aSAP/AlarmSeverityAssignment_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
*/

public final class AlarmSeverityAssignment_T implements org.omg.CORBA.portable.IDLEntity
{
  public String probableCause = null;
  public String probableCauseQualifier = null;
  public String nativeProbableCause = null;
  public aSAP.AssignedSeverity_T serviceAffecting = null;
  public aSAP.AssignedSeverity_T serviceNonAffecting = null;
  public aSAP.AssignedSeverity_T serviceIndependentOrUnknown = null;

  public AlarmSeverityAssignment_T ()
  {
  } // ctor

  public AlarmSeverityAssignment_T (String _probableCause, String _probableCauseQualifier, String _nativeProbableCause, aSAP.AssignedSeverity_T _serviceAffecting, aSAP.AssignedSeverity_T _serviceNonAffecting, aSAP.AssignedSeverity_T _serviceIndependentOrUnknown)
  {
    probableCause = _probableCause;
    probableCauseQualifier = _probableCauseQualifier;
    nativeProbableCause = _nativeProbableCause;
    serviceAffecting = _serviceAffecting;
    serviceNonAffecting = _serviceNonAffecting;
    serviceIndependentOrUnknown = _serviceIndependentOrUnknown;
  } // ctor

} // class AlarmSeverityAssignment_T
