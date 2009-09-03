package terminationPoint;


/**
* terminationPoint/GTPEffort_T.java .
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
public class GTPEffort_T implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 2;
  private static terminationPoint.GTPEffort_T[] __array = new terminationPoint.GTPEffort_T [__size];

  public static final int _EFFORT_WHATEVER = 0;
  public static final terminationPoint.GTPEffort_T EFFORT_WHATEVER = new terminationPoint.GTPEffort_T(_EFFORT_WHATEVER);
  public static final int _EFFORT_SAME = 1;
  public static final terminationPoint.GTPEffort_T EFFORT_SAME = new terminationPoint.GTPEffort_T(_EFFORT_SAME);

  public int value ()
  {
    return __value;
  }

  public static terminationPoint.GTPEffort_T from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected GTPEffort_T (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class GTPEffort_T
