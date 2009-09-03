package callSNC;


/**
* callSNC/Diversity_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
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
