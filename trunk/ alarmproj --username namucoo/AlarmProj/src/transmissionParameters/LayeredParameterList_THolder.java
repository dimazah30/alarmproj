package transmissionParameters;


/**
* transmissionParameters/LayeredParameterList_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 transmissionParameters.idl
* 2009年9月2日 星期三 下午03时27分34秒 CST
*/


/**
   * <p>Set of LayeredParameters_T.</p>
   *
   * <p>LayeredParameterList_T is used in the TP definition and as a 
   * consequence is available for use in a connection specification
   * where a TP is specified.</p>
   **/
public final class LayeredParameterList_THolder implements org.omg.CORBA.portable.Streamable
{
  public transmissionParameters.LayeredParameters_T value[] = null;

  public LayeredParameterList_THolder ()
  {
  }

  public LayeredParameterList_THolder (transmissionParameters.LayeredParameters_T[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = transmissionParameters.LayeredParameterList_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    transmissionParameters.LayeredParameterList_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return transmissionParameters.LayeredParameterList_THelper.type ();
  }

}
