package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/Comment.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/

public final class Comment implements org.omg.CORBA.portable.IDLEntity
{
  public TimeBase.UtcT comment_time = null;
  public String comment_text = null;
  public String user_id = null;
  public String system_id = null;

  public Comment ()
  {
  } // ctor

  public Comment (TimeBase.UtcT _comment_time, String _comment_text, String _user_id, String _system_id)
  {
    comment_time = _comment_time;
    comment_text = _comment_text;
    user_id = _user_id;
    system_id = _system_id;
  } // ctor

} // class Comment
