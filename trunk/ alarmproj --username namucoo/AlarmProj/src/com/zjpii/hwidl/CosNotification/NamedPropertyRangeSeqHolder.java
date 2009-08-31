package CosNotification;


/**
* CosNotification/NamedPropertyRangeSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotification.idl
* 2009��8��24�� ����һ ����09ʱ33��34�� CST
*/

public final class NamedPropertyRangeSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotification.NamedPropertyRange value[] = null;

  public NamedPropertyRangeSeqHolder ()
  {
  }

  public NamedPropertyRangeSeqHolder (CosNotification.NamedPropertyRange[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotification.NamedPropertyRangeSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotification.NamedPropertyRangeSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotification.NamedPropertyRangeSeqHelper.type ();
  }

}
