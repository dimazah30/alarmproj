package aSAP;

/**
* aSAP/ASAPIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� aSAP.idl
* 2009��9��2�� ������ ����03ʱ25��09�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class ASAPIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public aSAP.ASAPIterator_I value = null;

  public ASAPIterator_IHolder ()
  {
  }

  public ASAPIterator_IHolder (aSAP.ASAPIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = aSAP.ASAPIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    aSAP.ASAPIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return aSAP.ASAPIterator_IHelper.type ();
  }

}
