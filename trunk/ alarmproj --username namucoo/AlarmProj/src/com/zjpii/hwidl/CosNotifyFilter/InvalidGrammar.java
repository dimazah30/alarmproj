package CosNotifyFilter;


/**
* CosNotifyFilter/InvalidGrammar.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class InvalidGrammar extends org.omg.CORBA.UserException
{

  public InvalidGrammar ()
  {
    super(InvalidGrammarHelper.id());
  } // ctor


  public InvalidGrammar (String $reason)
  {
    super(InvalidGrammarHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidGrammar
