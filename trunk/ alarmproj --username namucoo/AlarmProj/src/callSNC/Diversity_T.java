package callSNC;


/**
* callSNC/Diversity_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class Diversity_T implements org.omg.CORBA.portable.IDLEntity
{
  public String coroutingLevelOfEffort = null;
  public String nodeDiversityLevelOfEffort = null;
  public String linkDiversityLevelOfEffort = null;
  public String nodeSRGType = null;
  public String linkSRGType = null;

  public Diversity_T ()
  {
  } // ctor

  public Diversity_T (String _coroutingLevelOfEffort, String _nodeDiversityLevelOfEffort, String _linkDiversityLevelOfEffort, String _nodeSRGType, String _linkSRGType)
  {
    coroutingLevelOfEffort = _coroutingLevelOfEffort;
    nodeDiversityLevelOfEffort = _nodeDiversityLevelOfEffort;
    linkDiversityLevelOfEffort = _linkDiversityLevelOfEffort;
    nodeSRGType = _nodeSRGType;
    linkSRGType = _linkSRGType;
  } // ctor

} // class Diversity_T
