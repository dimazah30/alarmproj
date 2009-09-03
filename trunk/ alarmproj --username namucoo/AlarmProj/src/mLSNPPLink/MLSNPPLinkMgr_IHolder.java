package mLSNPPLink;

/**
* mLSNPPLink/MLSNPPLinkMgr_IHolder.java .
* �� IDL-to-Java ������������ֲ�����汾 "3.2" ����
* ���� mLSNPPLink.idl
* 2009��9��2�� ������ ����03ʱ26��02�� CST
*/


/**
   * <p>The mLSNPPLinkMgr_I is used to gain access to MLSNPP Links and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public final class MLSNPPLinkMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPPLink.MLSNPPLinkMgr_I value = null;

  public MLSNPPLinkMgr_IHolder ()
  {
  }

  public MLSNPPLinkMgr_IHolder (mLSNPPLink.MLSNPPLinkMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPPLink.MLSNPPLinkMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPPLink.MLSNPPLinkMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPPLink.MLSNPPLinkMgr_IHelper.type ();
  }

}
