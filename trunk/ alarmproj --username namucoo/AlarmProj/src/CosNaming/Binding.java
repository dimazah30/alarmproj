package CosNaming;


/**
* CosNaming/Binding.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
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
