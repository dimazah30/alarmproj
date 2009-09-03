package CosNaming;


/**
* CosNaming/BindingIteratorPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The BindingIterator interface allows a client to iterate through the
 * bindings using the next_one or next_n operations.
 */
public abstract class BindingIteratorPOA extends org.omg.PortableServer.Servant
 implements CosNaming.BindingIteratorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("next_one", new java.lang.Integer (0));
    _methods.put ("next_n", new java.lang.Integer (1));
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

  /**
 * This operation returns the next binding. If there are no more
 * bindings, false is returned.
 *
 * @parm b - next binding.
 */
       case 0:  // CosNaming/BindingIterator/next_one
       {
         CosNaming.BindingHolder b = new CosNaming.BindingHolder ();
         boolean $result = false;
         $result = this.next_one (b);
         out = $rh.createReply();
         out.write_boolean ($result);
         CosNaming.BindingHelper.write (out, b.value);
         break;
       }


  /** 
 * This operation returns at most the requested number of bindings.
 *
 * @parm how_many - maximum number of binding to return in bl.
 * @parm bl - list of bindings.
 */
       case 1:  // CosNaming/BindingIterator/next_n
       {
         int how_many = in.read_ulong ();
         CosNaming.BindingListHolder bl = new CosNaming.BindingListHolder ();
         boolean $result = false;
         $result = this.next_n (how_many, bl);
         out = $rh.createReply();
         out.write_boolean ($result);
         CosNaming.BindingListHelper.write (out, bl.value);
         break;
       }


  /** 
 * This operation destroys the iterator.
 */
       case 2:  // CosNaming/BindingIterator/destroy
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
    "IDL:omg.org/CosNaming/BindingIterator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public BindingIterator _this() 
  {
    return BindingIteratorHelper.narrow(
    super._this_object());
  }

  public BindingIterator _this(org.omg.CORBA.ORB orb) 
  {
    return BindingIteratorHelper.narrow(
    super._this_object(orb));
  }


} // class BindingIteratorPOA
