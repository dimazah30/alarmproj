package mLSNPP;

/**
* mLSNPP/MLSNPPMgr_IHolder.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPP.idl
* 2009年9月2日 星期三 下午03时25分55秒 CST
*/


/**
   * <p>The mLSNPPMgr_I is used to gain access to MLSNPP and
   * their operations.</p>
   *
   * <p>A handle to an instance of this interface is gained via the
   * emsSession::EmsSession_I::getManager() operation in Manager.</p>
   **/
public final class MLSNPPMgr_IHolder implements org.omg.CORBA.portable.Streamable
{
  public mLSNPP.MLSNPPMgr_I value = null;

  public MLSNPPMgr_IHolder ()
  {
  }

  public MLSNPPMgr_IHolder (mLSNPP.MLSNPPMgr_I initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = mLSNPP.MLSNPPMgr_IHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    mLSNPP.MLSNPPMgr_IHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return mLSNPP.MLSNPPMgr_IHelper.type ();
  }

}
