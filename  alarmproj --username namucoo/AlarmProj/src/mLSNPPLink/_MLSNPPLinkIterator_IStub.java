package mLSNPPLink;


/**
* mLSNPPLink/_MLSNPPLinkIterator_IStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 mLSNPPLink.idl
* 2009年9月2日 星期三 下午03时26分02秒 CST
*/


/**
   * <p>In order to allow the NMS to deal with a large number of objects,
   * iterators are used.</p>
   * <p>See <a href=../../../supportingDocumentation/SD1-15_iterators.pdf >SD1-15 iterator overview</a>
   * for information on how iterators are used in this interface.</p>
   **/
public class _MLSNPPLinkIterator_IStub extends org.omg.CORBA.portable.ObjectImpl implements mLSNPPLink.MLSNPPLinkIterator_I
{

  public boolean next_n (int how_many, mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLink) throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("next_n", true);
                $out.write_ulong (how_many);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                mLSNPPLink.value = mLSNPPLink.MLSNPPLinkList_THelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return next_n (how_many, mLSNPPLink        );
            } finally {
                _releaseReply ($in);
            }
  } // next_n

  public int getLength () throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLength", true);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLength (        );
            } finally {
                _releaseReply ($in);
            }
  } // getLength

  public void destroy () throws globaldefs.ProcessingFailureException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
                    throw globaldefs.ProcessingFailureExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:mtnm.tmforum.org/mLSNPPLink/MLSNPPLinkIterator_I:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _MLSNPPLinkIterator_IStub
