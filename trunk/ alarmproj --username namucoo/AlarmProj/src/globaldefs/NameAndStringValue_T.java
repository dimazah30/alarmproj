package globaldefs;


/**
* globaldefs/NameAndStringValue_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� globaldefs.idl
* 2009��9��2�� ������ ����02ʱ43��56�� CST
*/

public final class NameAndStringValue_T implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String value = null;

  public NameAndStringValue_T ()
  {
  } // ctor

  public NameAndStringValue_T (String _name, String _value)
  {
    name = _name;
    value = _value;
  } // ctor

} // class NameAndStringValue_T
