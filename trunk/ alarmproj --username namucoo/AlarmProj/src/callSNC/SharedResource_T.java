package callSNC;


/**
* callSNC/SharedResource_T.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� callSNC.idl
* 2009��9��2�� ������ ����03ʱ26��40�� CST
*/

public final class SharedResource_T implements org.omg.CORBA.portable.IDLEntity
{
  public globaldefs.NameAndStringValue_T name[] = null;
  public globaldefs.NameAndStringValue_T connectionNameList[][] = null;

  public SharedResource_T ()
  {
  } // ctor

  public SharedResource_T (globaldefs.NameAndStringValue_T[] _name, globaldefs.NameAndStringValue_T[][] _connectionNameList)
  {
    name = _name;
    connectionNameList = _connectionNameList;
  } // ctor

} // class SharedResource_T
