package callSNC;


/**
* callSNC/CallEnd_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class CallEnd_T implements org.omg.CORBA.portable.IDLEntity
{
  public String tNANameOrGroupTNAName = null;
  public String sNPPid = null;
  public String sNPid = null;
  public globaldefs.NameAndStringValue_T tpName[] = null;

  public CallEnd_T ()
  {
  } // ctor

  public CallEnd_T (String _tNANameOrGroupTNAName, String _sNPPid, String _sNPid, globaldefs.NameAndStringValue_T[] _tpName)
  {
    tNANameOrGroupTNAName = _tNANameOrGroupTNAName;
    sNPPid = _sNPPid;
    sNPid = _sNPid;
    tpName = _tpName;
  } // ctor

} // class CallEnd_T
