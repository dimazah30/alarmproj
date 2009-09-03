package CosNaming;


/**
* CosNaming/Binding.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/

public final class Binding implements org.omg.CORBA.portable.IDLEntity
{
  public CosNaming.NameComponent binding_name[] = null;
  public CosNaming.BindingType binding_type = null;

  public Binding ()
  {
  } // ctor

  public Binding (CosNaming.NameComponent[] _binding_name, CosNaming.BindingType _binding_type)
  {
    binding_name = _binding_name;
    binding_type = _binding_type;
  } // ctor

} // class Binding
