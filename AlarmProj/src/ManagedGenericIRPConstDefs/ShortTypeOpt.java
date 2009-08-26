package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/ShortTypeOpt.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 ManagedGenericIRPConstDefs.idl
* 2009年8月24日 星期一 上午09时33分45秒 CST
*/

public final class ShortTypeOpt implements org.omg.CORBA.portable.IDLEntity
{
  private short ___value;
  private boolean __discriminator;
  private boolean __uninitialized = true;

  public ShortTypeOpt ()
  {
  }

  public boolean discriminator ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    return __discriminator;
  }

  public short value ()
  {
    if (__uninitialized)
      throw new org.omg.CORBA.BAD_OPERATION ();
    verifyvalue (__discriminator);
    return ___value;
  }

  public void value (short value)
  {
    __discriminator = true;
    ___value = value;
    __uninitialized = false;
  }

  public void value (boolean discriminator, short value)
  {
    verifyvalue (discriminator);
    __discriminator = discriminator;
    ___value = value;
    __uninitialized = false;
  }

  private void verifyvalue (boolean discriminator)
  {
    if (discriminator != true)
      throw new org.omg.CORBA.BAD_OPERATION ();
  }

  public void _default ()
  {
    __discriminator = false;
    __uninitialized = false;
  }

  public void _default (boolean discriminator)
  {
    verifyDefault( discriminator ) ;
    __discriminator = discriminator ;
    __uninitialized = false;
  }

  private void verifyDefault( boolean value )
  {
	  if(value){
		  throw new org.omg.CORBA.BAD_OPERATION() ;
	  }else{
		  return ;
	  }
//    switch (value) {
//      case true:
//        throw new org.omg.CORBA.BAD_OPERATION() ;
//
//      default:
//        return;
//    }
  }

} // class ShortTypeOpt
