package CosNaming;


/**
* CosNaming/NameComponent.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNaming.idl
* 2009��9��2�� ������ ����02ʱ45��19�� CST
*/

public final class NameComponent implements org.omg.CORBA.portable.IDLEntity
{
  public String id = null;
  public String kind = null;

  public NameComponent ()
  {
  } // ctor

  public NameComponent (String _id, String _kind)
  {
    id = _id;
    kind = _kind;
  } // ctor

} // class NameComponent
