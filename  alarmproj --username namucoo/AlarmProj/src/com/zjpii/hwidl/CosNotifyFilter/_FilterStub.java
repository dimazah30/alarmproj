package CosNotifyFilter;


/**
* CosNotifyFilter/_FilterStub.java .
* 由 IDL-to-Java 编译器（可移植），版本 "3.2" 生成
* 来自 CosNotifyFilter.idl
* 2009年8月26日 星期三 上午11时27分17秒 CST
*/

public class _FilterStub extends org.omg.CORBA.portable.ObjectImpl implements CosNotifyFilter.Filter
{

  public String constraint_grammar ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("_get_constraint_grammar", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return constraint_grammar (        );
            } finally {
                _releaseReply ($in);
            }
  } // constraint_grammar

  public CosNotifyFilter.ConstraintInfo[] add_constraints (CosNotifyFilter.ConstraintExp[] constraint_list) throws CosNotifyFilter.InvalidConstraint
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("add_constraints", true);
                CosNotifyFilter.ConstraintExpSeqHelper.write ($out, constraint_list);
                $in = _invoke ($out);
                CosNotifyFilter.ConstraintInfo $result[] = CosNotifyFilter.ConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return add_constraints (constraint_list        );
            } finally {
                _releaseReply ($in);
            }
  } // add_constraints

  public void modify_constraints (int[] del_list, CosNotifyFilter.ConstraintInfo[] modify_list) throws CosNotifyFilter.InvalidConstraint, CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("modify_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, del_list);
                CosNotifyFilter.ConstraintInfoSeqHelper.write ($out, modify_list);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/InvalidConstraint:1.0"))
                    throw CosNotifyFilter.InvalidConstraintHelper.read ($in);
                else if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                modify_constraints (del_list, modify_list        );
            } finally {
                _releaseReply ($in);
            }
  } // modify_constraints

  public CosNotifyFilter.ConstraintInfo[] get_constraints (int[] id_list) throws CosNotifyFilter.ConstraintNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_constraints", true);
                CosNotifyFilter.ConstraintIDSeqHelper.write ($out, id_list);
                $in = _invoke ($out);
                CosNotifyFilter.ConstraintInfo $result[] = CosNotifyFilter.ConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/ConstraintNotFound:1.0"))
                    throw CosNotifyFilter.ConstraintNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_constraints (id_list        );
            } finally {
                _releaseReply ($in);
            }
  } // get_constraints

  public CosNotifyFilter.ConstraintInfo[] get_all_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_all_constraints", true);
                $in = _invoke ($out);
                CosNotifyFilter.ConstraintInfo $result[] = CosNotifyFilter.ConstraintInfoSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_all_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_all_constraints

  public void remove_all_constraints ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("remove_all_constraints", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                remove_all_constraints (        );
            } finally {
                _releaseReply ($in);
            }
  } // remove_all_constraints

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

  public boolean match (org.omg.CORBA.Any filterable_data) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match", true);
                $out.write_any (filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match (filterable_data        );
            } finally {
                _releaseReply ($in);
            }
  } // match

  public boolean match_structured (CosNotification.StructuredEvent filterable_data) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_structured", true);
                CosNotification.StructuredEventHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_structured (filterable_data        );
            } finally {
                _releaseReply ($in);
            }
  } // match_structured

  public boolean match_typed (CosNotification.Property[] filterable_data) throws CosNotifyFilter.UnsupportedFilterableData
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("match_typed", true);
                CosNotification.PropertySeqHelper.write ($out, filterable_data);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/UnsupportedFilterableData:1.0"))
                    throw CosNotifyFilter.UnsupportedFilterableDataHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return match_typed (filterable_data        );
            } finally {
                _releaseReply ($in);
            }
  } // match_typed

  public int attach_callback (CosNotifyComm.NotifySubscribe callback)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("attach_callback", true);
                CosNotifyComm.NotifySubscribeHelper.write ($out, callback);
                $in = _invoke ($out);
                int $result = CosNotifyFilter.CallbackIDHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return attach_callback (callback        );
            } finally {
                _releaseReply ($in);
            }
  } // attach_callback

  public void detach_callback (int callback) throws CosNotifyFilter.CallbackNotFound
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("detach_callback", true);
                CosNotifyFilter.CallbackIDHelper.write ($out, callback);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:omg.org/CosNotifyFilter/CallbackNotFound:1.0"))
                    throw CosNotifyFilter.CallbackNotFoundHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                detach_callback (callback        );
            } finally {
                _releaseReply ($in);
            }
  } // detach_callback

  public int[] get_callbacks ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("get_callbacks", true);
                $in = _invoke ($out);
                int $result[] = CosNotifyFilter.CallbackIDSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return get_callbacks (        );
            } finally {
                _releaseReply ($in);
            }
  } // get_callbacks

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:omg.org/CosNotifyFilter/Filter:1.0"};

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
} // class _FilterStub
