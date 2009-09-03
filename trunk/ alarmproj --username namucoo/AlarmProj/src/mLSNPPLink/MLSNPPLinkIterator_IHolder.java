package mLSNPPLink;

/**
* mLSNPPLink/MLSNPPLinkIterator_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public final class MLSNPPLinkIterator_IHolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.MLSNPPLinkIterator_I value = null;

  public MLSNPPLinkIterator_IHolder ()
  {
  }

  public MLSNPPLinkIterator_IHolder (mLSNPPLink.MLSNPPLinkIterator_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.MLSNPPLinkIterator_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.MLSNPPLinkIterator_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.MLSNPPLinkIterator_IHelper.type ();
  }

}
