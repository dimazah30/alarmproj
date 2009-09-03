package CosNaming;


/**
* CosNaming/NamingContextExtPOA.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContextExt Interface provides the extensions to the 
 * NamingContext Interface as proposed by the Interoperable
 * Naming Service Extension.
 */
public abstract class NamingContextExtPOA extends org.omg.PortableServer.Servant
 implements CosNaming.NamingContextExtOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("to_string", new java.lang.Integer (0));
    _methods.put ("to_name", new java.lang.Integer (1));
    _methods.put ("to_url", new java.lang.Integer (2));
    _methods.put ("resolve_str", new java.lang.Integer (3));
    _methods.put ("bind", new java.lang.Integer (4));
    _methods.put ("rebind", new java.lang.Integer (5));
    _methods.put ("bind_context", new java.lang.Integer (6));
    _methods.put ("rebind_context", new java.lang.Integer (7));
    _methods.put ("resolve", new java.lang.Integer (8));
    _methods.put ("unbind", new java.lang.Integer (9));
    _methods.put ("new_context", new java.lang.Integer (10));
    _methods.put ("bind_new_context", new java.lang.Integer (11));
    _methods.put ("destroy", new java.lang.Integer (12));
    _methods.put ("list", new java.lang.Integer (13));
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
 * This operation accepts a Name and returns a stringified Name.
 *
 * @param n - Name (a sequence of NameComponents)
 * @raises InvalidName - if the Name is invalid.
 */
       case 0:  // CosNaming/NamingContextExt/to_string
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           String $result = null;
           $result = this.to_string (n);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /**
 * This operation accepts a StringifiedName and returns a Name.
 *
 * @param n - a StringifiedName
 * @raises InvalidName - if the Name is invalid.
 */
       case 1:  // CosNaming/NamingContextExt/to_name
       {
         try {
           String sn = CosNaming.NamingContextExtPackage.StringNameHelper.read (in);
           CosNaming.NameComponent $result[] = null;
           $result = this.to_name (sn);
           out = $rh.createReply();
           CosNaming.NameHelper.write (out, $result);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /**
 * This operation accepts a URL address component and a stringified
 * name and returns a URL string.
 *
 * @param n - a Stringified name.
 * @raises addr - URL address component.
 */
       case 2:  // CosNaming/NamingContextExt/to_url
       {
         try {
           String addr = CosNaming.NamingContextExtPackage.AddressHelper.read (in);
           String sn = CosNaming.NamingContextExtPackage.StringNameHelper.read (in);
           String $result = null;
           $result = this.to_url (addr, sn);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (CosNaming.NamingContextExtPackage.InvalidAddress $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextExtPackage.InvalidAddressHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /**
 * This is a convenience operation that performs a resolve in the same
 * manner as NamingContext::resolve.
 *
 * @param n - a Stringified name.
 * @raises NotFound, CannotProceed, InvalidName
 */
       case 3:  // CosNaming/NamingContextExt/resolve_str
       {
         try {
           String n = CosNaming.NamingContextExtPackage.StringNameHelper.read (in);
           org.omg.CORBA.Object $result = null;
           $result = this.resolve_str (n);
           out = $rh.createReply();
           org.omg.CORBA.ObjectHelper.write (out, $result);
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /**
 * Creates a binding of a name and an object in the naming
 * context. Naming contexts that are bound using bind do not
 * participate in name resolution when compound names are passed to be
 * resolved. A bind operation that is passed a compound name is
 * defined as follows:
 *
 * <pre>
 * ctx->bind(< c1 ; c2 ; ... ; cn >, obj) :=
 * (ctx->resolve(< c1 ; c2 ; ... ; cn-1 >))->bind(< cn >, obj)
 * </pre>
 *
 * @parm n - binding name.
 * @parm obj - object to bind.
 * @raises AlreadyBound - if the name is bound in the context.
 */
       case 4:  // CosNaming/NamingContext/bind
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           org.omg.CORBA.Object obj = org.omg.CORBA.ObjectHelper.read (in);
           this.bind (n, obj);
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.AlreadyBound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.AlreadyBoundHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * Creates a binding of a name and an object in the naming context
 * even if the name is already bound in the context. Naming contexts
 * that are bound using rebind do not participate in name resolution
 * when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm obj - object to bind.
 */
       case 5:  // CosNaming/NamingContext/rebind
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           org.omg.CORBA.Object obj = org.omg.CORBA.ObjectHelper.read (in);
           this.rebind (n, obj);
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * Names an object that is a naming context. Naming contexts that are
 * bound using bind_context() participate in name resolution when
 * compound names are passed to be resolved. A bind_context operation
 * that is passed a compound name is defined as follows:
 * <pre>
 * ctx->bind_context(< c1 ; c2 ; ... ; cn >, nc) :=
 * (ctx->resolve(< c1 ; c2 ; ... ; cn-1 >))->bind_context(< cn >, nc)
 * </pre>
 *
 * @parm n - binding name.
 * @parm nc - naming context to bind.
 * @raises AlreadyBound - if the name is bound in the context.
 */
       case 6:  // CosNaming/NamingContext/bind_context
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           CosNaming.NamingContext nc = CosNaming.NamingContextHelper.read (in);
           this.bind_context (n, nc);
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.AlreadyBound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.AlreadyBoundHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * Creates a binding of a name and a naming context in the naming
 * context even if the name is already bound in the context. Naming
 * contexts that are bound using rebind_context() participate in name
 * resolution when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm nc - naming context to bind.
 */
       case 7:  // CosNaming/NamingContext/rebind_context
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           CosNaming.NamingContext nc = CosNaming.NamingContextHelper.read (in);
           this.rebind_context (n, nc);
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * The resolve operation is the process of retrieving an object bound
 * to a name in a given context. The given name must exactly match the
 * bound name. The naming service does not return the type of the
 * object. Clients are responsible for "narrowing" the object to the
 * appropriate type. That is, clients typically cast the returned
 * object from Object to a more specialized interface. Names can have
 * multiple components; therefore, name resolution can traverse
 * multiple contexts.
 * A compound resolve is defined as follows:
 * <pre>
 * ctx->resolve(< c1 ; c2 ; ... ; cn >) :=
 * ctx->resolve(< c1 ; c2 ; ... ; cn-1 >)->resolve(< cn >)
 * </pre>
 *
 * @parm n - binding name.
 * @returns bound object.
 */
       case 8:  // CosNaming/NamingContext/resolve
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           org.omg.CORBA.Object $result = null;
           $result = this.resolve (n);
           out = $rh.createReply();
           org.omg.CORBA.ObjectHelper.write (out, $result);
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * The unbind operation removes a name binding from a context.
 * A unbind operation that is passed a compound name is defined as follows:
 * <pre>
 * ctx->unbind(< c1 ; c2 ; ... ; cn >) :=
 * (ctx->resolve(< c1 ; c2 ; ... ; cn-1 >))->unbind(< cn >)
 * </pre>
 *
 * @parm n - binding name.
 */
       case 9:  // CosNaming/NamingContext/unbind
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           this.unbind (n);
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * This operation returns a naming context implemented by the same
 * naming server as the context on which the operation was
 * invoked. The new context is not bound to any name.
 *
 * @returns new binding context.
 */
       case 10:  // CosNaming/NamingContext/new_context
       {
         CosNaming.NamingContext $result = null;
         $result = this.new_context ();
         out = $rh.createReply();
         CosNaming.NamingContextHelper.write (out, $result);
         break;
       }


  /** 
 * This operation creates a new context and binds it to the name
 * supplied as an argument. The newly-created context is implemented
 * by the same naming server as the context in which it was bound
 * (that is, the naming server that implements the context denoted by
 * the name argument excluding the last component). A bind_new_context
 * that is passed a compound name is defined as follows:
 * 
 * <pre>
 * ctx->bind_new_context(< c1 ; c2 ; ... ; cn >) :=
 * (ctx->resolve(< c1 ; c2 ; ... ; cn-1 >))->bind_new_context(< cn >)
 * </pre>
 *
 * @parm n - binding name.
 * @returns new binding context.
 * @raises AlreadyBound - if the name is bound in the context.
 */
       case 11:  // CosNaming/NamingContext/bind_new_context
       {
         try {
           CosNaming.NameComponent n[] = CosNaming.NameHelper.read (in);
           CosNaming.NamingContext $result = null;
           $result = this.bind_new_context (n);
           out = $rh.createReply();
           CosNaming.NamingContextHelper.write (out, $result);
         } catch (CosNaming.NamingContextPackage.NotFound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotFoundHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.CannotProceed $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.CannotProceedHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.InvalidName $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.InvalidNameHelper.write (out, $ex);
         } catch (CosNaming.NamingContextPackage.AlreadyBound $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.AlreadyBoundHelper.write (out, $ex);
         }
         break;
       }


  /** 
 * The destroy operation deletes a naming context. The list operation
 * allows a client to iterate through a set of bindings in a naming
 * context.
 *
 * @raises NotEmpty - if the naming context contains bindings.
 */
       case 12:  // CosNaming/NamingContext/destroy
       {
         try {
           this.destroy ();
           out = $rh.createReply();
         } catch (CosNaming.NamingContextPackage.NotEmpty $ex) {
           out = $rh.createExceptionReply ();
           CosNaming.NamingContextPackage.NotEmptyHelper.write (out, $ex);
         }
         break;
       }


  /**
 * The list operation returns at most the requested number of bindings in
 * BindingList bl.
 * <ul>
 * <li> If the naming context contains additional bindings, the list
 * operation returns a BindingIterator with the additional bindings.
 * <li> If the naming context does not contain additional bindings, the
 * binding iterator is a nil object reference.
 * </ul>
 *
 * @parm how_many - maximum number of binding to return in bl.
 * @parm bl - list of bindings.
 * @parm bi - iterator over remaining bindings.
 */
       case 13:  // CosNaming/NamingContext/list
       {
         int how_many = in.read_ulong ();
         CosNaming.BindingListHolder bl = new CosNaming.BindingListHolder ();
         CosNaming.BindingIteratorHolder bi = new CosNaming.BindingIteratorHolder ();
         this.list (how_many, bl, bi);
         out = $rh.createReply();
         CosNaming.BindingListHelper.write (out, bl.value);
         CosNaming.BindingIteratorHelper.write (out, bi.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNaming/NamingContextExt:1.0", 
    "IDL:omg.org/CosNaming/NamingContext:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public NamingContextExt _this() 
  {
    return NamingContextExtHelper.narrow(
    super._this_object());
  }

  public NamingContextExt _this(org.omg.CORBA.ORB orb) 
  {
    return NamingContextExtHelper.narrow(
    super._this_object(orb));
  }


} // class NamingContextExtPOA
