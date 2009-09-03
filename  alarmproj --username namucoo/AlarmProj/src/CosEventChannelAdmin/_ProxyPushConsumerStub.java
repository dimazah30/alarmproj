package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_ProxyPushConsumerStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy push consumer.
    */
public class _ProxyPushConsumerStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.ProxyPushConsumer
{


  /**
         * Connect a push supplier to this proxy.
         * @parm <code>push_supplier</code> - The <code>PushSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         */
  public void connect_push_supplier (CosEventComm.PushSupplier push_supplier) throws CosEventChannelAdmin.AlreadyConnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_push_supplier", true);
                CosEventComm.PushSupplierHelper.write ($out, push_supplier);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
                    throw CosEventChannelAdmin.AlreadyConnectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                connect_push_supplier (push_supplier        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_push_supplier


  /**
       * Push an event onto this consumer.
       * @parm <code>data</code> - The event data.
       * @raises Disconnected If this consumer is disconnected.
       */
  public void push (org.omg.CORBA.Any data) throws CosEventComm.Disconnected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("push", true);
                $out.write_any (data);
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
                push (data        );
            } finally {
                _releaseReply ($in);
            }
  } // push


  /**
       * Disconnect a push consumer.
       */
  public void disconnect_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_push_consumer", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_push_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPushConsumer:1.0", 
    "IDL:omg.org/CosEventComm/PushConsumer:1.0"};

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
} // class _ProxyPushConsumerStub
