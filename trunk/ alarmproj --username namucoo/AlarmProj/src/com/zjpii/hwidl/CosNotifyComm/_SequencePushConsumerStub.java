package CosNotifyComm;


/**
* CosNotifyComm/_SequencePushConsumerStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyComm.idl
* 2009年8月26日 星期三 上午11时27分08秒 CST
*/


// StructuredPushSupplier
public class _SequencePushConsumerStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyComm.SequencePushConsumer
{

  public void push_structured_events (CosNotification.StructuredEvent[] notifications) throws CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("push_structured_events", true);
                CosNotification.EventBatchHelper.write ($out, notifications);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventComm/Disconnected:1.0"))
                    throw CosEventComm.DisconnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                push_structured_events (notifications        );
            } finally {
                _releaseReply ($in);
            }
  } // push_structured_events

  public void disconnect_sequence_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_sequence_push_consumer", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_sequence_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_sequence_push_consumer

  public void offer_change (CosNotification.EventType[] added, CosNotification.EventType[] removed) throws CosNotifyComm.InvalidEventType
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("offer_change", true);
                CosNotification.EventTypeSeqHelper.write ($out, added);
                CosNotification.EventTypeSeqHelper.write ($out, removed);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyComm/InvalidEventType:1.0"))
                    throw CosNotifyComm.InvalidEventTypeHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                offer_change (added, removed        );
            } finally {
                _releaseReply ($in);
            }
  } // offer_change

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyComm/SequencePushConsumer:1.0", 
    "IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _SequencePushConsumerStub
