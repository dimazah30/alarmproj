package callSNC;


/**
* callSNC/DiversityInfo_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class DiversityInfo_T implements org.omg.CORBA.portable.IDLEntity
{
  public String sRGType = null;
  public callSNC.SharedResource_T sharedResourceList[] = null;

  public DiversityInfo_T ()
  {
  } // ctor

  public DiversityInfo_T (String _sRGType, callSNC.SharedResource_T[] _sharedResourceList)
  {
    sRGType = _sRGType;
    sharedResourceList = _sharedResourceList;
  } // ctor

} // class DiversityInfo_T
