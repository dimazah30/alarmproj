package CosNaming;


/**
* CosNaming/NamingContextOperations.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The NamingContext interface provides operations which support the following:
 * <ul>
 * <li> binding objects
 * <li> name resolution
 * <li> unbinding
 * <li> creating naming contexts
 * <li> deleting contexts
 * <li> listing a naming context
 * </ul>
 */
public interface NamingContextOperations 
{

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
  void bind (CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound;

  /** 
 * Creates a binding of a name and an object in the naming context
 * even if the name is already bound in the context. Naming contexts
 * that are bound using rebind do not participate in name resolution
 * when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm obj - object to bind.
 */
  void rebind (CosNaming.NameComponent[] n, org.omg.CORBA.Object obj) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName;

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
  void bind_context (CosNaming.NameComponent[] n, CosNaming.NamingContext nc) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound;

  /** 
 * Creates a binding of a name and a naming context in the naming
 * context even if the name is already bound in the context. Naming
 * contexts that are bound using rebind_context() participate in name
 * resolution when compound names are passed to be resolved.
 *
 * @parm n - binding name.
 * @parm nc - naming context to bind.
 */
  void rebind_context (CosNaming.NameComponent[] n, CosNaming.NamingContext nc) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName;

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
  org.omg.CORBA.Object resolve (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName;

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
  void unbind (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName;

  /** 
 * This operation returns a naming context implemented by the same
 * naming server as the context on which the operation was
 * invoked. The new context is not bound to any name.
 *
 * @returns new binding context.
 */
  CosNaming.NamingContext new_context ();

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
  CosNaming.NamingContext bind_new_context (CosNaming.NameComponent[] n) throws CosNaming.NamingContextPackage.NotFound, CosNaming.NamingContextPackage.CannotProceed, CosNaming.NamingContextPackage.InvalidName, CosNaming.NamingContextPackage.AlreadyBound;

  /** 
 * The destroy operation deletes a naming context. The list operation
 * allows a client to iterate through a set of bindings in a naming
 * context.
 *
 * @raises NotEmpty - if the naming context contains bindings.
 */
  void destroy () throws CosNaming.NamingContextPackage.NotEmpty;

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
  void list (int how_many, CosNaming.BindingListHolder bl, CosNaming.BindingIteratorHolder bi);
} // interface NamingContextOperations
