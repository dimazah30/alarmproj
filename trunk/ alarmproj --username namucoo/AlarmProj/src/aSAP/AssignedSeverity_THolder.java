package aSAP;

/**
* aSAP/AssignedSeverity_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 aSAP.idl
* 2009年9月2日 星期三 下午03时25分09秒 CST
*/


/**
   * <p>Alarm notifications include a severity. The severity is defined in
   * notifications::PerceivedSeverity_T .</p>
   *
   * <p>The assigned severity is allocated to a probable cause using the
   * alarm severity assignment profile (ASAP). The identified probable cause  
   * should be raised with the assigned severity. The assignment of severities 
   * is extended beyond notifications::PerceivedSeverity_T to cover the case 
   * where:<ul>
   * <li>no alarm should be raised: "AS_NONALARMED"</li>
   * <li>the EMS/ME is free to make a choice based upon its local criteria: 
   * "AS_FREE_CHOICE"</li></ul></p>
   **/
public final class AssignedSeverity_THolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.AssignedSeverity_T value = null;

  public AssignedSeverity_THolder ()
  {
  }

  public AssignedSeverity_THolder (aSAP.AssignedSeverity_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.AssignedSeverity_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.AssignedSeverity_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.AssignedSeverity_THelper.type ();
  }

}
