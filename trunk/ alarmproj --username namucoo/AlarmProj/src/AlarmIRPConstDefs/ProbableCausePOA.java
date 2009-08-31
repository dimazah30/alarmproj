package AlarmIRPConstDefs;


/**
* AlarmIRPConstDefs/ProbableCausePOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 AlarmIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分58秒 CST
*/


/*
   This block identifies the probable cause of a reported alarm.
   */
public abstract class ProbableCausePOA extends org.omg.PortableServer.Servant
 implements AlarmIRPConstDefs.ProbableCauseOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:3gppsa5.org/AlarmIRPConstDefs/ProbableCause:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public ProbableCause _this() 
  {
    return ProbableCauseHelper.narrow(
    super._this_object());
  }

  public ProbableCause _this(org.omg.CORBA.ORB orb) 
  {
    return ProbableCauseHelper.narrow(
    super._this_object(orb));
  }


} // class ProbableCausePOA
