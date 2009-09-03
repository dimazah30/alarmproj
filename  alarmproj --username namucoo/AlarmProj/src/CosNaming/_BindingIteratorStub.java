package CosNaming;


/**
* CosNaming/_BindingIteratorStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNaming.idl
* 2009年9月2日 星期三 下午02时45分19秒 CST
*/


/**
 * The BindingIterator interface allows a client to iterate through the
 * bindings using the next_one or next_n operations.
 */
public class _BindingIteratorStub extends org.omg.CORBA.portable.ObjectImpl implements CosNaming.BindingIterator
{


  /**
 * This operation returns the next binding. If there are no more
 * bindings, false is returned.
 *
 * @parm b - next binding.
 */
  public boolean next_one (CosNaming.BindingHolder b)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("next_one", true);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                b.value = CosNaming.BindingHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return next_one (b        );
            } finally {
                _releaseReply ($in);
            }
  } // next_one


  /** 
 * This operation returns at most the requested number of bindings.
 *
 * @parm how_many - maximum number of binding to return in bl.
 * @parm bl - list of bindings.
 */
  public boolean next_n (int how_many, CosNaming.BindingListHolder bl)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("next_n", true);
                $out.write_ulong (how_many);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                bl.value = CosNaming.BindingListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return next_n (how_many, bl        );
            } finally {
                _releaseReply ($in);
            }
  } // next_n


  /** 
 * This operation destroys the iterator.
 */
  public void destroy ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("destroy", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                destroy (        );
            } finally {
                _releaseReply ($in);
            }
  } // destroy

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNaming/BindingIterator:1.0"};

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
} // class _BindingIteratorStub
