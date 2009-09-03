package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_ProxyPullConsumerStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for a proxy pull consumer.
    */
public class _ProxyPullConsumerStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.ProxyPullConsumer
{


  /**
         * Connect a pull supplier to this proxy.
         * @parm <code>pull_supplier</code> - The <code>PullSupplier</code>
         * object reference.
         * @raises AlreadyConnected If this supplier is already connected.
         * @raises TypeError Illegal supplier type.
         */
  public void connect_pull_supplier (CosEventComm.PullSupplier pull_supplier) throws CosEventChannelAdmin.AlreadyConnected, CosEventChannelAdmin.TypeError
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("connect_pull_supplier", true);
                CosEventComm.PullSupplierHelper.write ($out, pull_supplier);
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
                connect_pull_supplier (pull_supplier        );
            } finally {
                _releaseReply ($in);
            }
  } // connect_pull_supplier


  /**
       * Disconnect a pull consumer.
       */
  public void disconnect_pull_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("disconnect_pull_consumer", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                disconnect_pull_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // disconnect_pull_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/ProxyPullConsumer:1.0", 
    "IDL:omg.org/CosEventComm/PullConsumer:1.0"};

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
} // class _ProxyPullConsumerStub
