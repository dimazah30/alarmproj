package CosNotifyFilter;

/**
* CosNotifyFilter/InvalidGrammarHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class InvalidGrammarHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.InvalidGrammar value = null;

  public InvalidGrammarHolder ()
  {
  }

  public InvalidGrammarHolder (CosNotifyFilter.InvalidGrammar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.InvalidGrammarHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.InvalidGrammarHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.InvalidGrammarHelper.type ();
  }

}
