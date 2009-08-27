package CosNotifyFilter;


/**
* CosNotifyFilter/_FilterAdminStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public class _FilterAdminStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyFilter.FilterAdmin
{

  public int add_filter (CosNotifyFilter.Filter new_filter)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_filter", true);
                CosNotifyFilter.FilterHelper.write ($out, new_filter);
                $in = _invoke ($out);
                int $result = CosNotifyFilter.FilterIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_filter (new_filter        );
            } finally {
                _releaseReply ($in);
            }
  } // add_filter

  public void remove_filter (int filter) throws CosNotifyFilter.FilterNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_filter", true);
                CosNotifyFilter.FilterIDHelper.write ($out, filter);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
                    throw CosNotifyFilter.FilterNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_filter (filter        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_filter

  public CosNotifyFilter.Filter get_filter (int filter) throws CosNotifyFilter.FilterNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_filter", true);
                CosNotifyFilter.FilterIDHelper.write ($out, filter);
                $in = _invoke ($out);
                CosNotifyFilter.Filter $result = CosNotifyFilter.FilterHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
                    throw CosNotifyFilter.FilterNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_filter (filter        );
            } finally {
                _releaseReply ($in);
            }
  } // get_filter

  public int[] get_all_filters ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_filters", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyFilter.FilterIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_filters (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_filters

  public void remove_all_filters ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_filters", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_filters (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_filters

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0"};

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
} // class _FilterAdminStub
