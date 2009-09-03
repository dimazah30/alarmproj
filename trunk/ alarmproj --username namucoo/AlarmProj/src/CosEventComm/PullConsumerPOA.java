package CosEventComm;


/**
* CosEventComm/PullConsumerPOA.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventComm.idl
* 2009��9��2�� ������ ����02ʱ45��10�� CST
*/


/**
    * Interface for a pull consumer.
    */
public abstract class PullConsumerPOA extends org.omg.PortableServer.Servant
 implements CosEventComm.PullConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("disconnect_pull_consumer", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /**
       * Disconnect a pull consumer.
       */
       case 0:  // CosEventComm/PullConsumer/disconnect_pull_consumer
       {
         this.disconnect_pull_consumer ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventComm/PullConsumer:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public PullConsumer _this() 
  {
    return PullConsumerHelper.narrow(
    super._this_object());
  }

  public PullConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return PullConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class PullConsumerPOA
