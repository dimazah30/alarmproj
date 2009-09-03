package mLSNPPLink;


/**
* mLSNPPLink/LayeredCapacity_T.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/

public final class LayeredCapacity_T implements org.omg.CORBA.portable.IDLEntity
{
  public short layerRate = (short)0;
  public String capacity = null;

  public LayeredCapacity_T ()
  {
  } // ctor

  public LayeredCapacity_T (short _layerRate, String _capacity)
  {
    layerRate = _layerRate;
    capacity = _capacity;
  } // ctor

} // class LayeredCapacity_T
