package EPIRPSystem;

/**
* EPIRPSystem/InvalidRequestedParametersHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 EPIRPSystem.idl
* 2009年8月25日 星期二 下午04时07分42秒 CST
*/

public final class InvalidRequestedParametersHolder implements org.omg.CORBA.portable.Streamable
{
  public EPIRPSystem.InvalidRequestedParameters value = null;

  public InvalidRequestedParametersHolder ()
  {
  }

  public InvalidRequestedParametersHolder (EPIRPSystem.InvalidRequestedParameters initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EPIRPSystem.InvalidRequestedParametersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EPIRPSystem.InvalidRequestedParametersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EPIRPSystem.InvalidRequestedParametersHelper.type ();
  }

}
