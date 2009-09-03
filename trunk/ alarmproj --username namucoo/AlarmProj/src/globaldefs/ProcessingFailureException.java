package globaldefs;


/**
* globaldefs/ProcessingFailureException.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
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
