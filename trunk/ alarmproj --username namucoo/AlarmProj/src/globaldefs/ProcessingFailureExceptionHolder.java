package globaldefs;

/**
* globaldefs/ProcessingFailureExceptionHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
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
