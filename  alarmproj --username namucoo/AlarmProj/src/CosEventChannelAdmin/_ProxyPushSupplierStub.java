package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_ProxyPushSupplierStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy push supplier.
    */
public class _ProxyPushSupplierStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.ProxyPushSupplier
{


  /**
         * Connect a push consumer to this proxy.
         * @parm <code>push_consumer</code> - The <code>PushConsumer</code>
         * object reference.
         * @raises AlreadyConnected If this consumer is already connected.
         * @raises TypeError Illegal consumer type.
         */
  public void connect_push_consumer (CosEventComm.PushConsumer push_consumer) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_push_consumer", true);
                CosEventComm.PushConsumerHelper.write ($out, push_consumer);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/AlreadyConnected:1.0"))
                    throw CosEventChannelAdmin.AlreadyConnectedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosEventChannelAdmin/TypeError:1.0"))
                    throw CosEventChannelAdmin.TypeErrorHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                connect_push_consumer (push_consumer        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_push_consumer


  /**
       * Disconnect a push supplier.
       */
  public void disconnect_push_supplier ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_push_supplier", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_push_supplier (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_push_supplier

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0", 
    "IDL:omg.org/CosEventComm/PushSupplier:1.0"};

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
} // class _ProxyPushSupplierStub
