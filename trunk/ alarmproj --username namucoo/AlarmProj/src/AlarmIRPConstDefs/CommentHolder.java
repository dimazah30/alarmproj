package AlarmIRPConstDefs;

/**
* AlarmIRPConstDefs/CommentHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� AlarmIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��58�� CST
*/

public final class CommentHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.Comment value = null;

  public CommentHolder ()
  {
  }

  public CommentHolder (AlarmIRPConstDefs.Comment initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.CommentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.CommentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.CommentHelper.type ();
  }

}
