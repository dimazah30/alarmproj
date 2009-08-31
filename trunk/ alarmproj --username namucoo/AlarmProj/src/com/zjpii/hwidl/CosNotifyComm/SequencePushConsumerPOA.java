package CosNotifyComm;


/**
* CosNotifyComm/SequencePushConsumerPOA.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyComm.idl
* 2009��8��26�� ������ ����11ʱ27��08�� CST
*/


// StructuredPushSupplier
public abstract class SequencePushConsumerPOA extends org.omg.PortableServer.Servant
 implements CosNotifyComm.SequencePushConsumerOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("push_structured_events", new java.lang.Integer (0));
    _methods.put ("disconnect_sequence_push_consumer", new java.lang.Integer (1));
    _methods.put ("offer_change", new java.lang.Integer (2));
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
       case 0:  // CosNotifyComm/SequencePushConsumer/push_structured_events
       {
         try {
           CosNotification.StructuredEvent notifications[] = CosNotification.EventBatchHelper.read (in);
           this.push_structured_events (notifications);
           out = $rh.createReply();
         } catch (CosEventComm.Disconnected $ex) {
           out = $rh.createExceptionReply ();
           CosEventComm.DisconnectedHelper.write (out, $ex);
         }
         break;
       }

       case 1:  // CosNotifyComm/SequencePushConsumer/disconnect_sequence_push_consumer
       {
         this.disconnect_sequence_push_consumer ();
         out = $rh.createReply();
         break;
       }

       case 2:  // CosNotifyComm/NotifyPublish/offer_change
       {
         try {
           CosNotification.EventType added[] = CosNotification.EventTypeSeqHelper.read (in);
           CosNotification.EventType removed[] = CosNotification.EventTypeSeqHelper.read (in);
           this.offer_change (added, removed);
           out = $rh.createReply();
         } catch (CosNotifyComm.InvalidEventType $ex) {
           out = $rh.createExceptionReply ();
           CosNotifyComm.InvalidEventTypeHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public SequencePushConsumer _this() 
  {
    return SequencePushConsumerHelper.narrow(
    super._this_object());
  }

  public SequencePushConsumer _this(org.omg.CORBA.ORB orb) 
  {
    return SequencePushConsumerHelper.narrow(
    super._this_object(orb));
  }


} // class SequencePushConsumerPOA
