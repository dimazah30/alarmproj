package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/_SupplierAdminStub.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��9��2�� ������ ����02ʱ44��57�� CST
*/


/**
    * Interface for the supplier administration object.
    */
public class _SupplierAdminStub extends org.omg.CORBA.portable.ObjectImpl implements CosEventChannelAdmin.SupplierAdmin
{


  /**
         * Obtain a push consumer proxy for this administration object.
         * @returns A <code>ProxyPushConsumer</code> object reference.
         */
  public CosEventChannelAdmin.ProxyPushConsumer obtain_push_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_push_consumer", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ProxyPushConsumer $result = CosEventChannelAdmin.ProxyPushConsumerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_push_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_push_consumer


  /**
         * Obtain a pull consumer proxy for this administration object.
         * @returns A <code>ProxyPullConsumer</code> object reference.
         */
  public CosEventChannelAdmin.ProxyPullConsumer obtain_pull_consumer ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("obtain_pull_consumer", true);
                $in = _invoke ($out);
                CosEventChannelAdmin.ProxyPullConsumer $result = CosEventChannelAdmin.ProxyPullConsumerHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return obtain_pull_consumer (        );
            } finally {
                _releaseReply ($in);
            }
  } // obtain_pull_consumer

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0"};

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
} // class _SupplierAdminStub
