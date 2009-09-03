package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_EventChannelStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosEventChannelAdmin.idl
* 2009年9月2日 星期三 下午02时44分57秒 CST
*/


/**
    * Interface for the event channel.
    */
public class _EventChannelStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.EventChannel
{


  /**
         * Gets an object reference to the administration object
         * for event consumers.
         * @returns The <code>ConsumerAdmin</code> object reference.
         */
  public CosEventChannelAdmin.ConsumerAdmin for_consumers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("for_consumers", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ConsumerAdmin $result = CosEventChannelAdmin.ConsumerAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return for_consumers (        );
            } finally {
                _releaseReply ($in);
            }
  } // for_consumers


  /**
         * Gets an object reference to the administration object
         * for event suppliers.
         * @returns The <code>SupplierAdmin</code> object reference.
         */
  public CosEventChannelAdmin.SupplierAdmin for_suppliers ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("for_suppliers", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.SupplierAdmin $result = CosEventChannelAdmin.SupplierAdminHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return for_suppliers (        );
            } finally {
                _releaseReply ($in);
            }
  } // for_suppliers


  /**
         * Destroys this event channel and released any storage used.
         */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0"};

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
} // class _EventChannelStub
