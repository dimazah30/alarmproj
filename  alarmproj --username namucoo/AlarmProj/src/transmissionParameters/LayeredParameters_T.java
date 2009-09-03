package transmissionParameters;


/**
* transmissionParameters/LayeredParameters_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 transmissionParameters.idl
* 2009年9月2日 星期三 下午03时27分34秒 CST
*/

public final class LayeredParameters_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layer = (short)0;
  public globaldefs.NameAndStringValue_T transmissionParams[] = null;

  public LayeredParameters_T ()
  {
  } // ctor

  public LayeredParameters_T (short _layer, globaldefs.NameAndStringValue_T[] _transmissionParams)
  {
    layer = _layer;
    transmissionParams = _transmissionParams;
  } // ctor

} // class LayeredParameters_T
