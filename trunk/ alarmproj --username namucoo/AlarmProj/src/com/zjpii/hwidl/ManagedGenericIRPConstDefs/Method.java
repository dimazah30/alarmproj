package ManagedGenericIRPConstDefs;


/**
* ManagedGenericIRPConstDefs/Method.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� ManagedGenericIRPConstDefs.idl
* 2009��8��24�� ����һ ����09ʱ33��45�� CST
*/

public final class Method implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String parameter_list[] = null;

  public Method ()
  {
  } // ctor

  public Method (String _name, String[] _parameter_list)
  {
    name = _name;
    parameter_list = _parameter_list;
  } // ctor

} // class Method
