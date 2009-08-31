package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/CommentSetHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   Defines a set of comments which are placed in the COMMENTS attribute
   of a structured event.
   */
public final class CommentSetHolder implements org.omg.CORBA.portable.Streamable
{
  public AlarmIRPConstDefs.Comment value[] = null;

  public CommentSetHolder ()
  {
  }

  public CommentSetHolder (AlarmIRPConstDefs.Comment[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = AlarmIRPConstDefs.CommentSetHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    AlarmIRPConstDefs.CommentSetHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return AlarmIRPConstDefs.CommentSetHelper.type ();
  }

}
