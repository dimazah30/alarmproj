package CosNaming;


/**
* CosNaming/_NamingContextExtStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContextExt Interface provides the extensions to the 
 * NamingContext Interface as proposed by the Interoperable
 * Naming Service Extension.
 */
public class _NamingContextExtStub extends org.omg.CORBA.portable.ObjectImpl implements CosNaming.NamingContextExt
{


  /**
 * This operation accepts a Name and returns a stringified Name.
 *
 * @param n - Name (a sequence of NameComponents)
 * @raises InvalidName - if the Name is invalid.
 */
  public String to_string (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_string", true);
                CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                String $result = CosNaming.NamingContextExtPackage.StringNameHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_string (n        );
            } finally {
                _releaseReply ($in);
            }
  } // to_string


  /**
 * This operation accepts a StringifiedName and returns a Name.
 *
 * @param n - a StringifiedName
 * @raises InvalidName - if the Name is invalid.
 */
  public CosNaming.NameComponent[] to_name (String sn) throws CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_name", true);
                CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, sn);
                $in = _invoke ($out);
                CosNaming.NameComponent $result[] = CosNaming.NameHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_name (sn        );
            } finally {
                _releaseReply ($in);
            }
  } // to_name


  /**
 * This operation accepts a URL address component and a stringified
 * name and returns a URL string.
 *
 * @param n - a Stringified name.
 * @raises addr - URL address component.
 */
  public String to_url (String addr, String sn) throws CosNaming.NamingContextExtPackage.InvalidAddress, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("to_url", true);
                CosNaming.NamingContextExtPackage.AddressHelper.write ($out, addr);
                CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, sn);
                $in = _invoke ($out);
                String $result = CosNaming.NamingContextExtPackage.URLStringHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContextExt/InvalidAddress:1.0"))
                    throw CosNaming.NamingContextExtPackage.InvalidAddressHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return to_url (addr, sn        );
            } finally {
                _releaseReply ($in);
            }
  } // to_url


  /**
 * This is a convenience operation that performs a resolve in the same
 * manner as NamingContext::resolve.
 *
 * @param n - a Stringified name.
 * @raises NotFound, CannotProceed, InvalidName
 */
  public org.omg.CORBA.Object resolve_str (String n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resolve_str", true);
                CosNaming.NamingContextExtPackage.StringNameHelper.write ($out, n);
                $in = _invoke ($out);
                org.omg.CORBA.Object $result = org.omg.CORBA.ObjectHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return resolve_str (n        );
            } finally {
                _releaseReply ($in);
            }
  } // resolve_str


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
  public void bind (CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind", true);
                CosNaming.NameHelper.write ($out, n);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind (n, obj        );
            } finally {
                _releaseReply ($in);
            }
  } // bind


  /** 
 * Creates a binding of a name and an object in the naming context
 * even if the name is already bound in the context. Naming contexts
 * that are bound using rebind do not participate in name resolution
 * when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm obj - object to bind.
 */
  public void rebind (CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("rebind", true);
                CosNaming.NameHelper.write ($out, n);
                org.omg.CORBA.ObjectHelper.write ($out, obj);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rebind (n, obj        );
            } finally {
                _releaseReply ($in);
            }
  } // rebind


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
  public void bind_context (CosNaming.NameComponent[] n, CosNaming.NamingContext nc) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind_context", true);
                CosNaming.NameHelper.write ($out, n);
                CosNaming.NamingContextHelper.write ($out, nc);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                bind_context (n, nc        );
            } finally {
                _releaseReply ($in);
            }
  } // bind_context


  /** 
 * Creates a binding of a name and a naming context in the naming
 * context even if the name is already bound in the context. Naming
 * contexts that are bound using rebind_context() participate in name
 * resolution when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm nc - naming context to bind.
 */
  public void rebind_context (CosNaming.NameComponent[] n, CosNaming.NamingContext nc) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("rebind_context", true);
                CosNaming.NameHelper.write ($out, n);
                CosNaming.NamingContextHelper.write ($out, nc);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                rebind_context (n, nc        );
            } finally {
                _releaseReply ($in);
            }
  } // rebind_context


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
  public org.omg.CORBA.Object resolve (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resolve", true);
                CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                org.omg.CORBA.Object $result = org.omg.CORBA.ObjectHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return resolve (n        );
            } finally {
                _releaseReply ($in);
            }
  } // resolve


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
  public void unbind (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("unbind", true);
                CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                unbind (n        );
            } finally {
                _releaseReply ($in);
            }
  } // unbind


  /** 
 * This operation returns a naming context implemented by the same
 * naming server as the context on which the operation was
 * invoked. The new context is not bound to any name.
 *
 * @returns new binding context.
 */
  public CosNaming.NamingContext new_context ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("new_context", true);
                $in = _invoke ($out);
                CosNaming.NamingContext $result = CosNaming.NamingContextHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return new_context (        );
            } finally {
                _releaseReply ($in);
            }
  } // new_context


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
  public CosNaming.NamingContext bind_new_context (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bind_new_context", true);
                CosNaming.NameHelper.write ($out, n);
                $in = _invoke ($out);
                CosNaming.NamingContext $result = CosNaming.NamingContextHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotFound:1.0"))
                    throw CosNaming.NamingContextPackage.NotFoundHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/CannotProceed:1.0"))
                    throw CosNaming.NamingContextPackage.CannotProceedHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/InvalidName:1.0"))
                    throw CosNaming.NamingContextPackage.InvalidNameHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/AlreadyBound:1.0"))
                    throw CosNaming.NamingContextPackage.AlreadyBoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return bind_new_context (n        );
            } finally {
                _releaseReply ($in);
            }
  } // bind_new_context


  /** 
 * The destroy operation deletes a naming context. The list operation
 * allows a client to iterate through a set of bindings in a naming
 * context.
 *
 * @raises NotEmpty - if the naming context contains bindings.
 */
  public void destroy () throws CosNaming.NamingContextPackage.NotEmpty
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNaming/NamingContext/NotEmpty:1.0"))
                    throw CosNaming.NamingContextPackage.NotEmptyHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy


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
  public void list (int how_many, CosNaming.BindingListHolder bl, CosNaming.BindingIteratorHolder bi)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("list", true);
                $out.write_ulong (how_many);
                $in = _invoke ($out);
                bl.value = CosNaming.BindingListHelper.read ($in);
                bi.value = CosNaming.BindingIteratorHelper.read ($in);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                list (how_many, bl, bi        );
            } finally {
                _releaseReply ($in);
            }
  } // list

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNaming/NamingContextExt:1.0", 
    "IDL:omg.org/CosNaming/NamingContext:1.0"};

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
} // class _NamingContextExtStub
