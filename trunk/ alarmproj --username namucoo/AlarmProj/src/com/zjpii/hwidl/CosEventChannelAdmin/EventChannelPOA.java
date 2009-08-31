package CosEventChannelAdmin;


/**
* CosEventChannelAdmin/EventChannelPOA.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosEventChannelAdmin.idl
* 2009��8��26�� ������ ����10ʱ45��20�� CST
*/

public abstract class EventChannelPOA extends org.omg.PortableServer.Servant
 implements CosEventChannelAdmin.EventChannelOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("for_consumers", new java.lang.Integer (0));
    _methods.put ("for_suppliers", new java.lang.Integer (1));
    _methods.put ("destroy", new java.lang.Integer (2));
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
       case 0:  // CosEventChannelAdmin/EventChannel/for_consumers
       {
         CosEventChannelAdmin.ConsumerAdmin $result = null;
         $result = this.for_consumers ();
         out = $rh.createReply();
         CosEventChannelAdmin.ConsumerAdminHelper.write (out, $result);
         break;
       }

       case 1:  // CosEventChannelAdmin/EventChannel/for_suppliers
       {
         CosEventChannelAdmin.SupplierAdmin $result = null;
         $result = this.for_suppliers ();
         out = $rh.createReply();
         CosEventChannelAdmin.SupplierAdminHelper.write (out, $result);
         break;
       }

       case 2:  // CosEventChannelAdmin/EventChannel/destroy
       {
         this.destroy ();
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
    "IDL:omg.org/CosEventChannelAdmin/EventChannel:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EventChannel _this() 
  {
    return EventChannelHelper.narrow(
    super._this_object());
  }

  public EventChannel _this(org.omg.CORBA.ORB orb) 
  {
    return EventChannelHelper.narrow(
    super._this_object(orb));
  }


} // class EventChannelPOA
