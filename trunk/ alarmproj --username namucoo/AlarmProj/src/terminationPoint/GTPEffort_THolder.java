package terminationPoint;

/**
* terminationPoint/GTPEffort_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 terminationPoint.idl
* 2009年9月2日 星期三 下午03时27分55秒 CST
*/


/**
   * <p>The GTP effort is a statement of the requirement of the list of CTPs
   * that a new GTP. If EFFORT_SAME is specified then the EMS must create the 
   * GTP with the exact same list of CTPs as provided with the GTP creation 
   * request. Further, if the NMS uses EFFORT_SAME, it is assume that the EMS 
   * will not modify the CTP list comprising the GTP at some later point (unless 
   * requested by the NMS via the modifyGTP operation). If EFFORT_WHATEVER is 
   * specified then the EMS may comply with the total bandwidth requirement by 
   * using a different set of CTPs.</p>
   *  
   * <p>If the NMS requests a GTP with gtpEffort equal to EFFORT_SAME, this also 
   * implies that the EMS will not modify on its own, i.e., the EMS will only 
   * modify the GTP if requested by the NMS via the modifyGTP operation.</p>
   **/
public final class GTPEffort_THolder implements org.omg.CORBA.portable.Streamable
{
  public terminationPoint.GTPEffort_T value = null;

  public GTPEffort_THolder ()
  {
  }

  public GTPEffort_THolder (terminationPoint.GTPEffort_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = terminationPoint.GTPEffort_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    terminationPoint.GTPEffort_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return terminationPoint.GTPEffort_THelper.type ();
  }

}
