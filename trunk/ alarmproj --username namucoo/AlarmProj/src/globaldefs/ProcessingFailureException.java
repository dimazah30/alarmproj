package globaldefs;


/**
* globaldefs/ProcessingFailureException.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/

public final class ProcessingFailureException extends org.omg.CORBA.UserException
{
  public globaldefs.ExceptionType_T exceptionType = null;
  public String errorReason = null;

  public ProcessingFailureException ()
  {
    super(ProcessingFailureExceptionHelper.id());
  } // ctor

  public ProcessingFailureException (globaldefs.ExceptionType_T _exceptionType, String _errorReason)
  {
    super(ProcessingFailureExceptionHelper.id());
    exceptionType = _exceptionType;
    errorReason = _errorReason;
  } // ctor


  public ProcessingFailureException (String $reason, globaldefs.ExceptionType_T _exceptionType, String _errorReason)
  {
    super(ProcessingFailureExceptionHelper.id() + "  " + $reason);
    exceptionType = _exceptionType;
    errorReason = _errorReason;
  } // ctor

} // class ProcessingFailureException
