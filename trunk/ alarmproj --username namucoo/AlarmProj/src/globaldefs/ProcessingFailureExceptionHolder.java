package globaldefs;

/**
* globaldefs/ProcessingFailureExceptionHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 globaldefs.idl
* 2009年9月2日 星期三 下午02时43分56秒 CST
*/

public final class ProcessingFailureExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public globaldefs.ProcessingFailureException value = null;

  public ProcessingFailureExceptionHolder ()
  {
  }

  public ProcessingFailureExceptionHolder (globaldefs.ProcessingFailureException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = globaldefs.ProcessingFailureExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    globaldefs.ProcessingFailureExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return globaldefs.ProcessingFailureExceptionHelper.type ();
  }

}
