package CosNotifyFilter;


/**
* CosNotifyFilter/MappingConstraintPairSeqHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� CosNotifyFilter.idl
* 2009��8��26�� ������ ����11ʱ27��17�� CST
*/

public final class MappingConstraintPairSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public CosNotifyFilter.MappingConstraintPair value[] = null;

  public MappingConstraintPairSeqHolder ()
  {
  }

  public MappingConstraintPairSeqHolder (CosNotifyFilter.MappingConstraintPair[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CosNotifyFilter.MappingConstraintPairSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CosNotifyFilter.MappingConstraintPairSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CosNotifyFilter.MappingConstraintPairSeqHelper.type ();
  }

}
