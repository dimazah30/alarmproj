package callSNC;


/**
* callSNC/DiversityInfo_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 callSNC.idl
* 2009年9月2日 星期三 下午03时26分40秒 CST
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
