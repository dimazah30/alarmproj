package globaldefs;

/**
* globaldefs/ExceptionType_THolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/


/**
   * <p> Exception Definitions </p>
   * <p>As per CORBA policies agreement, only one exception object is defined
   * to capture all of the possible exceptions
   * defined in the ProcessingFailureException.</p>
   * <ul>
   * <li> EXCPT_NOT_IMPLEMENTED, <p> If some IDL operations are optional 
   * or not implemented in this release, then this value may be used
   * for this purpose.  If the operation itself is not supported, then
   * errorReason shall be an empty string.  
   * If this exception is raised because of the values
   * of specific parameters, then the names of these parameters shall be
   * supplied in errorReason (separated by commas), unless otherwise
   * specified in the operation description.</p></li>
   * <li> EXCPT_INTERNAL_ERROR, <p> To indicate an EMS internal error.
   * Applies to all methods. </p></li>
   * <li> EXCPT_INVALID_INPUT, 
   * <p> If the format of a parameter is incorrect, e.g. if a TP name which is a  
   * 3 level namingAttribute is passed as a single level name, then this type  
   * will be used.  Also if a parameter is out of range, this type will be used.  
   * The reason field will be filled with the parameter that was incorrect 
   * </p></li>
   * <li> EXCPT_OBJECT_IN_USE, <p> To indicate an object already in use.</p> 
   * </li>
   * <li> EXCPT_TP_INVALID_ENDPOINT, <p> To indicate that the specified TP does 
   * not exist or cannot be created (e.g., attempt to create a VPL TP using an 
   * out of range VPI value). 
   * Note that if the TP is valid but is already terminated & mapped or cross- 
   * connected then EXCPT_OBJECT_IN_USE must be returned. </p> </li>
   * <li> EXCPT_ENTITY_NOT_FOUND, 
   * <p> In general, if the NMS supplies an object name as a parameter to
   * an operation and the EMS can not find the object with the given name then 
   *  an exception of this type is returned. The reason field in the 
   * exception will be filled with the name that was passed in as 
   * parameter.</p></li>
   * <li> EXCPT_TIMESLOT_IN_USE, <p> To indicate a timeslot already in use
   * when creating or activating an SNC. </p>  </li> 
   * <li> EXCPT_PROTECTION_EFFORT_NOT_MET, <p> If the NMS requests an SNC 
   * with a protection effort that cannot be met by the EMS. </p> </li>
   * <li> EXCPT_NOT_IN_VALID_STATE, <p> Used if the client tries to delete 
   * an active SNC for example. </p></li>
   * <li> EXCPT_UNABLE_TO_COMPLY, <p> The value EXCPT_UNABLE_TO_COMPLY value is   
   * used as a generic
   * value when a server cannot respond to the request. </p> </li>
   * <li> EXCPT_NE_COMM_LOSS, <p> The value EXCPT_NE_COMM_LOSS value is   
   * used as a generic value when a server cannot communicate with the NE and 
   * that prevents the successful completion of the operation.  All operations
   * that involve communication with the NE may throw this particular 
   * exception type.</p> </li>
   * <li> EXCPT_CAPACITY_EXCEEDED <p>Raised when an operation will result in
   * resources being created or activated beyond the capacity supported by the 
   * NE/EMS.</p></li> 
   * <li> EXCPT_ACCESS_DENIED <p> Raised when an operation results in a
   * security violation. </p></li>
   * <li> EXCPT_TOO_MANY_OPEN_ITERATORS <p>Raised when an EMS exceeds its 
   * internal limit of the number of iterators it can support.</p></li> 
   * <li> EXCPT_UNSUPPORTED_ROUTING_CONSTRAINTS <p>Raised when an EMS does not 
   * support the routing constraints specified as input.</p></li> 
   * <li> EXCPT_USERLABEL_IN_USE <p>Raised when the userLabel uniqueness 
   * constraint can not be met.</p></li> 
   * </ul>
   * </p>
   **/
public final class ExceptionType_THolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.ExceptionType_T value = null;

  public ExceptionType_THolder ()
  {
  }

  public ExceptionType_THolder (globaldefs.ExceptionType_T initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.ExceptionType_THelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.ExceptionType_THelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.ExceptionType_THelper.type ();
  }

}
