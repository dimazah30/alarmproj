package subnetworkConnection;

/**
* subnetworkConnection/ProtectionEffort_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 subnetworkConnection.idl
* 2009年9月2日 星期三 下午03时28分43秒 CST
*/


/**
   * <p>The protection effort is a statement of the requirement
   * of the static protection level.  
   * For example if EFFORT_SAME_OR_WORSE is specified for a 3-ended
   * FULLY_PROTECTED connection, a 3-ended PARTIALLY_PROTECTED connection is 
   * acceptable, but a 2-ended connection (ST_SIMPLE) is not acceptable i.e. 
   * ProtectionEffort_T does not have any bearing on the externally visible shape 
   * of the SNC.</p>
   *
   * <p>EFFORT_WHATEVER indicates that the specified static protection level is 
   * preferred, but that any other level is acceptable.</p>
   *
   * <p>For a detailed description of the use of this attribute see 
   * <a href=../../../supportingDocumentation/SD1-36_SNCTypes.pdf >SD1-36 SNC Types</a>.</p>
   **/
public final class ProtectionEffort_THolder implements org.omg.CORBA.portable.Streamable
{
  public subnetworkConnection.ProtectionEffort_T value = null;

  public ProtectionEffort_THolder ()
  {
  }

  public ProtectionEffort_THolder (subnetworkConnection.ProtectionEffort_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = subnetworkConnection.ProtectionEffort_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    subnetworkConnection.ProtectionEffort_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return subnetworkConnection.ProtectionEffort_THelper.type ();
  }

}
