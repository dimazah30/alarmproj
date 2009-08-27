package CosNotifyFilter;

/**
* CosNotifyFilter/MappingConstraintPairHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class MappingConstraintPairHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingConstraintPair value = null;

  public MappingConstraintPairHolder ()
  {
  }

  public MappingConstraintPairHolder (CosNotifyFilter.MappingConstraintPair initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingConstraintPairHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingConstraintPairHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingConstraintPairHelper.type ();
  }

}
